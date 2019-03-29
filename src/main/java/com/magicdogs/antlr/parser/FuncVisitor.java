// Generated from C:/Users/Administrator/IdeaProjects/demo/src/main/resources\Func.parser by ANTLR 4.7.2
package com.magicdogs.antlr.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FuncParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FuncVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FuncParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(FuncParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(FuncParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(FuncParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FuncParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(FuncParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(FuncParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(FuncParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(FuncParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(FuncParser.RContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEQNEQ}
	 * labeled alternative in {@link FuncParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEQNEQ(FuncParser.ExprEQNEQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link FuncParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(FuncParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link FuncParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(FuncParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(FuncParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(FuncParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(FuncParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(FuncParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(FuncParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(FuncParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(FuncParser.NilAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLITERAL}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLITERAL(FuncParser.StringLITERALContext ctx);
}
