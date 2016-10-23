// Generated from SimplePy.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplePyParser}.
 */
public interface SimplePyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplePyParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull SimplePyParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePyParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull SimplePyParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull SimplePyParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull SimplePyParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePyParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull SimplePyParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePyParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull SimplePyParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SimplePyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SimplePyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePyParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull SimplePyParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePyParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull SimplePyParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplePyParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull SimplePyParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePyParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull SimplePyParser.AssignContext ctx);
}