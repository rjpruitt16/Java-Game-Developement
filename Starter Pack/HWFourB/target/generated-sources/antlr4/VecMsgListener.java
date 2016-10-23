// Generated from VecMsg.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VecMsgParser}.
 */
public interface VecMsgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VecMsgParser#ints}.
	 * @param ctx the parse tree
	 */
	void enterInts(@NotNull VecMsgParser.IntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VecMsgParser#ints}.
	 * @param ctx the parse tree
	 */
	void exitInts(@NotNull VecMsgParser.IntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VecMsgParser#vec4}.
	 * @param ctx the parse tree
	 */
	void enterVec4(@NotNull VecMsgParser.Vec4Context ctx);
	/**
	 * Exit a parse tree produced by {@link VecMsgParser#vec4}.
	 * @param ctx the parse tree
	 */
	void exitVec4(@NotNull VecMsgParser.Vec4Context ctx);
}