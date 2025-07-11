// Generated from Figlan.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link FiglanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FiglanParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#drawStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawStmt(FiglanParser.DrawStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#eraseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEraseStmt(FiglanParser.EraseStmtContext ctx);
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
	 * Visit a parse tree produced by {@link FiglanParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(FiglanParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#loopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStmt(FiglanParser.LoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FiglanParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(FiglanParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(FiglanParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(FiglanParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(FiglanParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(FiglanParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModDivExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModDivExpr(FiglanParser.ModDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link FiglanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(FiglanParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FiglanParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FiglanParser.FunctionCallContext ctx);
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