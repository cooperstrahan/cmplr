package com.company;

public class Symbol {
    public String name;
    public String type;
    public String stringValue;
    public int intValue;
    public float floatValue;

    public Symbol(String name, String type){
        this.name = name;
        this.type = type;
    }

    public Symbol(String name, String type, String stringValue){
        this.name = name;
        this.type = type;
        this.stringValue = stringValue;
    }

    public Symbol(String name, String type, int intValue){
        this.name = name;
        this.type = type;
        this.intValue = intValue;
    }

    public Symbol(String name, String type, float floatValue){
        this.name = name;
        this.type = type;
        this.floatValue = floatValue;
    }
}
