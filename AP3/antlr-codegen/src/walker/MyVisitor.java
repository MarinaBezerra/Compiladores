package walker;

import java.lang.String;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Token;

import frontend.CymbolBaseVisitor;
import frontend.CymbolParser;

public class MyVisitor extends CymbolBaseVisitor<String> {
	Map<String, Integer> simpleSymbolTable = new HashMap<String, Integer>( );
	boolean flag = true; //True = continua visitando dentro do ifdef e False = nao visita dentro do ifdef
	
	@Override
	public String visitDefineBin(CymbolParser.DefineBinContext ctx) {
		ctx.WS(0).toString();
		String id = ctx.ID().getText();
		ctx.WS(1).toString();
		String number = ctx.INT().getText();
		ctx.WS(2).toString();
		
		simpleSymbolTable.put(id, Integer.parseInt(number)); //coloca na table ID visitado e valor correspondente
		
		return id;
	}

	public String visitDefineUn(ProjetoParser.DefineUnContext ctx) {
		ctx.WS(0).toString();
		String id = ctx.ID().getText();
		ctx.WS(1).toString();
		
		simpleSymbolTable.put(id, 0); //0 eh valor arbitrario colocado na table quando #define eh unario
		
		return id;
	}

	public String visitUndefine(ProjetoParser.UndefineContext ctx) {
		ctx.WS(0).toString();
		String id = ctx.ID().getText();
		ctx.WS(1).toString();
		
		simpleSymbolTable.remove(id); //remove da table ID visitado
		
		return id;
	}

	public String visitIfDefined(ProjetoParser.IfDefinedContext ctx) {
		ctx.WS(0).toString();
		String id = ctx.ID().getText();
		ctx.WS(1).toString();
		String result;
		
		//verifica se o ID ja foi definido
		if(simpleSymbolTable.get(id) == null) //ID nao definido
			flag = false; //false = nao visita restante do ifdef
		else //ID definido
			flag = true; //true = continua visitando dentro do ifdef
		
		//controle de visitas
		if(flag == true) 
			result = visit(ctx.pgm());
		else 
			result = null;
		
		ctx.WS(2).toString();
		
		return result;
	}

	public String visitIfNotDefined(ProjetoParser.IfNotDefinedContext ctx) {
		ctx.WS(0).toString();
		String id = ctx.ID().getText();
		ctx.WS(1).toString();
		String result;
		
		//verifica se o ID nao foi definido
		if(simpleSymbolTable.get(id) != null) //ID definido
			flag = false; //false = nao visita restante do ifdef
		else //ID nao definido
			flag = true; //true = continua visitando dentro do ifdef
		
		//controle de visitas
		if(flag == true) 
			result = visit(ctx.pgm());
		else 
			result = null;
		
		ctx.WS(2).toString();
		
		return result;
	}

	public String visitTextID(ProjetoParser.TextIDContext ctx) {
		String id = ctx.ID().getText();
		String value;
		
		//substituir no codigo ID ja definido
		if(simpleSymbolTable.get(id) == null) //ID nao foi definido anteriormente
			System.out.print(id); //printa apenas o ID (texto)
		else { //ID ja foi definido anteriormente
			value = simpleSymbolTable.get(id).toString(); //guarda valor correspondente ao ID
			System.out.print(value); //printa valor no codigo no lugar do ID
		}
		
		String schar = ctx.WS().toString();
		System.out.print(schar);
		
		return id;
	}

	public String visitTextNumber(ProjetoParser.TextNumberContext ctx) {
		String number = ctx.INT().getText();
		System.out.print(number);
		String schar = ctx.WS().toString();
		System.out.print(schar);
		
		return number;
	}

	public String visitTextSymbol(ProjetoParser.TextSymbolContext ctx) {
		String symbol = ctx.getText();
		System.out.print(symbol);
		ctx.WS().toString();
		//System.out.print(schar);
		
		return symbol;
	}
}