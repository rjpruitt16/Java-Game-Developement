// Generated from ExprLR.g4 by ANTLR 4.5.3
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
	void enterExpr(ExprLRParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLRParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprLRParser.ExprContext ctx);
}