// Generated from C:/AIN5/Sprachkonzepte/src/u2\CreationParser.g4 by ANTLR 4.11.1
package u2;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreationParser extends Parser {
    public static final int
            KEYWORD = 1, NAME = 2, NUM = 3, COMMA = 4, PAR_OPEN = 5, PAR_CLOSE = 6, WS = 7, InvalidChar = 8;
    public static final int
            RULE_start = 0, RULE_expr = 1, RULE_params = 2, RULE_param = 3;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\u0004\u0001\b%\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001" +
                    "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0016" +
                    "\b\u0002\u0001\u0002\u0005\u0002\u0019\b\u0002\n\u0002\f\u0002\u001c\t" +
                    "\u0002\u0003\u0002\u001e\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003" +
                    "\u0003#\b\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006" +
                    "\u0000\u0000%\u0000\b\u0001\u0000\u0000\u0000\u0002\u000b\u0001\u0000" +
                    "\u0000\u0000\u0004\u001d\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000" +
                    "\u0000\b\t\u0003\u0002\u0001\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001" +
                    "\u0001\u0000\u0000\u0000\u000b\f\u0005\u0001\u0000\u0000\f\r\u0005\u0007" +
                    "\u0000\u0000\r\u000e\u0005\u0002\u0000\u0000\u000e\u000f\u0005\u0005\u0000" +
                    "\u0000\u000f\u0010\u0003\u0004\u0002\u0000\u0010\u0011\u0005\u0006\u0000" +
                    "\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0012\u001a\u0003\u0006\u0003" +
                    "\u0000\u0013\u0015\u0005\u0004\u0000\u0000\u0014\u0016\u0005\u0007\u0000" +
                    "\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000" +
                    "\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0003\u0006\u0003" +
                    "\u0000\u0018\u0013\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000" +
                    "\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000" +
                    "\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000" +
                    "\u0000\u001d\u0012\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000" +
                    "\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u001f#\u0003\u0002\u0001\u0000" +
                    " #\u0005\u0002\u0000\u0000!#\u0005\u0003\u0000\u0000\"\u001f\u0001\u0000" +
                    "\u0000\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#\u0007" +
                    "\u0001\u0000\u0000\u0000\u0004\u0015\u001a\u001d\"";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

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

    public CreationParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "start", "expr", "params", "param"
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
        return "CreationParser.g4";
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
    public ATN getATN() {
        return _ATN;
    }

    public final StartContext start() throws RecognitionException {
        StartContext _localctx = new StartContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_start);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(8);
                expr();
                setState(9);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprContext expr() throws RecognitionException {
        ExprContext _localctx = new ExprContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_expr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(11);
                match(KEYWORD);
                setState(12);
                match(WS);
                setState(13);
                match(NAME);
                setState(14);
                match(PAR_OPEN);
                setState(15);
                params();
                setState(16);
                match(PAR_CLOSE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ParamsContext params() throws RecognitionException {
        ParamsContext _localctx = new ParamsContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_params);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(29);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << NAME) | (1L << NUM))) != 0)) {
                    {
                        setState(18);
                        param();
                        setState(26);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(19);
                                    match(COMMA);
                                    setState(21);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == WS) {
                                        {
                                            setState(20);
                                            match(WS);
                                        }
                                    }

                                    setState(23);
                                    param();
                                }
                            }
                            setState(28);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ParamContext param() throws RecognitionException {
        ParamContext _localctx = new ParamContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_param);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(34);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case KEYWORD: {
                        setState(31);
                        expr();
                    }
                    break;
                    case NAME: {
                        setState(32);
                        match(NAME);
                    }
                    break;
                    case NUM: {
                        setState(33);
                        match(NUM);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StartContext extends ParserRuleContext {
        public StartContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(CreationParser.EOF, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_start;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CreationParserListener) ((CreationParserListener) listener).enterStart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CreationParserListener) ((CreationParserListener) listener).exitStart(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CreationParserVisitor)
                return ((CreationParserVisitor<? extends T>) visitor).visitStart(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode KEYWORD() {
            return getToken(CreationParser.KEYWORD, 0);
        }

        public TerminalNode WS() {
            return getToken(CreationParser.WS, 0);
        }

        public TerminalNode NAME() {
            return getToken(CreationParser.NAME, 0);
        }

        public TerminalNode PAR_OPEN() {
            return getToken(CreationParser.PAR_OPEN, 0);
        }

        public ParamsContext params() {
            return getRuleContext(ParamsContext.class, 0);
        }

        public TerminalNode PAR_CLOSE() {
            return getToken(CreationParser.PAR_CLOSE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CreationParserListener) ((CreationParserListener) listener).enterExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CreationParserListener) ((CreationParserListener) listener).exitExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CreationParserVisitor)
                return ((CreationParserVisitor<? extends T>) visitor).visitExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParamsContext extends ParserRuleContext {
        public ParamsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ParamContext> param() {
            return getRuleContexts(ParamContext.class);
        }

        public ParamContext param(int i) {
            return getRuleContext(ParamContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(CreationParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(CreationParser.COMMA, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(CreationParser.WS);
        }

        public TerminalNode WS(int i) {
            return getToken(CreationParser.WS, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_params;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CreationParserListener) ((CreationParserListener) listener).enterParams(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CreationParserListener) ((CreationParserListener) listener).exitParams(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CreationParserVisitor)
                return ((CreationParserVisitor<? extends T>) visitor).visitParams(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParamContext extends ParserRuleContext {
        public ParamContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode NAME() {
            return getToken(CreationParser.NAME, 0);
        }

        public TerminalNode NUM() {
            return getToken(CreationParser.NUM, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_param;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CreationParserListener) ((CreationParserListener) listener).enterParam(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CreationParserListener) ((CreationParserListener) listener).exitParam(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CreationParserVisitor)
                return ((CreationParserVisitor<? extends T>) visitor).visitParam(this);
            else return visitor.visitChildren(this);
        }
    }
}