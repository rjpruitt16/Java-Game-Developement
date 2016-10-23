// Generated from F.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FParser}.
 */
public interface FListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull FParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull FParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull FParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull FParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(@NotNull FParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(@NotNull FParser.GroupContext ctx);
}