// Generated from A.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AParser}.
 */
public interface AListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link AParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull AParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link AParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull AParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn(@NotNull AParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn(@NotNull AParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link AParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull AParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link AParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull AParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link AParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBreak(@NotNull AParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link AParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBreak(@NotNull AParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link AParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull AParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link AParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull AParser.IntContext ctx);
}