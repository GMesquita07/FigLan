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
		RULE_printStmt = 8, RULE_printArgs = 9, RULE_argumentSep = 10, RULE_readStmt = 11, 
		RULE_forStmt = 12, RULE_expression = 13, RULE_newExpr = 14, RULE_readExpr = 15, 
		RULE_functionCall = 16, RULE_exprList = 17, RULE_pointLiteral = 18, RULE_lineLiteral = 19, 
		RULE_circleLiteral = 20, RULE_literal = 21, RULE_type = 22, RULE_identifier = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "varDecl", "varInit", "assignStmt", "showStmt", 
			"hideStmt", "pauseStmt", "printStmt", "printArgs", "argumentSep", "readStmt", 
			"forStmt", "expression", "newExpr", "readExpr", "functionCall", "exprList", 
			"pointLiteral", "lineLiteral", "circleLiteral", "literal", "type", "identifier"
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72980916064L) != 0)) {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				varDecl();
				setState(57);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				assignStmt();
				setState(60);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				showStmt();
				setState(63);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				hideStmt();
				setState(66);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				pauseStmt();
				setState(69);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				printStmt();
				setState(72);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				readStmt();
				setState(75);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
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
			setState(80);
			type();
			setState(81);
			varInit();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(82);
				match(T__1);
				setState(83);
				varInit();
				}
				}
				setState(88);
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
			setState(89);
			match(ID);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(90);
				match(T__2);
				setState(91);
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
			setState(94);
			match(ID);
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(96);
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
			setState(98);
			match(T__4);
			setState(99);
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
			setState(101);
			match(T__5);
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(102);
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
				setState(103);
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
			setState(106);
			match(T__7);
			setState(107);
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
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(110);
				match(T__10);
				setState(111);
				printArgs();
				setState(112);
				match(T__11);
				}
				break;
			case 2:
				{
				setState(114);
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
		public List<ArgumentSepContext> argumentSep() {
			return getRuleContexts(ArgumentSepContext.class);
		}
		public ArgumentSepContext argumentSep(int i) {
			return getRuleContext(ArgumentSepContext.class,i);
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
			setState(117);
			expression(0);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1037217836548L) != 0)) {
				{
				{
				setState(118);
				argumentSep();
				setState(119);
				expression(0);
				}
				}
				setState(125);
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
	public static class ArgumentSepContext extends ParserRuleContext {
		public ArgumentSepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentSep; }
	}

	public final ArgumentSepContext argumentSep() throws RecognitionException {
		ArgumentSepContext _localctx = new ArgumentSepContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentSep);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__1);
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
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 22, RULE_readStmt);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(ID);
				setState(131);
				match(T__2);
				setState(132);
				readExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__12);
				setState(134);
				match(T__10);
				setState(135);
				match(ID);
				setState(136);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(T__12);
				setState(138);
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
			setState(141);
			match(T__13);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4261412864L) != 0)) {
				{
				setState(142);
				type();
				}
			}

			setState(145);
			match(ID);
			setState(146);
			match(T__2);
			}
			setState(148);
			expression(0);
			setState(149);
			match(T__14);
			setState(150);
			expression(0);
			setState(151);
			match(T__15);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72980916064L) != 0)) {
				{
				{
				setState(152);
				statement();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
	public static class ReadExpressionContext extends ExpressionContext {
		public ReadExprContext readExpr() {
			return getRuleContext(ReadExprContext.class,0);
		}
		public ReadExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new NewObjContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(161);
				newExpr();
				}
				break;
			case 2:
				{
				_localctx = new ReadExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				readExpr();
				}
				break;
			case 3:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new PointLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				pointLiteral();
				}
				break;
			case 5:
				{
				_localctx = new LineLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				lineLiteral();
				}
				break;
			case 6:
				{
				_localctx = new CircleLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				circleLiteral();
				}
				break;
			case 7:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(T__10);
				setState(168);
				expression(0);
				setState(169);
				match(T__11);
				}
				break;
			case 8:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				literal();
				}
				break;
			case 9:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(176);
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
						setState(177);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(179);
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
						setState(180);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ModDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(182);
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
						setState(183);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(188);
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
			setState(189);
			match(T__23);
			setState(190);
			identifier();
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(191);
				match(T__10);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1037217836544L) != 0)) {
					{
					setState(192);
					expression(0);
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(193);
						match(T__1);
						setState(194);
						expression(0);
						}
						}
						setState(199);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(202);
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
	public static class ReadExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReadExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readExpr; }
	}

	public final ReadExprContext readExpr() throws RecognitionException {
		ReadExprContext _localctx = new ReadExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_readExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__12);
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(206);
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
		enterRule(_localctx, 32, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			identifier();
			setState(210);
			match(T__10);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1037217836544L) != 0)) {
				{
				setState(211);
				expression(0);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(212);
					match(T__1);
					setState(213);
					expression(0);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(221);
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
		enterRule(_localctx, 34, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			expression(0);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(224);
				match(T__1);
				setState(225);
				expression(0);
				}
				}
				setState(230);
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
		enterRule(_localctx, 36, RULE_pointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(LBRACK);
			setState(232);
			expression(0);
			setState(233);
			match(T__1);
			setState(234);
			expression(0);
			setState(235);
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
		enterRule(_localctx, 38, RULE_lineLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			pointLiteral();
			setState(238);
			match(DASHDASH);
			setState(239);
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
		enterRule(_localctx, 40, RULE_circleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			pointLiteral();
			setState(242);
			match(PIPE);
			setState(243);
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
		enterRule(_localctx, 42, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 46, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		"\u0004\u0001+\u00fc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001O\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002U\b\u0002\n\u0002\f\u0002"+
		"X\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003]\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006i\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\bt\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tz\b\t\n\t"+
		"\f\t}\t\t\u0001\n\u0001\n\u0003\n\u0081\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u008c\b\u000b\u0001\f\u0001\f\u0003\f\u0090\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u009a"+
		"\b\f\n\f\f\f\u009d\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00ae\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u00b9\b\r\n\r\f\r\u00bc\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00c4"+
		"\b\u000e\n\u000e\f\u000e\u00c7\t\u000e\u0003\u000e\u00c9\b\u000e\u0001"+
		"\u000e\u0003\u000e\u00cc\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00d0"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00d7\b\u0010\n\u0010\f\u0010\u00da\t\u0010\u0003\u0010\u00dc\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00e3\b\u0011\n\u0011\f\u0011\u00e6\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0000\u0001\u001a\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\b\u0001"+
		"\u0000\u0003\u0004\u0001\u0000\t\n\u0001\u0000\u0012\u0013\u0001\u0000"+
		"\u0014\u0015\u0001\u0000\u0016\u0017\u0001\u0000%\'\u0001\u0000\u0019"+
		"\u001f\u0004\u0000\t\n\r\r\u0019\u001e$$\u0107\u00003\u0001\u0000\u0000"+
		"\u0000\u0002N\u0001\u0000\u0000\u0000\u0004P\u0001\u0000\u0000\u0000\u0006"+
		"Y\u0001\u0000\u0000\u0000\b^\u0001\u0000\u0000\u0000\nb\u0001\u0000\u0000"+
		"\u0000\fe\u0001\u0000\u0000\u0000\u000ej\u0001\u0000\u0000\u0000\u0010"+
		"m\u0001\u0000\u0000\u0000\u0012u\u0001\u0000\u0000\u0000\u0014\u0080\u0001"+
		"\u0000\u0000\u0000\u0016\u008b\u0001\u0000\u0000\u0000\u0018\u008d\u0001"+
		"\u0000\u0000\u0000\u001a\u00ad\u0001\u0000\u0000\u0000\u001c\u00bd\u0001"+
		"\u0000\u0000\u0000\u001e\u00cd\u0001\u0000\u0000\u0000 \u00d1\u0001\u0000"+
		"\u0000\u0000\"\u00df\u0001\u0000\u0000\u0000$\u00e7\u0001\u0000\u0000"+
		"\u0000&\u00ed\u0001\u0000\u0000\u0000(\u00f1\u0001\u0000\u0000\u0000*"+
		"\u00f5\u0001\u0000\u0000\u0000,\u00f7\u0001\u0000\u0000\u0000.\u00f9\u0001"+
		"\u0000\u0000\u000002\u0003\u0002\u0001\u000010\u0001\u0000\u0000\u0000"+
		"25\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000046\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0005\u0000"+
		"\u0000\u00017\u0001\u0001\u0000\u0000\u000089\u0003\u0004\u0002\u0000"+
		"9:\u0005\u0001\u0000\u0000:O\u0001\u0000\u0000\u0000;<\u0003\b\u0004\u0000"+
		"<=\u0005\u0001\u0000\u0000=O\u0001\u0000\u0000\u0000>?\u0003\n\u0005\u0000"+
		"?@\u0005\u0001\u0000\u0000@O\u0001\u0000\u0000\u0000AB\u0003\f\u0006\u0000"+
		"BC\u0005\u0001\u0000\u0000CO\u0001\u0000\u0000\u0000DE\u0003\u000e\u0007"+
		"\u0000EF\u0005\u0001\u0000\u0000FO\u0001\u0000\u0000\u0000GH\u0003\u0010"+
		"\b\u0000HI\u0005\u0001\u0000\u0000IO\u0001\u0000\u0000\u0000JK\u0003\u0016"+
		"\u000b\u0000KL\u0005\u0001\u0000\u0000LO\u0001\u0000\u0000\u0000MO\u0003"+
		"\u0018\f\u0000N8\u0001\u0000\u0000\u0000N;\u0001\u0000\u0000\u0000N>\u0001"+
		"\u0000\u0000\u0000NA\u0001\u0000\u0000\u0000ND\u0001\u0000\u0000\u0000"+
		"NG\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000"+
		"\u0000O\u0003\u0001\u0000\u0000\u0000PQ\u0003,\u0016\u0000QV\u0003\u0006"+
		"\u0003\u0000RS\u0005\u0002\u0000\u0000SU\u0003\u0006\u0003\u0000TR\u0001"+
		"\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000W\u0005\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000Y\\\u0005$\u0000\u0000Z[\u0005\u0003\u0000\u0000[]\u0003\u001a"+
		"\r\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0007"+
		"\u0001\u0000\u0000\u0000^_\u0005$\u0000\u0000_`\u0007\u0000\u0000\u0000"+
		"`a\u0003\u001a\r\u0000a\t\u0001\u0000\u0000\u0000bc\u0005\u0005\u0000"+
		"\u0000cd\u0003\"\u0011\u0000d\u000b\u0001\u0000\u0000\u0000eh\u0005\u0006"+
		"\u0000\u0000fi\u0005\u0007\u0000\u0000gi\u0003\"\u0011\u0000hf\u0001\u0000"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000i\r\u0001\u0000\u0000\u0000jk\u0005"+
		"\b\u0000\u0000kl\u0003\u001a\r\u0000l\u000f\u0001\u0000\u0000\u0000ms"+
		"\u0007\u0001\u0000\u0000no\u0005\u000b\u0000\u0000op\u0003\u0012\t\u0000"+
		"pq\u0005\f\u0000\u0000qt\u0001\u0000\u0000\u0000rt\u0003\u0012\t\u0000"+
		"sn\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u0011\u0001\u0000"+
		"\u0000\u0000u{\u0003\u001a\r\u0000vw\u0003\u0014\n\u0000wx\u0003\u001a"+
		"\r\u0000xz\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000z}\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0013"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0005\u0002"+
		"\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0015\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005$\u0000\u0000\u0083\u0084\u0005\u0003\u0000\u0000"+
		"\u0084\u008c\u0003\u001e\u000f\u0000\u0085\u0086\u0005\r\u0000\u0000\u0086"+
		"\u0087\u0005\u000b\u0000\u0000\u0087\u0088\u0005$\u0000\u0000\u0088\u008c"+
		"\u0005\f\u0000\u0000\u0089\u008a\u0005\r\u0000\u0000\u008a\u008c\u0005"+
		"$\u0000\u0000\u008b\u0082\u0001\u0000\u0000\u0000\u008b\u0085\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u0017\u0001\u0000"+
		"\u0000\u0000\u008d\u008f\u0005\u000e\u0000\u0000\u008e\u0090\u0003,\u0016"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0005$\u0000\u0000"+
		"\u0092\u0093\u0005\u0003\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0003\u001a\r\u0000\u0095\u0096\u0005\u000f\u0000\u0000\u0096"+
		"\u0097\u0003\u001a\r\u0000\u0097\u009b\u0005\u0010\u0000\u0000\u0098\u009a"+
		"\u0003\u0002\u0001\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0011\u0000\u0000\u009f\u0019"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006\r\uffff\uffff\u0000\u00a1\u00ae"+
		"\u0003\u001c\u000e\u0000\u00a2\u00ae\u0003\u001e\u000f\u0000\u00a3\u00ae"+
		"\u0003 \u0010\u0000\u00a4\u00ae\u0003$\u0012\u0000\u00a5\u00ae\u0003&"+
		"\u0013\u0000\u00a6\u00ae\u0003(\u0014\u0000\u00a7\u00a8\u0005\u000b\u0000"+
		"\u0000\u00a8\u00a9\u0003\u001a\r\u0000\u00a9\u00aa\u0005\f\u0000\u0000"+
		"\u00aa\u00ae\u0001\u0000\u0000\u0000\u00ab\u00ae\u0003*\u0015\u0000\u00ac"+
		"\u00ae\u0005$\u0000\u0000\u00ad\u00a0\u0001\u0000\u0000\u0000\u00ad\u00a2"+
		"\u0001\u0000\u0000\u0000\u00ad\u00a3\u0001\u0000\u0000\u0000\u00ad\u00a4"+
		"\u0001\u0000\u0000\u0000\u00ad\u00a5\u0001\u0000\u0000\u0000\u00ad\u00a6"+
		"\u0001\u0000\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ba"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\n\t\u0000\u0000\u00b0\u00b1\u0007"+
		"\u0002\u0000\u0000\u00b1\u00b9\u0003\u001a\r\n\u00b2\u00b3\n\b\u0000\u0000"+
		"\u00b3\u00b4\u0007\u0003\u0000\u0000\u00b4\u00b9\u0003\u001a\r\t\u00b5"+
		"\u00b6\n\u0007\u0000\u0000\u00b6\u00b7\u0007\u0004\u0000\u0000\u00b7\u00b9"+
		"\u0003\u001a\r\b\u00b8\u00af\u0001\u0000\u0000\u0000\u00b8\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u001b\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005\u0018\u0000\u0000\u00be\u00cb\u0003"+
		".\u0017\u0000\u00bf\u00c8\u0005\u000b\u0000\u0000\u00c0\u00c5\u0003\u001a"+
		"\r\u0000\u00c1\u00c2\u0005\u0002\u0000\u0000\u00c2\u00c4\u0003\u001a\r"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c0\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005\f\u0000\u0000"+
		"\u00cb\u00bf\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u001d\u0001\u0000\u0000\u0000\u00cd\u00cf\u0005\r\u0000\u0000\u00ce"+
		"\u00d0\u0003\u001a\r\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d0\u001f\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0003.\u0017\u0000\u00d2\u00db\u0005\u000b\u0000\u0000\u00d3\u00d8\u0003"+
		"\u001a\r\u0000\u00d4\u00d5\u0005\u0002\u0000\u0000\u00d5\u00d7\u0003\u001a"+
		"\r\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00db\u00d3\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\f\u0000\u0000"+
		"\u00de!\u0001\u0000\u0000\u0000\u00df\u00e4\u0003\u001a\r\u0000\u00e0"+
		"\u00e1\u0005\u0002\u0000\u0000\u00e1\u00e3\u0003\u001a\r\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5#\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		" \u0000\u0000\u00e8\u00e9\u0003\u001a\r\u0000\u00e9\u00ea\u0005\u0002"+
		"\u0000\u0000\u00ea\u00eb\u0003\u001a\r\u0000\u00eb\u00ec\u0005!\u0000"+
		"\u0000\u00ec%\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003$\u0012\u0000\u00ee"+
		"\u00ef\u0005#\u0000\u0000\u00ef\u00f0\u0003$\u0012\u0000\u00f0\'\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0003$\u0012\u0000\u00f2\u00f3\u0005\""+
		"\u0000\u0000\u00f3\u00f4\u0003\u001a\r\u0000\u00f4)\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0007\u0005\u0000\u0000\u00f6+\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0007\u0006\u0000\u0000\u00f8-\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0007\u0007\u0000\u0000\u00fa/\u0001\u0000\u0000\u0000\u00153N"+
		"V\\hs{\u0080\u008b\u008f\u009b\u00ad\u00b8\u00ba\u00c5\u00c8\u00cb\u00cf"+
		"\u00d8\u00db\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}