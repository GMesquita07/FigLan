// Ficheiro: src/figlan/compiler/SemanticAnalyser.java
package figlan.compiler;

import figlan.generated.*;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

// O SemanticAnalyser percorre a árvore sintática para verificar a lógica e os tipos.
// Ele retorna um objeto 'Symbol' para cada expressão para que as regras "parentes"
// possam verificar os tipos dos seus "filhos".
// Para statements (instruções que não produzem valor), ele retorna null.
public class SemanticAnalyser extends FiglanBaseVisitor<Symbol> {

    // A Tabela de Símbolos é o nosso "cérebro" para lembrar das variáveis e seus tipos.
    private final SymbolTable st = new SymbolTable();
    private int errorCount = 0;

    // Método auxiliar para reportar erros de forma padronizada.
    protected void error(ParserRuleContext ctx, String message) {
        System.err.printf("Error at line %d:%d -> %s\n", ctx.start.getLine(), ctx.start.getCharPositionInLine(), message);
        errorCount++;
    }

    public int getErrorCount() {
        return errorCount;
    }

    // --- Métodos para as Instruções (Statements) ---
    // Statements não retornam valor, então retornamos null.

    @Override
    public Symbol visitProgram(FiglanParser.ProgramContext ctx) {
        // A Tabela de Símbolos já foi inicializada com o escopo global.
        // Apenas visitamos todas as instruções do programa.
        visitChildren(ctx);
        return null;
    }

    @Override
    public Symbol visitVarDecl(FiglanParser.VarDeclContext ctx) {
        FiglanType declarationType = visit(ctx.type()).type();

        for (FiglanParser.VarInitContext varCtx : ctx.varInit()) {
            String varName = varCtx.ID().getText();

            // Verifica se a variável já foi declarada NESTE escopo.
            if (st.probe(varName)) {
                error(varCtx, "Variable '" + varName + "' already declared in this scope.");
            } else {
                Symbol symbol = new Symbol(declarationType);
                st.put(varName, symbol);

                // Se houver uma expressão de inicialização (ex: integer n = 10)
                if (varCtx.expression() != null) {
                    Symbol exprSymbol = visit(varCtx.expression());
                    // Verifica se o tipo da expressão é compatível com o tipo da variável.
                    if (!isAssignable(declarationType, exprSymbol.type())) {
                        error(varCtx.expression(), "Type mismatch: cannot assign " + exprSymbol.type() + " to " + declarationType);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Symbol visitNewObj(FiglanParser.NewObjContext ctx) {
        // CORREÇÃO: Acedemos através de ctx.newExpr()
        FiglanParser.NewExprContext newExprCtx = ctx.newExpr();
        FiglanType newType = visit(newExprCtx.type()).type();
        
        // Verifica os argumentos do construtor (se existirem)
        if (!newExprCtx.expression().isEmpty()) {
            List<FiglanParser.ExpressionContext> args = newExprCtx.expression();
            switch(newType) {
                case POINT:
                    if (args.size() != 2 || !isNumeric(visit(args.get(0)).type()) || !isNumeric(visit(args.get(1)).type())) {
                        error(ctx, "Point constructor requires two numeric arguments: new point(x, y)");
                    }
                    break;
                case LINE:
                    if (args.size() != 2 || visit(args.get(0)).type() != FiglanType.POINT || visit(args.get(1)).type() != FiglanType.POINT) {
                        error(ctx, "Line constructor requires two point arguments: new line(p1, p2)");
                    }
                    break;
                case CIRCLE:
                    if (args.size() != 2 || visit(args.get(0)).type() != FiglanType.POINT || !isNumeric(visit(args.get(1)).type())) {
                        error(ctx, "Circle constructor requires a point and a numeric radius: new circle(center, radius)");
                    }
                    break;
                default:
                    error(ctx, "Type '" + newType + "' is not constructible with 'new'.");
                    break;
            }
        }

        // A expressão 'new' resulta num objeto do tipo especificado.
        return new Symbol(newType);
    }

    @Override
    public Symbol visitTypeConversion(FiglanParser.TypeConversionContext ctx) {
        FiglanType targetType = visit(ctx.type()).type();
        Symbol expressionToConvert = visit(ctx.expression());

        // Adicionar aqui a lógica de que conversões são válidas.
        // Exemplo: pode converter texto para inteiro, ou inteiro para real.
        boolean isValidConversion = false;
        if (targetType == FiglanType.INTEGER || targetType == FiglanType.REAL) {
            if (expressionToConvert.type() == FiglanType.TEXT || isNumeric(expressionToConvert.type())) {
                isValidConversion = true;
            }
        } else if (targetType == FiglanType.TEXT) {
            isValidConversion = true; // Quase tudo pode ser convertido para texto.
        }

        if (!isValidConversion) {
            error(ctx, "Invalid type conversion from " + expressionToConvert.type() + " to " + targetType);
        }

        return new Symbol(targetType);
    }

    @Override
    public Symbol visitReadExpression(FiglanParser.ReadExpressionContext ctx) {
        // CORREÇÃO: Acedemos através de ctx.readExpr()
        FiglanParser.ReadExprContext readExprCtx = ctx.readExpr();

        // Se houver uma expressão de prompt, ela deve ser do tipo texto.
        if (readExprCtx.expression() != null) {
            Symbol promptSymbol = visit(readExprCtx.expression());
            if (promptSymbol.type() != FiglanType.TEXT) {
                error(readExprCtx.expression(), "Read prompt must be of type text.");
            }
        }
        // A expressão 'read' resulta sempre num valor do tipo TEXT.
        return new Symbol(FiglanType.TEXT);
    }

    @Override
    public Symbol visitAssignStmt(FiglanParser.AssignStmtContext ctx) {
        String varName = ctx.ID().getText();
        Symbol varSymbol = st.get(varName);

        // Verifica se a variável foi declarada.
        if (varSymbol == null) {
            error(ctx, "Undeclared variable '" + varName + "'");
            return null;
        }

        Symbol exprSymbol = visit(ctx.expression());
        FiglanType varType = varSymbol.type();
        FiglanType exprType = exprSymbol.type();

        // Lógica para os operadores '=' e '+='
        if (ctx.op.getText().equals("=")) {
            if (!isAssignable(varType, exprType)) {
                error(ctx.expression(), "Type mismatch: cannot assign " + exprType + " to " + varType);
            }
        } else if (ctx.op.getText().equals("+=")) {
            // Regras para '+=' (soma para numéricos, concatenação para texto/figura)
            boolean isNumeric = isNumeric(varType) && isNumeric(exprType);
            boolean isText = varType == FiglanType.TEXT && exprType == FiglanType.TEXT;
            // Para Figuras, permitimos adicionar figuras a uma coleção 'figure'
            boolean isFigure = varType == FiglanType.FIGURE && isFigure(exprType);

            if (!isNumeric && !isText && !isFigure) {
                error(ctx.expression(), "Operator '+=' cannot be applied to '" + varType + "' and '" + exprType + "'");
            }
        }
        return null;
    }

    @Override
    public Symbol visitForStmt(FiglanParser.ForStmtContext ctx) {
        // Verificamos as expressões de início e fim do ciclo. Devem ser inteiros.
        Symbol startExpr = visit(ctx.expression(0));
        Symbol endExpr = visit(ctx.expression(1));

        if (startExpr.type() != FiglanType.INTEGER) {
            error(ctx.expression(0), "For loop start expression must be an integer.");
        }
        if (endExpr.type() != FiglanType.INTEGER) {
            error(ctx.expression(1), "For loop end expression must be an integer.");
        }

        st.enterScope(); // Entramos num novo escopo para o corpo do 'for'.

        String loopVarName = ctx.ID().getText();
        // Se o tipo da variável de ciclo for declarado (ex: for integer i = ...)
        if (ctx.type() != null) {
            FiglanType loopVarType = visit(ctx.type()).type();
            if (loopVarType != FiglanType.INTEGER) {
                error(ctx.type(), "For loop variable must be of type integer.");
            }
            // Declaramos a nova variável no escopo do 'for'.
            st.put(loopVarName, new Symbol(FiglanType.INTEGER));
        } else {
            // Se o tipo não for declarado, a variável deve existir e ser um inteiro.
            Symbol existingVar = st.get(loopVarName);
            if (existingVar == null) {
                error(ctx, "Undeclared variable '" + loopVarName + "'");
            } else if (existingVar.type() != FiglanType.INTEGER) {
                error(ctx, "Loop variable '" + loopVarName + "' must be of type integer.");
            }
        }

        // Visitamos as instruções dentro do corpo do 'for'.
        for (FiglanParser.StatementContext sc : ctx.statement()) {
            visit(sc);
        }

        st.exitScope(); // Saímos do escopo, as variáveis locais ao 'for' desaparecem.
        return null;
    }

    // --- Métodos para as Expressões (Expressions) ---
    // Expressões retornam um Symbol com o seu tipo resultante.

    @Override
    public Symbol visitId(FiglanParser.IdContext ctx) {
        String varName = ctx.ID().getText();
        Symbol symbol = st.get(varName);

        if (symbol == null) {
            error(ctx, "Undeclared variable '" + varName + "'");
            return new Symbol(FiglanType.UNDEFINED); // Retorna um tipo de erro
        }
        return symbol;
    }

    @Override
    public Symbol visitLiteralExpr(FiglanParser.LiteralExprContext ctx) {
        TerminalNode node = (TerminalNode) ctx.literal().getChild(0);
        switch (node.getSymbol().getType()) {
            case FiglanParser.INT:    return new Symbol(FiglanType.INTEGER);
            case FiglanParser.REAL:   return new Symbol(FiglanType.REAL);
            case FiglanParser.STRING: return new Symbol(FiglanType.TEXT);
        }
        return new Symbol(FiglanType.UNDEFINED);
    }
    
    @Override
    public Symbol visitType(FiglanParser.TypeContext ctx) {
        FiglanType type = switch (ctx.getText()) {
            case "integer" -> FiglanType.INTEGER;
            case "real"    -> FiglanType.REAL;
            case "text"    -> FiglanType.TEXT;
            case "point"   -> FiglanType.POINT;
            case "line"    -> FiglanType.LINE;
            case "circle"  -> FiglanType.CIRCLE;
            case "figure"  -> FiglanType.FIGURE;
            default        -> FiglanType.UNDEFINED;
        };
        return new Symbol(type);
    }

    @Override
    public Symbol visitParens(FiglanParser.ParensContext ctx) {
        // Apenas visita a expressão interior e retorna o seu tipo.
        return visit(ctx.expression());
    }

    @Override
    public Symbol visitAddSub(FiglanParser.AddSubContext ctx) {
        Symbol left = visit(ctx.expression(0));
        Symbol right = visit(ctx.expression(1));
        String op = ctx.op.getText();

        if (isNumeric(left.type()) && isNumeric(right.type())) {
            // Se ambos são numéricos, o resultado é o "maior" dos dois (real > integer)
            FiglanType resultType = (left.type() == FiglanType.REAL || right.type() == FiglanType.REAL) ? FiglanType.REAL : FiglanType.INTEGER;
            return new Symbol(resultType);
        } else if (op.equals("+") && left.type() == FiglanType.TEXT && isPrintable(right.type())) {
             // Concatenação de texto
             return new Symbol(FiglanType.TEXT);
        } else {
            error(ctx, "Operator '" + op + "' cannot be applied to '" + left.type() + "' and '" + right.type() + "'");
            return new Symbol(FiglanType.UNDEFINED);
        }
    }

    @Override
    public Symbol visitMulDivMod(FiglanParser.MulDivModContext ctx) {
        Symbol left = visit(ctx.expression(0));
        Symbol right = visit(ctx.expression(1));
        String op = ctx.op.getText();

        if (op.equals("%") || op.equals("//")) { // Resto e Divisão Inteira
            if (left.type() == FiglanType.INTEGER && right.type() == FiglanType.INTEGER) {
                return new Symbol(FiglanType.INTEGER);
            } else {
                error(ctx, "Operator '" + op + "' requires integer operands.");
                return new Symbol(FiglanType.UNDEFINED);
            }
        } else { // Multiplicação e Divisão Real
            if (isNumeric(left.type()) && isNumeric(right.type())) {
                FiglanType resultType = (left.type() == FiglanType.REAL || right.type() == FiglanType.REAL) ? FiglanType.REAL : FiglanType.INTEGER;
                return new Symbol(resultType);
            } else {
                error(ctx, "Operator '" + op + "' requires numeric operands.");
                return new Symbol(FiglanType.UNDEFINED);
            }
        }
    }
    
    @Override
    public Symbol visitPointLiteral(FiglanParser.PointLiteralContext ctx) {
        Symbol x = visit(ctx.expression(0));
        Symbol y = visit(ctx.expression(1));
        if (!isNumeric(x.type()) || !isNumeric(y.type())) {
            error(ctx, "Point coordinates must be numeric.");
        }
        return new Symbol(FiglanType.POINT);
    }

    @Override
    public Symbol visitLineLiteral(FiglanParser.LineLiteralContext ctx) {
        Symbol p1 = visit(ctx.pointLiteral(0));
        Symbol p2 = visit(ctx.pointLiteral(1));
        if (p1.type() != FiglanType.POINT || p2.type() != FiglanType.POINT) {
            error(ctx, "Line endpoints must be points.");
        }
        return new Symbol(FiglanType.LINE);
    }

    @Override
    public Symbol visitCircleLiteral(FiglanParser.CircleLiteralContext ctx) {
        Symbol center = visit(ctx.pointLiteral());
        Symbol radius = visit(ctx.expression());
        if (center.type() != FiglanType.POINT) {
            error(ctx.pointLiteral(), "Circle center must be a point.");
        }
        if (!isNumeric(radius.type())) {
            error(ctx.expression(), "Circle radius must be numeric.");
        }
        return new Symbol(FiglanType.CIRCLE);
    }
    
    // --- Helper methods for type checking ---

    private boolean isNumeric(FiglanType type) {
        return type == FiglanType.INTEGER || type == FiglanType.REAL;
    }

    private boolean isFigure(FiglanType type) {
        return type == FiglanType.POINT || type == FiglanType.LINE || type == FiglanType.CIRCLE || type == FiglanType.FIGURE;
    }

    private boolean isPrintable(FiglanType type) {
        return type != FiglanType.VOID && type != FiglanType.UNDEFINED;
    }

    // Verifica se um tipo 'source' pode ser atribuído a uma variável do tipo 'target'
    private boolean isAssignable(FiglanType target, FiglanType source) {
        if (target == source) {
            return true; // Tipos iguais são sempre atribuíveis
        }
        // Permite atribuir integer a uma variável real
        if (target == FiglanType.REAL && source == FiglanType.INTEGER) {
            return true;
        }
        // Permite atribuir qualquer figura a uma variável 'figure'
        if (target == FiglanType.FIGURE && isFigure(source)) {
            return true;
        }
        return false;
    }
}