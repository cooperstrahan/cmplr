package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class SymbolTable {
    String scope;
    Map<String, String> variables = new LinkedHashMap<String, String>();
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

    public void addString(String name, String value){
        variables.put(name, value);

    }

    public void addVar(String name, String type){
        variables.put(name, type);
    }
}
