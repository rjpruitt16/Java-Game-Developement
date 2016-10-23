// Generated from ELang.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ELangParser}.
 */
public interface ELangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ELangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull ELangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull ELangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ELangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ELangParser.ExprContext ctx);
}