public interface ExpVisitor<T> {
	T visitId(LabeledExprParser.IdContext ctx); 
	T visitAssign(LabeledExprParser.AssignContext ctx); 
	T visitMulDiv(LabeledExprParser.MulDivContext ctx); 
}