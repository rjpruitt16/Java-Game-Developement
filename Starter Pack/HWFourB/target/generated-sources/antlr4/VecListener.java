// Generated from Vec.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VecParser}.
 */
public interface VecListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VecParser#ints}.
	 * @param ctx the parse tree
	 */
	void enterInts(@NotNull VecParser.IntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VecParser#ints}.
	 * @param ctx the parse tree
	 */
	void exitInts(@NotNull VecParser.IntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VecParser#vec4}.
	 * @param ctx the parse tree
	 */
	void enterVec4(@NotNull VecParser.Vec4Context ctx);
	/**
	 * Exit a parse tree produced by {@link VecParser#vec4}.
	 * @param ctx the parse tree
	 */
	void exitVec4(@NotNull VecParser.Vec4Context ctx);
}