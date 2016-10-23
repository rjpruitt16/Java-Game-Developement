// Generated from SetType.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SetType extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, WS=2;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'"
	};
	public static final String[] ruleNames = {
		"DOUBLE", "SINGLE", "WS"
	};


	public SetType(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SetType.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\4&\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\7\3\27\n\3\f\3\16\3\32\13\3\3\3\3\3\3\3\3\3\3\4\6\4!\n\4\r\4\16\4"+
		"\"\3\4\3\4\4\r\30\2\5\3\2\5\2\7\4\3\2\3\5\2\13\f\17\17\"\"(\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\3\t\3\2\2\2\5\24\3\2\2\2\7 \3\2\2\2\t\r\7$"+
		"\2\2\n\f\13\2\2\2\13\n\3\2\2\2\f\17\3\2\2\2\r\16\3\2\2\2\r\13\3\2\2\2"+
		"\16\20\3\2\2\2\17\r\3\2\2\2\20\21\7$\2\2\21\22\3\2\2\2\22\23\b\2\2\2\23"+
		"\4\3\2\2\2\24\30\7)\2\2\25\27\13\2\2\2\26\25\3\2\2\2\27\32\3\2\2\2\30"+
		"\31\3\2\2\2\30\26\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7)\2\2\34"+
		"\35\3\2\2\2\35\36\b\3\2\2\36\6\3\2\2\2\37!\t\2\2\2 \37\3\2\2\2!\"\3\2"+
		"\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\b\4\3\2%\b\3\2\2\2\6\2\r\30\"\4"+
		"\t\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}