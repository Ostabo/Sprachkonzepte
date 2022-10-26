// Generated from C:/AIN5/Sprachkonzepte/src/u2\CreationLexer.g4 by ANTLR 4.10.1
package u2;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreationLexer extends Lexer {
	public static final int
			KEYWORD = 1, NAME = 2, NUM = 3, COMMA = 4, PAR_OPEN = 5, PAR_CLOSE = 6, WS = 7, InvalidChar = 8;
	public static final String[] ruleNames = makeRuleNames();
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\u0004\u0000\b,\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
					"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
					"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
					"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001" +
					"\u0004\u0001\u0017\b\u0001\u000b\u0001\f\u0001\u0018\u0001\u0002\u0004" +
					"\u0002\u001c\b\u0002\u000b\u0002\f\u0002\u001d\u0001\u0003\u0001\u0003" +
					"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006" +
					"\'\b\u0006\u000b\u0006\f\u0006(\u0001\u0007\u0001\u0007\u0000\u0000\b" +
					"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r" +
					"\u0007\u000f\b\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000" +
					"\t\n\r\r  .\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000" +
					"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000" +
					"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000" +
					"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000" +
					"\u0001\u0011\u0001\u0000\u0000\u0000\u0003\u0016\u0001\u0000\u0000\u0000" +
					"\u0005\u001b\u0001\u0000\u0000\u0000\u0007\u001f\u0001\u0000\u0000\u0000" +
					"\t!\u0001\u0000\u0000\u0000\u000b#\u0001\u0000\u0000\u0000\r&\u0001\u0000" +
					"\u0000\u0000\u000f*\u0001\u0000\u0000\u0000\u0011\u0012\u0005n\u0000\u0000" +
					"\u0012\u0013\u0005e\u0000\u0000\u0013\u0014\u0005w\u0000\u0000\u0014\u0002" +
					"\u0001\u0000\u0000\u0000\u0015\u0017\u0007\u0000\u0000\u0000\u0016\u0015" +
					"\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0016" +
					"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0004" +
					"\u0001\u0000\u0000\u0000\u001a\u001c\u0007\u0001\u0000\u0000\u001b\u001a" +
					"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b" +
					"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0006" +
					"\u0001\u0000\u0000\u0000\u001f \u0005,\u0000\u0000 \b\u0001\u0000\u0000" +
					"\u0000!\"\u0005(\u0000\u0000\"\n\u0001\u0000\u0000\u0000#$\u0005)\u0000" +
					"\u0000$\f\u0001\u0000\u0000\u0000%\'\u0007\u0002\u0000\u0000&%\u0001\u0000" +
					"\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001" +
					"\u0000\u0000\u0000)\u000e\u0001\u0000\u0000\u0000*+\t\u0000\u0000\u0000" +
					"+\u0010\u0001\u0000\u0000\u0000\u0004\u0000\u0018\u001d(\u0000";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
	public static String[] channelNames = {
			"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};
	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	static {
		RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);
	}

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

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public CreationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	private static String[] makeRuleNames() {
		return new String[]{
				"KEYWORD", "NAME", "NUM", "COMMA", "PAR_OPEN", "PAR_CLOSE", "WS", "InvalidChar"
		};
	}

	private static String[] makeLiteralNames() {
		return new String[]{
				null, "'new'", null, null, "','", "'('", "')'"
		};
	}

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, "KEYWORD", "NAME", "NUM", "COMMA", "PAR_OPEN", "PAR_CLOSE", "WS",
				"InvalidChar"
		};
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
	public String getGrammarFileName() {
		return "CreationLexer.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getChannelNames() {
		return channelNames;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}
}