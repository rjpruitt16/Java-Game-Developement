// Generated from Nested.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NestedParser}.
 */
public interface NestedListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NestedParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull NestedParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link NestedParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull NestedParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link NestedParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(@NotNull NestedParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link NestedParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(@NotNull NestedParser.SContext ctx);
}