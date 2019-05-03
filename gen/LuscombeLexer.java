// Generated from /Users/bromlu/Documents/Projects/Luscombe/Luscombe.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuscombeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, WS=14, WORD=15, NUMBER=16, OPERATOR=17, 
		COMPAREOP=18, PRINT=19, COMMENT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "WS", "WORD", "NUMBER", "OPERATOR", 
			"COMPAREOP", "PRINT", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INVENTORY'", "'{'", "'}'", "'ADD'", "'DROP'", "'GOTO'", "'IF'", 
			"'ELSE IF'", "'ELSE'", "'INTRO'", "'ACTIONS'", "','", "'OBJECTS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WS", "WORD", "NUMBER", "OPERATOR", "COMPAREOP", "PRINT", 
			"COMMENT"
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


	public LuscombeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Luscombe.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17q\n\17\r\17\16\17"+
		"r\3\17\3\17\3\20\3\20\7\20y\n\20\f\20\16\20|\13\20\3\21\6\21\177\n\21"+
		"\r\21\16\21\u0080\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u008c"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0095\n\24\f\24\16\24\u0098"+
		"\13\24\3\24\3\24\7\24\u009c\n\24\f\24\16\24\u009f\13\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\7\25\u00a7\n\25\f\25\16\25\u00aa\13\25\3\25\3\25\3\25"+
		"\3\25\4\u009d\u00a8\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\t\5\2\13\f\17\17"+
		"\"\"\4\2C\\c|\5\2\62;C\\c|\3\2\62;\7\2\'\',-//\61\61??\4\2>>@@\4\2\f\f"+
		"\17\17\2\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\65\3"+
		"\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13=\3\2\2\2\rB\3\2\2\2\17G\3\2\2\2\21J"+
		"\3\2\2\2\23R\3\2\2\2\25W\3\2\2\2\27]\3\2\2\2\31e\3\2\2\2\33g\3\2\2\2\35"+
		"p\3\2\2\2\37v\3\2\2\2!~\3\2\2\2#\u0082\3\2\2\2%\u008b\3\2\2\2\'\u008d"+
		"\3\2\2\2)\u00a2\3\2\2\2+,\7K\2\2,-\7P\2\2-.\7X\2\2./\7G\2\2/\60\7P\2\2"+
		"\60\61\7V\2\2\61\62\7Q\2\2\62\63\7T\2\2\63\64\7[\2\2\64\4\3\2\2\2\65\66"+
		"\7}\2\2\66\6\3\2\2\2\678\7\177\2\28\b\3\2\2\29:\7C\2\2:;\7F\2\2;<\7F\2"+
		"\2<\n\3\2\2\2=>\7F\2\2>?\7T\2\2?@\7Q\2\2@A\7R\2\2A\f\3\2\2\2BC\7I\2\2"+
		"CD\7Q\2\2DE\7V\2\2EF\7Q\2\2F\16\3\2\2\2GH\7K\2\2HI\7H\2\2I\20\3\2\2\2"+
		"JK\7G\2\2KL\7N\2\2LM\7U\2\2MN\7G\2\2NO\7\"\2\2OP\7K\2\2PQ\7H\2\2Q\22\3"+
		"\2\2\2RS\7G\2\2ST\7N\2\2TU\7U\2\2UV\7G\2\2V\24\3\2\2\2WX\7K\2\2XY\7P\2"+
		"\2YZ\7V\2\2Z[\7T\2\2[\\\7Q\2\2\\\26\3\2\2\2]^\7C\2\2^_\7E\2\2_`\7V\2\2"+
		"`a\7K\2\2ab\7Q\2\2bc\7P\2\2cd\7U\2\2d\30\3\2\2\2ef\7.\2\2f\32\3\2\2\2"+
		"gh\7Q\2\2hi\7D\2\2ij\7L\2\2jk\7G\2\2kl\7E\2\2lm\7V\2\2mn\7U\2\2n\34\3"+
		"\2\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b"+
		"\17\2\2u\36\3\2\2\2vz\t\3\2\2wy\t\4\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{ \3\2\2\2|z\3\2\2\2}\177\t\5\2\2~}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\"\3\2\2\2\u0082\u0083\t\6"+
		"\2\2\u0083$\3\2\2\2\u0084\u0085\7?\2\2\u0085\u008c\7?\2\2\u0086\u008c"+
		"\t\7\2\2\u0087\u0088\7@\2\2\u0088\u008c\7?\2\2\u0089\u008a\7>\2\2\u008a"+
		"\u008c\7?\2\2\u008b\u0084\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008c&\3\2\2\2\u008d\u008e\7R\2\2\u008e\u008f"+
		"\7T\2\2\u008f\u0090\7K\2\2\u0090\u0091\7P\2\2\u0091\u0092\7V\2\2\u0092"+
		"\u0096\3\2\2\2\u0093\u0095\7\"\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009d\7}\2\2\u009a\u009c\13\2\2\2\u009b\u009a\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\177\2\2\u00a1(\3\2\2"+
		"\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\7\61\2\2\u00a4\u00a8\3\2\2\2\u00a5"+
		"\u00a7\13\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a9\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ac\t\b\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\25\2\2\u00ae*\3\2\2\2"+
		"\n\2rz\u0080\u008b\u0096\u009d\u00a8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}