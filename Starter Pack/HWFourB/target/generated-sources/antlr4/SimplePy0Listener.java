// Generated from SimplePy0.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplePy0Parser}.
 */
public interface SimplePy0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplePy0Parser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull SimplePy0Parser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePy0Parser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull SimplePy0Parser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePy0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull SimplePy0Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePy0Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull SimplePy0Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePy0Parser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull SimplePy0Parser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePy0Parser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull SimplePy0Parser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePy0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SimplePy0Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePy0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SimplePy0Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePy0Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull SimplePy0Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePy0Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull SimplePy0Parser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePy0Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull SimplePy0Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePy0Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull SimplePy0Parser.AssignContext ctx);
}