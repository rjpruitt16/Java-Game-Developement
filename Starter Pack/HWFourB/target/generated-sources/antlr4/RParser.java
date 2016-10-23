// Generated from R.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__53=1, T__52=2, T__51=3, T__50=4, T__49=5, T__48=6, T__47=7, T__46=8, 
		T__45=9, T__44=10, T__43=11, T__42=12, T__41=13, T__40=14, T__39=15, T__38=16, 
		T__37=17, T__36=18, T__35=19, T__34=20, T__33=21, T__32=22, T__31=23, 
		T__30=24, T__29=25, T__28=26, T__27=27, T__26=28, T__25=29, T__24=30, 
		T__23=31, T__22=32, T__21=33, T__20=34, T__19=35, T__18=36, T__17=37, 
		T__16=38, T__15=39, T__14=40, T__13=41, T__12=42, T__11=43, T__10=44, 
		T__9=45, T__8=46, T__7=47, T__6=48, T__5=49, T__4=50, T__3=51, T__2=52, 
		T__1=53, T__0=54, HEX=55, INT=56, FLOAT=57, COMPLEX=58, STRING=59, ID=60, 
		USER_OP=61, NL=62, WS=63;
	public static final String[] tokenNames = {
		"<INVALID>", "'->>'", "'!='", "'while'", "'{'", "'&&'", "'::'", "'='", 
		"'for'", "'^'", "'$'", "'('", "'Inf'", "','", "'repeat'", "'NA'", "'<-'", 
		"'FALSE'", "':::'", "'>='", "'[['", "'<'", "']'", "'~'", "'@'", "'function'", 
		"'NULL'", "'+'", "'TRUE'", "'/'", "'||'", "';'", "'}'", "'if'", "'?'", 
		"':='", "'<='", "'break'", "'&'", "'*'", "'->'", "'...'", "'NaN'", "':'", 
		"'['", "'|'", "'=='", "'>'", "'!'", "'in'", "'else'", "'next'", "')'", 
		"'-'", "'<<-'", "HEX", "INT", "FLOAT", "COMPLEX", "STRING", "ID", "USER_OP", 
		"NL", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_expr_or_assign = 1, RULE_expr = 2, RULE_exprlist = 3, 
		RULE_formlist = 4, RULE_form = 5, RULE_sublist = 6, RULE_sub = 7;
	public static final String[] ruleNames = {
		"prog", "expr_or_assign", "expr", "exprlist", "formlist", "form", "sublist", 
		"sub"
	};

	@Override
	public String getGrammarFileName() { return "R.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(RParser.NL); }
		public TerminalNode EOF() { return getToken(RParser.EOF, 0); }
		public List<Expr_or_assignContext> expr_or_assign() {
			return getRuleContexts(Expr_or_assignContext.class);
		}
		public Expr_or_assignContext expr_or_assign(int i) {
			return getRuleContext(Expr_or_assignContext.class,i);
		}
		public TerminalNode NL(int i) {
			return getToken(RParser.NL, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__51) | (1L << T__50) | (1L << T__46) | (1L << T__43) | (1L << T__42) | (1L << T__40) | (1L << T__39) | (1L << T__37) | (1L << T__31) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__26) | (1L << T__21) | (1L << T__20) | (1L << T__17) | (1L << T__12) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << HEX) | (1L << INT) | (1L << FLOAT) | (1L << COMPLEX) | (1L << STRING) | (1L << ID) | (1L << NL))) != 0)) {
				{
				setState(20);
				switch (_input.LA(1)) {
				case T__51:
				case T__50:
				case T__46:
				case T__43:
				case T__42:
				case T__40:
				case T__39:
				case T__37:
				case T__31:
				case T__29:
				case T__28:
				case T__27:
				case T__26:
				case T__21:
				case T__20:
				case T__17:
				case T__12:
				case T__6:
				case T__3:
				case T__1:
				case HEX:
				case INT:
				case FLOAT:
				case COMPLEX:
				case STRING:
				case ID:
					{
					setState(16); expr_or_assign();
					setState(17);
					_la = _input.LA(1);
					if ( !(_la==T__23 || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case NL:
					{
					setState(19); match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25); match(EOF);
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

	public static class Expr_or_assignContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_or_assignContext expr_or_assign() {
			return getRuleContext(Expr_or_assignContext.class,0);
		}
		public Expr_or_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterExpr_or_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitExpr_or_assign(this);
		}
	}

	public final Expr_or_assignContext expr_or_assign() throws RecognitionException {
		Expr_or_assignContext _localctx = new Expr_or_assignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr_or_assign);
		int _la;
		try {
			setState(32);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27); expr(0);
				setState(28);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__38) | (1L << T__0))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(29); expr_or_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RParser.ID, 0); }
		public TerminalNode HEX() { return getToken(RParser.HEX, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode USER_OP() { return getToken(RParser.USER_OP, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SublistContext sublist() {
			return getRuleContext(SublistContext.class,0);
		}
		public FormlistContext formlist() {
			return getRuleContext(FormlistContext.class,0);
		}
		public TerminalNode STRING() { return getToken(RParser.STRING, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode INT() { return getToken(RParser.INT, 0); }
		public TerminalNode COMPLEX() { return getToken(RParser.COMPLEX, 0); }
		public TerminalNode FLOAT() { return getToken(RParser.FLOAT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(35);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(36); expr(36);
				}
				break;
			case 2:
				{
				setState(37); match(T__6);
				setState(38); expr(30);
				}
				break;
			case 3:
				{
				setState(39); match(T__31);
				setState(40); expr(27);
				}
				break;
			case 4:
				{
				setState(41); match(T__29);
				setState(42); match(T__43);
				setState(44);
				_la = _input.LA(1);
				if (_la==T__13 || _la==ID) {
					{
					setState(43); formlist();
					}
				}

				setState(46); match(T__2);
				setState(47); expr(24);
				}
				break;
			case 5:
				{
				setState(48); match(T__40);
				setState(49); expr(17);
				}
				break;
			case 6:
				{
				setState(50); match(T__20);
				setState(51); expr(16);
				}
				break;
			case 7:
				{
				setState(52); match(T__50);
				setState(53); exprlist();
				setState(54); match(T__22);
				}
				break;
			case 8:
				{
				setState(56); match(T__21);
				setState(57); match(T__43);
				setState(58); expr(0);
				setState(59); match(T__2);
				setState(60); expr(0);
				}
				break;
			case 9:
				{
				setState(62); match(T__21);
				setState(63); match(T__43);
				setState(64); expr(0);
				setState(65); match(T__2);
				setState(66); expr(0);
				setState(67); match(T__4);
				setState(68); expr(0);
				}
				break;
			case 10:
				{
				setState(70); match(T__46);
				setState(71); match(T__43);
				setState(72); match(ID);
				setState(73); match(T__5);
				setState(74); expr(0);
				setState(75); match(T__2);
				setState(76); expr(0);
				}
				break;
			case 11:
				{
				setState(78); match(T__51);
				setState(79); match(T__43);
				setState(80); expr(0);
				setState(81); match(T__2);
				setState(82); expr(0);
				}
				break;
			case 12:
				{
				setState(84); match(T__3);
				}
				break;
			case 13:
				{
				setState(85); match(T__17);
				}
				break;
			case 14:
				{
				setState(86); match(T__43);
				setState(87); expr(0);
				setState(88); match(T__2);
				}
				break;
			case 15:
				{
				setState(90); match(ID);
				}
				break;
			case 16:
				{
				setState(91); match(STRING);
				}
				break;
			case 17:
				{
				setState(92); match(HEX);
				}
				break;
			case 18:
				{
				setState(93); match(INT);
				}
				break;
			case 19:
				{
				setState(94); match(FLOAT);
				}
				break;
			case 20:
				{
				setState(95); match(COMPLEX);
				}
				break;
			case 21:
				{
				setState(96); match(T__28);
				}
				break;
			case 22:
				{
				setState(97); match(T__39);
				}
				break;
			case 23:
				{
				setState(98); match(T__42);
				}
				break;
			case 24:
				{
				setState(99); match(T__12);
				}
				break;
			case 25:
				{
				setState(100); match(T__26);
				}
				break;
			case 26:
				{
				setState(101); match(T__37);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(156);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(105);
						_la = _input.LA(1);
						if ( !(_la==T__48 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(106); expr(40);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(108);
						_la = _input.LA(1);
						if ( !(_la==T__44 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(109); expr(39);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(111); match(T__45);
						setState(112); expr(38);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(114); match(T__11);
						setState(115); expr(36);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(117); match(USER_OP);
						setState(118); expr(35);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(120);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(121); expr(34);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(123);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(124); expr(33);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(126);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__35) | (1L << T__33) | (1L << T__18) | (1L << T__8) | (1L << T__7))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(127); expr(32);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(129);
						_la = _input.LA(1);
						if ( !(_la==T__49 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(130); expr(30);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(132);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__9) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(133); expr(29);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(135); match(T__31);
						setState(136); expr(27);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(138);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__53) | (1L << T__19) | (1L << T__14))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(139); expr(26);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(141); match(T__34);
						setState(142); sublist();
						setState(143); match(T__32);
						setState(144); match(T__32);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(147); match(T__10);
						setState(148); sublist();
						setState(149); match(T__32);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(152); match(T__43);
						setState(153); sublist();
						setState(154); match(T__2);
						}
						break;
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ExprlistContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(RParser.NL); }
		public List<Expr_or_assignContext> expr_or_assign() {
			return getRuleContexts(Expr_or_assignContext.class);
		}
		public Expr_or_assignContext expr_or_assign(int i) {
			return getRuleContext(Expr_or_assignContext.class,i);
		}
		public TerminalNode NL(int i) {
			return getToken(RParser.NL, i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitExprlist(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprlist);
		int _la;
		try {
			setState(172);
			switch (_input.LA(1)) {
			case T__51:
			case T__50:
			case T__46:
			case T__43:
			case T__42:
			case T__40:
			case T__39:
			case T__37:
			case T__31:
			case T__29:
			case T__28:
			case T__27:
			case T__26:
			case T__21:
			case T__20:
			case T__17:
			case T__12:
			case T__6:
			case T__3:
			case T__1:
			case HEX:
			case INT:
			case FLOAT:
			case COMPLEX:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(161); expr_or_assign();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23 || _la==NL) {
					{
					{
					setState(162);
					_la = _input.LA(1);
					if ( !(_la==T__23 || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(164);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__51) | (1L << T__50) | (1L << T__46) | (1L << T__43) | (1L << T__42) | (1L << T__40) | (1L << T__39) | (1L << T__37) | (1L << T__31) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__26) | (1L << T__21) | (1L << T__20) | (1L << T__17) | (1L << T__12) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << HEX) | (1L << INT) | (1L << FLOAT) | (1L << COMPLEX) | (1L << STRING) | (1L << ID))) != 0)) {
						{
						setState(163); expr_or_assign();
						}
					}

					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__22:
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

	public static class FormlistContext extends ParserRuleContext {
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterFormlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitFormlist(this);
		}
	}

	public final FormlistContext formlist() throws RecognitionException {
		FormlistContext _localctx = new FormlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); form();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41) {
				{
				{
				setState(175); match(T__41);
				setState(176); form();
				}
				}
				setState(181);
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

	public static class FormContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitForm(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_form);
		try {
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); match(ID);
				setState(184); match(T__47);
				setState(185); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186); match(T__13);
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

	public static class SublistContext extends ParserRuleContext {
		public SubContext sub(int i) {
			return getRuleContext(SubContext.class,i);
		}
		public List<SubContext> sub() {
			return getRuleContexts(SubContext.class);
		}
		public SublistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sublist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterSublist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitSublist(this);
		}
	}

	public final SublistContext sublist() throws RecognitionException {
		SublistContext _localctx = new SublistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sublist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); sub();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41) {
				{
				{
				setState(190); match(T__41);
				setState(191); sub();
				}
				}
				setState(196);
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

	public static class SubContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(RParser.STRING, 0); }
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitSub(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sub);
		try {
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); match(ID);
				setState(199); match(T__47);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200); match(ID);
				setState(201); match(T__47);
				setState(202); expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203); match(STRING);
				setState(204); match(T__47);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205); match(STRING);
				setState(206); match(T__47);
				setState(207); expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208); match(T__28);
				setState(209); match(T__47);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(210); match(T__28);
				setState(211); match(T__47);
				setState(212); expr(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(213); match(T__13);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 39);
		case 1: return precpred(_ctx, 38);
		case 2: return precpred(_ctx, 37);
		case 3: return precpred(_ctx, 35);
		case 4: return precpred(_ctx, 34);
		case 5: return precpred(_ctx, 33);
		case 6: return precpred(_ctx, 32);
		case 7: return precpred(_ctx, 31);
		case 8: return precpred(_ctx, 29);
		case 9: return precpred(_ctx, 28);
		case 10: return precpred(_ctx, 26);
		case 11: return precpred(_ctx, 25);
		case 12: return precpred(_ctx, 41);
		case 13: return precpred(_ctx, 40);
		case 14: return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4i\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\u009f\n\4\f\4\16\4\u00a2\13\4\3\5\3\5\3\5\5\5\u00a7\n\5\7\5\u00a9\n"+
		"\5\f\5\16\5\u00ac\13\5\3\5\5\5\u00af\n\5\3\6\3\6\3\6\7\6\u00b4\n\6\f\6"+
		"\16\6\u00b7\13\6\3\7\3\7\3\7\3\7\3\7\5\7\u00be\n\7\3\b\3\b\3\b\7\b\u00c3"+
		"\n\b\f\b\16\b\u00c6\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00da\n\t\3\t\2\3\6\n\2\4\6\b\n\f\16\20"+
		"\2\f\4\2!!@@\5\2\t\t\22\2288\4\2\35\35\67\67\4\2\b\b\24\24\4\2\f\f\32"+
		"\32\4\2\37\37))\7\2\4\4\25\25\27\27&&\60\61\4\2\7\7((\4\2  //\5\2\3\3"+
		"%%**\u010e\2\30\3\2\2\2\4\"\3\2\2\2\6h\3\2\2\2\b\u00ae\3\2\2\2\n\u00b0"+
		"\3\2\2\2\f\u00bd\3\2\2\2\16\u00bf\3\2\2\2\20\u00d9\3\2\2\2\22\23\5\4\3"+
		"\2\23\24\t\2\2\2\24\27\3\2\2\2\25\27\7@\2\2\26\22\3\2\2\2\26\25\3\2\2"+
		"\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2"+
		"\2\33\34\7\2\2\3\34\3\3\2\2\2\35\36\5\6\4\2\36\37\t\3\2\2\37 \5\4\3\2"+
		" #\3\2\2\2!#\5\6\4\2\"\35\3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\b\4\1\2%&\t"+
		"\4\2\2&i\5\6\4&\'(\7\62\2\2(i\5\6\4 )*\7\31\2\2*i\5\6\4\35+,\7\33\2\2"+
		",.\7\r\2\2-/\5\n\6\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\66\2\2\61"+
		"i\5\6\4\32\62\63\7\20\2\2\63i\5\6\4\23\64\65\7$\2\2\65i\5\6\4\22\66\67"+
		"\7\6\2\2\678\5\b\5\289\7\"\2\29i\3\2\2\2:;\7#\2\2;<\7\r\2\2<=\5\6\4\2"+
		"=>\7\66\2\2>?\5\6\4\2?i\3\2\2\2@A\7#\2\2AB\7\r\2\2BC\5\6\4\2CD\7\66\2"+
		"\2DE\5\6\4\2EF\7\64\2\2FG\5\6\4\2Gi\3\2\2\2HI\7\n\2\2IJ\7\r\2\2JK\7>\2"+
		"\2KL\7\63\2\2LM\5\6\4\2MN\7\66\2\2NO\5\6\4\2Oi\3\2\2\2PQ\7\5\2\2QR\7\r"+
		"\2\2RS\5\6\4\2ST\7\66\2\2TU\5\6\4\2Ui\3\2\2\2Vi\7\65\2\2Wi\7\'\2\2XY\7"+
		"\r\2\2YZ\5\6\4\2Z[\7\66\2\2[i\3\2\2\2\\i\7>\2\2]i\7=\2\2^i\79\2\2_i\7"+
		":\2\2`i\7;\2\2ai\7<\2\2bi\7\34\2\2ci\7\21\2\2di\7\16\2\2ei\7,\2\2fi\7"+
		"\36\2\2gi\7\23\2\2h$\3\2\2\2h\'\3\2\2\2h)\3\2\2\2h+\3\2\2\2h\62\3\2\2"+
		"\2h\64\3\2\2\2h\66\3\2\2\2h:\3\2\2\2h@\3\2\2\2hH\3\2\2\2hP\3\2\2\2hV\3"+
		"\2\2\2hW\3\2\2\2hX\3\2\2\2h\\\3\2\2\2h]\3\2\2\2h^\3\2\2\2h_\3\2\2\2h`"+
		"\3\2\2\2ha\3\2\2\2hb\3\2\2\2hc\3\2\2\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2h"+
		"g\3\2\2\2i\u00a0\3\2\2\2jk\f)\2\2kl\t\5\2\2l\u009f\5\6\4*mn\f(\2\2no\t"+
		"\6\2\2o\u009f\5\6\4)pq\f\'\2\2qr\7\13\2\2r\u009f\5\6\4(st\f%\2\2tu\7-"+
		"\2\2u\u009f\5\6\4&vw\f$\2\2wx\7?\2\2x\u009f\5\6\4%yz\f#\2\2z{\t\7\2\2"+
		"{\u009f\5\6\4$|}\f\"\2\2}~\t\4\2\2~\u009f\5\6\4#\177\u0080\f!\2\2\u0080"+
		"\u0081\t\b\2\2\u0081\u009f\5\6\4\"\u0082\u0083\f\37\2\2\u0083\u0084\t"+
		"\t\2\2\u0084\u009f\5\6\4 \u0085\u0086\f\36\2\2\u0086\u0087\t\n\2\2\u0087"+
		"\u009f\5\6\4\37\u0088\u0089\f\34\2\2\u0089\u008a\7\31\2\2\u008a\u009f"+
		"\5\6\4\35\u008b\u008c\f\33\2\2\u008c\u008d\t\13\2\2\u008d\u009f\5\6\4"+
		"\34\u008e\u008f\f+\2\2\u008f\u0090\7\26\2\2\u0090\u0091\5\16\b\2\u0091"+
		"\u0092\7\30\2\2\u0092\u0093\7\30\2\2\u0093\u009f\3\2\2\2\u0094\u0095\f"+
		"*\2\2\u0095\u0096\7.\2\2\u0096\u0097\5\16\b\2\u0097\u0098\7\30\2\2\u0098"+
		"\u009f\3\2\2\2\u0099\u009a\f\31\2\2\u009a\u009b\7\r\2\2\u009b\u009c\5"+
		"\16\b\2\u009c\u009d\7\66\2\2\u009d\u009f\3\2\2\2\u009ej\3\2\2\2\u009e"+
		"m\3\2\2\2\u009ep\3\2\2\2\u009es\3\2\2\2\u009ev\3\2\2\2\u009ey\3\2\2\2"+
		"\u009e|\3\2\2\2\u009e\177\3\2\2\2\u009e\u0082\3\2\2\2\u009e\u0085\3\2"+
		"\2\2\u009e\u0088\3\2\2\2\u009e\u008b\3\2\2\2\u009e\u008e\3\2\2\2\u009e"+
		"\u0094\3\2\2\2\u009e\u0099\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\7\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00aa"+
		"\5\4\3\2\u00a4\u00a6\t\2\2\2\u00a5\u00a7\5\4\3\2\u00a6\u00a5\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00af\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a3\3\2\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\t\3\2\2\2\u00b0\u00b5\5\f\7\2\u00b1\u00b2\7\17\2\2\u00b2\u00b4"+
		"\5\f\7\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\13\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00be\7>\2\2"+
		"\u00b9\u00ba\7>\2\2\u00ba\u00bb\7\t\2\2\u00bb\u00be\5\6\4\2\u00bc\u00be"+
		"\7+\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\r\3\2\2\2\u00bf\u00c4\5\20\t\2\u00c0\u00c1\7\17\2\2\u00c1\u00c3\5\20"+
		"\t\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\17\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00da\5\6\4"+
		"\2\u00c8\u00c9\7>\2\2\u00c9\u00da\7\t\2\2\u00ca\u00cb\7>\2\2\u00cb\u00cc"+
		"\7\t\2\2\u00cc\u00da\5\6\4\2\u00cd\u00ce\7=\2\2\u00ce\u00da\7\t\2\2\u00cf"+
		"\u00d0\7=\2\2\u00d0\u00d1\7\t\2\2\u00d1\u00da\5\6\4\2\u00d2\u00d3\7\34"+
		"\2\2\u00d3\u00da\7\t\2\2\u00d4\u00d5\7\34\2\2\u00d5\u00d6\7\t\2\2\u00d6"+
		"\u00da\5\6\4\2\u00d7\u00da\7+\2\2\u00d8\u00da\3\2\2\2\u00d9\u00c7\3\2"+
		"\2\2\u00d9\u00c8\3\2\2\2\u00d9\u00ca\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9"+
		"\u00cf\3\2\2\2\u00d9\u00d2\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da\21\3\2\2\2\20\26\30\".h\u009e\u00a0\u00a6"+
		"\u00aa\u00ae\u00b5\u00bd\u00c4\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}