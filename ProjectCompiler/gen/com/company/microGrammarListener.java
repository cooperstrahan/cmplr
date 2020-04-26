// Generated from /Users/cooperstrahan/Documents/Compilers/ProjectCompiler/src/com/company/microGrammar.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link microGrammarParser}.
 */
public interface microGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(microGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(microGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(microGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(microGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void enterPgm_body(microGrammarParser.Pgm_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void exitPgm_body(microGrammarParser.Pgm_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(microGrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(microGrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void enterString_decl(microGrammarParser.String_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void exitString_decl(microGrammarParser.String_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(microGrammarParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(microGrammarParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(microGrammarParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(microGrammarParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(microGrammarParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(microGrammarParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(microGrammarParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(microGrammarParser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(microGrammarParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(microGrammarParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_tail(microGrammarParser.Id_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_tail(microGrammarParser.Id_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_list(microGrammarParser.Param_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_list(microGrammarParser.Param_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(microGrammarParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(microGrammarParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_tail(microGrammarParser.Param_decl_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_tail(microGrammarParser.Param_decl_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declarations(microGrammarParser.Func_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declarations(microGrammarParser.Func_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(microGrammarParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(microGrammarParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(microGrammarParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(microGrammarParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(microGrammarParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(microGrammarParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(microGrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(microGrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBase_stmt(microGrammarParser.Base_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBase_stmt(microGrammarParser.Base_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(microGrammarParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(microGrammarParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(microGrammarParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(microGrammarParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(microGrammarParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(microGrammarParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(microGrammarParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(microGrammarParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(microGrammarParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(microGrammarParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(microGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(microGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(microGrammarParser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(microGrammarParser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(microGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(microGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void enterFactor_prefix(microGrammarParser.Factor_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void exitFactor_prefix(microGrammarParser.Factor_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expr(microGrammarParser.Postfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expr(microGrammarParser.Postfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(microGrammarParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(microGrammarParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(microGrammarParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(microGrammarParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(microGrammarParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(microGrammarParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(microGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(microGrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(microGrammarParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(microGrammarParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(microGrammarParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(microGrammarParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(microGrammarParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(microGrammarParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(microGrammarParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(microGrammarParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(microGrammarParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(microGrammarParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(microGrammarParser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(microGrammarParser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(microGrammarParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(microGrammarParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link microGrammarParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(microGrammarParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link microGrammarParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(microGrammarParser.EmptyContext ctx);
}