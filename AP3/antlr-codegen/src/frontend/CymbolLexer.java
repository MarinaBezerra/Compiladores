package frontend;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;



@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CymbolLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, ID=24, 
		INT=25, WS=26, SL_COMMENT=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'+'", "'*'", "'-'", "'('", "'if'", "'int'", "'<'", "'return'", 
		"'='", "';'", "'<='", "'void'", "'{'", "'>'", "'then'", "'else'", "'/'", 
		"'=='", "'}'", "'>='", "'!'", "ID", "INT", "WS", "SL_COMMENT"
	};
	
	public static final String[] ruleNames = {
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ID", "LETTER", "INT", 
		"WS", "SL_COMMENT"
	};


	public CymbolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cymbol.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26: WS_action((RuleContext)_localctx, actionIndex); break;

		case 27: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\35\u00a0\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\7\31\u0081\n\31\f\31\16\31\u0084\13"+
		"\31\3\32\3\32\3\33\6\33\u0089\n\33\r\33\16\33\u008a\3\34\6\34\u008e\n"+
		"\34\r\34\16\34\u008f\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u0098\n\35\f\35"+
		"\16\35\u009b\13\35\3\35\3\35\3\35\3\35\3\u0099\36\3\3\1\5\4\1\7\5\1\t"+
		"\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1"+
		"\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32"+
		"\1\63\2\1\65\33\1\67\34\29\35\3\3\2\6\3\62;\4C\\c|\3\62;\5\13\f\17\17"+
		"\"\"\u00a3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2"+
		"\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2"+
		"\21J\3\2\2\2\23N\3\2\2\2\25P\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2"+
		"\2\35^\3\2\2\2\37c\3\2\2\2!e\3\2\2\2#g\3\2\2\2%l\3\2\2\2\'q\3\2\2\2)s"+
		"\3\2\2\2+v\3\2\2\2-x\3\2\2\2/{\3\2\2\2\61}\3\2\2\2\63\u0085\3\2\2\2\65"+
		"\u0088\3\2\2\2\67\u008d\3\2\2\29\u0093\3\2\2\2;<\7+\2\2<\4\3\2\2\2=>\7"+
		".\2\2>\6\3\2\2\2?@\7-\2\2@\b\3\2\2\2AB\7,\2\2B\n\3\2\2\2CD\7/\2\2D\f\3"+
		"\2\2\2EF\7*\2\2F\16\3\2\2\2GH\7k\2\2HI\7h\2\2I\20\3\2\2\2JK\7k\2\2KL\7"+
		"p\2\2LM\7v\2\2M\22\3\2\2\2NO\7>\2\2O\24\3\2\2\2PQ\7t\2\2QR\7g\2\2RS\7"+
		"v\2\2ST\7w\2\2TU\7t\2\2UV\7p\2\2V\26\3\2\2\2WX\7?\2\2X\30\3\2\2\2YZ\7"+
		"=\2\2Z\32\3\2\2\2[\\\7>\2\2\\]\7?\2\2]\34\3\2\2\2^_\7x\2\2_`\7q\2\2`a"+
		"\7k\2\2ab\7f\2\2b\36\3\2\2\2cd\7}\2\2d \3\2\2\2ef\7@\2\2f\"\3\2\2\2gh"+
		"\7v\2\2hi\7j\2\2ij\7g\2\2jk\7p\2\2k$\3\2\2\2lm\7g\2\2mn\7n\2\2no\7u\2"+
		"\2op\7g\2\2p&\3\2\2\2qr\7\61\2\2r(\3\2\2\2st\7?\2\2tu\7?\2\2u*\3\2\2\2"+
		"vw\7\177\2\2w,\3\2\2\2xy\7@\2\2yz\7?\2\2z.\3\2\2\2{|\7#\2\2|\60\3\2\2"+
		"\2}\u0082\5\63\32\2~\u0081\5\63\32\2\177\u0081\t\2\2\2\u0080~\3\2\2\2"+
		"\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\62\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\t\3\2\2\u0086"+
		"\64\3\2\2\2\u0087\u0089\t\4\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2"+
		"\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\66\3\2\2\2\u008c\u008e"+
		"\t\5\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\34\2\2\u00928\3\2\2\2"+
		"\u0093\u0094\7\61\2\2\u0094\u0095\7\61\2\2\u0095\u0099\3\2\2\2\u0096\u0098"+
		"\13\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d"+
		"\7\f\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\35\3\2\u009f:\3\2\2\2\b\2\u0080"+
		"\u0082\u008a\u008f\u0099";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}