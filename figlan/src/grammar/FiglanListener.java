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
	 * Enter a parse tree produced by {@link FiglanParser#varInit}.
	 * @param ctx the parse tree
	 */
	void enterVarInit(FiglanParser.VarInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#varInit}.
	 * @param ctx the parse tree
	 */
	void exitVarInit(FiglanParser.VarInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(FiglanParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(FiglanParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowStmt(FiglanParser.ShowStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowStmt(FiglanParser.ShowStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#hideStmt}.
	 * @param ctx the parse tree
	 */
	void enterHideStmt(FiglanParser.HideStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#hideStmt}.
	 * @param ctx the parse tree
	 */
	void exitHideStmt(FiglanParser.HideStmtContext ctx);
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
	 * Enter a parse tree produced by {@link FiglanParser#printArgs}.
	 * @param ctx the parse tree
	 */
	void enterPrintArgs(FiglanParser.PrintArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#printArgs}.
	 * @param ctx the parse tree
	 */
	void exitPrintArgs(FiglanParser.PrintArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#argumentSep}.
	 * @param ctx the parse tree
	 */
	void enterArgumentSep(FiglanParser.ArgumentSepContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#argumentSep}.
	 * @param ctx the parse tree
	 */
	void exitArgumentSep(FiglanParser.ArgumentSepContext ctx);
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
	 * Enter a parse tree produced by {@link FiglanParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(FiglanParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(FiglanParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LineLit}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLineLit(FiglanParser.LineLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LineLit}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLineLit(FiglanParser.LineLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModDiv}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModDiv(FiglanParser.ModDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModDiv}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModDiv(FiglanParser.ModDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadExpression(FiglanParser.ReadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadExpression(FiglanParser.ReadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunCall}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(FiglanParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunCall}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(FiglanParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PointLit}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPointLit(FiglanParser.PointLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PointLit}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPointLit(FiglanParser.PointLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(FiglanParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(FiglanParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(FiglanParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(FiglanParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(FiglanParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(FiglanParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewObj}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewObj(FiglanParser.NewObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewObj}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewObj(FiglanParser.NewObjContext ctx);
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
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(FiglanParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(FiglanParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CircleLit}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCircleLit(FiglanParser.CircleLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CircleLit}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCircleLit(FiglanParser.CircleLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#newExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(FiglanParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#newExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(FiglanParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#readExpr}.
	 * @param ctx the parse tree
	 */
	void enterReadExpr(FiglanParser.ReadExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#readExpr}.
	 * @param ctx the parse tree
	 */
	void exitReadExpr(FiglanParser.ReadExprContext ctx);
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
	 * Enter a parse tree produced by {@link FiglanParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(FiglanParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(FiglanParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#pointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterPointLiteral(FiglanParser.PointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#pointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitPointLiteral(FiglanParser.PointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#lineLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLineLiteral(FiglanParser.LineLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#lineLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLineLiteral(FiglanParser.LineLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiglanParser#circleLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCircleLiteral(FiglanParser.CircleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#circleLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCircleLiteral(FiglanParser.CircleLiteralContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link FiglanParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FiglanParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiglanParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FiglanParser.IdentifierContext ctx);
}