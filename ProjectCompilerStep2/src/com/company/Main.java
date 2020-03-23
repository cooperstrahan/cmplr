package com.company;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

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
