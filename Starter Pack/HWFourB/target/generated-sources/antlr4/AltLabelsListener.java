// Generated from AltLabels.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AltLabelsParser}.
 */
public interface AltLabelsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link AltLabelsParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull AltLabelsParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link AltLabelsParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull AltLabelsParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AltLabelsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn(@NotNull AltLabelsParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AltLabelsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn(@NotNull AltLabelsParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link AltLabelsParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull AltLabelsParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link AltLabelsParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull AltLabelsParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link AltLabelsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBreak(@NotNull AltLabelsParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link AltLabelsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBreak(@NotNull AltLabelsParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link AltLabelsParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull AltLabelsParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link AltLabelsParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull AltLabelsParser.IntContext ctx);
}