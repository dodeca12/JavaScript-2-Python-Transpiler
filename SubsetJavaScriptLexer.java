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
public class SubsetJavaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, FUNCTION=17, 
		RETURN=18, WHILE=19, FOR=20, VAR=21, CONST=22, LET=23, IF=24, ELSE=25, 
		LESS_THAN=26, LESS_THAN_EQUAL=27, GREATER_THAN=28, GREATER_THAN_EQUAL=29, 
		EQUALS=30, NOT_EQUALS=31, CONSOLE=32, LOG=33, BREAK=34, ADD_OP=35, SUB_OP=36, 
		MUL_OP=37, DIV_OP=38, UNARY_INCREMENT=39, UNARY_DECREMENT=40, VARIABLE=41, 
		NUMBER=42, WHITESPACE=43, NEWLINE=44, TEXT=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "LOWERCASE", 
			"UPPERCASE", "DIGIT", "FUNCTION", "RETURN", "WHILE", "FOR", "VAR", "CONST", 
			"LET", "IF", "ELSE", "LESS_THAN", "LESS_THAN_EQUAL", "GREATER_THAN", 
			"GREATER_THAN_EQUAL", "EQUALS", "NOT_EQUALS", "CONSOLE", "LOG", "BREAK", 
			"ADD_OP", "SUB_OP", "MUL_OP", "DIV_OP", "UNARY_INCREMENT", "UNARY_DECREMENT", 
			"VARIABLE", "NUMBER", "WHITESPACE", "NEWLINE", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'{'", "'}'", "'?'", "':'", "'['", "']'", 
			"'.'", "'length'", "'push'", "'pop'", "'concat'", "','", "'.log'", "'function'", 
			"'return'", "'while'", "'for'", "'var'", "'const'", "'let'", "'if'", 
			"'else'", "'<'", "'<='", "'>'", "'>='", "'='", "'!='", "'console'", "'log'", 
			"'break'", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "FUNCTION", "RETURN", "WHILE", "FOR", "VAR", 
			"CONST", "LET", "IF", "ELSE", "LESS_THAN", "LESS_THAN_EQUAL", "GREATER_THAN", 
			"GREATER_THAN_EQUAL", "EQUALS", "NOT_EQUALS", "CONSOLE", "LOG", "BREAK", 
			"ADD_OP", "SUB_OP", "MUL_OP", "DIV_OP", "UNARY_INCREMENT", "UNARY_DECREMENT", 
			"VARIABLE", "NUMBER", "WHITESPACE", "NEWLINE", "TEXT"
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


	public SubsetJavaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SubsetJavaScript.g4"; }

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
		"\u0004\u0000-\u012a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001+\u0001+\u0003+\u00fb\b+\u0001+\u0001+\u0001"+
		"+\u0001+\u0005+\u0101\b+\n+\f+\u0104\t+\u0001,\u0004,\u0107\b,\u000b,"+
		"\f,\u0108\u0001,\u0001,\u0004,\u010d\b,\u000b,\f,\u010e\u0003,\u0111\b"+
		",\u0001-\u0004-\u0114\b-\u000b-\f-\u0115\u0001-\u0001-\u0001.\u0003.\u011b"+
		"\b.\u0001.\u0001.\u0004.\u011f\b.\u000b.\f.\u0120\u0001/\u0001/\u0004"+
		"/\u0125\b/\u000b/\f/\u0126\u0001/\u0001/\u0000\u00000\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0000#\u0000%\u0000\'\u0011)\u0012+\u0013-\u0014/\u00151\u00163\u0017"+
		"5\u00187\u00199\u001a;\u001b=\u001c?\u001dA\u001eC\u001fE G!I\"K#M$O%"+
		"Q&S\'U(W)Y*[+],_-\u0001\u0000\u0006\u0001\u0000az\u0001\u0000AZ\u0001"+
		"\u000009\u0002\u0000,,..\u0002\u0000\t\t  \u0002\u0000\"\"\'\'\u0133\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000"+
		"M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001"+
		"\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000"+
		"\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000"+
		"[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001"+
		"\u0000\u0000\u0000\u0001a\u0001\u0000\u0000\u0000\u0003c\u0001\u0000\u0000"+
		"\u0000\u0005e\u0001\u0000\u0000\u0000\u0007g\u0001\u0000\u0000\u0000\t"+
		"i\u0001\u0000\u0000\u0000\u000bk\u0001\u0000\u0000\u0000\rm\u0001\u0000"+
		"\u0000\u0000\u000fo\u0001\u0000\u0000\u0000\u0011q\u0001\u0000\u0000\u0000"+
		"\u0013s\u0001\u0000\u0000\u0000\u0015u\u0001\u0000\u0000\u0000\u0017|"+
		"\u0001\u0000\u0000\u0000\u0019\u0081\u0001\u0000\u0000\u0000\u001b\u0085"+
		"\u0001\u0000\u0000\u0000\u001d\u008c\u0001\u0000\u0000\u0000\u001f\u008e"+
		"\u0001\u0000\u0000\u0000!\u0093\u0001\u0000\u0000\u0000#\u0095\u0001\u0000"+
		"\u0000\u0000%\u0097\u0001\u0000\u0000\u0000\'\u0099\u0001\u0000\u0000"+
		"\u0000)\u00a2\u0001\u0000\u0000\u0000+\u00a9\u0001\u0000\u0000\u0000-"+
		"\u00af\u0001\u0000\u0000\u0000/\u00b3\u0001\u0000\u0000\u00001\u00b7\u0001"+
		"\u0000\u0000\u00003\u00bd\u0001\u0000\u0000\u00005\u00c1\u0001\u0000\u0000"+
		"\u00007\u00c4\u0001\u0000\u0000\u00009\u00c9\u0001\u0000\u0000\u0000;"+
		"\u00cb\u0001\u0000\u0000\u0000=\u00ce\u0001\u0000\u0000\u0000?\u00d0\u0001"+
		"\u0000\u0000\u0000A\u00d3\u0001\u0000\u0000\u0000C\u00d5\u0001\u0000\u0000"+
		"\u0000E\u00d8\u0001\u0000\u0000\u0000G\u00e0\u0001\u0000\u0000\u0000I"+
		"\u00e4\u0001\u0000\u0000\u0000K\u00ea\u0001\u0000\u0000\u0000M\u00ec\u0001"+
		"\u0000\u0000\u0000O\u00ee\u0001\u0000\u0000\u0000Q\u00f0\u0001\u0000\u0000"+
		"\u0000S\u00f2\u0001\u0000\u0000\u0000U\u00f5\u0001\u0000\u0000\u0000W"+
		"\u00fa\u0001\u0000\u0000\u0000Y\u0106\u0001\u0000\u0000\u0000[\u0113\u0001"+
		"\u0000\u0000\u0000]\u011e\u0001\u0000\u0000\u0000_\u0122\u0001\u0000\u0000"+
		"\u0000ab\u0005;\u0000\u0000b\u0002\u0001\u0000\u0000\u0000cd\u0005(\u0000"+
		"\u0000d\u0004\u0001\u0000\u0000\u0000ef\u0005)\u0000\u0000f\u0006\u0001"+
		"\u0000\u0000\u0000gh\u0005{\u0000\u0000h\b\u0001\u0000\u0000\u0000ij\u0005"+
		"}\u0000\u0000j\n\u0001\u0000\u0000\u0000kl\u0005?\u0000\u0000l\f\u0001"+
		"\u0000\u0000\u0000mn\u0005:\u0000\u0000n\u000e\u0001\u0000\u0000\u0000"+
		"op\u0005[\u0000\u0000p\u0010\u0001\u0000\u0000\u0000qr\u0005]\u0000\u0000"+
		"r\u0012\u0001\u0000\u0000\u0000st\u0005.\u0000\u0000t\u0014\u0001\u0000"+
		"\u0000\u0000uv\u0005l\u0000\u0000vw\u0005e\u0000\u0000wx\u0005n\u0000"+
		"\u0000xy\u0005g\u0000\u0000yz\u0005t\u0000\u0000z{\u0005h\u0000\u0000"+
		"{\u0016\u0001\u0000\u0000\u0000|}\u0005p\u0000\u0000}~\u0005u\u0000\u0000"+
		"~\u007f\u0005s\u0000\u0000\u007f\u0080\u0005h\u0000\u0000\u0080\u0018"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005p\u0000\u0000\u0082\u0083\u0005"+
		"o\u0000\u0000\u0083\u0084\u0005p\u0000\u0000\u0084\u001a\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005c\u0000\u0000\u0086\u0087\u0005o\u0000\u0000\u0087"+
		"\u0088\u0005n\u0000\u0000\u0088\u0089\u0005c\u0000\u0000\u0089\u008a\u0005"+
		"a\u0000\u0000\u008a\u008b\u0005t\u0000\u0000\u008b\u001c\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005,\u0000\u0000\u008d\u001e\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005.\u0000\u0000\u008f\u0090\u0005l\u0000\u0000\u0090\u0091"+
		"\u0005o\u0000\u0000\u0091\u0092\u0005g\u0000\u0000\u0092 \u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0007\u0000\u0000\u0000\u0094\"\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0007\u0001\u0000\u0000\u0096$\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0007\u0002\u0000\u0000\u0098&\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005f\u0000\u0000\u009a\u009b\u0005u\u0000\u0000\u009b\u009c\u0005"+
		"n\u0000\u0000\u009c\u009d\u0005c\u0000\u0000\u009d\u009e\u0005t\u0000"+
		"\u0000\u009e\u009f\u0005i\u0000\u0000\u009f\u00a0\u0005o\u0000\u0000\u00a0"+
		"\u00a1\u0005n\u0000\u0000\u00a1(\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"r\u0000\u0000\u00a3\u00a4\u0005e\u0000\u0000\u00a4\u00a5\u0005t\u0000"+
		"\u0000\u00a5\u00a6\u0005u\u0000\u0000\u00a6\u00a7\u0005r\u0000\u0000\u00a7"+
		"\u00a8\u0005n\u0000\u0000\u00a8*\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"w\u0000\u0000\u00aa\u00ab\u0005h\u0000\u0000\u00ab\u00ac\u0005i\u0000"+
		"\u0000\u00ac\u00ad\u0005l\u0000\u0000\u00ad\u00ae\u0005e\u0000\u0000\u00ae"+
		",\u0001\u0000\u0000\u0000\u00af\u00b0\u0005f\u0000\u0000\u00b0\u00b1\u0005"+
		"o\u0000\u0000\u00b1\u00b2\u0005r\u0000\u0000\u00b2.\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0005v\u0000\u0000\u00b4\u00b5\u0005a\u0000\u0000\u00b5"+
		"\u00b6\u0005r\u0000\u0000\u00b60\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"c\u0000\u0000\u00b8\u00b9\u0005o\u0000\u0000\u00b9\u00ba\u0005n\u0000"+
		"\u0000\u00ba\u00bb\u0005s\u0000\u0000\u00bb\u00bc\u0005t\u0000\u0000\u00bc"+
		"2\u0001\u0000\u0000\u0000\u00bd\u00be\u0005l\u0000\u0000\u00be\u00bf\u0005"+
		"e\u0000\u0000\u00bf\u00c0\u0005t\u0000\u0000\u00c04\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005i\u0000\u0000\u00c2\u00c3\u0005f\u0000\u0000\u00c3"+
		"6\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005e\u0000\u0000\u00c5\u00c6\u0005"+
		"l\u0000\u0000\u00c6\u00c7\u0005s\u0000\u0000\u00c7\u00c8\u0005e\u0000"+
		"\u0000\u00c88\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005<\u0000\u0000\u00ca"+
		":\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005<\u0000\u0000\u00cc\u00cd\u0005"+
		"=\u0000\u0000\u00cd<\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005>\u0000"+
		"\u0000\u00cf>\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005>\u0000\u0000\u00d1"+
		"\u00d2\u0005=\u0000\u0000\u00d2@\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"=\u0000\u0000\u00d4B\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005!\u0000"+
		"\u0000\u00d6\u00d7\u0005=\u0000\u0000\u00d7D\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0005c\u0000\u0000\u00d9\u00da\u0005o\u0000\u0000\u00da\u00db\u0005"+
		"n\u0000\u0000\u00db\u00dc\u0005s\u0000\u0000\u00dc\u00dd\u0005o\u0000"+
		"\u0000\u00dd\u00de\u0005l\u0000\u0000\u00de\u00df\u0005e\u0000\u0000\u00df"+
		"F\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005l\u0000\u0000\u00e1\u00e2\u0005"+
		"o\u0000\u0000\u00e2\u00e3\u0005g\u0000\u0000\u00e3H\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0005b\u0000\u0000\u00e5\u00e6\u0005r\u0000\u0000\u00e6"+
		"\u00e7\u0005e\u0000\u0000\u00e7\u00e8\u0005a\u0000\u0000\u00e8\u00e9\u0005"+
		"k\u0000\u0000\u00e9J\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005+\u0000"+
		"\u0000\u00ebL\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005-\u0000\u0000\u00ed"+
		"N\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005*\u0000\u0000\u00efP\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005/\u0000\u0000\u00f1R\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0005+\u0000\u0000\u00f3\u00f4\u0005+\u0000\u0000\u00f4"+
		"T\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005-\u0000\u0000\u00f6\u00f7\u0005"+
		"-\u0000\u0000\u00f7V\u0001\u0000\u0000\u0000\u00f8\u00fb\u0003!\u0010"+
		"\u0000\u00f9\u00fb\u0003#\u0011\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u0102\u0001\u0000\u0000\u0000"+
		"\u00fc\u0101\u0003!\u0010\u0000\u00fd\u0101\u0003#\u0011\u0000\u00fe\u0101"+
		"\u0003%\u0012\u0000\u00ff\u0101\u0005_\u0000\u0000\u0100\u00fc\u0001\u0000"+
		"\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103X\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0105\u0107\u0003%\u0012\u0000\u0106\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0110\u0001\u0000\u0000\u0000"+
		"\u010a\u010c\u0007\u0003\u0000\u0000\u010b\u010d\u0003%\u0012\u0000\u010c"+
		"\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u0111\u0001\u0000\u0000\u0000\u0110\u010a\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111Z\u0001\u0000\u0000\u0000\u0112\u0114"+
		"\u0007\u0004\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0006-\u0000\u0000\u0118\\\u0001\u0000\u0000\u0000\u0119\u011b\u0005"+
		"\r\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011f\u0005\n\u0000"+
		"\u0000\u011d\u011f\u0005\r\u0000\u0000\u011e\u011a\u0001\u0000\u0000\u0000"+
		"\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121^\u0001\u0000\u0000\u0000\u0122\u0124\u0007\u0005\u0000\u0000\u0123"+
		"\u0125\b\u0005\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0007\u0005\u0000\u0000\u0129`\u0001\u0000\u0000\u0000\f\u0000\u00fa"+
		"\u0100\u0102\u0108\u010e\u0110\u0115\u011a\u011e\u0120\u0126\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}