// Generated from Enum2.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Enum2Parser}.
 */
public interface Enum2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Enum2Parser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void enterEnumDecl(@NotNull Enum2Parser.EnumDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Enum2Parser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void exitEnumDecl(@NotNull Enum2Parser.EnumDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Enum2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull Enum2Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Enum2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull Enum2Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Enum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull Enum2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Enum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull Enum2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Enum2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull Enum2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Enum2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull Enum2Parser.ProgContext ctx);
}