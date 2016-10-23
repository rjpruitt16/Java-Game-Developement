// Generated from CDecl.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CDeclParser}.
 */
public interface CDeclListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CDeclParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull CDeclParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDeclParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull CDeclParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDeclParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull CDeclParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDeclParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull CDeclParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull CDeclParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull CDeclParser.DeclaratorContext ctx);
}