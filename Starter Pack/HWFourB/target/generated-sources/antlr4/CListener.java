// Generated from C.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull CParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull CParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull CParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull CParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull CParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull CParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull CParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull CParser.TypeContext ctx);
}