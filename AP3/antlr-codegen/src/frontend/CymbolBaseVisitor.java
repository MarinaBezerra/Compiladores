package frontend;

import org.antlr.v4.runtime.tree.*;



public class CymbolBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CymbolVisitor<T> {
	@Override public T visitAddSubExpr(CymbolParser.AddSubExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitParenExpr(CymbolParser.ParenExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitFormalParameter(CymbolParser.FormalParameterContext ctx) { return visitChildren(ctx); }

	@Override public T visitVarDecl(CymbolParser.VarDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlock(CymbolParser.BlockContext ctx) { return visitChildren(ctx); }

	@Override public T visitType(CymbolParser.TypeContext ctx) { return visitChildren(ctx); }

	@Override public T visitFunctionCallStat(CymbolParser.FunctionCallStatContext ctx) { return visitChildren(ctx); }

	@Override public T visitFunctionDecl(CymbolParser.FunctionDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitNotExpr(CymbolParser.NotExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitFunCallExpr(CymbolParser.FunCallExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitFormalParameters(CymbolParser.FormalParametersContext ctx) { return visitChildren(ctx); }

	@Override public T visitEqExpr(CymbolParser.EqExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitFile(CymbolParser.FileContext ctx) { return visitChildren(ctx); }

	@Override public T visitVarDecStat(CymbolParser.VarDecStatContext ctx) { return visitChildren(ctx); }

	@Override public T visitMulDivExpr(CymbolParser.MulDivExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitNameExpr(CymbolParser.NameExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitIfThenElseStat(CymbolParser.IfThenElseStatContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignStat(CymbolParser.AssignStatContext ctx) { return visitChildren(ctx); }

	@Override public T visitReturnStat(CymbolParser.ReturnStatContext ctx) { return visitChildren(ctx); }

	@Override public T visitComparisonExpr(CymbolParser.ComparisonExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitVarIdExpr(CymbolParser.VarIdExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprList(CymbolParser.ExprListContext ctx) { return visitChildren(ctx); }
}