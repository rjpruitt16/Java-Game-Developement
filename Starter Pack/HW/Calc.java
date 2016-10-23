/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

import java.io.IOException;

public class Calc {
	public static void main(String[] args) throws IOException {
		String inputFile = null;
		if ( args.length>0 ) inputFile = args[0];
		InputStream is = System.in;
		if ( inputFile!=null ) is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		ExpLexer lexer = new ExpLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExpParser parser = new ExpParser(tokens);
		ParseTree t = parser.prog();
		EvalVisitor eval = new EvalVisitor();
		eval.visit(t); 
	}
}
