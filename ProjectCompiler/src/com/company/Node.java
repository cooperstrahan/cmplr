package com.company;
import com.sun.jmx.snmp.SnmpOidDatabase;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public String type;
    public String name;
    public int intValue;
    public float floatValue;
    public String stringValue;


    public Node leftChild;
    public Node centerChild;
    public Node rightChild;

    public Node() {}

    public Node(String name, String type){
        this.type = type;
        this.name = name;
    }

    public Node(String name, String type, int intValue){
            this.type = type;
            this.name = name;
            this.intValue = intValue;
    }

    public Node(String name, String type, float floatValue){
        this.type = type;
        this.name = name;
        this.floatValue = floatValue;
    }

    public Node(String type, String name, String stringValue){
        this.type = type;
        this.name = name;
        this.stringValue = stringValue;
    }


}
