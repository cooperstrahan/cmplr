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

        AbstractSyntaxTree tree = listener.getAbstractSyntaxTree();

        tree.printTree();
//        boolean dup = false;
//
//        for(SymbolTable table : tables){
//            if(table.duplicateDeclaration)
//                dup = true;
//        }
//        if(!dup){
//            for(SymbolTable table : tables){
//                if(table.scope.equals("BLOCK")){
//                    System.out.println("Symbol table " + table.scope + " " + table.blockNumber);
//                } else {
//                    System.out.println("Symbol table " + table.scope);
//                }
//                for(String id : table.variables.keySet() ){
//                    Symbol symbol = table.variables.get(id);
//
//                    if(symbol.stringValue != null){
//                        System.out.println("name " + symbol.name + " type " + symbol.type + " value " + symbol.stringValue);
//                    } else {
//                        System.out.println("name " + symbol.name + " type " + symbol.type);
//                    }
//
//
//                }
//                System.out.println();
//            }
//        }
    }
}
