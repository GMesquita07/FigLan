// Ficheiro: src/compiler/CodeGenerator.java
package figlan.compiler;

import figlan.generated.*;

import org.stringtemplate.v4.*;
import java.util.stream.Collectors;

/**
 * Visita a árvore sintática após a validação semântica e gera código Java
 * usando a biblioteca StringTemplate.
 */
public class CodeGenerator extends FiglanBaseVisitor<ST> {

    private final STGroup templates;
    private final SymbolTable st = new SymbolTable();
    private int tempVarCounter = 0;

    /**
     * Construtor que carrega o grupo de templates a partir do ficheiro .stg.
     */
    public CodeGenerator() {
        this.templates = new STGroupFile("figlan/src/figlan/compiler/templates/Java.stg");
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
            case FIGURE -> "Object"; // Ou uma classe Figure se tiver uma lista
            default -> "void";
        };
    }

    // --- Métodos de Visita para a Geração de Código ---

    @Override
    public ST visitProgram(FiglanParser.ProgramContext ctx) {
        ST programST = templates.getInstanceOf("program");
        String statements = ctx.statement().stream()
                // ALTERAÇÃO: Visitar o primeiro filho da instrução (ex: varDecl), 
                // não a própria 'statement'.
                .map(statementContext -> visit(statementContext.getChild(0)))
                .map(ST::render)
                .collect(Collectors.joining("\n"));
        programST.add("statements", statements);
        return programST;
    }

    @Override
    public ST visitVarDecl(FiglanParser.VarDeclContext ctx) {
        FiglanType type = new SemanticAnalyser().visit(ctx.type()).type(); // Re-avalia o tipo
        String javaType = mapType(type);
        StringBuilder declarations = new StringBuilder();

        for (FiglanParser.VarInitContext varCtx : ctx.varInit()) {
            String varName = varCtx.ID().getText();
            st.put(varName, new Symbol(type)); // Adiciona à tabela de símbolos do gerador

            ST decl = templates.getInstanceOf("varDecl");
            decl.add("type", javaType);
            decl.add("name", varName);

            if (varCtx.expression() != null) {
                ST expr = visit(varCtx.expression());
                decl.add("value", expr.render());
            } else {
                // Inicialização padrão em Java (ex: 0 para int, null para objetos)
                decl.add("value", "null"); // ou 0, 0.0, etc. conforme o tipo
            }
            declarations.append(decl.render()).append("\n");
        }
        return new ST(declarations.toString());
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
        String figures = ctx.exprList().expression().stream()
            .map(e -> "board.draw(" + visit(e).render() + ");")
            .collect(Collectors.joining("\n"));
        return new ST(figures);
    }
    
    @Override
    public ST visitHideStmt(FiglanParser.HideStmtContext ctx) {
        if (ctx.ALL() != null) {
            return new ST("board.eraseAll();"); // Supondo que board tem este método
        }
        String figures = ctx.exprList().expression().stream()
            .map(e -> "board.erase(" + visit(e).render() + ");")
            .collect(Collectors.joining("\n"));
        return new ST(figures);
    }

    @Override
    public ST visitForStmt(FiglanParser.ForStmtContext ctx) {
        st.enterScope();
        String varName = ctx.ID().getText();
        st.put(varName, new Symbol(FiglanType.INTEGER)); // Variável do ciclo é sempre int

        String body = ctx.statement().stream()
            .map(this::visit)
            .map(ST::render)
            .collect(Collectors.joining("\n"));
        
        st.exitScope();

        ST forST = templates.getInstanceOf("forLoop");
        forST.add("var", varName);
        forST.add("start", visit(ctx.expression(0)).render());
        forST.add("end", visit(ctx.expression(1)).render());
        forST.add("statements", body);
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
        ST left = visit(ctx.expression(0));
        ST right = visit(ctx.expression(1));
        return new ST(left.render() + " " + ctx.op.getText() + " " + right.render());
    }


    @Override
    public ST visitMulDivMod(FiglanParser.MulDivModContext ctx) {
        ST left = visit(ctx.expression(0));
        ST right = visit(ctx.expression(1));
        
        String op = ctx.op.getText();
        
        // VERIFICAÇÃO: Se o operador for a divisão inteira de Figlan ('//'),
        // traduz para o operador de divisão de Java ('/').
        // Como a análise semântica já garantiu que os operandos são inteiros,
        // o resultado em Java será uma divisão inteira.
        if (op.equals("//")) {
            op = "/";
        }
        
        return new ST(left.render() + " " + op + " " + right.render());
    }

    @Override
    public ST visitNewObj(FiglanParser.NewObjContext ctx) {
        FiglanParser.NewExprContext newCtx = ctx.newExpr();
        FiglanType type = new SemanticAnalyser().visit(newCtx.type()).type();
        String javaType = mapType(type);

        String args = newCtx.expression().stream()
            .map(this::visit)
            .map(ST::render)
            .collect(Collectors.joining(", "));

        return new ST("new " + javaType + "(" + args + ")");
    }

    @Override
    public ST visitTypeConversion(FiglanParser.TypeConversionContext ctx) {
        FiglanType targetType = new SemanticAnalyser().visit(ctx.type()).type();
        ST expr = visit(ctx.expression());
        
        return switch (targetType) {
            case INTEGER -> new ST("Integer.parseInt(" + expr.render() + ")");
            case REAL -> new ST("Double.parseDouble(" + expr.render() + ")");
            case TEXT -> new ST("String.valueOf(" + expr.render() + ")");
            default -> expr;
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