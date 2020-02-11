// Generated from microGrammar.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SET=1, ADD=2, SUB=3, MUL=4, DIV=5, EQ=6, NEQ=7, LT=8, GT=9, LP=10, RP=11, 
		SC=12, CM=13, LTQ=14, GTQ=15, WS=16, IDENTIFIER=17, INTLITERAL=18, FLOATLITERAL=19, 
		STRINGLITERAL=20, COMMENT=21, PROGRAM=22, BEGIN=23, END=24, FUNCTION=25, 
		READ=26, WRITE=27, IF=28, ELSE=29, ENDIF=30, WHILE=31, ENDWHILE=32, CONTINUE=33, 
		BREAK=34, RETURN=35, INT=36, VOID=37, STRING=38, FLOAT=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SET", "ADD", "SUB", "MUL", "DIV", "EQ", "NEQ", "LT", "GT", "LP", "RP", 
		"SC", "CM", "LTQ", "GTQ", "WS", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
		"STRINGLITERAL", "COMMENT", "PROGRAM", "BEGIN", "END", "FUNCTION", "READ", 
		"WRITE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "CONTINUE", "BREAK", 
		"RETURN", "INT", "VOID", "STRING", "FLOAT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':='", "'+'", "'-'", "'*'", "'/'", "'='", "'!='", "'<'", "'>'", 
		"'('", "')'", "';'", "','", "'<='", "'>='", null, null, null, null, null, 
		null, "'PROGRAM'", "'BEGIN'", "'END'", "'FUNCTION'", "'READ'", "'WRITE'", 
		"'IF'", "'ELSE'", "'ENDIF'", "'WHILE'", "'ENDWHILE'", "'CONTINUE'", "'BREAK'", 
		"'RETURN'", "'INT'", "'VOID'", "'STRING'", "'FLOAT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SET", "ADD", "SUB", "MUL", "DIV", "EQ", "NEQ", "LT", "GT", "LP", 
		"RP", "SC", "CM", "LTQ", "GTQ", "WS", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
		"STRINGLITERAL", "COMMENT", "PROGRAM", "BEGIN", "END", "FUNCTION", "READ", 
		"WRITE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "CONTINUE", "BREAK", 
		"RETURN", "INT", "VOID", "STRING", "FLOAT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0115\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\6\21u\n"+
		"\21\r\21\16\21v\3\21\3\21\3\22\3\22\7\22}\n\22\f\22\16\22\u0080\13\22"+
		"\3\23\6\23\u0083\n\23\r\23\16\23\u0084\3\24\7\24\u0088\n\24\f\24\16\24"+
		"\u008b\13\24\3\24\3\24\6\24\u008f\n\24\r\24\16\24\u0090\3\25\3\25\7\25"+
		"\u0095\n\25\f\25\16\25\u0098\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26"+
		"\u00a0\n\26\f\26\16\26\u00a3\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\4\u0096\u00a1\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\6\5\2\13\f\17\17"+
		"\"\"\4\2C\\c|\5\2\62;C\\c|\3\2\62;\2\u011b\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5T\3\2\2\2\7V\3\2\2\2\tX\3\2\2\2\13Z\3"+
		"\2\2\2\r\\\3\2\2\2\17^\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27"+
		"g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37p\3\2\2\2!t\3\2\2\2#z"+
		"\3\2\2\2%\u0082\3\2\2\2\'\u0089\3\2\2\2)\u0092\3\2\2\2+\u009b\3\2\2\2"+
		"-\u00a6\3\2\2\2/\u00ae\3\2\2\2\61\u00b4\3\2\2\2\63\u00b8\3\2\2\2\65\u00c1"+
		"\3\2\2\2\67\u00c6\3\2\2\29\u00cc\3\2\2\2;\u00cf\3\2\2\2=\u00d4\3\2\2\2"+
		"?\u00da\3\2\2\2A\u00e0\3\2\2\2C\u00e9\3\2\2\2E\u00f2\3\2\2\2G\u00f8\3"+
		"\2\2\2I\u00ff\3\2\2\2K\u0103\3\2\2\2M\u0108\3\2\2\2O\u010f\3\2\2\2QR\7"+
		"<\2\2RS\7?\2\2S\4\3\2\2\2TU\7-\2\2U\6\3\2\2\2VW\7/\2\2W\b\3\2\2\2XY\7"+
		",\2\2Y\n\3\2\2\2Z[\7\61\2\2[\f\3\2\2\2\\]\7?\2\2]\16\3\2\2\2^_\7#\2\2"+
		"_`\7?\2\2`\20\3\2\2\2ab\7>\2\2b\22\3\2\2\2cd\7@\2\2d\24\3\2\2\2ef\7*\2"+
		"\2f\26\3\2\2\2gh\7+\2\2h\30\3\2\2\2ij\7=\2\2j\32\3\2\2\2kl\7.\2\2l\34"+
		"\3\2\2\2mn\7>\2\2no\7?\2\2o\36\3\2\2\2pq\7@\2\2qr\7?\2\2r \3\2\2\2su\t"+
		"\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\21\2\2y\""+
		"\3\2\2\2z~\t\3\2\2{}\t\4\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177$\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\t\5\2\2\u0082\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"&\3\2\2\2\u0086\u0088\t\5\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008e\7\60\2\2\u008d\u008f\t\5\2\2\u008e\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091(\3"+
		"\2\2\2\u0092\u0096\7$\2\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7$\2\2\u009a*\3\2\2\2\u009b\u009c"+
		"\7/\2\2\u009c\u009d\7/\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\13\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\f\2\2\u00a5"+
		",\3\2\2\2\u00a6\u00a7\7R\2\2\u00a7\u00a8\7T\2\2\u00a8\u00a9\7Q\2\2\u00a9"+
		"\u00aa\7I\2\2\u00aa\u00ab\7T\2\2\u00ab\u00ac\7C\2\2\u00ac\u00ad\7O\2\2"+
		"\u00ad.\3\2\2\2\u00ae\u00af\7D\2\2\u00af\u00b0\7G\2\2\u00b0\u00b1\7I\2"+
		"\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7P\2\2\u00b3\60\3\2\2\2\u00b4\u00b5"+
		"\7G\2\2\u00b5\u00b6\7P\2\2\u00b6\u00b7\7F\2\2\u00b7\62\3\2\2\2\u00b8\u00b9"+
		"\7H\2\2\u00b9\u00ba\7W\2\2\u00ba\u00bb\7P\2\2\u00bb\u00bc\7E\2\2\u00bc"+
		"\u00bd\7V\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7Q\2\2\u00bf\u00c0\7P\2\2"+
		"\u00c0\64\3\2\2\2\u00c1\u00c2\7T\2\2\u00c2\u00c3\7G\2\2\u00c3\u00c4\7"+
		"C\2\2\u00c4\u00c5\7F\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7Y\2\2\u00c7\u00c8"+
		"\7T\2\2\u00c8\u00c9\7K\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cb\7G\2\2\u00cb"+
		"8\3\2\2\2\u00cc\u00cd\7K\2\2\u00cd\u00ce\7H\2\2\u00ce:\3\2\2\2\u00cf\u00d0"+
		"\7G\2\2\u00d0\u00d1\7N\2\2\u00d1\u00d2\7U\2\2\u00d2\u00d3\7G\2\2\u00d3"+
		"<\3\2\2\2\u00d4\u00d5\7G\2\2\u00d5\u00d6\7P\2\2\u00d6\u00d7\7F\2\2\u00d7"+
		"\u00d8\7K\2\2\u00d8\u00d9\7H\2\2\u00d9>\3\2\2\2\u00da\u00db\7Y\2\2\u00db"+
		"\u00dc\7J\2\2\u00dc\u00dd\7K\2\2\u00dd\u00de\7N\2\2\u00de\u00df\7G\2\2"+
		"\u00df@\3\2\2\2\u00e0\u00e1\7G\2\2\u00e1\u00e2\7P\2\2\u00e2\u00e3\7F\2"+
		"\2\u00e3\u00e4\7Y\2\2\u00e4\u00e5\7J\2\2\u00e5\u00e6\7K\2\2\u00e6\u00e7"+
		"\7N\2\2\u00e7\u00e8\7G\2\2\u00e8B\3\2\2\2\u00e9\u00ea\7E\2\2\u00ea\u00eb"+
		"\7Q\2\2\u00eb\u00ec\7P\2\2\u00ec\u00ed\7V\2\2\u00ed\u00ee\7K\2\2\u00ee"+
		"\u00ef\7P\2\2\u00ef\u00f0\7W\2\2\u00f0\u00f1\7G\2\2\u00f1D\3\2\2\2\u00f2"+
		"\u00f3\7D\2\2\u00f3\u00f4\7T\2\2\u00f4\u00f5\7G\2\2\u00f5\u00f6\7C\2\2"+
		"\u00f6\u00f7\7M\2\2\u00f7F\3\2\2\2\u00f8\u00f9\7T\2\2\u00f9\u00fa\7G\2"+
		"\2\u00fa\u00fb\7V\2\2\u00fb\u00fc\7W\2\2\u00fc\u00fd\7T\2\2\u00fd\u00fe"+
		"\7P\2\2\u00feH\3\2\2\2\u00ff\u0100\7K\2\2\u0100\u0101\7P\2\2\u0101\u0102"+
		"\7V\2\2\u0102J\3\2\2\2\u0103\u0104\7X\2\2\u0104\u0105\7Q\2\2\u0105\u0106"+
		"\7K\2\2\u0106\u0107\7F\2\2\u0107L\3\2\2\2\u0108\u0109\7U\2\2\u0109\u010a"+
		"\7V\2\2\u010a\u010b\7T\2\2\u010b\u010c\7K\2\2\u010c\u010d\7P\2\2\u010d"+
		"\u010e\7I\2\2\u010eN\3\2\2\2\u010f\u0110\7H\2\2\u0110\u0111\7N\2\2\u0111"+
		"\u0112\7Q\2\2\u0112\u0113\7C\2\2\u0113\u0114\7V\2\2\u0114P\3\2\2\2\n\2"+
		"v~\u0084\u0089\u0090\u0096\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}