// Ficheiro: src/compiler/CodeGenerator.java
package figlan.compiler;

import figlan.generated.*;

import org.stringtemplate.v4.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Visita a árvore sintática após a validação semântica e gera código Java
 * usando a biblioteca StringTemplate.
 */
public class CodeGenerator extends FiglanBaseVisitor<ST> {

    private final STGroup templates;
    private final SymbolTable st;
    private int tempVarCounter = 0;

    /**
     * Construtor que carrega o grupo de templates a partir do ficheiro .stg.
     */
    public CodeGenerator(SymbolTable st) { // <-- ALTERAÇÃO CRÍTICA
        this.templates = new STGroupFile("figlan/src/figlan/compiler/templates/Java.stg");
        this.st = st; // Armazena a tabela de símbolos recebida
    }

    // --- Métodos Auxiliares ---

    private String newTempVar() {
        return "temp" + (tempVarCounter++);
    }
    
    // Mapeia os tipos da linguagem Figlan para os tipos correspondentes em Java.
    private String mapType(FiglanType type) {
        return switch (type) {
            case INTEGER -> "int";
            case REAL -> "double";
            case TEXT -> "String";
            case POINT -> "Point";
            case LINE -> "Line";
            case CIRCLE -> "Circle";
            case FIGURE -> "Figure"; 
            default -> "void";
        };
    }

    private String getDefaultValue(FiglanType type) {
        return switch (type) {
            case INTEGER -> "0";
            case REAL -> "0.0";
            default -> "null"; // Correct for TEXT, POINT, LINE, CIRCLE, FIGURE
        };
    }

    // --- Métodos de Visita para a Geração de Código ---

    @Override
    public ST visitProgram(FiglanParser.ProgramContext ctx) {
        ST programST = templates.getInstanceOf("program");
        
        // CORREÇÃO: Mude de String para List<ST>
        List<ST> statements = ctx.statement().stream()
                .map(statementContext -> visit(statementContext.getChild(0)))
                // REMOVA o .map(ST::render) e mude o collector
                .collect(Collectors.toList()); 
                
        programST.add("statements", statements);
        return programST;
    }

    @Override
    public ST visitVarDecl(FiglanParser.VarDeclContext ctx) {
        // 1. Obter o tipo da primeira variável (a sua lógica está correta).
        String firstVarNameInDecl = ctx.varInit(0).ID().getText();
        Symbol symbol = st.get(firstVarNameInDecl);
        FiglanType type = symbol.type();
        String javaType = mapType(type);
        
        // 2. CORREÇÃO: Usar um Stream para gerar e juntar as declarações.
        String declarations = ctx.varInit().stream()
            .map(varCtx -> {
                String varName = varCtx.ID().getText();
                ST decl = templates.getInstanceOf("varDecl");
                decl.add("type", javaType);
                decl.add("name", varName);

                if (varCtx.expression() != null) {
                    decl.add("value", visit(varCtx.expression()).render());
                } else {
                    decl.add("value", getDefaultValue(type));
                }
                return decl.render();
            })
            .collect(Collectors.joining("\n"));

        // 3. Retornar um ST que contém a string final.
        return new ST(declarations);
    }
    
    @Override
    public ST visitAssignStmt(FiglanParser.AssignStmtContext ctx) {
        String varName = ctx.ID().getText();
        ST expr = visit(ctx.expression());
        
        ST assignST = templates.getInstanceOf("assign");
        assignST.add("var", varName);
        assignST.add("op", ctx.op.getText()); // Passa o operador (=, +=)
        assignST.add("expr", expr.render());
        
        return assignST;
    }

    @Override
    public ST visitPrintStmt(FiglanParser.PrintStmtContext ctx) {
        String command = ctx.getChild(0).getText().equals("println") ? "println" : "print";
        String args = ctx.printArgs().expression().stream()
                .map(this::visit)
                .map(ST::render)
                .collect(Collectors.joining(" + "));

        ST printST = templates.getInstanceOf(command);
        printST.add("args", args);
        return printST;
    }

    @Override
    public ST visitPauseStmt(FiglanParser.PauseStmtContext ctx) {
        ST pauseST = templates.getInstanceOf("pause");
        pauseST.add("ms", visit(ctx.expression()).render());
        return pauseST;
    }

    @Override
    public ST visitShowStmt(FiglanParser.ShowStmtContext ctx) {
        // Gera uma sequência de chamadas "board.draw(...);" usando o template 'show'
        String figuresCode = ctx.exprList().expression().stream()
            .map(expr -> {
                ST showST = templates.getInstanceOf("show");
                showST.add("figureVar", visit(expr).render());
                return showST.render();
            })
            .collect(Collectors.joining("\n"));
        return new ST(figuresCode);
    }
    
    @Override
    public ST visitHideStmt(FiglanParser.HideStmtContext ctx) {
        if (ctx.ALL() != null) {
            // Usa um template para "hideAll" (assumindo que adicionou ao Java.stg)
            return templates.getInstanceOf("hideAll"); 
        }

        // Gera uma sequência de chamadas "board.erase(...);" usando o template 'hide'
        String figuresCode = ctx.exprList().expression().stream()
            .map(expr -> {
                ST hideST = templates.getInstanceOf("hide");
                hideST.add("figureVar", visit(expr).render());
                return hideST.render();
            })
            .collect(Collectors.joining("\n"));
        return new ST(figuresCode);
    }

    @Override
    public ST visitForStmt(FiglanParser.ForStmtContext ctx) {
        st.enterScope();
        String varName = ctx.ID().getText();
        st.put(varName, new Symbol(FiglanType.INTEGER));

        // CORREÇÃO: Mude de String para List<ST>
        List<ST> body = ctx.statement().stream()
            .map(this::visit)
            // REMOVA o .map(ST::render) e mude o collector
            .collect(Collectors.toList());
        
        st.exitScope();

        ST forST = templates.getInstanceOf("forLoop");
        forST.add("var", varName);
        forST.add("start", visit(ctx.expression(0)).render());
        forST.add("end", visit(ctx.expression(1)).render());
        forST.add("statements", body); // Agora 'body' é uma lista, o que é correto
        return forST;
    }

    // --- Expressões ---

    @Override
    public ST visitId(FiglanParser.IdContext ctx) {
        return new ST(ctx.ID().getText());
    }
    
    @Override
    public ST visitLiteralExpr(FiglanParser.LiteralExprContext ctx) {
        return new ST(ctx.literal().getText());
    }
    
    @Override
    public ST visitParens(FiglanParser.ParensContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ST visitAddSub(FiglanParser.AddSubContext ctx) {
        ST st = templates.getInstanceOf("binaryOp");
        st.add("left", visit(ctx.expression(0)).render());
        st.add("op", ctx.op.getText());
        st.add("right", visit(ctx.expression(1)).render());
        return st;
    }


    @Override
    public ST visitMulDivMod(FiglanParser.MulDivModContext ctx) {
        String op = ctx.op.getText();
        if (op.equals("//")) {
            op = "/";
        }

        ST st = templates.getInstanceOf("binaryOp");
        st.add("left", visit(ctx.expression(0)).render());
        st.add("op", op);
        st.add("right", visit(ctx.expression(1)).render());
        return st;
    }

// Ficheiro: CodeGenerator.java

    @Override
    public ST visitNewObj(FiglanParser.NewObjContext ctx) {
        // --- LÓGICA CORRIGIDA ---
        FiglanParser.NewExprContext newCtx = ctx.newExpr();
        
        // 1. Obter o nome do tipo diretamente da árvore (ex: "point", "line").
        String figlanTypeName = newCtx.type().getText();

        // 2. Converter para o nome da classe Java (ex: "Point", "Line").
        // A forma mais simples é capitalizar a primeira letra.
        String javaType = figlanTypeName.substring(0, 1).toUpperCase() + figlanTypeName.substring(1);

        // 3. Processar os argumentos da mesma forma que antes.
        String args = newCtx.expression().stream()
            .map(this::visit)
            .map(ST::render)
            .collect(Collectors.joining(", "));

        return new ST("new " + javaType + "(" + args + ")");
    }

    // Ficheiro: CodeGenerator.java

    @Override
    public ST visitTypeConversion(FiglanParser.TypeConversionContext ctx) {
        // --- LÓGICA CORRIGIDA ---
        // 1. Obter o nome do tipo alvo diretamente da árvore (ex: "integer", "text").
        String targetTypeName = ctx.type().getText();
        
        // 2. Visitar a expressão a ser convertida.
        ST expr = visit(ctx.expression());
        
        // 3. Gerar o código de conversão com base no nome do tipo.
        return switch (targetTypeName) {
            case "integer" -> new ST("Integer.parseInt(" + expr.render() + ")");
            case "real"    -> new ST("Double.parseDouble(" + expr.render() + ")");
            case "text"    -> new ST("String.valueOf(" + expr.render() + ")");
            default        -> expr; // Se não for uma conversão conhecida, retorna a expressão original.
        };
    }

    @Override
    public ST visitReadExpression(FiglanParser.ReadExpressionContext ctx) {
        if (ctx.readExpr().expression() != null) {
            ST prompt = visit(ctx.readExpr().expression());
            return new ST("System.out.print(" + prompt.render() + "); scanner.nextLine()");
        }
        return new ST("scanner.nextLine()");
    }
    
    @Override
    public ST visitPointLiteral(FiglanParser.PointLiteralContext ctx) {
        String x = visit(ctx.expression(0)).render();
        String y = visit(ctx.expression(1)).render();
        return new ST("new Point(" + x + ", " + y + ")");
    }

    @Override
    public ST visitLineLiteral(FiglanParser.LineLiteralContext ctx) {
        String p1 = visit(ctx.pointLiteral(0)).render();
        String p2 = visit(ctx.pointLiteral(1)).render();
        return new ST("new Line(" + p1 + ", " + p2 + ")");
    }

    @Override
    public ST visitCircleLiteral(FiglanParser.CircleLiteralContext ctx) {
        String center = visit(ctx.pointLiteral()).render();
        String radius = visit(ctx.expression()).render();
        return new ST("new Circle(" + center + ", " + radius + ")");
    }
}