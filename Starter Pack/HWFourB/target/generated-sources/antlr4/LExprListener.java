// Generated from LExpr.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LExprParser}.
 */
public interface LExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull LExprParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull LExprParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link LExprParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(@NotNull LExprParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link LExprParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(@NotNull LExprParser.SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull LExprParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull LExprParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull LExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull LExprParser.IntContext ctx);
}