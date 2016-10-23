// Generated from C.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, ID=9, 
		INT=10, WS=11, SL_COMMENT=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ID", 
		"INT", "WS", "SL_COMMENT"
	};


	public CLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\n\67\n\n"+
		"\r\n\16\n8\3\13\6\13<\n\13\r\13\16\13=\3\f\6\fA\n\f\r\f\16\fB\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\7\rK\n\r\f\r\16\rN\13\r\3\r\5\rQ\n\r\3\r\3\r\3\r\3\r"+
		"\3L\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2"+
		"\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"Z\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\""+
		"\3\2\2\2\7&\3\2\2\2\t(\3\2\2\2\13*\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21"+
		"\63\3\2\2\2\23\66\3\2\2\2\25;\3\2\2\2\27@\3\2\2\2\31F\3\2\2\2\33\34\7"+
		"g\2\2\34\35\7z\2\2\35\36\7v\2\2\36\37\7g\2\2\37 \7t\2\2 !\7p\2\2!\4\3"+
		"\2\2\2\"#\7k\2\2#$\7p\2\2$%\7v\2\2%\6\3\2\2\2&\'\7*\2\2\'\b\3\2\2\2()"+
		"\7+\2\2)\n\3\2\2\2*+\7x\2\2+,\7q\2\2,-\7k\2\2-.\7f\2\2.\f\3\2\2\2/\60"+
		"\7=\2\2\60\16\3\2\2\2\61\62\7}\2\2\62\20\3\2\2\2\63\64\7\177\2\2\64\22"+
		"\3\2\2\2\65\67\t\2\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\2"+
		"9\24\3\2\2\2:<\t\3\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\26\3\2"+
		"\2\2?A\t\4\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b\f"+
		"\2\2E\30\3\2\2\2FG\7\61\2\2GH\7\61\2\2HL\3\2\2\2IK\13\2\2\2JI\3\2\2\2"+
		"KN\3\2\2\2LM\3\2\2\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2OQ\7\17\2\2PO\3\2\2"+
		"\2PQ\3\2\2\2QR\3\2\2\2RS\7\f\2\2ST\3\2\2\2TU\b\r\2\2U\32\3\2\2\2\b\28"+
		"=BLP\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}