package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class CodeGenerator {
    public HashMap<String, String> map = new HashMap<>();

    public CodeGenerator(LinkedHashMap<String, String> symbolTable, ArrayList<IRNode> irNodes ){
        int register = -1;
        try {
            for (String key : symbolTable.keySet()) {
                if (key.substring(0, 1).equals("$")) {
                    symbolTable.remove(key, symbolTable.get(key));
                }
                if (symbolTable.get(key).equals("INT") || symbolTable.get(key).equals("FLOAT")) {
                    System.out.println("var " + key);
                } else {
                    System.out.println("str " + key + " " + symbolTable.get(key));
                }

            }
        } catch (NullPointerException np){}

        for(IRNode node : irNodes){
            if(node.op1.length() > 0){
                if(node.op1.substring(0,1).equals("$")){
                    map.putIfAbsent(node.op1, "r"+register);
                }
            }
            if(node.op2.length() > 0){
                if(node.op2.substring(0,1).equals("$")){
                    register++;
                    map.putIfAbsent(node.op2, "r" + register);
                }
            }
            if(node.result.length() > 0){
                if(node.result.substring(0,1).equals("$")){
                    register++;
                    map.putIfAbsent(node.result, "r" + register);
                }
            }
//            System.out.println(node.opCode + " " + node.op1 + " " + node.op2 + " " + node.result + " ");

            if(node.opCode.equals(";STOREI") && node.op2.substring(0,1).equals("$")){
                System.out.println("move " + node.op1 + " " + map.get(node.op2));
            }
            if(node.opCode.equals(";STOREI") && node.op1.substring(0,1).equals("$")){
                System.out.println("move " + map.get(node.op1) + " " + node.op2);
            }
            if(node.opCode.equals(";STOREF") && node.op2.substring(0,1).equals("$")){
                System.out.println("move " + node.op1 + " " + map.get(node.op2));
            }
            if(node.opCode.equals(";STOREF") && node.op1.substring(0,1).equals("$")){
                System.out.println("move " + map.get(node.op1) + " " + node.op2);
            }

            if(node.opCode.equals(";READI")){
                System.out.println("sys readi " + node.op1);
            }
            if(node.opCode.equals(";READF")){
                System.out.println("sys readf " + node.op1 );
            }

            if(node.opCode.equals(";WRITEI")){
                System.out.println("sys writei " + node.op1);
            }
            if(node.opCode.equals(";WRITEF")){
                System.out.println("sys writef " + node.op1 );
            }
            if(node.opCode.equals(";WRITES")){
                System.out.println("sys writes " + node.op1 );
            }
            if(node.opCode.equals(";RET")){
                System.out.println("sys halt");
            }

            //Integer multiplication
            if(node.opCode.equals(";MULTI") && map.get(node.op1) == null && map.get(node.op2) == null){
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("muli " + node.op2 + " " + map.get(node.result));
            }

            if(node.opCode.equals(";MULTI") && map.get(node.op1) != null && map.get(node.op2) == null){
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("muli " + node.op2 + " " + map.get(node.result));
            }

            if(node.opCode.equals(";MULTI") && map.get(node.op1) == null && map.get(node.op2) != null){
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("muli " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";MULTI") && map.get(node.op1) != null && map.get(node.op2) != null){
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("muli " + map.get(node.op2) + " " + map.get(node.result));
            }
            //Float Multiplication
            if(node.opCode.equals(";MULTF") && map.get(node.op1) == null && map.get(node.op2) == null){
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("mulf " + node.op2 + " " + map.get(node.result));
            }

            if(node.opCode.equals(";MULTF") && map.get(node.op1) != null && map.get(node.op2) == null){
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("mulf " + node.op2 + " " + map.get(node.result));
            }

            if(node.opCode.equals(";MULTF") && map.get(node.op1) == null && map.get(node.op2) != null){
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("mulf " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";MULTF") && map.get(node.op1) != null && map.get(node.op2) != null){
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("mulf " + map.get(node.op2) + " " + map.get(node.result));
            }

            //Integer Addition

            if(node.opCode.equals(";ADDI") && map.get(node.op1) != null && map.get(node.op2) != null) {
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("addi " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";ADDI") && map.get(node.op1) != null && map.get(node.op2) == null) {
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("addi " + node.op2 + " " + map.get(node.result));
            }

            if(node.opCode.equals(";ADDI") && map.get(node.op1) == null && map.get(node.op2) != null) {
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("addi " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";ADDI") && map.get(node.op2) == null && map.get(node.op1) == null) {
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("addi " + node.op2 + " " + map.get(node.result));
            }

            //Float Addition

            if(node.opCode.equals(";ADDF") && map.get(node.op1) != null && map.get(node.op2) != null) {
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("addf " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";ADDF") && map.get(node.op1) != null && map.get(node.op2) == null) {
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("addf " + node.op2 + " " + map.get(node.result));
            }

            if(node.opCode.equals(";ADDF") && map.get(node.op1) == null && map.get(node.op2) != null) {
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("addf " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";ADDF") && map.get(node.op2) == null && map.get(node.op1) == null) {
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("addf " + node.op2 + " " + map.get(node.result));
            }

            //Integer Subtraction
            if(node.opCode.equals(";SUBI") && map.get(node.op1) != null && map.get(node.op2) != null) {
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("subi " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";SUBI") && map.get(node.op1) != null && map.get(node.op2) == null) {
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("subi " + node.op2 + " " + map.get(node.result));
            }

            if(node.opCode.equals(";SUBI") && map.get(node.op1) == null && map.get(node.op2) != null) {
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("subi " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";SUBI") && map.get(node.op1) == null && map.get(node.op2) == null) {
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("subi " + node.op2 + " " + map.get(node.result));
            }

            //Float Subtraction

            if(node.opCode.equals(";SUBF") && map.get(node.op1) != null && map.get(node.op2) != null) {
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("subf " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";SUBF") && map.get(node.op1) != null && map.get(node.op2) == null) {
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("subf " + node.op2 + " " + map.get(node.result));
            }

            if(node.opCode.equals(";SUBF") && map.get(node.op1) == null && map.get(node.op2) != null) {
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("subf " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";SUBF") && map.get(node.op1) == null && map.get(node.op2) == null) {
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("subf " + node.op2 + " " + map.get(node.result));
            }

            //Integer Division

            if(node.opCode.equals(";DIVI") && map.get(node.op1) != null && map.get(node.op2) != null) {
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("divi " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";DIVI") && map.get(node.op1) != null && map.get(node.op2) == null) {
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("divi " + node.op2 + " " + map.get(node.result));
            }

            if(node.opCode.equals(";DIVI") && map.get(node.op1) == null && map.get(node.op2) != null) {
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("divi " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";DIVI") && map.get(node.op1) == null && map.get(node.op2) == null) {
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("divi " + node.op2 + " " + map.get(node.result));
            }

            //Float Division

            if(node.opCode.equals(";DIVF") && map.get(node.op1) != null && map.get(node.op2) != null) {
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("divf " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";DIVF") && map.get(node.op1) != null && map.get(node.op2) == null) {
                System.out.println("move " + map.get(node.op1) + " " + map.get(node.result));
                System.out.println("divf " + node.op2 + " " + map.get(node.result));
            }

            if(node.opCode.equals(";DIVF") && map.get(node.op1) == null && map.get(node.op2) != null) {
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("divf " + map.get(node.op2) + " " + map.get(node.result));
            }

            if(node.opCode.equals(";DIVF") && map.get(node.op1) == null && map.get(node.op2) == null) {
                System.out.println("move " + node.op1 + " " + map.get(node.result));
                System.out.println("divf " + node.op2 + " " + map.get(node.result));
            }


        }


    }

}

