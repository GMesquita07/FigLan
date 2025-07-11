// Generated from /home/mesquita/COMPILADORES_2/FigLan/figlan/src/grammar/Figlan.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FiglanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		LBRACK=32, RBRACK=33, PIPE=34, DASHDASH=35, ID=36, INT=37, REAL=38, STRING=39, 
		COMMENT_SLASH=40, COMMENT_HASH=41, COMMENT_BLOCK=42, WS=43;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_varDecl = 2, RULE_varInit = 3, 
		RULE_assignStmt = 4, RULE_showStmt = 5, RULE_hideStmt = 6, RULE_pauseStmt = 7, 
		RULE_printStmt = 8, RULE_printArgs = 9, RULE_readStmt = 10, RULE_readExpr = 11, 
		RULE_forStmt = 12, RULE_expression = 13, RULE_newExpr = 14, RULE_functionCall = 15, 
		RULE_exprList = 16, RULE_pointLiteral = 17, RULE_lineLiteral = 18, RULE_circleLiteral = 19, 
		RULE_literal = 20, RULE_type = 21, RULE_identifier = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "varDecl", "varInit", "assignStmt", "showStmt", 
			"hideStmt", "pauseStmt", "printStmt", "printArgs", "readStmt", "readExpr", 
			"forStmt", "expression", "newExpr", "functionCall", "exprList", "pointLiteral", 
			"lineLiteral", "circleLiteral", "literal", "type", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'='", "'+='", "'show'", "'hide'", "'all'", "'pause'", 
			"'print'", "'println'", "'('", "')'", "'read'", "'for'", "'to'", "'do'", 
			"'end'", "'*'", "'/'", "'+'", "'-'", "'%'", "'//'", "'new'", "'integer'", 
			"'real'", "'text'", "'point'", "'line'", "'circle'", "'figure'", "'['", 
			"']'", "'|'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "LBRACK", "RBRACK", "PIPE", 
			"DASHDASH", "ID", "INT", "REAL", "STRING", "COMMENT_SLASH", "COMMENT_HASH", 
			"COMMENT_BLOCK", "WS"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72980916064L) != 0)) {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				varDecl();
				setState(55);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				assignStmt();
				setState(58);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				showStmt();
				setState(61);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				hideStmt();
				setState(64);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				pauseStmt();
				setState(67);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				printStmt();
				setState(70);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				readStmt();
				setState(73);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				forStmt();
				}
				break;
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
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			type();
			setState(79);
			varInit();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(80);
				match(T__1);
				setState(81);
				varInit();
				}
				}
				setState(86);
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
	}

	public final VarInitContext varInit() throws RecognitionException {
		VarInitContext _localctx = new VarInitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(88);
				match(T__2);
				setState(89);
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
		public TerminalNode ID() { return getToken(FiglanParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(94);
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
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ShowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStmt; }
	}

	public final ShowStmtContext showStmt() throws RecognitionException {
		ShowStmtContext _localctx = new ShowStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_showStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__4);
			setState(97);
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
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public HideStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hideStmt; }
	}

	public final HideStmtContext hideStmt() throws RecognitionException {
		HideStmtContext _localctx = new HideStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hideStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__5);
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(100);
				match(T__6);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case LBRACK:
			case ID:
			case INT:
			case REAL:
			case STRING:
				{
				setState(101);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PauseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pauseStmt; }
	}

	public final PauseStmtContext pauseStmt() throws RecognitionException {
		PauseStmtContext _localctx = new PauseStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pauseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__7);
			setState(105);
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
		public PrintArgsContext printArgs() {
			return getRuleContext(PrintArgsContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(108);
				match(T__10);
				setState(109);
				printArgs();
				setState(110);
				match(T__11);
				}
				break;
			case 2:
				{
				setState(112);
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
	}

	public final PrintArgsContext printArgs() throws RecognitionException {
		PrintArgsContext _localctx = new PrintArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			expression(0);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(116);
				match(T__1);
				setState(117);
				expression(0);
				}
				}
				setState(122);
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
	public static class ReadStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FiglanParser.ID, 0); }
		public ReadExprContext readExpr() {
			return getRuleContext(ReadExprContext.class,0);
		}
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_readStmt);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(ID);
				setState(124);
				match(T__2);
				setState(125);
				readExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__12);
				setState(127);
				match(T__10);
				setState(128);
				match(ID);
				setState(129);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(T__12);
				setState(131);
				match(ID);
				}
				break;
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
		public TerminalNode STRING() { return getToken(FiglanParser.STRING, 0); }
		public ReadExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readExpr; }
	}

	public final ReadExprContext readExpr() throws RecognitionException {
		ReadExprContext _localctx = new ReadExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_readExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__12);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(135);
				match(STRING);
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
	public static class ForStmtContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__13);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4261412864L) != 0)) {
				{
				setState(139);
				type();
				}
			}

			setState(142);
			match(ID);
			setState(143);
			match(T__2);
			}
			setState(145);
			expression(0);
			setState(146);
			match(T__14);
			setState(147);
			expression(0);
			setState(148);
			match(T__15);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72980916064L) != 0)) {
				{
				{
				setState(149);
				statement();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(T__16);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModDivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ModDivContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunCallContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PointLitContext extends ExpressionContext {
		public PointLiteralContext pointLiteral() {
			return getRuleContext(PointLiteralContext.class,0);
		}
		public PointLitContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewObjContext extends ExpressionContext {
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public NewObjContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(FiglanParser.ID, 0); }
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CircleLitContext extends ExpressionContext {
		public CircleLiteralContext circleLiteral() {
			return getRuleContext(CircleLiteralContext.class,0);
		}
		public CircleLitContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new NewObjContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(158);
				newExpr();
				}
				break;
			case 2:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new PointLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				pointLiteral();
				}
				break;
			case 4:
				{
				_localctx = new LineLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				lineLiteral();
				}
				break;
			case 5:
				{
				_localctx = new CircleLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				circleLiteral();
				}
				break;
			case 6:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(T__10);
				setState(164);
				expression(0);
				setState(165);
				match(T__11);
				}
				break;
			case 7:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				literal();
				}
				break;
			case 8:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(172);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(175);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ModDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(178);
						((ModDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((ModDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(184);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_newExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__23);
			setState(186);
			identifier();
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(187);
				match(T__10);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1037217836544L) != 0)) {
					{
					setState(188);
					expression(0);
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(189);
						match(T__1);
						setState(190);
						expression(0);
						}
						}
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(198);
				match(T__11);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			identifier();
			setState(202);
			match(T__10);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1037217836544L) != 0)) {
				{
				setState(203);
				expression(0);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(204);
					match(T__1);
					setState(205);
					expression(0);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(213);
			match(T__11);
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
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			expression(0);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(216);
				match(T__1);
				setState(217);
				expression(0);
				}
				}
				setState(222);
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
	}

	public final PointLiteralContext pointLiteral() throws RecognitionException {
		PointLiteralContext _localctx = new PointLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(LBRACK);
			setState(224);
			expression(0);
			setState(225);
			match(T__1);
			setState(226);
			expression(0);
			setState(227);
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
	}

	public final LineLiteralContext lineLiteral() throws RecognitionException {
		LineLiteralContext _localctx = new LineLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lineLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			pointLiteral();
			setState(230);
			match(DASHDASH);
			setState(231);
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
	}

	public final CircleLiteralContext circleLiteral() throws RecognitionException {
		CircleLiteralContext _localctx = new CircleLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_circleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			pointLiteral();
			setState(234);
			match(PIPE);
			setState(235);
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FiglanParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70833415680L) != 0)) ) {
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
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u00f4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002S\b\u0002\n\u0002\f\u0002V\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006g\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\br"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0005\tw\b\t\n\t\f\tz\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0085"+
		"\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u0089\b\u000b\u0001\f\u0001\f"+
		"\u0003\f\u008d\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u0097\b\f\n\f\f\f\u009a\t\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00aa\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b5\b\r\n\r\f\r\u00b8\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00c0\b\u000e\n\u000e\f\u000e\u00c3\t\u000e\u0003\u000e\u00c5"+
		"\b\u000e\u0001\u000e\u0003\u000e\u00c8\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00cf\b\u000f\n\u000f"+
		"\f\u000f\u00d2\t\u000f\u0003\u000f\u00d4\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00db\b\u0010\n\u0010"+
		"\f\u0010\u00de\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0001"+
		"\u001a\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,\u0000\b\u0001\u0000\u0003\u0004\u0001"+
		"\u0000\t\n\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0015\u0001\u0000"+
		"\u0016\u0017\u0001\u0000%\'\u0001\u0000\u0019\u001f\u0004\u0000\t\n\r"+
		"\r\u0019\u001e$$\u00fe\u00001\u0001\u0000\u0000\u0000\u0002L\u0001\u0000"+
		"\u0000\u0000\u0004N\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000\u0000"+
		"\b\\\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000\u0000\fc\u0001\u0000"+
		"\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000"+
		"\u0012s\u0001\u0000\u0000\u0000\u0014\u0084\u0001\u0000\u0000\u0000\u0016"+
		"\u0086\u0001\u0000\u0000\u0000\u0018\u008a\u0001\u0000\u0000\u0000\u001a"+
		"\u00a9\u0001\u0000\u0000\u0000\u001c\u00b9\u0001\u0000\u0000\u0000\u001e"+
		"\u00c9\u0001\u0000\u0000\u0000 \u00d7\u0001\u0000\u0000\u0000\"\u00df"+
		"\u0001\u0000\u0000\u0000$\u00e5\u0001\u0000\u0000\u0000&\u00e9\u0001\u0000"+
		"\u0000\u0000(\u00ed\u0001\u0000\u0000\u0000*\u00ef\u0001\u0000\u0000\u0000"+
		",\u00f1\u0001\u0000\u0000\u0000.0\u0003\u0002\u0001\u0000/.\u0001\u0000"+
		"\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"45\u0005\u0000\u0000\u00015\u0001\u0001\u0000\u0000\u000067\u0003\u0004"+
		"\u0002\u000078\u0005\u0001\u0000\u00008M\u0001\u0000\u0000\u00009:\u0003"+
		"\b\u0004\u0000:;\u0005\u0001\u0000\u0000;M\u0001\u0000\u0000\u0000<=\u0003"+
		"\n\u0005\u0000=>\u0005\u0001\u0000\u0000>M\u0001\u0000\u0000\u0000?@\u0003"+
		"\f\u0006\u0000@A\u0005\u0001\u0000\u0000AM\u0001\u0000\u0000\u0000BC\u0003"+
		"\u000e\u0007\u0000CD\u0005\u0001\u0000\u0000DM\u0001\u0000\u0000\u0000"+
		"EF\u0003\u0010\b\u0000FG\u0005\u0001\u0000\u0000GM\u0001\u0000\u0000\u0000"+
		"HI\u0003\u0014\n\u0000IJ\u0005\u0001\u0000\u0000JM\u0001\u0000\u0000\u0000"+
		"KM\u0003\u0018\f\u0000L6\u0001\u0000\u0000\u0000L9\u0001\u0000\u0000\u0000"+
		"L<\u0001\u0000\u0000\u0000L?\u0001\u0000\u0000\u0000LB\u0001\u0000\u0000"+
		"\u0000LE\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000LK\u0001\u0000"+
		"\u0000\u0000M\u0003\u0001\u0000\u0000\u0000NO\u0003*\u0015\u0000OT\u0003"+
		"\u0006\u0003\u0000PQ\u0005\u0002\u0000\u0000QS\u0003\u0006\u0003\u0000"+
		"RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000U\u0005\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000WZ\u0005$\u0000\u0000XY\u0005\u0003\u0000\u0000Y[\u0003"+
		"\u001a\r\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0007"+
		"\u0001\u0000\u0000\u0000\\]\u0005$\u0000\u0000]^\u0007\u0000\u0000\u0000"+
		"^_\u0003\u001a\r\u0000_\t\u0001\u0000\u0000\u0000`a\u0005\u0005\u0000"+
		"\u0000ab\u0003 \u0010\u0000b\u000b\u0001\u0000\u0000\u0000cf\u0005\u0006"+
		"\u0000\u0000dg\u0005\u0007\u0000\u0000eg\u0003 \u0010\u0000fd\u0001\u0000"+
		"\u0000\u0000fe\u0001\u0000\u0000\u0000g\r\u0001\u0000\u0000\u0000hi\u0005"+
		"\b\u0000\u0000ij\u0003\u001a\r\u0000j\u000f\u0001\u0000\u0000\u0000kq"+
		"\u0007\u0001\u0000\u0000lm\u0005\u000b\u0000\u0000mn\u0003\u0012\t\u0000"+
		"no\u0005\f\u0000\u0000or\u0001\u0000\u0000\u0000pr\u0003\u0012\t\u0000"+
		"ql\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0011\u0001\u0000"+
		"\u0000\u0000sx\u0003\u001a\r\u0000tu\u0005\u0002\u0000\u0000uw\u0003\u001a"+
		"\r\u0000vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0013\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000{|\u0005$\u0000\u0000|}\u0005\u0003\u0000\u0000"+
		"}\u0085\u0003\u0016\u000b\u0000~\u007f\u0005\r\u0000\u0000\u007f\u0080"+
		"\u0005\u000b\u0000\u0000\u0080\u0081\u0005$\u0000\u0000\u0081\u0085\u0005"+
		"\f\u0000\u0000\u0082\u0083\u0005\r\u0000\u0000\u0083\u0085\u0005$\u0000"+
		"\u0000\u0084{\u0001\u0000\u0000\u0000\u0084~\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0015\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0005\r\u0000\u0000\u0087\u0089\u0005\'\u0000\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0017"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0005\u000e\u0000\u0000\u008b\u008d"+
		"\u0003*\u0015\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"$\u0000\u0000\u008f\u0090\u0005\u0003\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0003\u001a\r\u0000\u0092\u0093\u0005\u000f\u0000"+
		"\u0000\u0093\u0094\u0003\u001a\r\u0000\u0094\u0098\u0005\u0010\u0000\u0000"+
		"\u0095\u0097\u0003\u0002\u0001\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0011\u0000\u0000"+
		"\u009c\u0019\u0001\u0000\u0000\u0000\u009d\u009e\u0006\r\uffff\uffff\u0000"+
		"\u009e\u00aa\u0003\u001c\u000e\u0000\u009f\u00aa\u0003\u001e\u000f\u0000"+
		"\u00a0\u00aa\u0003\"\u0011\u0000\u00a1\u00aa\u0003$\u0012\u0000\u00a2"+
		"\u00aa\u0003&\u0013\u0000\u00a3\u00a4\u0005\u000b\u0000\u0000\u00a4\u00a5"+
		"\u0003\u001a\r\u0000\u00a5\u00a6\u0005\f\u0000\u0000\u00a6\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a7\u00aa\u0003(\u0014\u0000\u00a8\u00aa\u0005$\u0000"+
		"\u0000\u00a9\u009d\u0001\u0000\u0000\u0000\u00a9\u009f\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a0\u0001\u0000\u0000\u0000\u00a9\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a2\u0001\u0000\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u00b6\u0001\u0000\u0000\u0000\u00ab\u00ac\n\t\u0000\u0000"+
		"\u00ac\u00ad\u0007\u0002\u0000\u0000\u00ad\u00b5\u0003\u001a\r\n\u00ae"+
		"\u00af\n\b\u0000\u0000\u00af\u00b0\u0007\u0003\u0000\u0000\u00b0\u00b5"+
		"\u0003\u001a\r\t\u00b1\u00b2\n\u0007\u0000\u0000\u00b2\u00b3\u0007\u0004"+
		"\u0000\u0000\u00b3\u00b5\u0003\u001a\r\b\u00b4\u00ab\u0001\u0000\u0000"+
		"\u0000\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u001b\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0018\u0000"+
		"\u0000\u00ba\u00c7\u0003,\u0016\u0000\u00bb\u00c4\u0005\u000b\u0000\u0000"+
		"\u00bc\u00c1\u0003\u001a\r\u0000\u00bd\u00be\u0005\u0002\u0000\u0000\u00be"+
		"\u00c0\u0003\u001a\r\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c4\u00bc\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8"+
		"\u0005\f\u0000\u0000\u00c7\u00bb\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u001d\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003"+
		",\u0016\u0000\u00ca\u00d3\u0005\u000b\u0000\u0000\u00cb\u00d0\u0003\u001a"+
		"\r\u0000\u00cc\u00cd\u0005\u0002\u0000\u0000\u00cd\u00cf\u0003\u001a\r"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d3\u00cb\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\f\u0000\u0000"+
		"\u00d6\u001f\u0001\u0000\u0000\u0000\u00d7\u00dc\u0003\u001a\r\u0000\u00d8"+
		"\u00d9\u0005\u0002\u0000\u0000\u00d9\u00db\u0003\u001a\r\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd!\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		" \u0000\u0000\u00e0\u00e1\u0003\u001a\r\u0000\u00e1\u00e2\u0005\u0002"+
		"\u0000\u0000\u00e2\u00e3\u0003\u001a\r\u0000\u00e3\u00e4\u0005!\u0000"+
		"\u0000\u00e4#\u0001\u0000\u0000\u0000\u00e5\u00e6\u0003\"\u0011\u0000"+
		"\u00e6\u00e7\u0005#\u0000\u0000\u00e7\u00e8\u0003\"\u0011\u0000\u00e8"+
		"%\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003\"\u0011\u0000\u00ea\u00eb"+
		"\u0005\"\u0000\u0000\u00eb\u00ec\u0003\u001a\r\u0000\u00ec\'\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0007\u0005\u0000\u0000\u00ee)\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0007\u0006\u0000\u0000\u00f0+\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0007\u0007\u0000\u0000\u00f2-\u0001\u0000\u0000\u0000\u0014"+
		"1LTZfqx\u0084\u0088\u008c\u0098\u00a9\u00b4\u00b6\u00c1\u00c4\u00c7\u00d0"+
		"\u00d3\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}