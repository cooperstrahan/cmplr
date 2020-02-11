// Generated from microGrammar.g4 by ANTLR 4.7.1
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link microGrammarParser}.
 */
public interface microGrammarListener extends ParseTreeListener {
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