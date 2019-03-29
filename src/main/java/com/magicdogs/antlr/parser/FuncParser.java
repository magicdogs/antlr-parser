// Generated from C:/Users/Administrator/IdeaProjects/demo/src/main/resources\Func.parser by ANTLR 4.7.2
package com.magicdogs.antlr.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FuncParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, EQ=3, NEQ=4, GT=5, LT=6, GTEQ=7, LTEQ=8, PLUS=9, MINUS=10,
		MULT=11, DIV=12, MOD=13, POW=14, NOT=15, SCOL=16, ASSIGN=17, OPAR=18,
		CPAR=19, OBRACE=20, CBRACE=21, LSQU=22, RSQU=23, TRUE=24, FALSE=25, NIL=26,
		IF=27, ELSE=28, VAR=29, STRING_LITERAL=30, RET=31, ID=32, INT=33, FLOAT=34,
		STRING=35, COMMENT=36, SPACE=37, OTHER=38;
	public static final int
		RULE_parse = 0, RULE_start = 1, RULE_content = 2, RULE_assignment = 3,
		RULE_if_stat = 4, RULE_condition_block = 5, RULE_stat_block = 6, RULE_ret = 7,
		RULE_r = 8, RULE_expr = 9, RULE_key = 10, RULE_atom = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "start", "content", "assignment", "if_stat", "condition_block",
			"stat_block", "ret", "r", "expr", "key", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'",
			"'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", "'='", "'('", "')'",
			"'{'", "'}'", "'['", "']'", "'true'", "'false'", "'nil'", "'if'", "'else'",
			"'var'", null, "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS",
			"MULT", "DIV", "MOD", "POW", "NOT", "SCOL", "ASSIGN", "OPAR", "CPAR",
			"OBRACE", "CBRACE", "LSQU", "RSQU", "TRUE", "FALSE", "NIL", "IF", "ELSE",
			"VAR", "STRING_LITERAL", "RET", "ID", "INT", "FLOAT", "STRING", "COMMENT",
			"SPACE", "OTHER"
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
	public String getGrammarFileName() { return "Func.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FuncParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FuncParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			start();
			setState(25);
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

	public static class StartContext extends ParserRuleContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << VAR) | (1L << OTHER))) != 0)) {
				{
				{
				setState(27);
				content();
				}
				}
				setState(32);
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

	public static class ContentContext extends ParserRuleContext {
		public Token OTHER;
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(FuncParser.OTHER, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_content);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				if_stat();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				assignment();
				}
				break;
			case OTHER:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				((ContentContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown char: " + (((ContentContext)_localctx).OTHER!=null?((ContentContext)_localctx).OTHER.getText():null));
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(FuncParser.VAR, 0); }
		public TerminalNode ID() { return getToken(FuncParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(FuncParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(FuncParser.SCOL, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(VAR);
			setState(40);
			match(ID);
			setState(41);
			match(ASSIGN);
			setState(42);
			expr();
			setState(43);
			match(SCOL);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(FuncParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(FuncParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(FuncParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(FuncParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(IF);
			setState(46);
			condition_block();
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					match(ELSE);
					setState(48);
					match(IF);
					setState(49);
					condition_block();
					}
					}
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(55);
				match(ELSE);
				setState(56);
				stat_block();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(FuncParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(FuncParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(OPAR);
			setState(60);
			expr();
			setState(61);
			match(CPAR);
			setState(62);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(FuncParser.OBRACE, 0); }
		public TerminalNode RET() { return getToken(FuncParser.RET, 0); }
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(FuncParser.CBRACE, 0); }
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stat_block);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(OBRACE);
				setState(65);
				match(RET);
				setState(66);
				ret();
				setState(67);
				match(CBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(OBRACE);
				setState(70);
				if_stat();
				setState(71);
				match(CBRACE);
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FuncParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(FuncParser.OPAR, 0); }
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(FuncParser.CPAR, 0); }
		public TerminalNode SCOL() { return getToken(FuncParser.SCOL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FuncParser.STRING_LITERAL, 0); }
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ret);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(ID);
				setState(76);
				match(OPAR);
				setState(77);
				r();
				setState(78);
				match(CPAR);
				setState(79);
				match(SCOL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(STRING_LITERAL);
				setState(82);
				match(SCOL);
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

	public static class RContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FuncParser.ID, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ID);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }

		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(FuncParser.ID, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public AssignmentExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEQNEQContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(FuncParser.ID, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode EQ() { return getToken(FuncParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(FuncParser.NEQ, 0); }
		public ExprEQNEQContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterExprEQNEQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitExprEQNEQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitExprEQNEQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(FuncParser.ID, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode LTEQ() { return getToken(FuncParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(FuncParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(FuncParser.LT, 0); }
		public TerminalNode GT() { return getToken(FuncParser.GT, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ExprEQNEQContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(ID);
				setState(88);
				key();
				setState(89);
				((ExprEQNEQContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
					((ExprEQNEQContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(90);
				atom();
				}
				break;
			case 2:
				_localctx = new RelationalExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(ID);
				setState(93);
				key();
				setState(94);
				((RelationalExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
					((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(95);
				atom();
				}
				break;
			case 3:
				_localctx = new AssignmentExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(ID);
				setState(98);
				key();
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(FuncParser.OPAR, 0); }
		public TerminalNode ID() { return getToken(FuncParser.ID, 0); }
		public TerminalNode CPAR() { return getToken(FuncParser.CPAR, 0); }
		public TerminalNode LSQU() { return getToken(FuncParser.LSQU, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FuncParser.STRING_LITERAL, 0); }
		public TerminalNode RSQU() { return getToken(FuncParser.RSQU, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_key);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(OPAR);
				setState(102);
				match(ID);
				setState(103);
				match(CPAR);
				}
				break;
			case LSQU:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(LSQU);
				setState(105);
				match(STRING_LITERAL);
				setState(106);
				match(RSQU);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }

		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLITERALContext extends AtomContext {
		public TerminalNode STRING_LITERAL() { return getToken(FuncParser.STRING_LITERAL, 0); }
		public StringLITERALContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterStringLITERAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitStringLITERAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitStringLITERAL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends AtomContext {
		public TerminalNode OPAR() { return getToken(FuncParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(FuncParser.CPAR, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(FuncParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FuncParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(FuncParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(FuncParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NilAtomContext extends AtomContext {
		public TerminalNode NIL() { return getToken(FuncParser.NIL, 0); }
		public NilAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterNilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitNilAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitNilAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(FuncParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(FuncParser.FLOAT, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FuncVisitor ) return ((FuncVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atom);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(OPAR);
				setState(110);
				expr();
				setState(111);
				match(CPAR);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				match(STRING);
				}
				break;
			case NIL:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				match(NIL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLITERALContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
				match(STRING_LITERAL);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(|\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\3\2\3\2\3\2\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3\4\3\4\3"+
		"\4\5\4(\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\65\n\6\f\6"+
		"\16\68\13\6\3\6\3\6\5\6<\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bL\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tV\n\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13f\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fn\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\rz\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\3\2\5\6\3"+
		"\2\7\n\3\2#$\3\2\32\33\2\177\2\32\3\2\2\2\4 \3\2\2\2\6\'\3\2\2\2\b)\3"+
		"\2\2\2\n/\3\2\2\2\f=\3\2\2\2\16K\3\2\2\2\20U\3\2\2\2\22W\3\2\2\2\24e\3"+
		"\2\2\2\26m\3\2\2\2\30y\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\3\3\2\2"+
		"\2\35\37\5\6\4\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3"+
		"\2\2\2\" \3\2\2\2#(\5\n\6\2$(\5\b\5\2%&\7(\2\2&(\b\4\1\2\'#\3\2\2\2\'"+
		"$\3\2\2\2\'%\3\2\2\2(\7\3\2\2\2)*\7\37\2\2*+\7\"\2\2+,\7\23\2\2,-\5\24"+
		"\13\2-.\7\22\2\2.\t\3\2\2\2/\60\7\35\2\2\60\66\5\f\7\2\61\62\7\36\2\2"+
		"\62\63\7\35\2\2\63\65\5\f\7\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2"+
		"\66\67\3\2\2\2\67;\3\2\2\28\66\3\2\2\29:\7\36\2\2:<\5\16\b\2;9\3\2\2\2"+
		";<\3\2\2\2<\13\3\2\2\2=>\7\24\2\2>?\5\24\13\2?@\7\25\2\2@A\5\16\b\2A\r"+
		"\3\2\2\2BC\7\26\2\2CD\7!\2\2DE\5\20\t\2EF\7\27\2\2FL\3\2\2\2GH\7\26\2"+
		"\2HI\5\n\6\2IJ\7\27\2\2JL\3\2\2\2KB\3\2\2\2KG\3\2\2\2L\17\3\2\2\2MN\7"+
		"\"\2\2NO\7\24\2\2OP\5\22\n\2PQ\7\25\2\2QR\7\22\2\2RV\3\2\2\2ST\7 \2\2"+
		"TV\7\22\2\2UM\3\2\2\2US\3\2\2\2V\21\3\2\2\2WX\7\"\2\2X\23\3\2\2\2YZ\7"+
		"\"\2\2Z[\5\26\f\2[\\\t\2\2\2\\]\5\30\r\2]f\3\2\2\2^_\7\"\2\2_`\5\26\f"+
		"\2`a\t\3\2\2ab\5\30\r\2bf\3\2\2\2cd\7\"\2\2df\5\26\f\2eY\3\2\2\2e^\3\2"+
		"\2\2ec\3\2\2\2f\25\3\2\2\2gh\7\24\2\2hi\7\"\2\2in\7\25\2\2jk\7\30\2\2"+
		"kl\7 \2\2ln\7\31\2\2mg\3\2\2\2mj\3\2\2\2n\27\3\2\2\2op\7\24\2\2pq\5\24"+
		"\13\2qr\7\25\2\2rz\3\2\2\2sz\t\4\2\2tz\t\5\2\2uz\7\"\2\2vz\7%\2\2wz\7"+
		"\34\2\2xz\7 \2\2yo\3\2\2\2ys\3\2\2\2yt\3\2\2\2yu\3\2\2\2yv\3\2\2\2yw\3"+
		"\2\2\2yx\3\2\2\2z\31\3\2\2\2\13 \'\66;KUemy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
