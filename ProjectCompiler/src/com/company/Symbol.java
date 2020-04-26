package com.company;

public class Symbol {
    public String name;
    public String type;
    public String stringValue;


    public Symbol(String name, String type){
        this.name = name;
        this.type = type;
    }

    public Symbol(String name, String type, String stringValue){
        this.name = name;
        this.type = type;
        this.stringValue = stringValue;
    }

}
