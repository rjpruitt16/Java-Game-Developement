// Generated from Exp.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpParser}.
 */
public interface ExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(ExpParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(ExpParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code evalEquation}
	 * labeled alternative in {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEvalEquation(ExpParser.EvalEquationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code evalEquation}
	 * labeled alternative in {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEvalEquation(ExpParser.EvalEquationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code evalEquations}
	 * labeled alternative in {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEvalEquations(ExpParser.EvalEquationsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code evalEquations}
	 * labeled alternative in {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEvalEquations(ExpParser.EvalEquationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(ExpParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(ExpParser.AtomExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ExpParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ExpParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExpParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExpParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(ExpParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(ExpParser.OpContext ctx);
}