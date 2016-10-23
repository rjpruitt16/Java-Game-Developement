/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;

import java.io.IOException;

public class TestB {
	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRFileStream(System.in);
		ExpLexer lexer = new ExpLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExpParser parser = new ExpParser(tokens);
		ParseTree t = parser.prog();
		EvalVisitor eval = new EvalVisitor();
		eval.visir(t); 
	}
}
