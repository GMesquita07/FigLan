package compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import generated.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TestParser {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Uso: java TestParser <ficheiro.fl>");
            System.exit(1);
        }

        String input = Files.readString(Paths.get(args[0]));
        CharStream cs = CharStreams.fromString(input);

        FiglanLexer lexer = new FiglanLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FiglanParser parser = new FiglanParser(tokens);

        ParseTree tree = parser.program();  // regra inicial
        System.out.println(tree.toStringTree(parser));
    }
}
