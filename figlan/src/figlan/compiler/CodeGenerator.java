// Ficheiro: src/compiler/CodeGenerator.java
package figlan.compiler;

import figlan.generated.*;
import figlan.compiler.utils.PathConfig;

import org.stringtemplate.v4.*;

import java.util.ArrayList;
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
        this.templates = new STGroupFile(PathConfig.getTemplateFilePath("Java.stg"));
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
            // CORREÇÃO: Mapear 'figure' para uma lista de figuras Java.
            case FIGURE -> "List<Figure>"; 
            default -> "void";
        };
    }

    private String getDefaultValue(FiglanType type) {
        return switch (type) {
            case INTEGER -> "0";
            case REAL -> "0.0";
            // CORREÇÃO: Inicializar a lista de figuras.
            case FIGURE -> "new ArrayList<>()";
            default -> "null";
        };
    }

    // --- Métodos de Visita para a Geração de Código ---

    @Override
    public ST visitProgram(FiglanParser.ProgramContext ctx) {
        ST programST = templates.getInstanceOf("program");
        
        // CORREÇÃO: Mapear diretamente para o visit, que agora é seguro.
        List<ST> statements = ctx.statement().stream()
                .map(this::visit) // Simplificado!
                .collect(Collectors.toList()); 
                
        programST.add("statements", statements);
        return programST;
    }

    @Override
    public ST visitVarDecl(FiglanParser.VarDeclContext ctx) {
        String firstVarNameInDecl = ctx.varInit(0).ID().getText();
        Symbol symbol = st.get(firstVarNameInDecl);
        FiglanType type = symbol.type();
        String javaType = mapType(type);
        
        // CORREÇÃO: Mapear para uma LISTA DE OBJETOS ST, não para strings.
        List<ST> declarationSTs = ctx.varInit().stream()
            .map(varCtx -> {
                String varName = varCtx.ID().getText();
                ST decl = templates.getInstanceOf("varDecl");
                decl.add("type", javaType);
                decl.add("name", varName);

                if (varCtx.expression() != null) {
                    decl.add("value", visit(varCtx.expression())); // Retorna ST
                } else {
                    decl.add("value", getDefaultValue(type));
                }
                return decl; // Retorna o objeto ST, não a sua renderização.
            })
            .collect(Collectors.toList());

        // CORREÇÃO: Usar um template contentor para juntar as declarações.
        ST container = new ST("<declarations; separator=\"\\n\">");
        container.add("declarations", declarationSTs);
        return container;
    }

    @Override
    public ST visitStatement(FiglanParser.StatementContext ctx) {
        // A regra 'statement' tem sempre um filho que é a instrução real
        // (seja um forStmt, um showStmt, etc.).
        // Ao visitar apenas o primeiro filho, ignoramos o ';' terminal.
        if (ctx.getChild(0) != null) {
            return visit(ctx.getChild(0));
        }
        return null; // Não deve acontecer com uma gramática válida
    }
    
    @Override
    public ST visitAssignStmt(FiglanParser.AssignStmtContext ctx) {
        String varName = ctx.ID().getText();
        Symbol varSymbol = st.get(varName); // Obter o símbolo da variável
        ST expr = visit(ctx.expression());
        
        // --- CORREÇÃO: Lógica para o operador '+=' em figuras ---
        if (ctx.op.getText().equals("+=") && varSymbol.type() == FiglanType.FIGURE) {
            ST addToListST = templates.getInstanceOf("addToList"); // Usar um novo template
            addToListST.add("listVar", varName);
            addToListST.add("element", expr.render());
            return addToListST;
        }
        
        // Lógica original para todos os outros casos
        ST assignST = templates.getInstanceOf("assign");
        assignST.add("var", varName);
        assignST.add("op", ctx.op.getText());
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
        // CORREÇÃO: Construir uma lista de ST e usar um template contentor.
        List<ST> showInstructions = ctx.exprList().expression().stream()
            .map(expr -> {
                // É preciso verificar se a variável é uma lista de figuras.
                String varName = expr.getText();
                Symbol symbol = st.get(varName); // Assumindo que é um ID simples.
                
                // Para expressões complexas, uma análise mais robusta seria necessária,
                // mas para os exemplos, isto funciona.
                if (symbol != null && symbol.type() == FiglanType.FIGURE) {
                    ST showListST = templates.getInstanceOf("showList");
                    showListST.add("listVar", visit(expr));
                    return showListST;
                } else {
                    ST showST = templates.getInstanceOf("show");
                    showST.add("figureVar", visit(expr));
                    return showST;
                }
            })
            .collect(Collectors.toList());

        ST container = new ST("<instructions; separator=\"\\n\">");
        container.add("instructions", showInstructions);
        return container;
    }
    
    @Override
    public ST visitHideStmt(FiglanParser.HideStmtContext ctx) {
        if (ctx.ALL() != null) {
            return templates.getInstanceOf("hideAll");
        }

        // CORREÇÃO: Lógica idêntica ao showStmt
        List<ST> hideInstructions = ctx.exprList().expression().stream()
            .map(expr -> {
                String varName = expr.getText();
                Symbol symbol = st.get(varName);
                
                if (symbol != null && symbol.type() == FiglanType.FIGURE) {
                    ST hideListST = templates.getInstanceOf("hideList");
                    hideListST.add("listVar", visit(expr));
                    return hideListST;
                } else {
                    ST hideST = templates.getInstanceOf("hide");
                    hideST.add("figureVar", visit(expr));
                    return hideST;
                }
            })
            .collect(Collectors.toList());

        ST container = new ST("<instructions; separator=\"\\n\">");
        container.add("instructions", hideInstructions);
        return container;
    }

    @Override
    public ST visitForStmt(FiglanParser.ForStmtContext ctx) {
        String varName = ctx.ID().getText();
        
        // Processa o corpo do loop (a sua lógica atual está correta)
        st.enterScope();
        st.put(varName, new Symbol(FiglanType.INTEGER)); // Garante que a var existe dentro do escopo do loop
        List<ST> body = ctx.statement().stream()
            .map(this::visit)
            .collect(Collectors.toList());
        st.exitScope();
        
        // --- LÓGICA DE DECISÃO ---
        ST forST;
        if (ctx.type() != null) {
            // Caso 1: O 'for' declara a variável (ex: for integer i = ...)
            forST = templates.getInstanceOf("forLoopWithDecl");
            forST.add("type", mapType(FiglanType.INTEGER)); // O tipo é sempre int
        } else {
            // Caso 2: O 'for' reutiliza uma variável existente (ex: for i = ...)
            forST = templates.getInstanceOf("forLoop");
        }

        // Adiciona os atributos comuns a ambos os templates
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
        // Se a expressão de leitura tiver um prompt...
        if (ctx.readExpr().expression() != null) {
            ST prompt = visit(ctx.readExpr().expression());
            
            // CORREÇÃO: Gerar uma chamada para a função auxiliar.
            return new ST("readHelper(" + prompt.render() + ")");
        }
        
        // Se não houver prompt, apenas lê a próxima linha.
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