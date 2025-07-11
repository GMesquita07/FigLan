// Ficheiro: src/figlan/compiler/Main.java
package figlan.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import figlan.generated.*; // Importa as classes geradas pelo ANTLR

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java figlan.compiler.Main <source-file>");
            System.exit(1);
        }

        String fileName = args[0];
        try {
            // 1. Ler o ficheiro e criar o CharStream
            CharStream input = CharStreams.fromFileName(fileName);

            // 2. Criar o Lexer
            FiglanLexer lexer = new FiglanLexer(input);

            // 3. Criar o fluxo de tokens e o Parser
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FiglanParser parser = new FiglanParser(tokens);

            // 4. Iniciar a análise sintática a partir da regra 'program'
            ParseTree tree = parser.program();

            // Verifica se houve erros sintáticos antes de prosseguir
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("Syntax errors detected. Halting analysis.");
                System.exit(1);
            }

            // 5. Criar o Analisador Semântico e visitá-lo
            SemanticAnalyser analyser = new SemanticAnalyser();
            analyser.visit(tree);

            // 6. Verificar o resultado da análise semântica
            int errorCount = analyser.getErrorCount();
            if (errorCount == 0) {
                System.out.println("Semantic analysis successful! The program is valid.");
            } else {
                System.err.printf("Semantic analysis failed with %d error(s).\n", errorCount);
                System.exit(1);
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
    }
}