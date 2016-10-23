// Generated from Enum.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnumParser}.
 */
public interface EnumListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnumParser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void enterEnumDecl(@NotNull EnumParser.EnumDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnumParser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void exitEnumDecl(@NotNull EnumParser.EnumDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnumParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull EnumParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnumParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull EnumParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnumParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull EnumParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnumParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull EnumParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnumParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull EnumParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnumParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull EnumParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnumParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull EnumParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnumParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull EnumParser.ProgContext ctx);
}