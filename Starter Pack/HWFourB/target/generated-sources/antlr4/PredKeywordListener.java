// Generated from PredKeyword.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PredKeywordParser}.
 */
public interface PredKeywordListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PredKeywordParser#keyCALL}.
	 * @param ctx the parse tree
	 */
	void enterKeyCALL(@NotNull PredKeywordParser.KeyCALLContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredKeywordParser#keyCALL}.
	 * @param ctx the parse tree
	 */
	void exitKeyCALL(@NotNull PredKeywordParser.KeyCALLContext ctx);
	/**
	 * Enter a parse tree produced by {@link PredKeywordParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull PredKeywordParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredKeywordParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull PredKeywordParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PredKeywordParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull PredKeywordParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredKeywordParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull PredKeywordParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PredKeywordParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull PredKeywordParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredKeywordParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull PredKeywordParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PredKeywordParser#keyIF}.
	 * @param ctx the parse tree
	 */
	void enterKeyIF(@NotNull PredKeywordParser.KeyIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredKeywordParser#keyIF}.
	 * @param ctx the parse tree
	 */
	void exitKeyIF(@NotNull PredKeywordParser.KeyIFContext ctx);
}