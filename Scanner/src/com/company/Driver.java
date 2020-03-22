package com.company;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

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

        tokens.consume();
        while(true)
        {
            Token t = tokens.get(tokens.index()-1);
            if(t.getType() != Token.EOF)
            {
                System.out.println("Token Type: " + lexer.getVocabulary().getSymbolicName(t.getType()));
                System.out.println("Value: " + t.getText());

            }
            if(tokens.get(tokens.index()).getType() != Token.EOF) {
                tokens.consume();
            }
            else {
                break;
            }
        }
    }

}
