package com.company;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Stack;

public class Listener implements microGrammarListener {

    LinkedHashMap<String, String> symbolTable = new LinkedHashMap<String, String>();
    HashMap<String, String> expressions = new HashMap<>();
    ArrayList<IRNode> generatedCode = new ArrayList<>();
    int max_temp;

    private void enter(String id, String val){
        symbolTable.putIfAbsent(id, val);
    }

    public LinkedHashMap<String, String> getSymbolTable() {
        return symbolTable;
    }

    public ArrayList<IRNode> getGeneratedCode() {
        return generatedCode;
    }

    public HashMap<String, String> getExpressions() {
        return expressions;
    }

    private String get_temp(String type){
        if(symbolTable.get("$T"+max_temp) != null)
            return "$T"+max_temp;
        return new_temp(type);
    }

    String new_temp(String type){

        //generate new temporary value
        max_temp++;
        String temp_name = "$T" + max_temp;

        //add temp to symbol Table
        enter(temp_name, type);

        return temp_name;
    }

    private void generate(String opCode, String op1, String op2, String result){
        generatedCode.add(new IRNode(opCode, op1, op2, result));
    }

    private String extract(microGrammarParser.Assign_exprContext ctx){
//        If ctx is a int/float literal generate temp and assign int/float literal
//        If ctx is a

        return "";
    }

    @Override
    public void enterProgram(microGrammarParser.ProgramContext ctx) {
        generate(";IR", "code", "", "");

    }

    @Override
    public void exitProgram(microGrammarParser.ProgramContext ctx) {
        generate(";RET", "", "", "");
        generate(";tiny code", "", "", "");
    }

    @Override
    public void enterId(microGrammarParser.IdContext ctx) {

    }

    @Override
    public void exitId(microGrammarParser.IdContext ctx) {

    }

    @Override
    public void enterPgm_body(microGrammarParser.Pgm_bodyContext ctx) {

    }

    @Override
    public void exitPgm_body(microGrammarParser.Pgm_bodyContext ctx) {

    }

    @Override
    public void enterDecl(microGrammarParser.DeclContext ctx) {

    }

    @Override
    public void exitDecl(microGrammarParser.DeclContext ctx) {

    }

    @Override
    public void enterString_decl(microGrammarParser.String_declContext ctx) {

    }

    @Override
    public void exitString_decl(microGrammarParser.String_declContext ctx) {
        enter(ctx.id().getText(), ctx.str().STRINGLITERAL().getText());
    }

    @Override
    public void enterStr(microGrammarParser.StrContext ctx) {

    }

    @Override
    public void exitStr(microGrammarParser.StrContext ctx) {

    }

    @Override
    public void enterVar_decl(microGrammarParser.Var_declContext ctx) {
        String[] id_list = ctx.id_list().getText().split(",");
        for(String id : id_list){
            enter(id, ctx.var_type().getText());
        }
    }

    @Override
    public void exitVar_decl(microGrammarParser.Var_declContext ctx) {

    }

    @Override
    public void enterVar_type(microGrammarParser.Var_typeContext ctx) {

    }

    @Override
    public void exitVar_type(microGrammarParser.Var_typeContext ctx) {

    }

    @Override
    public void enterAny_type(microGrammarParser.Any_typeContext ctx) {

    }

    @Override
    public void exitAny_type(microGrammarParser.Any_typeContext ctx) {

    }

    @Override
    public void enterId_list(microGrammarParser.Id_listContext ctx) {

    }

    @Override
    public void exitId_list(microGrammarParser.Id_listContext ctx) {

    }

    @Override
    public void enterId_tail(microGrammarParser.Id_tailContext ctx) {

    }

    @Override
    public void exitId_tail(microGrammarParser.Id_tailContext ctx) {

    }

    @Override
    public void enterParam_decl_list(microGrammarParser.Param_decl_listContext ctx) {

    }

    @Override
    public void exitParam_decl_list(microGrammarParser.Param_decl_listContext ctx) {

    }

    @Override
    public void enterParam_decl(microGrammarParser.Param_declContext ctx) {

    }

    @Override
    public void exitParam_decl(microGrammarParser.Param_declContext ctx) {

    }

    @Override
    public void enterParam_decl_tail(microGrammarParser.Param_decl_tailContext ctx) {

    }

    @Override
    public void exitParam_decl_tail(microGrammarParser.Param_decl_tailContext ctx) {

    }

    @Override
    public void enterFunc_declarations(microGrammarParser.Func_declarationsContext ctx) {

    }

    @Override
    public void exitFunc_declarations(microGrammarParser.Func_declarationsContext ctx) {

    }

    @Override
    public void enterFunc_decl(microGrammarParser.Func_declContext ctx) {
        generate(";LABEL", ctx.id().getText(), "", "");
        generate(";LINK", "", "", "");
    }

    @Override
    public void exitFunc_decl(microGrammarParser.Func_declContext ctx) {

    }

    @Override
    public void enterFunc_body(microGrammarParser.Func_bodyContext ctx) {

    }

    @Override
    public void exitFunc_body(microGrammarParser.Func_bodyContext ctx) {

    }

    @Override
    public void enterStmt_list(microGrammarParser.Stmt_listContext ctx) {

    }

    @Override
    public void exitStmt_list(microGrammarParser.Stmt_listContext ctx) {

    }

    @Override
    public void enterStmt(microGrammarParser.StmtContext ctx) {

    }

    @Override
    public void exitStmt(microGrammarParser.StmtContext ctx) {

    }

    @Override
    public void enterBase_stmt(microGrammarParser.Base_stmtContext ctx) {

    }

    @Override
    public void exitBase_stmt(microGrammarParser.Base_stmtContext ctx) {

    }

    @Override
    public void enterAssign_stmt(microGrammarParser.Assign_stmtContext ctx) {

    }

    @Override
    public void exitAssign_stmt(microGrammarParser.Assign_stmtContext ctx) {

    }

    @Override
    public void enterAssign_expr(microGrammarParser.Assign_exprContext ctx) {

    }

    @Override
    public void exitAssign_expr(microGrammarParser.Assign_exprContext ctx) {
        String id = ctx.id().getText();
        String type = symbolTable.get(id);
        switch (type) {
            case "INT":
                generate(";STOREI", get_temp(type), id, "");
                break;
            case "FLOAT":
                generate(";STOREF", get_temp(type), id, "");
                break;
            default:
                break;

        }

    }

    @Override
    public void enterRead_stmt(microGrammarParser.Read_stmtContext ctx) {

    }

    @Override
    public void exitRead_stmt(microGrammarParser.Read_stmtContext ctx) {
        String[] id_list = ctx.id_list().getText().split(",");
        for(String id : id_list){
            String type = symbolTable.get(id);
            switch (type){
                case "INT":
                    generate(";READI", id, "", "");
                    break;
                case "FLOAT":
                    generate(";READF", id, "", "");
                    break;
                default:
                    generate(";READS", id, "", "");
                    break;
            }
        }
    }

    @Override
    public void enterWrite_stmt(microGrammarParser.Write_stmtContext ctx) {

    }

    @Override
    public void exitWrite_stmt(microGrammarParser.Write_stmtContext ctx) {
        String[] id_list = ctx.id_list().getText().split(",");
        for(String id : id_list){
            String type = symbolTable.get(id);
            switch (type){
                case "INT":
                    generate(";WRITEI", id, "", "");
                    break;
                case "FLOAT":
                    generate(";WRITEF", id, "", "");
                    break;
                default:
                    generate(";WRITES", id, "", "");
                    break;
            }
        }
    }

    @Override
    public void enterReturn_stmt(microGrammarParser.Return_stmtContext ctx) {

    }

    @Override
    public void exitReturn_stmt(microGrammarParser.Return_stmtContext ctx) {

    }

    @Override
    public void enterExpr(microGrammarParser.ExprContext ctx) {

    }

    @Override
    public void exitExpr(microGrammarParser.ExprContext ctx) {
        try{
            Stack<microGrammarParser.Expr_prefixContext> prefixContexts = new Stack<>();
            microGrammarParser.Expr_prefixContext prefix = ctx.expr_prefix();
            String expr;
            String factor;
            String temporary;
            String temporary2;
            microGrammarParser.Expr_prefixContext p;
            microGrammarParser.Expr_prefixContext p2;
            String type;
            int count = 0;

            try {
                while (prefix.expr_prefix().getText() != "") {
//                    System.out.println(prefix.getText());
                    prefixContexts.push(prefix);
                    prefix = prefix.expr_prefix();
                }
            } catch (NullPointerException prefixPointer) {}


            while (!prefixContexts.isEmpty() ) {

                p = prefixContexts.pop();
                expr = p.factor().getText();
                factor = ctx.factor().getText();

                if(count > 0)
                    expr = p.getText().substring(0, p.getText().length()-1);

                if(prefixContexts.size() >= 1){
                    p2 = prefixContexts.peek();

                    if(!p2.factor().getText().equals(factor)){
                        factor = p2.factor().getText();
                    }
                }

//                System.out.println(expr + " " + factor);
                temporary = expressions.get(expr);
                temporary2 = expressions.get(factor);

                count++;
                type = symbolTable.get(temporary);

                if(type == null)
                    type = symbolTable.get(temporary2);
                if(type == null)
                    type = expressions.get(expr);
                if(type == null)
                    type = expressions.get(factor);

//                System.out.println(type);


                if (temporary == null && temporary2 == null) {
                    String op = p.addop().getText();
                    switch (type) {
                        case "INT":
                            switch (op) {
                                case "+":
                                    generate(";ADDI", expr, factor, new_temp("INT"));
                                    break;
                                case "-":
                                    generate(";SUBI", expr, factor, new_temp("INT"));
                                    break;
                            }
                            break;
                        case "FLOAT":
                            switch (op) {
                                case "+":
                                    generate(";ADDF", expr, factor, new_temp("FLOAT"));
                                    break;
                                case "-":
                                    generate(";SUBF", expr, factor, new_temp("FLOAT"));
                                    break;
                            }
                            break;
                    }
                    expressions.put(expr+op+factor, get_temp(type));
                } else if (temporary == null && temporary2 != null) {
                    String op = p.addop().getText();
                    switch (type) {
                        case "INT":
                            switch (op) {
                                case "+":
                                    generate(";ADDI", expr, temporary2, new_temp("INT"));
                                    break;
                                case "-":
                                    generate(";SUBI", expr, temporary2, new_temp("INT"));
                                    break;
                            }
                            break;
                        case "FLOAT":
                            switch (op) {
                                case "+":
                                    generate(";ADDF", expr, temporary2, new_temp("FLOAT"));
                                    break;
                                case "-":
                                    generate(";SUBF", expr, temporary2, new_temp("FLOAT"));
                                    break;
                            }
                            break;
                    }
                    expressions.put(expr+op+factor, get_temp(type));
                }else if (temporary != null && temporary2 == null) {
                    String op = p.addop().getText();
                    switch (type) {
                        case "INT":
                            switch (op) {
                                case "+":
                                    generate(";ADDI", temporary, factor, new_temp("INT"));
                                    break;
                                case "-":
                                    generate(";SUBI", temporary, factor, new_temp("INT"));
                                    break;
                            }
                            break;
                        case "FLOAT":
                            switch (op) {
                                case "+":
                                    generate(";ADDF", temporary, factor, new_temp("FLOAT"));
                                    break;
                                case "-":
                                    generate(";SUBF", temporary, factor, new_temp("FLOAT"));
                                    break;
                            }
                            break;
                    }
                    expressions.put(expr+op+factor, get_temp(type));
                } else if (temporary != null && temporary2 != null) {
              String op = p.addop().getText();
                    switch (type) {
                        case "INT":
                            switch (op) {
                                case "+":
                                    generate(";ADDI", temporary, temporary2, new_temp("INT"));
                                    break;
                                case "-":
                                    generate(";SUBI", temporary, temporary2, new_temp("INT"));
                                    break;
                            }
                            break;
                        case "FLOAT":
                            switch (op) {
                                case "+":
                                    generate(";ADDF", temporary, temporary2, new_temp("FLOAT"));
                                    break;
                                case "-":
                                    generate(";SUBF", temporary, temporary2, new_temp("FLOAT"));
                                    break;
                            }
                            break;
                    }
                    expressions.put(expr+op+factor, get_temp(type));
                }
            }
        } catch (NullPointerException np) {
//            System.out.println("Null Ptr: " + ctx.getText());
        }
//        generate("Add Expr", "", "", "");
    }

    @Override
    public void enterExpr_prefix(microGrammarParser.Expr_prefixContext ctx) {

    }

    @Override
    public void exitExpr_prefix(microGrammarParser.Expr_prefixContext ctx) {

    }

    @Override
    public void enterFactor(microGrammarParser.FactorContext ctx) {

    }

    @Override
    public void exitFactor(microGrammarParser.FactorContext ctx) {
//        System.out.println(ctx.getText());
        try{
            String op = ctx.factor_prefix().mulop().getText();
            String id1 = ctx.factor_prefix().postfix_expr().primary().id().getText();
            String id2 = ctx.postfix_expr().primary().id().getText();

//            System.out.println("id1: " + id1 + " id2: " + id2);
            String type = symbolTable.get(id1);
            switch (type) {
                case "INT":
                switch (op) {
                    case "*":
                        generate(";MULTI", id1, id2, new_temp("INT"));
                        break;
                    case "/":
                        generate(";DIVI", id1, id2, new_temp("INT"));
                        break;
                }
                break;
                case "FLOAT":
                    switch (op) {
                        case "*":
                            generate(";MULTF", id1, id2, new_temp("FLOAT"));
                            break;
                        case "/":
                            generate(";DIVF", id1, id2, new_temp("FLOAT"));
                            break;
                    }
                    break;
            }
//            System.out.println("Adding to expressions " + ctx.getText());
            expressions.put(ctx.getText(), get_temp(type));
        } catch (NullPointerException np) {
            try{
//                System.out.println("Null Ptr: "+ ctx.factor_prefix().getText());
//                System.out.println("Operation: " + ctx.factor_prefix().mulop().getText());

                String op = ctx.factor_prefix().mulop().getText();
                String id = ctx.postfix_expr().primary().id().getText();
                String type = symbolTable.get(id);
                String temporary = get_temp(type);

                switch (type) {
                    case "INT":
                        switch (op) {
                            case "*":
                                generate(";MULTI", temporary, id, new_temp("INT"));
                                break;
                            case "/":
                                generate(";DIVI", temporary, id, new_temp("INT"));
                                break;
                        }
                        break;
                    case "FLOAT":
                        switch (op) {
                            case "*":
                                generate(";MULTF", temporary, id, new_temp("FLOAT"));
                                break;
                            case "/":
                                generate(";DIVF", temporary, id, new_temp("FLOAT"));
                                break;
                        }
                        break;
                }
//                System.out.println("Adding to expressions " + ctx.getText());
                expressions.put(ctx.getText(), get_temp(type));
            } catch (NullPointerException np1) { }
        }
    }

    @Override
    public void enterFactor_prefix(microGrammarParser.Factor_prefixContext ctx) {

    }

    @Override
    public void exitFactor_prefix(microGrammarParser.Factor_prefixContext ctx) {

    }

    @Override
    public void enterPostfix_expr(microGrammarParser.Postfix_exprContext ctx) {

    }

    @Override
    public void exitPostfix_expr(microGrammarParser.Postfix_exprContext ctx) {

    }

    @Override
    public void enterCall_expr(microGrammarParser.Call_exprContext ctx) {

    }

    @Override
    public void exitCall_expr(microGrammarParser.Call_exprContext ctx) {

    }

    @Override
    public void enterExpr_list(microGrammarParser.Expr_listContext ctx) {

    }

    @Override
    public void exitExpr_list(microGrammarParser.Expr_listContext ctx) {

    }

    @Override
    public void enterExpr_list_tail(microGrammarParser.Expr_list_tailContext ctx) {

    }

    @Override
    public void exitExpr_list_tail(microGrammarParser.Expr_list_tailContext ctx) {

    }

    @Override
    public void enterPrimary(microGrammarParser.PrimaryContext ctx) {

    }

    @Override
    public void exitPrimary(microGrammarParser.PrimaryContext ctx) {
        try{
            String num = ctx.INTLITERAL().getText();
            generate(";STOREI", num, new_temp("INT"), "");
            expressions.put(num, get_temp("INT"));
        } catch (NullPointerException np){}
        try{
            String num = ctx.FLOATLITERAL().getText();
            generate(";STOREF", num, new_temp("FLOAT"), "");
            expressions.put(num, get_temp("FLOAT"));
        } catch (NullPointerException np){}
    }

    @Override
    public void enterAddop(microGrammarParser.AddopContext ctx) {

    }

    @Override
    public void exitAddop(microGrammarParser.AddopContext ctx) {

    }

    @Override
    public void enterMulop(microGrammarParser.MulopContext ctx) {

    }

    @Override
    public void exitMulop(microGrammarParser.MulopContext ctx) {

    }

    @Override
    public void enterIf_stmt(microGrammarParser.If_stmtContext ctx) {

    }

    @Override
    public void exitIf_stmt(microGrammarParser.If_stmtContext ctx) {

    }

    @Override
    public void enterElse_part(microGrammarParser.Else_partContext ctx) {

    }

    @Override
    public void exitElse_part(microGrammarParser.Else_partContext ctx) {

    }

    @Override
    public void enterCond(microGrammarParser.CondContext ctx) {

    }

    @Override
    public void exitCond(microGrammarParser.CondContext ctx) {

    }

    @Override
    public void enterCompop(microGrammarParser.CompopContext ctx) {

    }

    @Override
    public void exitCompop(microGrammarParser.CompopContext ctx) {

    }

    @Override
    public void enterWhile_stmt(microGrammarParser.While_stmtContext ctx) {

    }

    @Override
    public void exitWhile_stmt(microGrammarParser.While_stmtContext ctx) {

    }

    @Override
    public void enterEmpty(microGrammarParser.EmptyContext ctx) {

    }

    @Override
    public void exitEmpty(microGrammarParser.EmptyContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
