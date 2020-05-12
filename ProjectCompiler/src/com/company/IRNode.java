package com.company;

public class IRNode {
    String opCode;
    String op1;
    String op2;
    String result;

    public IRNode(String opCode, String op1, String op2, String result){
        this.opCode = opCode;
        this.op1 = op1;
        this.op2 = op2;
        this.result = result;
    }
}
