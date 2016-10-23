// Generated from MyELang.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyELangParser}.
 */
public interface MyELangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyELangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MyELangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyELangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MyELangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyELangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MyELangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyELangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MyELangParser.StatContext ctx);
}