// Generated from Figlan.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FiglanParser}.
 */
public interface FiglanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FiglanParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FiglanParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FiglanParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FiglanParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FiglanParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(FiglanParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(FiglanParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FiglanParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FiglanParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#drawStmt}.
	 * @param ctx the parse tree
	 */
	void enterDrawStmt(FiglanParser.DrawStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#drawStmt}.
	 * @param ctx the parse tree
	 */
	void exitDrawStmt(FiglanParser.DrawStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#eraseStmt}.
	 * @param ctx the parse tree
	 */
	void enterEraseStmt(FiglanParser.EraseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#eraseStmt}.
	 * @param ctx the parse tree
	 */
	void exitEraseStmt(FiglanParser.EraseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#pauseStmt}.
	 * @param ctx the parse tree
	 */
	void enterPauseStmt(FiglanParser.PauseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#pauseStmt}.
	 * @param ctx the parse tree
	 */
	void exitPauseStmt(FiglanParser.PauseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(FiglanParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(FiglanParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(FiglanParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(FiglanParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(FiglanParser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(FiglanParser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FiglanParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FiglanParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(FiglanParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(FiglanParser.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(FiglanParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(FiglanParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(FiglanParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(FiglanParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(FiglanParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(FiglanParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(FiglanParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(FiglanParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModDivExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModDivExpr(FiglanParser.ModDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModDivExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModDivExpr(FiglanParser.ModDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(FiglanParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(FiglanParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(FiglanParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(FiglanParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FiglanParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FiglanParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FiglanParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FiglanParser.TypeContext ctx);
}