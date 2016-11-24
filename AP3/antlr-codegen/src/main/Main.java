package main;



import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import frontend.CymbolLexer;
import frontend.CymbolParser;



public class Main {
	public static void main(String[] args) throws Exception {
		// create a CharStream that reads from the specified file
		ANTLRInputStream input = new ANTLRFileStream("input");
		// create a lexer that feeds off of input CharStream
		CymbolLexer lexer = new CymbolLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		CymbolParser parser = new CymbolParser(tokens);
		// begin parsing at init rule
		ParseTree tree = parser.file( ); 
		
		System.out.println(tree.toStringTree( ));

		// create the visitor to compile the program
		// ...
		// visit the tree created by the parser
		// ...
		// print the CIL code (or send it to a file)
	}
}
