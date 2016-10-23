// Generated from PredKeyword.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PredKeywordParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ID=2, WS=3;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "ID", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_keyIF = 3, RULE_keyCALL = 4;
	public static final String[] ruleNames = {
		"prog", "stat", "expr", "keyIF", "keyCALL"
	};

	@Override
	public String getGrammarFileName() { return "PredKeyword.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PredKeywordParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PredKeywordListener ) ((PredKeywordListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PredKeywordListener ) ((PredKeywordListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(10); stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(13); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PredKeywordParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KeyCALLContext keyCALL() {
			return getRuleContext(KeyCALLContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public KeyIFContext keyIF() {
			return getRuleContext(KeyIFContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PredKeywordListener ) ((PredKeywordListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PredKeywordListener ) ((PredKeywordListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15); keyIF();
				setState(16); expr();
				setState(17); stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19); keyCALL();
				setState(20); match(ID);
				setState(21); match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(23); match(T__0);
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
		public TerminalNode ID() { return getToken(PredKeywordParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PredKeywordListener ) ((PredKeywordListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PredKeywordListener ) ((PredKeywordListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(ID);
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

	public static class KeyIFContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PredKeywordParser.ID, 0); }
		public KeyIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyIF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PredKeywordListener ) ((PredKeywordListener)listener).enterKeyIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PredKeywordListener ) ((PredKeywordListener)listener).exitKeyIF(this);
		}
	}

	public final KeyIFContext keyIF() throws RecognitionException {
		KeyIFContext _localctx = new KeyIFContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			if (!(_input.LT(1).getText().equals("if"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"if\")");
			setState(29); match(ID);
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

	public static class KeyCALLContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PredKeywordParser.ID, 0); }
		public KeyCALLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyCALL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PredKeywordListener ) ((PredKeywordListener)listener).enterKeyCALL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PredKeywordListener ) ((PredKeywordListener)listener).exitKeyCALL(this);
		}
	}

	public final KeyCALLContext keyCALL() throws RecognitionException {
		KeyCALLContext _localctx = new KeyCALLContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_keyCALL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			if (!(_input.LT(1).getText().equals("call"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"call\")");
			setState(32); match(ID);
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
		case 3: return keyIF_sempred((KeyIFContext)_localctx, predIndex);
		case 4: return keyCALL_sempred((KeyCALLContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean keyCALL_sempred(KeyCALLContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return _input.LT(1).getText().equals("call");
		}
		return true;
	}
	private boolean keyIF_sempred(KeyIFContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return _input.LT(1).getText().equals("if");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\5%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\2"+
		"\2\7\2\4\6\b\n\2\2\"\2\r\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b\36\3\2\2"+
		"\2\n!\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20"+
		"\3\2\2\2\20\3\3\2\2\2\21\22\5\b\5\2\22\23\5\6\4\2\23\24\5\4\3\2\24\33"+
		"\3\2\2\2\25\26\5\n\6\2\26\27\7\4\2\2\27\30\7\3\2\2\30\33\3\2\2\2\31\33"+
		"\7\3\2\2\32\21\3\2\2\2\32\25\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\35"+
		"\7\4\2\2\35\7\3\2\2\2\36\37\6\5\2\2\37 \7\4\2\2 \t\3\2\2\2!\"\6\6\3\2"+
		"\"#\7\4\2\2#\13\3\2\2\2\4\17\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}