package walker;

import java.lang.String;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Token;

import autogenerated.ProjetoBaseVisitor;
import autogenerated.ProjetoParser;

public class MyVisitor extends ProjetoBaseVisitor<String> {
	Map<String, Integer> simpleSymbolTable = new HashMap<String, Integer>( );
	
	@Override
	public String visitProgram(ProjetoParser.ProgramContext ctx) {
		System.out.println("entrei");
		String result = visit(ctx.dir(0));
		return result;
	}
	public String visitDefineBin(ProjetoParser.DefineBinContext ctx) {
		System.out.println("entrei2");
		String result1 = ctx.ID().getText();
		String result2 = ctx.INT().getText();
		System.out.println(result1 + " e " + result2);
		return result1;
	}
	public String visitTextID(ProjetoParser.TextIDContext ctx){
		System.out.println("to no ID");
		return ctx.ID().getText();
	}
	
}