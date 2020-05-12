package com.company;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        String inputFile = args[0];

        InputStream is = System.in;
        if (inputFile != null ) is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);
        microGrammarLexer lexer = new microGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        microGrammarParser parser = new microGrammarParser(tokens);

        Listener listener = new Listener();

        new ParseTreeWalker().walk(listener, parser.program());

        LinkedHashMap<String, String> map = listener.getSymbolTable();

        HashMap<String, String> expr = listener.getExpressions();

        ArrayList<IRNode> intRepCode = listener.getGeneratedCode();

        for(IRNode node : intRepCode){
            System.out.println(node.opCode + " " + node.op1 + " " + node.op2 + " " + node.result + " ");
        }

        CodeGenerator code = new CodeGenerator(map, intRepCode);


    }
}
