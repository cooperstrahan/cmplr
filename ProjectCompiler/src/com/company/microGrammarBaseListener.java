// Generated from /Users/cooperstrahan/Documents/Compilers/CompilersProject/src/com/company/microGrammar.g4 by ANTLR 4.8
package com.company;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

/**
 * This class provides an empty implementation of {@link microGrammarListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class microGrammarBaseListener implements microGrammarListener {

    ArrayList<SymbolTable> symbolTables = new ArrayList<SymbolTable>();
	int currentTable = 0;
	int currentBlock = 0;

	public ArrayList<SymbolTable> getSymbolTable(){
		return symbolTables;
	}

	private void createBlock(){
	    symbolTables.add(new SymbolTable("BLOCK", currentBlock));
        currentTable++;
    }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterProgram(microGrammarParser.ProgramContext ctx) {
	    symbolTables.add(new SymbolTable("GLOBAL"));
    }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitProgram(microGrammarParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterId(microGrammarParser.IdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitId(microGrammarParser.IdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterPgm_body(microGrammarParser.Pgm_bodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitPgm_body(microGrammarParser.Pgm_bodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterDecl(microGrammarParser.DeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitDecl(microGrammarParser.DeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterString_decl(microGrammarParser.String_declContext ctx) {
		String id = ctx.id().getText();
		String value = ctx.str().getText();
		symbolTables.get(currentTable).addString(id, value);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitString_decl(microGrammarParser.String_declContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterStr(microGrammarParser.StrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitStr(microGrammarParser.StrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterVar_decl(microGrammarParser.Var_declContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitVar_decl(microGrammarParser.Var_declContext ctx) {
		String type = ctx.var_type().getText();
		String[] idList = ctx.id_list().getText().split(",");
		for(String name : idList){
		    if(!symbolTables.get(currentTable).duplicateDeclaration){
                if(symbolTables.get(currentTable).variables.get(name) != null){
                    System.out.println("DECLARATION ERROR " + name );
                    symbolTables.get(currentTable).duplicateDeclaration = true;
                }
                symbolTables.get(currentTable).addString(name, type);
            }
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterVar_type(microGrammarParser.Var_typeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitVar_type(microGrammarParser.Var_typeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterAny_type(microGrammarParser.Any_typeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitAny_type(microGrammarParser.Any_typeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterId_list(microGrammarParser.Id_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitId_list(microGrammarParser.Id_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterId_tail(microGrammarParser.Id_tailContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitId_tail(microGrammarParser.Id_tailContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterParam_decl_list(microGrammarParser.Param_decl_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitParam_decl_list(microGrammarParser.Param_decl_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterParam_decl(microGrammarParser.Param_declContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitParam_decl(microGrammarParser.Param_declContext ctx) {
	    String name = ctx.id().getText();
	    String type = ctx.var_type().getText();
	    symbolTables.get(currentTable).addVar(name, type);
    }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterParam_decl_tail(microGrammarParser.Param_decl_tailContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitParam_decl_tail(microGrammarParser.Param_decl_tailContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterFunc_declarations(microGrammarParser.Func_declarationsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitFunc_declarations(microGrammarParser.Func_declarationsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterFunc_decl(microGrammarParser.Func_declContext ctx) {
	    String func_name = ctx.id().getText();
	    symbolTables.add(new SymbolTable(func_name));
	    currentTable++;
    }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitFunc_decl(microGrammarParser.Func_declContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterFunc_body(microGrammarParser.Func_bodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitFunc_body(microGrammarParser.Func_bodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterStmt_list(microGrammarParser.Stmt_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitStmt_list(microGrammarParser.Stmt_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterStmt(microGrammarParser.StmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitStmt(microGrammarParser.StmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterBase_stmt(microGrammarParser.Base_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitBase_stmt(microGrammarParser.Base_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterAssign_stmt(microGrammarParser.Assign_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitAssign_stmt(microGrammarParser.Assign_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterAssign_expr(microGrammarParser.Assign_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitAssign_expr(microGrammarParser.Assign_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterRead_stmt(microGrammarParser.Read_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitRead_stmt(microGrammarParser.Read_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterWrite_stmt(microGrammarParser.Write_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitWrite_stmt(microGrammarParser.Write_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterReturn_stmt(microGrammarParser.Return_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitReturn_stmt(microGrammarParser.Return_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterExpr(microGrammarParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitExpr(microGrammarParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterExpr_prefix(microGrammarParser.Expr_prefixContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitExpr_prefix(microGrammarParser.Expr_prefixContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterFactor(microGrammarParser.FactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitFactor(microGrammarParser.FactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterFactor_prefix(microGrammarParser.Factor_prefixContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitFactor_prefix(microGrammarParser.Factor_prefixContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterPostfix_expr(microGrammarParser.Postfix_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitPostfix_expr(microGrammarParser.Postfix_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterCall_expr(microGrammarParser.Call_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitCall_expr(microGrammarParser.Call_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterExpr_list(microGrammarParser.Expr_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitExpr_list(microGrammarParser.Expr_listContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterExpr_list_tail(microGrammarParser.Expr_list_tailContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitExpr_list_tail(microGrammarParser.Expr_list_tailContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterPrimary(microGrammarParser.PrimaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitPrimary(microGrammarParser.PrimaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterAddop(microGrammarParser.AddopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitAddop(microGrammarParser.AddopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterMulop(microGrammarParser.MulopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitMulop(microGrammarParser.MulopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterIf_stmt(microGrammarParser.If_stmtContext ctx) {
	    currentBlock++;
	    createBlock();
    }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitIf_stmt(microGrammarParser.If_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterElse_part(microGrammarParser.Else_partContext ctx) {
	    try{
	        ctx.empty().getText();
        } catch (NullPointerException np) {
            currentBlock++;
            createBlock();
        }

    }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitElse_part(microGrammarParser.Else_partContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterCond(microGrammarParser.CondContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitCond(microGrammarParser.CondContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterCompop(microGrammarParser.CompopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitCompop(microGrammarParser.CompopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterWhile_stmt(microGrammarParser.While_stmtContext ctx) {
        currentBlock++;
        createBlock();
    }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitWhile_stmt(microGrammarParser.While_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterEmpty(microGrammarParser.EmptyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitEmpty(microGrammarParser.EmptyContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void visitErrorNode(ErrorNode node) { }
}