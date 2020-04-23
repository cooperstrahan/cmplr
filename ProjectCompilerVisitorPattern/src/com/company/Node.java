package com.company;

import sun.jvm.hotspot.debugger.cdbg.Sym;

public class Node {
    public Symbol symbol;
    public Node LeftChild;
    public Node CenterChild;
    public Node RightChild;

    public Node(String name, String type){
        this.symbol = new Symbol(name, type);
    }

    public Node(Node node){
        this.symbol = node.symbol;
        this.LeftChild = node.LeftChild;
        this.CenterChild = node.CenterChild;
        this.RightChild = node.RightChild;
    }

    public Node(String name, String type, String stringValue){
        this.symbol = new Symbol(name, type, stringValue);
    }

    public Node(String name, String type, int intValue){
        this.symbol = new Symbol(name, type, intValue);
    }

    public Node(String name, String type, float floatValue){
        this.symbol = new Symbol(name, type, floatValue);
    }



}
