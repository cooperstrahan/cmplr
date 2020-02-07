// Generated from microGrammar.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, WS=15, IDENTIFIER=16, 
		INTLITERAL=17, FLOATLITERAL=18, STRINGLITERAL=19, COMMENT=20, PROGRAM=21, 
		BEGIN=22, END=23, FUNCTION=24, READ=25, WRITE=26, IF=27, ELSE=28, ENDIF=29, 
		WHILE=30, ENDWHILE=31, CONTINUE=32, BREAK=33, RETURN=34, INT=35, VOID=36, 
		STRING=37, FLOAT=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "WS", "IDENTIFIER", "INTLITERAL", 
		"FLOATLITERAL", "STRINGLITERAL", "COMMENT", "PROGRAM", "BEGIN", "END", 
		"FUNCTION", "READ", "WRITE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", 
		"CONTINUE", "BREAK", "RETURN", "INT", "VOID", "STRING", "FLOAT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':='", "','", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'<'", 
		"'>'", "'='", "'!='", "'<='", "'>='", null, null, null, null, null, null, 
		"'PROGRAM'", "'BEGIN'", "'END'", "'FUNCTION'", "'READ'", "'WRITE'", "'IF'", 
		"'ELSE'", "'ENDIF'", "'WHILE'", "'ENDWHILE'", "'CONTINUE'", "'BREAK'", 
		"'RETURN'", "'INT'", "'VOID'", "'STRING'", "'FLOAT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "WS", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", 
		"COMMENT", "PROGRAM", "BEGIN", "END", "FUNCTION", "READ", "WRITE", "IF", 
		"ELSE", "ENDIF", "WHILE", "ENDWHILE", "CONTINUE", "BREAK", "RETURN", "INT", 
		"VOID", "STRING", "FLOAT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0111\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\6\20q\n\20\r\20\16\20r\3"+
		"\20\3\20\3\21\3\21\7\21y\n\21\f\21\16\21|\13\21\3\22\6\22\177\n\22\r\22"+
		"\16\22\u0080\3\23\7\23\u0084\n\23\f\23\16\23\u0087\13\23\3\23\3\23\6\23"+
		"\u008b\n\23\r\23\16\23\u008c\3\24\3\24\7\24\u0091\n\24\f\24\16\24\u0094"+
		"\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u009c\n\25\f\25\16\25\u009f"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\4\u0092\u009d"+
		"\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(\3\2\6\4\2\13\f\17\17\4\2C\\c|\5\2\62;C\\c|\3"+
		"\2\62;\2\u0117\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5R\3\2\2"+
		"\2\7T\3\2\2\2\tV\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21^\3\2\2"+
		"\2\23`\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33i\3\2\2\2\35l\3\2"+
		"\2\2\37p\3\2\2\2!v\3\2\2\2#~\3\2\2\2%\u0085\3\2\2\2\'\u008e\3\2\2\2)\u0097"+
		"\3\2\2\2+\u00a2\3\2\2\2-\u00aa\3\2\2\2/\u00b0\3\2\2\2\61\u00b4\3\2\2\2"+
		"\63\u00bd\3\2\2\2\65\u00c2\3\2\2\2\67\u00c8\3\2\2\29\u00cb\3\2\2\2;\u00d0"+
		"\3\2\2\2=\u00d6\3\2\2\2?\u00dc\3\2\2\2A\u00e5\3\2\2\2C\u00ee\3\2\2\2E"+
		"\u00f4\3\2\2\2G\u00fb\3\2\2\2I\u00ff\3\2\2\2K\u0104\3\2\2\2M\u010b\3\2"+
		"\2\2OP\7<\2\2PQ\7?\2\2Q\4\3\2\2\2RS\7.\2\2S\6\3\2\2\2TU\7*\2\2U\b\3\2"+
		"\2\2VW\7+\2\2W\n\3\2\2\2XY\7-\2\2Y\f\3\2\2\2Z[\7/\2\2[\16\3\2\2\2\\]\7"+
		",\2\2]\20\3\2\2\2^_\7\61\2\2_\22\3\2\2\2`a\7>\2\2a\24\3\2\2\2bc\7@\2\2"+
		"c\26\3\2\2\2de\7?\2\2e\30\3\2\2\2fg\7#\2\2gh\7?\2\2h\32\3\2\2\2ij\7>\2"+
		"\2jk\7?\2\2k\34\3\2\2\2lm\7@\2\2mn\7?\2\2n\36\3\2\2\2oq\t\2\2\2po\3\2"+
		"\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\20\2\2u \3\2\2\2vz\t"+
		"\3\2\2wy\t\4\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\"\3\2\2\2|z"+
		"\3\2\2\2}\177\t\5\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081$\3\2\2\2\u0082\u0084\t\5\2\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7\60\2\2\u0089\u008b\t\5\2\2"+
		"\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d&\3\2\2\2\u008e\u0092\7$\2\2\u008f\u0091\13\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0093\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7$\2\2\u0096"+
		"(\3\2\2\2\u0097\u0098\7/\2\2\u0098\u0099\7/\2\2\u0099\u009d\3\2\2\2\u009a"+
		"\u009c\13\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009e\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a1\7\f\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7R\2\2\u00a3\u00a4\7T\2\2\u00a4"+
		"\u00a5\7Q\2\2\u00a5\u00a6\7I\2\2\u00a6\u00a7\7T\2\2\u00a7\u00a8\7C\2\2"+
		"\u00a8\u00a9\7O\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7D\2\2\u00ab\u00ac\7G\2"+
		"\2\u00ac\u00ad\7I\2\2\u00ad\u00ae\7K\2\2\u00ae\u00af\7P\2\2\u00af.\3\2"+
		"\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2\7P\2\2\u00b2\u00b3\7F\2\2\u00b3\60"+
		"\3\2\2\2\u00b4\u00b5\7H\2\2\u00b5\u00b6\7W\2\2\u00b6\u00b7\7P\2\2\u00b7"+
		"\u00b8\7E\2\2\u00b8\u00b9\7V\2\2\u00b9\u00ba\7K\2\2\u00ba\u00bb\7Q\2\2"+
		"\u00bb\u00bc\7P\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7T\2\2\u00be\u00bf\7"+
		"G\2\2\u00bf\u00c0\7C\2\2\u00c0\u00c1\7F\2\2\u00c1\64\3\2\2\2\u00c2\u00c3"+
		"\7Y\2\2\u00c3\u00c4\7T\2\2\u00c4\u00c5\7K\2\2\u00c5\u00c6\7V\2\2\u00c6"+
		"\u00c7\7G\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7K\2\2\u00c9\u00ca\7H\2\2\u00ca"+
		"8\3\2\2\2\u00cb\u00cc\7G\2\2\u00cc\u00cd\7N\2\2\u00cd\u00ce\7U\2\2\u00ce"+
		"\u00cf\7G\2\2\u00cf:\3\2\2\2\u00d0\u00d1\7G\2\2\u00d1\u00d2\7P\2\2\u00d2"+
		"\u00d3\7F\2\2\u00d3\u00d4\7K\2\2\u00d4\u00d5\7H\2\2\u00d5<\3\2\2\2\u00d6"+
		"\u00d7\7Y\2\2\u00d7\u00d8\7J\2\2\u00d8\u00d9\7K\2\2\u00d9\u00da\7N\2\2"+
		"\u00da\u00db\7G\2\2\u00db>\3\2\2\2\u00dc\u00dd\7G\2\2\u00dd\u00de\7P\2"+
		"\2\u00de\u00df\7F\2\2\u00df\u00e0\7Y\2\2\u00e0\u00e1\7J\2\2\u00e1\u00e2"+
		"\7K\2\2\u00e2\u00e3\7N\2\2\u00e3\u00e4\7G\2\2\u00e4@\3\2\2\2\u00e5\u00e6"+
		"\7E\2\2\u00e6\u00e7\7Q\2\2\u00e7\u00e8\7P\2\2\u00e8\u00e9\7V\2\2\u00e9"+
		"\u00ea\7K\2\2\u00ea\u00eb\7P\2\2\u00eb\u00ec\7W\2\2\u00ec\u00ed\7G\2\2"+
		"\u00edB\3\2\2\2\u00ee\u00ef\7D\2\2\u00ef\u00f0\7T\2\2\u00f0\u00f1\7G\2"+
		"\2\u00f1\u00f2\7C\2\2\u00f2\u00f3\7M\2\2\u00f3D\3\2\2\2\u00f4\u00f5\7"+
		"T\2\2\u00f5\u00f6\7G\2\2\u00f6\u00f7\7V\2\2\u00f7\u00f8\7W\2\2\u00f8\u00f9"+
		"\7T\2\2\u00f9\u00fa\7P\2\2\u00faF\3\2\2\2\u00fb\u00fc\7K\2\2\u00fc\u00fd"+
		"\7P\2\2\u00fd\u00fe\7V\2\2\u00feH\3\2\2\2\u00ff\u0100\7X\2\2\u0100\u0101"+
		"\7Q\2\2\u0101\u0102\7K\2\2\u0102\u0103\7F\2\2\u0103J\3\2\2\2\u0104\u0105"+
		"\7U\2\2\u0105\u0106\7V\2\2\u0106\u0107\7T\2\2\u0107\u0108\7K\2\2\u0108"+
		"\u0109\7P\2\2\u0109\u010a\7I\2\2\u010aL\3\2\2\2\u010b\u010c\7H\2\2\u010c"+
		"\u010d\7N\2\2\u010d\u010e\7Q\2\2\u010e\u010f\7C\2\2\u010f\u0110\7V\2\2"+
		"\u0110N\3\2\2\2\n\2rz\u0080\u0085\u008c\u0092\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}