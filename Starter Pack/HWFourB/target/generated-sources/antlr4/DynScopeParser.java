// Generated from DynScope.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DynScopeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, ID=6, INT=7, WS=8;
	public static final String[] tokenNames = {
		"<INVALID>", "'int'", "';'", "'{'", "'='", "'}'", "ID", "INT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_decl = 2, RULE_stat = 3;
	public static final String[] ruleNames = {
		"prog", "block", "decl", "stat"
	};

	@Override
	public String getGrammarFileName() { return "DynScope.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DynScopeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynScopeListener ) ((DynScopeListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynScopeListener ) ((DynScopeListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<String> symbols;
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynScopeListener ) ((DynScopeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynScopeListener ) ((DynScopeListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); match(T__2);
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(11); decl();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17); stat();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==ID );
			setState(22); match(T__0);
			System.out.println("symbols="+_localctx.symbols);
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

	public static class DeclContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(DynScopeParser.ID, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynScopeListener ) ((DynScopeListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynScopeListener ) ((DynScopeListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(T__4);
			setState(26); ((DeclContext)_localctx).ID = match(ID);
			((BlockContext)getInvokingContext(1)).symbols.add((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null));
			setState(28); match(T__3);
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
		public Token ID;
		public TerminalNode ID() { return getToken(DynScopeParser.ID, 0); }
		public TerminalNode INT() { return getToken(DynScopeParser.INT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynScopeListener ) ((DynScopeListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynScopeListener ) ((DynScopeListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(36);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); ((StatContext)_localctx).ID = match(ID);
				setState(31); match(T__1);
				setState(32); match(INT);
				setState(33); match(T__3);

				        if ( !((BlockContext)getInvokingContext(1)).symbols.contains((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null)) ) {
				            System.err.println("undefined variable: "+(((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null));
				        }
				        
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35); block();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\7\3\17\n\3\f\3\16\3\22\13\3\3\3\6\3"+
		"\25\n\3\r\3\16\3\26\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\'\n\5\3\5\2\2\6\2\4\6\b\2\2\'\2\n\3\2\2\2\4\f\3\2\2\2\6\33"+
		"\3\2\2\2\b&\3\2\2\2\n\13\5\4\3\2\13\3\3\2\2\2\f\20\7\5\2\2\r\17\5\6\4"+
		"\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\24\3\2\2"+
		"\2\22\20\3\2\2\2\23\25\5\b\5\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2"+
		"\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\7\7\2\2\31\32\b\3\1\2\32\5\3\2\2"+
		"\2\33\34\7\3\2\2\34\35\7\b\2\2\35\36\b\4\1\2\36\37\7\4\2\2\37\7\3\2\2"+
		"\2 !\7\b\2\2!\"\7\6\2\2\"#\7\t\2\2#$\7\4\2\2$\'\b\5\1\2%\'\5\4\3\2& \3"+
		"\2\2\2&%\3\2\2\2\'\t\3\2\2\2\5\20\26&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}