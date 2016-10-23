// Generated from Comment.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommentLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, LINE_COMMENT=2, COMMENT=3, WS=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'"
	};
	public static final String[] ruleNames = {
		"ID", "LINE_COMMENT", "COMMENT", "WS"
	};


	public CommentLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Comment.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6\65\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\6\2\r\n\2\r\2\16\2\16\3\3\3\3\3\3\3\3\7\3"+
		"\25\n\3\f\3\16\3\30\13\3\3\3\5\3\33\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\7\4%\n\4\f\4\16\4(\13\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5\60\n\5\r\5\16\5"+
		"\61\3\5\3\5\4\26&\2\6\3\3\5\4\7\5\t\6\3\2\3\4\2\13\f\"\"9\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\f\3\2\2\2\5\20\3\2\2\2\7 \3\2\2"+
		"\2\t/\3\2\2\2\13\r\4c|\2\f\13\3\2\2\2\r\16\3\2\2\2\16\f\3\2\2\2\16\17"+
		"\3\2\2\2\17\4\3\2\2\2\20\21\7\61\2\2\21\22\7\61\2\2\22\26\3\2\2\2\23\25"+
		"\13\2\2\2\24\23\3\2\2\2\25\30\3\2\2\2\26\27\3\2\2\2\26\24\3\2\2\2\27\32"+
		"\3\2\2\2\30\26\3\2\2\2\31\33\7\17\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34"+
		"\3\2\2\2\34\35\7\f\2\2\35\36\3\2\2\2\36\37\b\3\2\2\37\6\3\2\2\2 !\7\61"+
		"\2\2!\"\7,\2\2\"&\3\2\2\2#%\13\2\2\2$#\3\2\2\2%(\3\2\2\2&\'\3\2\2\2&$"+
		"\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7,\2\2*+\7\61\2\2+,\3\2\2\2,-\b\4\2\2"+
		"-\b\3\2\2\2.\60\t\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\63\3\2\2\2\63\64\b\5\2\2\64\n\3\2\2\2\b\2\16\26\32&\61\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}