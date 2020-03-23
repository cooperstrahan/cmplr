// Generated from /Users/cooperstrahan/Documents/Compilers/ProjectCompilerStep1/src/com/company/microGrammar.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link microGrammarVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class microGrammarBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements microGrammarVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEmpty(microGrammarParser.EmptyContext ctx) { return visitChildren(ctx); }
}