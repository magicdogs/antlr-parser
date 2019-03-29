// Generated from C:/Users/Administrator/IdeaProjects/demo/src/main/resources\Func.parser by ANTLR 4.7.2
package com.magicdogs.antlr.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FuncParser}.
 */
public interface FuncListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FuncParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(FuncParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(FuncParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FuncParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FuncParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(FuncParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(FuncParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FuncParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FuncParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(FuncParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(FuncParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(FuncParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(FuncParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(FuncParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(FuncParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(FuncParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(FuncParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(FuncParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(FuncParser.RContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEQNEQ}
	 * labeled alternative in {@link FuncParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEQNEQ(FuncParser.ExprEQNEQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEQNEQ}
	 * labeled alternative in {@link FuncParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEQNEQ(FuncParser.ExprEQNEQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link FuncParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(FuncParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link FuncParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(FuncParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link FuncParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(FuncParser.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link FuncParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(FuncParser.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(FuncParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(FuncParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(FuncParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(FuncParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(FuncParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(FuncParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(FuncParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(FuncParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(FuncParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(FuncParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(FuncParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(FuncParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(FuncParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(FuncParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLITERAL}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringLITERAL(FuncParser.StringLITERALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLITERAL}
	 * labeled alternative in {@link FuncParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringLITERAL(FuncParser.StringLITERALContext ctx);
}
