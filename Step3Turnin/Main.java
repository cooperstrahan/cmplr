package com.company;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        String inputFile = args[0];

        InputStream is = System.in;
        if (inputFile != null ) is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);
        microGrammarLexer lexer = new microGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        microGrammarParser parser = new microGrammarParser(tokens);
        microGrammarBaseListener listener = new microGrammarBaseListener();

        new ParseTreeWalker().walk(listener, parser.program());

        ArrayList<SymbolTable> tables = listener.getSymbolTable();

        boolean dup = false;

        for(SymbolTable table : tables){
            if(table.duplicateDeclaration)
                dup = true;
        }
        if(!dup){
            for(SymbolTable table : tables){
                if(table.scope.equals("BLOCK")){
                    System.out.println("Symbol table " + table.scope + " " + table.blockNumber);
                } else {
                    System.out.println("Symbol table " + table.scope);
                }
                for(String id : table.variables.keySet() ){
                    String value = table.variables.get(id);
                    String first = value.split("")[0];
                    if(first.equals("\"")){
                        System.out.println("name " + id + " type STRING value " + value);
                    } else {
                        System.out.println("name " + id + " type " + value);
                    }
                }
                System.out.println();
            }
        }



//        parser.removeErrorListeners();
//        parser.program();
//        if(parser.getNumberOfSyntaxErrors() > 0){
//            System.out.println("Not accepted");
//        } else {
//            System.out.println("Accepted");
//        }


    }
}
