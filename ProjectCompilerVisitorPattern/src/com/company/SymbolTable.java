package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class SymbolTable {
    String scope;
    Map<String, Symbol> variables = new LinkedHashMap<String, Symbol>();
    int blockNumber = 0;
    boolean duplicateDeclaration = false;

    public SymbolTable() { }

    public SymbolTable(String scope){
        this.scope = scope;
        if(scope.equals("BLOCK"))
            blockNumber++;
    }

    public SymbolTable(String scope, int blockNumber) {
        this.scope = scope;
        this.blockNumber = blockNumber;
    }

    public SymbolTable(String scope, Map<String, Symbol> variables){
        this.scope = scope;
        this.variables = variables;
    }

    public void addString(String name, String value){
        variables.put(name, new Symbol(name, "String", value));

    }

    public void addVar(String name, String type){
        variables.put(name, new Symbol(name, type));
    }
}
