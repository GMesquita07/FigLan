// Generated from Figlan.g4 by ANTLR 4.13.2
package figlan.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FiglanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FiglanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FiglanParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FiglanParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FiglanParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(FiglanParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#varInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInit(FiglanParser.VarInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(FiglanParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#showStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStmt(FiglanParser.ShowStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#hideStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHideStmt(FiglanParser.HideStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#pauseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPauseStmt(FiglanParser.PauseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(FiglanParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#printArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArgs(FiglanParser.PrintArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(FiglanParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LineLit}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineLit(FiglanParser.LineLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExpression(FiglanParser.ReadExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeConversion}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(FiglanParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(FiglanParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PointLit}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointLit(FiglanParser.PointLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(FiglanParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(FiglanParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewObj}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObj(FiglanParser.NewObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(FiglanParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(FiglanParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CircleLit}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircleLit(FiglanParser.CircleLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#newExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(FiglanParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#readExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExpr(FiglanParser.ReadExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(FiglanParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#pointLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointLiteral(FiglanParser.PointLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#lineLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineLiteral(FiglanParser.LineLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#circleLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircleLiteral(FiglanParser.CircleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FiglanParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FiglanParser.TypeContext ctx);
}