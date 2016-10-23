// Generated from Exp.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(ExpParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code evalEquation}
	 * labeled alternative in {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalEquation(ExpParser.EvalEquationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code evalEquations}
	 * labeled alternative in {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalEquations(ExpParser.EvalEquationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#atomExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExp(ExpParser.AtomExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ExpParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExpParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(ExpParser.OpContext ctx);
}