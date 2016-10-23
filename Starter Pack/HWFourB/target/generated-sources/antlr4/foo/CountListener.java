// Generated from Count.g4 by ANTLR 4.4

package foo;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CountParser}.
 */
public interface CountListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CountParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull CountParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CountParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull CountParser.ListContext ctx);
}