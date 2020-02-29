import org.antlr.v4.runtime.*;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;

public class Driver {
    private static Object EOFException;

    public static void main(String[] args) throws Exception {
        String inputFile = args[0];

        InputStream is = System.in;
        if (inputFile != null ) is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);
        microGrammarLexer lexer = new microGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        microGrammarParser parser = new microGrammarParser(tokens);

        parser.removeErrorListeners();
        parser.program();
        if(parser.getNumberOfSyntaxErrors() > 0){
            System.out.println("Not accepted");
        } else {
            System.out.println("Accepted");
        }

    }

}
