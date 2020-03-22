// Generated from /Users/cooperstrahan/Documents/Compilers/Scanner/src/com/company/microGrammar.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class microGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATOR=1, KEYWORD=2, WS=3, IDENTIFIER=4, INTLITERAL=5, FLOATLITERAL=6, 
		STRINGLITERAL=7, COMMENT=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPERATOR", "KEYWORD", "WS", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
			"STRINGLITERAL", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERATOR", "KEYWORD", "WS", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
			"STRINGLITERAL", "COMMENT"
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


	public microGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "microGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3}\n"+
		"\3\3\4\6\4\u0080\n\4\r\4\16\4\u0081\3\4\3\4\3\5\3\5\7\5\u0088\n\5\f\5"+
		"\16\5\u008b\13\5\3\6\6\6\u008e\n\6\r\6\16\6\u008f\3\7\7\7\u0093\n\7\f"+
		"\7\16\7\u0096\13\7\3\7\3\7\6\7\u009a\n\7\r\7\16\7\u009b\3\b\3\b\7\b\u00a0"+
		"\n\b\f\b\16\b\u00a3\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00ab\n\t\f\t\16"+
		"\t\u00ae\13\t\3\t\3\t\3\t\3\t\4\u00a1\u00ac\2\n\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\3\2\b\6\2,-//\61\61??\6\2*+..=>@@\5\2\13\f\17\17\"\"\4\2"+
		"C\\c|\5\2\62;C\\c|\3\2\62;\2\u00cf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\35\3"+
		"\2\2\2\5|\3\2\2\2\7\177\3\2\2\2\t\u0085\3\2\2\2\13\u008d\3\2\2\2\r\u0094"+
		"\3\2\2\2\17\u009d\3\2\2\2\21\u00a6\3\2\2\2\23\24\7<\2\2\24\36\7?\2\2\25"+
		"\36\t\2\2\2\26\27\7#\2\2\27\36\7?\2\2\30\36\t\3\2\2\31\32\7>\2\2\32\36"+
		"\7?\2\2\33\34\7@\2\2\34\36\7?\2\2\35\23\3\2\2\2\35\25\3\2\2\2\35\26\3"+
		"\2\2\2\35\30\3\2\2\2\35\31\3\2\2\2\35\33\3\2\2\2\36\4\3\2\2\2\37 \7R\2"+
		"\2 !\7T\2\2!\"\7Q\2\2\"#\7I\2\2#$\7T\2\2$%\7C\2\2%}\7O\2\2&\'\7D\2\2\'"+
		"(\7G\2\2()\7I\2\2)*\7K\2\2*}\7P\2\2+,\7G\2\2,-\7P\2\2-}\7F\2\2./\7H\2"+
		"\2/\60\7W\2\2\60\61\7P\2\2\61\62\7E\2\2\62\63\7V\2\2\63\64\7K\2\2\64\65"+
		"\7Q\2\2\65}\7P\2\2\66\67\7T\2\2\678\7G\2\289\7C\2\29}\7F\2\2:;\7Y\2\2"+
		";<\7T\2\2<=\7K\2\2=>\7V\2\2>}\7G\2\2?@\7K\2\2@}\7H\2\2AB\7G\2\2BC\7N\2"+
		"\2CD\7U\2\2D}\7G\2\2EF\7G\2\2FG\7P\2\2GH\7F\2\2HI\7K\2\2I}\7H\2\2JK\7"+
		"Y\2\2KL\7J\2\2LM\7K\2\2MN\7N\2\2N}\7G\2\2OP\7G\2\2PQ\7P\2\2QR\7F\2\2R"+
		"S\7Y\2\2ST\7J\2\2TU\7K\2\2UV\7N\2\2V}\7G\2\2WX\7E\2\2XY\7Q\2\2YZ\7P\2"+
		"\2Z[\7V\2\2[\\\7K\2\2\\]\7P\2\2]^\7W\2\2^}\7G\2\2_`\7D\2\2`a\7T\2\2ab"+
		"\7G\2\2bc\7C\2\2c}\7M\2\2de\7T\2\2ef\7G\2\2fg\7V\2\2gh\7W\2\2hi\7T\2\2"+
		"i}\7P\2\2jk\7K\2\2kl\7P\2\2l}\7V\2\2mn\7X\2\2no\7Q\2\2op\7K\2\2p}\7F\2"+
		"\2qr\7U\2\2rs\7V\2\2st\7T\2\2tu\7K\2\2uv\7P\2\2v}\7I\2\2wx\7H\2\2xy\7"+
		"N\2\2yz\7Q\2\2z{\7C\2\2{}\7V\2\2|\37\3\2\2\2|&\3\2\2\2|+\3\2\2\2|.\3\2"+
		"\2\2|\66\3\2\2\2|:\3\2\2\2|?\3\2\2\2|A\3\2\2\2|E\3\2\2\2|J\3\2\2\2|O\3"+
		"\2\2\2|W\3\2\2\2|_\3\2\2\2|d\3\2\2\2|j\3\2\2\2|m\3\2\2\2|q\3\2\2\2|w\3"+
		"\2\2\2}\6\3\2\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\4\2"+
		"\2\u0084\b\3\2\2\2\u0085\u0089\t\5\2\2\u0086\u0088\t\6\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\n\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\t\7\2\2\u008d\u008c\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\f\3"+
		"\2\2\2\u0091\u0093\t\7\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0099\7\60\2\2\u0098\u009a\t\7\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\16\3\2\2"+
		"\2\u009d\u00a1\7$\2\2\u009e\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7$\2\2\u00a5\20\3\2\2\2\u00a6\u00a7\7/\2\2"+
		"\u00a7\u00a8\7/\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ab\13\2\2\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\f\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\b\t\2\2\u00b2\22\3\2\2\2\f\2\35|\u0081\u0089\u008f\u0094"+
		"\u009b\u00a1\u00ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}