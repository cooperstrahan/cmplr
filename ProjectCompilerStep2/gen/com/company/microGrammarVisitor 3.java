// Generated from /Users/cooperstrahan/Documents/Compilers/ProjectCompilerStep2/src/com/company/microGrammar.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link microGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface microGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(microGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(microGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#pgm_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgm_body(microGrammarParser.Pgm_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(microGrammarParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#string_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_decl(microGrammarParser.String_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(microGrammarParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(microGrammarParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(microGrammarParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#any_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_type(microGrammarParser.Any_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(microGrammarParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#id_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_tail(microGrammarParser.Id_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#param_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_list(microGrammarParser.Param_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl(microGrammarParser.Param_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#param_decl_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_tail(microGrammarParser.Param_decl_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#func_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_declarations(microGrammarParser.Func_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(microGrammarParser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(microGrammarParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(microGrammarParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(microGrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#base_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_stmt(microGrammarParser.Base_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(microGrammarParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(microGrammarParser.Assign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(microGrammarParser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(microGrammarParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(microGrammarParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(microGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#expr_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_prefix(microGrammarParser.Expr_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(microGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#factor_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_prefix(microGrammarParser.Factor_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#postfix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expr(microGrammarParser.Postfix_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#call_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_expr(microGrammarParser.Call_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(microGrammarParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#expr_list_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list_tail(microGrammarParser.Expr_list_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(microGrammarParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(microGrammarParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(microGrammarParser.MulopContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(microGrammarParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(microGrammarParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(microGrammarParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#compop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompop(microGrammarParser.CompopContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(microGrammarParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link microGrammarParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(microGrammarParser.EmptyContext ctx);
}