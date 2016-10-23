// Generated from CPPBaseLexer.g4 by ANTLR 4.5.3

import java.util.List;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPPBaseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INCLUDE=1, OTHER_CMD=2, CHUNK=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INCLUDE", "STRING", "OTHER_CMD", "CHUNK"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INCLUDE", "OTHER_CMD", "CHUNK"
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


	public CPPBaseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CPPBaseLexer.g4"; }

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
			INCLUDE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void INCLUDE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

					// launch another lexer on the include file, get tokens,
					// emit them all at once here, replacing this token
					List<CPPToken> tokens = CPP.include(getText());
					System.out.println("back from include");
					if ( tokens!=null ) {
						for (CPPToken t : tokens) emit(t);
					}
					
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5A\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\5\2#\n\2\3"+
		"\2\3\2\3\2\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\3\4\3\4\7\4\63\n\4"+
		"\f\4\16\4\66\13\4\3\4\5\49\n\4\3\4\3\4\3\5\6\5>\n\5\r\5\16\5?\3+\2\6\3"+
		"\3\5\2\7\4\t\5\3\2\5\4\2\13\13\"\"\4\2\f\f\17\17\3\2%%F\2\3\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2\5\'\3\2\2\2\7\60\3\2\2\2\t=\3\2\2"+
		"\2\13\f\7%\2\2\f\r\7k\2\2\r\16\7p\2\2\16\17\7e\2\2\17\20\7n\2\2\20\21"+
		"\7w\2\2\21\22\7f\2\2\22\23\7g\2\2\23\27\3\2\2\2\24\26\t\2\2\2\25\24\3"+
		"\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3"+
		"\2\2\2\32\36\5\5\3\2\33\35\t\2\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2"+
		"\2\2\36\37\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2!#\7\17\2\2\"!\3\2\2\2\"#\3"+
		"\2\2\2#$\3\2\2\2$%\7\f\2\2%&\b\2\2\2&\4\3\2\2\2\'+\7$\2\2(*\13\2\2\2)"+
		"(\3\2\2\2*-\3\2\2\2+,\3\2\2\2+)\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7$\2\2/"+
		"\6\3\2\2\2\60\64\7%\2\2\61\63\n\3\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62"+
		"\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\679\7\17\2\28\67\3\2"+
		"\2\289\3\2\2\29:\3\2\2\2:;\7\f\2\2;\b\3\2\2\2<>\n\4\2\2=<\3\2\2\2>?\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@\n\3\2\2\2\n\2\27\36\"+\648?\3\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}