// Generated from ExprLR.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprLRParser}.
 */
public interface ExprLRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprLRParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ExprLRParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLRParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ExprLRParser.ExprContext ctx);
}