// Generated from Tags.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TagsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CDATA=2, TAG=3, ENTITY=4, TEXT=5;
	public static final String[] tokenNames = {
		"<INVALID>", "COMMENT", "CDATA", "TAG", "ENTITY", "TEXT"
	};
	public static final int
		RULE_file = 0;
	public static final String[] ruleNames = {
		"file"
	};

	@Override
	public String getGrammarFileName() { return "Tags.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TagsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode CDATA(int i) {
			return getToken(TagsParser.CDATA, i);
		}
		public List<TerminalNode> TAG() { return getTokens(TagsParser.TAG); }
		public List<TerminalNode> TEXT() { return getTokens(TagsParser.TEXT); }
		public TerminalNode ENTITY(int i) {
			return getToken(TagsParser.ENTITY, i);
		}
		public List<TerminalNode> ENTITY() { return getTokens(TagsParser.ENTITY); }
		public List<TerminalNode> CDATA() { return getTokens(TagsParser.CDATA); }
		public TerminalNode TAG(int i) {
			return getToken(TagsParser.TAG, i);
		}
		public TerminalNode TEXT(int i) {
			return getToken(TagsParser.TEXT, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TagsListener ) ((TagsListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TagsListener ) ((TagsListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CDATA) | (1L << TAG) | (1L << ENTITY) | (1L << TEXT))) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CDATA) | (1L << TAG) | (1L << ENTITY) | (1L << TEXT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(7);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\13\4\2\t\2\3\2"+
		"\7\2\6\n\2\f\2\16\2\t\13\2\3\2\2\2\3\2\2\3\3\2\4\7\n\2\7\3\2\2\2\4\6\t"+
		"\2\2\2\5\4\3\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2\t\7"+
		"\3\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}