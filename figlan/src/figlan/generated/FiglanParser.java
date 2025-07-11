// Generated from Figlan.g4 by ANTLR 4.13.2
package figlan.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FiglanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, FOR=13, TO=14, DO=15, END=16, NEW=17, SHOW=18, 
		HIDE=19, ALL=20, PAUSE=21, PRINT=22, PRINTLN=23, READ=24, INTEGER_KW=25, 
		REAL_KW=26, TEXT_KW=27, POINT_KW=28, LINE_KW=29, CIRCLE_KW=30, FIGURE_KW=31, 
		LBRACK=32, RBRACK=33, PIPE=34, DASHDASH=35, ID=36, INT=37, REAL=38, STRING=39, 
		COMMENT_SLASH=40, COMMENT_HASH=41, COMMENT_BLOCK=42, WS=43;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_varDecl = 2, RULE_varInit = 3, 
		RULE_assignStmt = 4, RULE_showStmt = 5, RULE_hideStmt = 6, RULE_pauseStmt = 7, 
		RULE_printStmt = 8, RULE_printArgs = 9, RULE_forStmt = 10, RULE_expression = 11, 
		RULE_newExpr = 12, RULE_readExpr = 13, RULE_exprList = 14, RULE_pointLiteral = 15, 
		RULE_lineLiteral = 16, RULE_circleLiteral = 17, RULE_literal = 18, RULE_type = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "varDecl", "varInit", "assignStmt", "showStmt", 
			"hideStmt", "pauseStmt", "printStmt", "printArgs", "forStmt", "expression", 
			"newExpr", "readExpr", "exprList", "pointLiteral", "lineLiteral", "circleLiteral", 
			"literal", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'='", "'+='", "'('", "')'", "'*'", "'/'", "'%'", 
			"'//'", "'+'", "'-'", "'for'", "'to'", "'do'", "'end'", "'new'", "'show'", 
			"'hide'", "'all'", "'pause'", "'print'", "'println'", "'read'", "'integer'", 
			"'real'", "'text'", "'point'", "'line'", "'circle'", "'figure'", "'['", 
			"']'", "'|'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "FOR", "TO", "DO", "END", "NEW", "SHOW", "HIDE", "ALL", "PAUSE", 
			"PRINT", "PRINTLN", "READ", "INTEGER_KW", "REAL_KW", "TEXT_KW", "POINT_KW", 
			"LINE_KW", "CIRCLE_KW", "FIGURE_KW", "LBRACK", "RBRACK", "PIPE", "DASHDASH", 
			"ID", "INT", "REAL", "STRING", "COMMENT_SLASH", "COMMENT_HASH", "COMMENT_BLOCK", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Figlan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FiglanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FiglanParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72996364288L) != 0)) {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ShowStmtContext showStmt() {
			return getRuleContext(ShowStmtContext.class,0);
		}
		public HideStmtContext hideStmt() {
			return getRuleContext(HideStmtContext.class,0);
		}
		public PauseStmtContext pauseStmt() {
			return getRuleContext(PauseStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHOW:
			case HIDE:
			case PAUSE:
			case PRINT:
			case PRINTLN:
			case INTEGER_KW:
			case REAL_KW:
			case TEXT_KW:
			case POINT_KW:
			case LINE_KW:
			case CIRCLE_KW:
			case FIGURE_KW:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER_KW:
				case REAL_KW:
				case TEXT_KW:
				case POINT_KW:
				case LINE_KW:
				case CIRCLE_KW:
				case FIGURE_KW:
					{
					setState(48);
					varDecl();
					}
					break;
				case ID:
					{
					setState(49);
					assignStmt();
					}
					break;
				case SHOW:
					{
					setState(50);
					showStmt();
					}
					break;
				case HIDE:
					{
					setState(51);
					hideStmt();
					}
					break;
				case PAUSE:
					{
					setState(52);
					pauseStmt();
					}
					break;
				case PRINT:
				case PRINTLN:
					{
					setState(53);
					printStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56);
				match(T__0);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				forStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarInitContext> varInit() {
			return getRuleContexts(VarInitContext.class);
		}
		public VarInitContext varInit(int i) {
			return getRuleContext(VarInitContext.class,i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			type();
			setState(62);
			varInit();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(63);
				match(T__1);
				setState(64);
				varInit();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarInitContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FiglanParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterVarInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitVarInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitVarInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInitContext varInit() throws RecognitionException {
		VarInitContext _localctx = new VarInitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ID);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(71);
				match(T__2);
				setState(72);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ID() { return getToken(FiglanParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			{
			setState(76);
			((AssignStmtContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
				((AssignStmtContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(77);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShowStmtContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(FiglanParser.SHOW, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ShowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterShowStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitShowStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitShowStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowStmtContext showStmt() throws RecognitionException {
		ShowStmtContext _localctx = new ShowStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_showStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(SHOW);
			setState(80);
			exprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HideStmtContext extends ParserRuleContext {
		public TerminalNode HIDE() { return getToken(FiglanParser.HIDE, 0); }
		public TerminalNode ALL() { return getToken(FiglanParser.ALL, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public HideStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hideStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterHideStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitHideStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitHideStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HideStmtContext hideStmt() throws RecognitionException {
		HideStmtContext _localctx = new HideStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hideStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(HIDE);
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(83);
				match(ALL);
				}
				break;
			case T__4:
			case NEW:
			case READ:
			case INTEGER_KW:
			case REAL_KW:
			case TEXT_KW:
			case POINT_KW:
			case LINE_KW:
			case CIRCLE_KW:
			case FIGURE_KW:
			case LBRACK:
			case ID:
			case INT:
			case REAL:
			case STRING:
				{
				setState(84);
				exprList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PauseStmtContext extends ParserRuleContext {
		public TerminalNode PAUSE() { return getToken(FiglanParser.PAUSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PauseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pauseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterPauseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitPauseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitPauseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PauseStmtContext pauseStmt() throws RecognitionException {
		PauseStmtContext _localctx = new PauseStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pauseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(PAUSE);
			setState(88);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(FiglanParser.PRINT, 0); }
		public TerminalNode PRINTLN() { return getToken(FiglanParser.PRINTLN, 0); }
		public PrintArgsContext printArgs() {
			return getRuleContext(PrintArgsContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==PRINT || _la==PRINTLN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(91);
				match(T__4);
				setState(92);
				printArgs();
				setState(93);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(95);
				printArgs();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintArgsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterPrintArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitPrintArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitPrintArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintArgsContext printArgs() throws RecognitionException {
		PrintArgsContext _localctx = new PrintArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			expression(0);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1039365439524L) != 0)) {
				{
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(99);
					match(T__1);
					}
				}

				setState(102);
				expression(0);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FiglanParser.FOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(FiglanParser.TO, 0); }
		public TerminalNode DO() { return getToken(FiglanParser.DO, 0); }
		public TerminalNode END() { return getToken(FiglanParser.END, 0); }
		public TerminalNode ID() { return getToken(FiglanParser.ID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(FOR);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4261412864L) != 0)) {
				{
				setState(109);
				type();
				}
			}

			setState(112);
			match(ID);
			setState(113);
			match(T__2);
			}
			setState(115);
			expression(0);
			setState(116);
			match(TO);
			setState(117);
			expression(0);
			setState(118);
			match(DO);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72996364288L) != 0)) {
				{
				{
				setState(119);
				statement();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineLitContext extends ExpressionContext {
		public LineLiteralContext lineLiteral() {
			return getRuleContext(LineLiteralContext.class,0);
		}
		public LineLitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterLineLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitLineLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitLineLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadExpressionContext extends ExpressionContext {
		public ReadExprContext readExpr() {
			return getRuleContext(ReadExprContext.class,0);
		}
		public ReadExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterReadExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitReadExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitReadExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeConversionContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitTypeConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitTypeConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivModContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PointLitContext extends ExpressionContext {
		public PointLiteralContext pointLiteral() {
			return getRuleContext(PointLiteralContext.class,0);
		}
		public PointLitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterPointLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitPointLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitPointLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewObjContext extends ExpressionContext {
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public NewObjContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterNewObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitNewObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitNewObj(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(FiglanParser.ID, 0); }
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CircleLitContext extends ExpressionContext {
		public CircleLiteralContext circleLiteral() {
			return getRuleContext(CircleLiteralContext.class,0);
		}
		public CircleLitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterCircleLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitCircleLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitCircleLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(128);
				type();
				setState(129);
				match(T__4);
				setState(130);
				expression(0);
				setState(131);
				match(T__5);
				}
				break;
			case 2:
				{
				_localctx = new NewObjContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				newExpr();
				}
				break;
			case 3:
				{
				_localctx = new ReadExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				readExpr();
				}
				break;
			case 4:
				{
				_localctx = new PointLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				pointLiteral();
				}
				break;
			case 5:
				{
				_localctx = new LineLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				lineLiteral();
				}
				break;
			case 6:
				{
				_localctx = new CircleLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				circleLiteral();
				}
				break;
			case 7:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(T__4);
				setState(139);
				expression(0);
				setState(140);
				match(T__5);
				}
				break;
			case 8:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				literal();
				}
				break;
			case 9:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(147);
						((MulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
							((MulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(148);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(150);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(151);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewExprContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(FiglanParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_newExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(NEW);
			setState(158);
			type();
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(159);
				match(T__4);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1039365439520L) != 0)) {
					{
					setState(160);
					expression(0);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(161);
						match(T__1);
						setState(162);
						expression(0);
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(170);
				match(T__5);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadExprContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(FiglanParser.READ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReadExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterReadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitReadExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitReadExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadExprContext readExpr() throws RecognitionException {
		ReadExprContext _localctx = new ReadExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_readExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(READ);
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(174);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			expression(0);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(178);
				match(T__1);
				setState(179);
				expression(0);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(FiglanParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(FiglanParser.RBRACK, 0); }
		public PointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterPointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitPointLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitPointLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointLiteralContext pointLiteral() throws RecognitionException {
		PointLiteralContext _localctx = new PointLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(LBRACK);
			setState(186);
			expression(0);
			setState(187);
			match(T__1);
			setState(188);
			expression(0);
			setState(189);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineLiteralContext extends ParserRuleContext {
		public List<PointLiteralContext> pointLiteral() {
			return getRuleContexts(PointLiteralContext.class);
		}
		public PointLiteralContext pointLiteral(int i) {
			return getRuleContext(PointLiteralContext.class,i);
		}
		public TerminalNode DASHDASH() { return getToken(FiglanParser.DASHDASH, 0); }
		public LineLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterLineLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitLineLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitLineLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineLiteralContext lineLiteral() throws RecognitionException {
		LineLiteralContext _localctx = new LineLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lineLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			pointLiteral();
			setState(192);
			match(DASHDASH);
			setState(193);
			pointLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CircleLiteralContext extends ParserRuleContext {
		public PointLiteralContext pointLiteral() {
			return getRuleContext(PointLiteralContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(FiglanParser.PIPE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CircleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterCircleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitCircleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitCircleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CircleLiteralContext circleLiteral() throws RecognitionException {
		CircleLiteralContext _localctx = new CircleLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_circleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			pointLiteral();
			setState(196);
			match(PIPE);
			setState(197);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FiglanParser.INT, 0); }
		public TerminalNode REAL() { return getToken(FiglanParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(FiglanParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER_KW() { return getToken(FiglanParser.INTEGER_KW, 0); }
		public TerminalNode REAL_KW() { return getToken(FiglanParser.REAL_KW, 0); }
		public TerminalNode TEXT_KW() { return getToken(FiglanParser.TEXT_KW, 0); }
		public TerminalNode POINT_KW() { return getToken(FiglanParser.POINT_KW, 0); }
		public TerminalNode LINE_KW() { return getToken(FiglanParser.LINE_KW, 0); }
		public TerminalNode CIRCLE_KW() { return getToken(FiglanParser.CIRCLE_KW, 0); }
		public TerminalNode FIGURE_KW() { return getToken(FiglanParser.FIGURE_KW, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiglanListener ) ((FiglanListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FiglanVisitor ) return ((FiglanVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4261412864L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u00cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006V\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\ba\b\b\u0001\t\u0001\t\u0003\te\b\t\u0001\t\u0005\th\b\t\n\t"+
		"\f\tk\t\t\u0001\n\u0001\n\u0003\no\b\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\ny\b\n\n\n\f\n|\t\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0091\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0099\b\u000b\n\u000b\f\u000b\u009c\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a4\b\f\n\f\f\f\u00a7"+
		"\t\f\u0003\f\u00a9\b\f\u0001\f\u0003\f\u00ac\b\f\u0001\r\u0001\r\u0003"+
		"\r\u00b0\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b5\b\u000e"+
		"\n\u000e\f\u000e\u00b8\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0001\u0016\u0014\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&\u0000\u0006\u0001\u0000\u0003\u0004\u0001\u0000\u0016\u0017"+
		"\u0001\u0000\u0007\n\u0001\u0000\u000b\f\u0001\u0000%\'\u0001\u0000\u0019"+
		"\u001f\u00d5\u0000+\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000\u0000"+
		"\u0004=\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\bK\u0001"+
		"\u0000\u0000\u0000\nO\u0001\u0000\u0000\u0000\fR\u0001\u0000\u0000\u0000"+
		"\u000eW\u0001\u0000\u0000\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012b"+
		"\u0001\u0000\u0000\u0000\u0014l\u0001\u0000\u0000\u0000\u0016\u0090\u0001"+
		"\u0000\u0000\u0000\u0018\u009d\u0001\u0000\u0000\u0000\u001a\u00ad\u0001"+
		"\u0000\u0000\u0000\u001c\u00b1\u0001\u0000\u0000\u0000\u001e\u00b9\u0001"+
		"\u0000\u0000\u0000 \u00bf\u0001\u0000\u0000\u0000\"\u00c3\u0001\u0000"+
		"\u0000\u0000$\u00c7\u0001\u0000\u0000\u0000&\u00c9\u0001\u0000\u0000\u0000"+
		"(*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0000\u0000\u0001/\u0001"+
		"\u0001\u0000\u0000\u000007\u0003\u0004\u0002\u000017\u0003\b\u0004\u0000"+
		"27\u0003\n\u0005\u000037\u0003\f\u0006\u000047\u0003\u000e\u0007\u0000"+
		"57\u0003\u0010\b\u000060\u0001\u0000\u0000\u000061\u0001\u0000\u0000\u0000"+
		"62\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001\u0000\u0000"+
		"\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0005\u0001"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:<\u0003\u0014\n\u0000;6\u0001\u0000"+
		"\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0003\u0001\u0000\u0000\u0000"+
		"=>\u0003&\u0013\u0000>C\u0003\u0006\u0003\u0000?@\u0005\u0002\u0000\u0000"+
		"@B\u0003\u0006\u0003\u0000A?\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0005\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FI\u0005$\u0000\u0000GH\u0005"+
		"\u0003\u0000\u0000HJ\u0003\u0016\u000b\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000J\u0007\u0001\u0000\u0000\u0000KL\u0005$\u0000"+
		"\u0000LM\u0007\u0000\u0000\u0000MN\u0003\u0016\u000b\u0000N\t\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0012\u0000\u0000PQ\u0003\u001c\u000e\u0000Q\u000b"+
		"\u0001\u0000\u0000\u0000RU\u0005\u0013\u0000\u0000SV\u0005\u0014\u0000"+
		"\u0000TV\u0003\u001c\u000e\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000"+
		"\u0000\u0000V\r\u0001\u0000\u0000\u0000WX\u0005\u0015\u0000\u0000XY\u0003"+
		"\u0016\u000b\u0000Y\u000f\u0001\u0000\u0000\u0000Z`\u0007\u0001\u0000"+
		"\u0000[\\\u0005\u0005\u0000\u0000\\]\u0003\u0012\t\u0000]^\u0005\u0006"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_a\u0003\u0012\t\u0000`[\u0001\u0000"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000a\u0011\u0001\u0000\u0000\u0000"+
		"bi\u0003\u0016\u000b\u0000ce\u0005\u0002\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0003\u0016"+
		"\u000b\u0000gd\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0013\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000ln\u0005\r\u0000\u0000mo\u0003&\u0013"+
		"\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pq\u0005$\u0000\u0000qr\u0005\u0003\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000st\u0003\u0016\u000b\u0000tu\u0005\u000e\u0000\u0000uv\u0003"+
		"\u0016\u000b\u0000vz\u0005\u000f\u0000\u0000wy\u0003\u0002\u0001\u0000"+
		"xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000}~\u0005\u0010\u0000\u0000~\u0015\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0006\u000b\uffff\uffff\u0000\u0080\u0081\u0003&\u0013\u0000"+
		"\u0081\u0082\u0005\u0005\u0000\u0000\u0082\u0083\u0003\u0016\u000b\u0000"+
		"\u0083\u0084\u0005\u0006\u0000\u0000\u0084\u0091\u0001\u0000\u0000\u0000"+
		"\u0085\u0091\u0003\u0018\f\u0000\u0086\u0091\u0003\u001a\r\u0000\u0087"+
		"\u0091\u0003\u001e\u000f\u0000\u0088\u0091\u0003 \u0010\u0000\u0089\u0091"+
		"\u0003\"\u0011\u0000\u008a\u008b\u0005\u0005\u0000\u0000\u008b\u008c\u0003"+
		"\u0016\u000b\u0000\u008c\u008d\u0005\u0006\u0000\u0000\u008d\u0091\u0001"+
		"\u0000\u0000\u0000\u008e\u0091\u0003$\u0012\u0000\u008f\u0091\u0005$\u0000"+
		"\u0000\u0090\u007f\u0001\u0000\u0000\u0000\u0090\u0085\u0001\u0000\u0000"+
		"\u0000\u0090\u0086\u0001\u0000\u0000\u0000\u0090\u0087\u0001\u0000\u0000"+
		"\u0000\u0090\u0088\u0001\u0000\u0000\u0000\u0090\u0089\u0001\u0000\u0000"+
		"\u0000\u0090\u008a\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u009a\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\n\b\u0000\u0000\u0093\u0094\u0007\u0002\u0000\u0000"+
		"\u0094\u0099\u0003\u0016\u000b\t\u0095\u0096\n\u0007\u0000\u0000\u0096"+
		"\u0097\u0007\u0003\u0000\u0000\u0097\u0099\u0003\u0016\u000b\b\u0098\u0092"+
		"\u0001\u0000\u0000\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0099\u009c"+
		"\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u0017\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0011\u0000\u0000\u009e\u00ab"+
		"\u0003&\u0013\u0000\u009f\u00a8\u0005\u0005\u0000\u0000\u00a0\u00a5\u0003"+
		"\u0016\u000b\u0000\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2\u00a4\u0003"+
		"\u0016\u000b\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005"+
		"\u0006\u0000\u0000\u00ab\u009f\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad\u00af\u0005"+
		"\u0018\u0000\u0000\u00ae\u00b0\u0003\u0016\u000b\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u001b\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b6\u0003\u0016\u000b\u0000\u00b2\u00b3\u0005"+
		"\u0002\u0000\u0000\u00b3\u00b5\u0003\u0016\u000b\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u001d\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		" \u0000\u0000\u00ba\u00bb\u0003\u0016\u000b\u0000\u00bb\u00bc\u0005\u0002"+
		"\u0000\u0000\u00bc\u00bd\u0003\u0016\u000b\u0000\u00bd\u00be\u0005!\u0000"+
		"\u0000\u00be\u001f\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003\u001e\u000f"+
		"\u0000\u00c0\u00c1\u0005#\u0000\u0000\u00c1\u00c2\u0003\u001e\u000f\u0000"+
		"\u00c2!\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003\u001e\u000f\u0000\u00c4"+
		"\u00c5\u0005\"\u0000\u0000\u00c5\u00c6\u0003\u0016\u000b\u0000\u00c6#"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0007\u0004\u0000\u0000\u00c8%\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0007\u0005\u0000\u0000\u00ca\'\u0001\u0000"+
		"\u0000\u0000\u0013+6;CIU`dinz\u0090\u0098\u009a\u00a5\u00a8\u00ab\u00af"+
		"\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}