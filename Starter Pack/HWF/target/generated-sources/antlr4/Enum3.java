// Generated from Enum3.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Enum3 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENUM=1, ID=2, WS=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ENUM", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ENUM", "ID", "WS"
	};
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


	public Enum3(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Enum3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			ENUM_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ENUM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("enum!");
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("ID "+getText());
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return ENUM_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ENUM_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return getText().equals("enum");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5\34\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\3\2\6\2\13\n\2\r\2\16\2\f\3\2\3\2\3\2\3\3\6\3\23\n\3"+
		"\r\3\16\3\24\3\3\3\3\3\4\3\4\3\4\3\4\2\2\5\3\3\5\4\7\5\3\2\4\3\2c|\4\2"+
		"\f\f\"\"\35\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\3\n\3\2\2\2\5\22\3\2\2"+
		"\2\7\30\3\2\2\2\t\13\t\2\2\2\n\t\3\2\2\2\13\f\3\2\2\2\f\n\3\2\2\2\f\r"+
		"\3\2\2\2\r\16\3\2\2\2\16\17\6\2\2\2\17\20\b\2\2\2\20\4\3\2\2\2\21\23\t"+
		"\2\2\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\26\3"+
		"\2\2\2\26\27\b\3\3\2\27\6\3\2\2\2\30\31\t\3\2\2\31\32\3\2\2\2\32\33\b"+
		"\4\4\2\33\b\3\2\2\2\5\2\f\24\5\3\2\2\3\3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}