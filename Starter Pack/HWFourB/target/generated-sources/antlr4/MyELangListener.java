// Generated from MyELang.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyELangParser}.
 */
public interface MyELangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyELangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull MyELangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyELangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull MyELangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyELangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull MyELangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyELangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull MyELangParser.ExprContext ctx);
}