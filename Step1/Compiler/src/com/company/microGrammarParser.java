// Generated from microGrammar.g4 by ANTLR 4.7.1
package com.company;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class microGrammarParser extends Parser {
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
	public static final int
		RULE_empty = 0;
	public static final String[] ruleNames = {
		"empty"
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

	@Override
	public String getGrammarFileName() { return "microGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public microGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof microGrammarListener ) ((microGrammarListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof microGrammarListener ) ((microGrammarListener)listener).exitEmpty(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\7\4\2\t\2\3\2\3"+
		"\2\3\2\2\2\3\2\2\2\2\5\2\4\3\2\2\2\4\5\3\2\2\2\5\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}