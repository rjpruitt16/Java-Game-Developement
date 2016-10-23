// Generated from DynScope.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DynScopeParser}.
 */
public interface DynScopeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DynScopeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull DynScopeParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynScopeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull DynScopeParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynScopeParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull DynScopeParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynScopeParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull DynScopeParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynScopeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull DynScopeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynScopeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull DynScopeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynScopeParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull DynScopeParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynScopeParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull DynScopeParser.ProgContext ctx);
}