// Generated from CppStat.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CppStatParser}.
 */
public interface CppStatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CppStatParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull CppStatParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppStatParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull CppStatParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppStatParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull CppStatParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppStatParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull CppStatParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppStatParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull CppStatParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppStatParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull CppStatParser.ExprContext ctx);
}