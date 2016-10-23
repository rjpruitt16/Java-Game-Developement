// Generated from Call.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CallParser}.
 */
public interface CallListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CallParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull CallParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull CallParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull CallParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull CallParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CallParser#fcall}.
	 * @param ctx the parse tree
	 */
	void enterFcall(@NotNull CallParser.FcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CallParser#fcall}.
	 * @param ctx the parse tree
	 */
	void exitFcall(@NotNull CallParser.FcallContext ctx);
}