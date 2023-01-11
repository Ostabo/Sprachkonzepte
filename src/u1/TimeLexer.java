// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TimeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Time12H=1, AM=2, PM=3, WS=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Time12H", "Default", "Noon", "Midnight", "AM", "PM", "WS"
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
			null, "Time12H", "AM", "PM", "WS"
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


	public TimeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TimeLexer.g4"; }

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
		"\u0004\u0000\u0004e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001d\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\'\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00024\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004S\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005]\b\u0005\u0001"+
		"\u0006\u0004\u0006`\b\u0006\u000b\u0006\f\u0006a\u0001\u0006\u0001\u0006"+
		"\u0000\u0000\u0007\u0001\u0001\u0003\u0000\u0005\u0000\u0007\u0000\t\u0002"+
		"\u000b\u0003\r\u0004\u0001\u0000\u0005\u0001\u000019\u0001\u000001\u0001"+
		"\u000005\u0001\u000009\u0003\u0000\t\n\r\r  m\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u0012\u0001\u0000\u0000\u0000"+
		"\u0003!\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u0007H"+
		"\u0001\u0000\u0000\u0000\tR\u0001\u0000\u0000\u0000\u000b\\\u0001\u0000"+
		"\u0000\u0000\r_\u0001\u0000\u0000\u0000\u000f\u0013\u0003\u0003\u0001"+
		"\u0000\u0010\u0013\u0003\u0005\u0002\u0000\u0011\u0013\u0003\u0007\u0003"+
		"\u0000\u0012\u000f\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000"+
		"\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013\u0002\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u00051\u0000\u0000\u0015\u0016\u00052\u0000\u0000\u0016"+
		"\u0017\u0005:\u0000\u0000\u0017\u0018\u00050\u0000\u0000\u0018\"\u0005"+
		"0\u0000\u0000\u0019\u001d\u0007\u0000\u0000\u0000\u001a\u001b\u00051\u0000"+
		"\u0000\u001b\u001d\u0007\u0001\u0000\u0000\u001c\u0019\u0001\u0000\u0000"+
		"\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005:\u0000\u0000\u001f \u0007\u0002\u0000\u0000 "+
		"\"\u0007\u0003\u0000\u0000!\u0014\u0001\u0000\u0000\u0000!\u001c\u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#&\u0003\r\u0006\u0000$\'"+
		"\u0003\t\u0004\u0000%\'\u0003\u000b\u0005\u0000&$\u0001\u0000\u0000\u0000"+
		"&%\u0001\u0000\u0000\u0000\'\u0004\u0001\u0000\u0000\u0000()\u0005N\u0000"+
		"\u0000)*\u0005o\u0000\u0000*+\u0005o\u0000\u0000+4\u0005n\u0000\u0000"+
		",-\u00051\u0000\u0000-.\u00052\u0000\u0000./\u0005 \u0000\u0000/0\u0005"+
		"n\u0000\u000001\u0005o\u0000\u000012\u0005o\u0000\u000024\u0005n\u0000"+
		"\u00003(\u0001\u0000\u0000\u00003,\u0001\u0000\u0000\u00004\u0006\u0001"+
		"\u0000\u0000\u000056\u0005M\u0000\u000067\u0005i\u0000\u000078\u0005d"+
		"\u0000\u000089\u0005n\u0000\u00009:\u0005i\u0000\u0000:;\u0005g\u0000"+
		"\u0000;<\u0005h\u0000\u0000<I\u0005t\u0000\u0000=>\u00051\u0000\u0000"+
		">?\u00052\u0000\u0000?@\u0005 \u0000\u0000@A\u0005m\u0000\u0000AB\u0005"+
		"i\u0000\u0000BC\u0005d\u0000\u0000CD\u0005n\u0000\u0000DE\u0005i\u0000"+
		"\u0000EF\u0005g\u0000\u0000FG\u0005h\u0000\u0000GI\u0005t\u0000\u0000"+
		"H5\u0001\u0000\u0000\u0000H=\u0001\u0000\u0000\u0000I\b\u0001\u0000\u0000"+
		"\u0000JK\u0005a\u0000\u0000KL\u0005.\u0000\u0000LM\u0005m\u0000\u0000"+
		"MS\u0005.\u0000\u0000NO\u0005A\u0000\u0000OS\u0005M\u0000\u0000PQ\u0005"+
		"a\u0000\u0000QS\u0005m\u0000\u0000RJ\u0001\u0000\u0000\u0000RN\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000S\n\u0001\u0000\u0000\u0000TU\u0005"+
		"p\u0000\u0000UV\u0005.\u0000\u0000VW\u0005m\u0000\u0000W]\u0005.\u0000"+
		"\u0000XY\u0005P\u0000\u0000Y]\u0005M\u0000\u0000Z[\u0005p\u0000\u0000"+
		"[]\u0005m\u0000\u0000\\T\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]\f\u0001\u0000\u0000\u0000^`\u0007\u0004"+
		"\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"cd\u0006\u0006\u0000\u0000d\u000e\u0001\u0000\u0000\u0000\n\u0000\u0012"+
		"\u001c!&3HR\\a\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}