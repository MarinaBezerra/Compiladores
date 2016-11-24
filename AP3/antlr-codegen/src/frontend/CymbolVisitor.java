package frontend;

import org.antlr.v4.runtime.tree.*;



public interface CymbolVisitor<T> extends ParseTreeVisitor<T> {
	T visitAddSubExpr(CymbolParser.AddSubExprContext ctx);

	T visitParenExpr(CymbolParser.ParenExprContext ctx);

	T visitFormalParameter(CymbolParser.FormalParameterContext ctx);

	T visitVarDecl(CymbolParser.VarDeclContext ctx);

	T visitBlock(CymbolParser.BlockContext ctx);

	T visitType(CymbolParser.TypeContext ctx);

	T visitFunctionCallStat(CymbolParser.FunctionCallStatContext ctx);

	T visitFunctionDecl(CymbolParser.FunctionDeclContext ctx);

	T visitNotExpr(CymbolParser.NotExprContext ctx);

	T visitFunCallExpr(CymbolParser.FunCallExprContext ctx);

	T visitFormalParameters(CymbolParser.FormalParametersContext ctx);

	T visitEqExpr(CymbolParser.EqExprContext ctx);

	T visitFile(CymbolParser.FileContext ctx);

	T visitVarDecStat(CymbolParser.VarDecStatContext ctx);

	T visitMulDivExpr(CymbolParser.MulDivExprContext ctx);

	T visitNameExpr(CymbolParser.NameExprContext ctx);

	T visitIfThenElseStat(CymbolParser.IfThenElseStatContext ctx);

	T visitAssignStat(CymbolParser.AssignStatContext ctx);

	T visitReturnStat(CymbolParser.ReturnStatContext ctx);

	T visitComparisonExpr(CymbolParser.ComparisonExprContext ctx);

	T visitVarIdExpr(CymbolParser.VarIdExprContext ctx);

	T visitExprList(CymbolParser.ExprListContext ctx);
}