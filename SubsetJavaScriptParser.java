// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SubsetJavaScriptParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_condition = 3, 
		RULE_conditional_statement = 4, RULE_ternary_statement = 5, RULE_value = 6, 
		RULE_variable_number_text = 7, RULE_assignment = 8, RULE_reassignment = 9, 
		RULE_function = 10, RULE_function_call = 11, RULE_function_return = 12, 
		RULE_op = 13, RULE_unary_arithmetic = 14, RULE_arithmetic = 15, RULE_relop = 16, 
		RULE_expression = 17, RULE_array_item = 18, RULE_array_length = 19, RULE_array = 20, 
		RULE_array_operation = 21, RULE_array_concatenation = 22, RULE_console_log = 23, 
		RULE_while_loop = 24, RULE_for_loop = 25, RULE_for_loop_statement = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "condition", "conditional_statement", 
			"ternary_statement", "value", "variable_number_text", "assignment", "reassignment", 
			"function", "function_call", "function_return", "op", "unary_arithmetic", 
			"arithmetic", "relop", "expression", "array_item", "array_length", "array", 
			"array_operation", "array_concatenation", "console_log", "while_loop", 
			"for_loop", "for_loop_statement"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SubsetJavaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SubsetJavaScriptParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
				case RETURN:
				case WHILE:
				case FOR:
				case VAR:
				case CONST:
				case LET:
				case IF:
				case CONSOLE:
				case VARIABLE:
				case NUMBER:
				case TEXT:
					{
					setState(54);
					line();
					}
					break;
				case FUNCTION:
					{
					setState(55);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 41785770246400L) != 0 );
			setState(60);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public Ternary_statementContext ternary_statement() {
			return getRuleContext(Ternary_statementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SubsetJavaScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SubsetJavaScriptParser.NEWLINE, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(62);
				ternary_statement();
				}
				break;
			case 2:
				{
				setState(63);
				statement();
				}
				break;
			case 3:
				{
				setState(64);
				conditional_statement();
				}
				break;
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(67);
				match(T__0);
				}
			}

			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				match(NEWLINE);
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public Array_operationContext array_operation() {
			return getRuleContext(Array_operationContext.class,0);
		}
		public Array_concatenationContext array_concatenation() {
			return getRuleContext(Array_concatenationContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Console_logContext console_log() {
			return getRuleContext(Console_logContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(75);
				assignment();
				}
				break;
			case 2:
				{
				setState(76);
				arithmetic();
				}
				break;
			case 3:
				{
				setState(77);
				array_operation();
				}
				break;
			case 4:
				{
				setState(78);
				array_concatenation();
				}
				break;
			case 5:
				{
				setState(79);
				while_loop();
				}
				break;
			case 6:
				{
				setState(80);
				for_loop();
				}
				break;
			case 7:
				{
				setState(81);
				function_return();
				}
				break;
			case 8:
				{
				setState(82);
				function_call();
				}
				break;
			case 9:
				{
				setState(83);
				console_log();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<RelopContext> relop() {
			return getRuleContexts(RelopContext.class);
		}
		public RelopContext relop(int i) {
			return getRuleContext(RelopContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			expression();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4227858432L) != 0) {
				{
				{
				setState(87);
				relop();
				setState(88);
				expression();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SubsetJavaScriptParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SubsetJavaScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SubsetJavaScriptParser.NEWLINE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitConditional_statement(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IF);
			setState(96);
			match(T__1);
			setState(97);
			condition();
			setState(98);
			match(T__2);
			setState(99);
			match(T__3);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(100);
				match(NEWLINE);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				line();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 41785770115328L) != 0 );
			setState(111);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ternary_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Ternary_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterTernary_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitTernary_statement(this);
		}
	}

	public final Ternary_statementContext ternary_statement() throws RecognitionException {
		Ternary_statementContext _localctx = new Ternary_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ternary_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			expression();
			setState(114);
			match(T__5);
			setState(115);
			statement();
			setState(116);
			match(T__6);
			setState(117);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SubsetJavaScriptParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(SubsetJavaScriptParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(SubsetJavaScriptParser.TEXT, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Array_itemContext array_item() {
			return getRuleContext(Array_itemContext.class,0);
		}
		public Array_lengthContext array_length() {
			return getRuleContext(Array_lengthContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(119);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				setState(120);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(121);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(122);
				function_call();
				}
				break;
			case 5:
				{
				setState(123);
				array_item();
				}
				break;
			case 6:
				{
				setState(124);
				array_length();
				}
				break;
			case 7:
				{
				setState(125);
				array();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_number_textContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SubsetJavaScriptParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(SubsetJavaScriptParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(SubsetJavaScriptParser.TEXT, 0); }
		public Variable_number_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_number_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterVariable_number_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitVariable_number_text(this);
		}
	}

	public final Variable_number_textContext variable_number_text() throws RecognitionException {
		Variable_number_textContext _localctx = new Variable_number_textContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_number_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 41781441855488L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SubsetJavaScriptParser.VARIABLE, 0); }
		public TerminalNode EQUALS() { return getToken(SubsetJavaScriptParser.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode VAR() { return getToken(SubsetJavaScriptParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(SubsetJavaScriptParser.CONST, 0); }
		public TerminalNode LET() { return getToken(SubsetJavaScriptParser.LET, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
			match(VARIABLE);
			setState(132);
			match(EQUALS);
			setState(133);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReassignmentContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(SubsetJavaScriptParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(SubsetJavaScriptParser.VARIABLE, i);
		}
		public TerminalNode EQUALS() { return getToken(SubsetJavaScriptParser.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterReassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitReassignment(this);
		}
	}

	public final ReassignmentContext reassignment() throws RecognitionException {
		ReassignmentContext _localctx = new ReassignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(VARIABLE);
			setState(136);
			match(EQUALS);
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(137);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				setState(138);
				value();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(SubsetJavaScriptParser.FUNCTION, 0); }
		public TerminalNode VARIABLE() { return getToken(SubsetJavaScriptParser.VARIABLE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SubsetJavaScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SubsetJavaScriptParser.NEWLINE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(141);
			match(FUNCTION);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(142);
				match(VARIABLE);
				}
			}

			setState(145);
			match(T__1);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 41781441855744L) != 0) {
				{
				{
				setState(146);
				value();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(T__2);
			setState(153);
			match(T__3);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(154);
				match(NEWLINE);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				line();
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 41785770115328L) != 0 );
			setState(165);
			match(T__4);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(166);
				match(T__0);
				}
			}

			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				match(NEWLINE);
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SubsetJavaScriptParser.VARIABLE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(VARIABLE);
			setState(175);
			match(T__1);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 41781441855744L) != 0) {
				{
				{
				setState(176);
				value();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SubsetJavaScriptParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Array_concatenationContext array_concatenation() {
			return getRuleContext(Array_concatenationContext.class,0);
		}
		public Function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterFunction_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitFunction_return(this);
		}
	}

	public final Function_returnContext function_return() throws RecognitionException {
		Function_returnContext _localctx = new Function_returnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(RETURN);
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(185);
				value();
				}
				break;
			case 2:
				{
				setState(186);
				array_concatenation();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(SubsetJavaScriptParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(SubsetJavaScriptParser.SUB_OP, 0); }
		public TerminalNode MUL_OP() { return getToken(SubsetJavaScriptParser.MUL_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(SubsetJavaScriptParser.DIV_OP, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_arithmeticContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SubsetJavaScriptParser.VARIABLE, 0); }
		public TerminalNode UNARY_INCREMENT() { return getToken(SubsetJavaScriptParser.UNARY_INCREMENT, 0); }
		public TerminalNode UNARY_DECREMENT() { return getToken(SubsetJavaScriptParser.UNARY_DECREMENT, 0); }
		public Unary_arithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterUnary_arithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitUnary_arithmetic(this);
		}
	}

	public final Unary_arithmeticContext unary_arithmetic() throws RecognitionException {
		Unary_arithmeticContext _localctx = new Unary_arithmeticContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(VARIABLE);
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==UNARY_INCREMENT || _la==UNARY_DECREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticContext extends ParserRuleContext {
		public Unary_arithmeticContext unary_arithmetic() {
			return getRuleContext(Unary_arithmeticContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitArithmetic(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				{
				setState(194);
				value();
				setState(195);
				op();
				setState(196);
				value();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0) {
					{
					{
					setState(197);
					op();
					setState(198);
					value();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(205);
				unary_arithmetic();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelopContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(SubsetJavaScriptParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQUAL() { return getToken(SubsetJavaScriptParser.LESS_THAN_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SubsetJavaScriptParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUAL() { return getToken(SubsetJavaScriptParser.GREATER_THAN_EQUAL, 0); }
		public TerminalNode EQUALS() { return getToken(SubsetJavaScriptParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(SubsetJavaScriptParser.NOT_EQUALS, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4227858432L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(210);
				value();
				}
				break;
			case 2:
				{
				setState(211);
				arithmetic();
				}
				break;
			}
			setState(214);
			relop();
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(215);
				value();
				}
				break;
			case 2:
				{
				setState(216);
				arithmetic();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_itemContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SubsetJavaScriptParser.VARIABLE, 0); }
		public Variable_number_textContext variable_number_text() {
			return getRuleContext(Variable_number_textContext.class,0);
		}
		public Unary_arithmeticContext unary_arithmetic() {
			return getRuleContext(Unary_arithmeticContext.class,0);
		}
		public Array_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterArray_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitArray_item(this);
		}
	}

	public final Array_itemContext array_item() throws RecognitionException {
		Array_itemContext _localctx = new Array_itemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(VARIABLE);
			setState(220);
			match(T__7);
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(221);
				variable_number_text();
				}
				break;
			case 2:
				{
				setState(222);
				unary_arithmetic();
				}
				break;
			}
			setState(225);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_lengthContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SubsetJavaScriptParser.VARIABLE, 0); }
		public Array_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterArray_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitArray_length(this);
		}
	}

	public final Array_lengthContext array_length() throws RecognitionException {
		Array_lengthContext _localctx = new Array_lengthContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(VARIABLE);
			setState(228);
			match(T__9);
			setState(229);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__7);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 41781441855744L) != 0) {
				{
				setState(232);
				value();
				}
			}

			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(235);
				match(T__9);
				setState(236);
				value();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_operationContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SubsetJavaScriptParser.VARIABLE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<Array_itemContext> array_item() {
			return getRuleContexts(Array_itemContext.class);
		}
		public Array_itemContext array_item(int i) {
			return getRuleContext(Array_itemContext.class,i);
		}
		public Array_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterArray_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitArray_operation(this);
		}
	}

	public final Array_operationContext array_operation() throws RecognitionException {
		Array_operationContext _localctx = new Array_operationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(VARIABLE);
			setState(245);
			match(T__9);
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(247);
			match(T__1);
			setState(250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(248);
					value();
					}
					break;
				case 2:
					{
					setState(249);
					array_item();
					}
					break;
				}
				}
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 41781441855744L) != 0 );
			setState(254);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_concatenationContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<Array_itemContext> array_item() {
			return getRuleContexts(Array_itemContext.class);
		}
		public Array_itemContext array_item(int i) {
			return getRuleContext(Array_itemContext.class,i);
		}
		public Array_concatenationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_concatenation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterArray_concatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitArray_concatenation(this);
		}
	}

	public final Array_concatenationContext array_concatenation() throws RecognitionException {
		Array_concatenationContext _localctx = new Array_concatenationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_array_concatenation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			value();
			setState(257);
			match(T__9);
			setState(258);
			match(T__13);
			setState(259);
			match(T__1);
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(260);
				value();
				}
				break;
			case 2:
				{
				setState(261);
				array_item();
				}
				break;
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(264);
				match(T__14);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(265);
					value();
					}
					break;
				case 2:
					{
					setState(266);
					array_item();
					}
					break;
				}
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Console_logContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(SubsetJavaScriptParser.CONSOLE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Console_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_console_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterConsole_log(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitConsole_log(this);
		}
	}

	public final Console_logContext console_log() throws RecognitionException {
		Console_logContext _localctx = new Console_logContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_console_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(CONSOLE);
			setState(277);
			match(T__15);
			setState(278);
			match(T__1);
			setState(279);
			value();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(280);
				match(T__14);
				setState(281);
				value();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SubsetJavaScriptParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SubsetJavaScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SubsetJavaScriptParser.NEWLINE, i);
		}
		public TerminalNode BREAK() { return getToken(SubsetJavaScriptParser.BREAK, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(WHILE);
			setState(290);
			match(T__1);
			setState(291);
			condition();
			setState(292);
			match(T__2);
			setState(293);
			match(T__3);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(294);
				match(NEWLINE);
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case RETURN:
			case WHILE:
			case FOR:
			case VAR:
			case CONST:
			case LET:
			case IF:
			case CONSOLE:
			case VARIABLE:
			case NUMBER:
			case TEXT:
				{
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					line();
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 41785770115328L) != 0 );
				}
				break;
			case BREAK:
				{
				{
				setState(305);
				match(BREAK);
				setState(306);
				match(NEWLINE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(309);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SubsetJavaScriptParser.FOR, 0); }
		public For_loop_statementContext for_loop_statement() {
			return getRuleContext(For_loop_statementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SubsetJavaScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SubsetJavaScriptParser.NEWLINE, i);
		}
		public TerminalNode BREAK() { return getToken(SubsetJavaScriptParser.BREAK, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(FOR);
			setState(312);
			match(T__1);
			setState(313);
			for_loop_statement();
			setState(314);
			match(T__2);
			setState(315);
			match(T__3);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(316);
				match(NEWLINE);
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case RETURN:
			case WHILE:
			case FOR:
			case VAR:
			case CONST:
			case LET:
			case IF:
			case CONSOLE:
			case VARIABLE:
			case NUMBER:
			case TEXT:
				{
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(322);
					line();
					}
					}
					setState(325); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 41785770115328L) != 0 );
				}
				break;
			case BREAK:
				{
				{
				setState(327);
				match(BREAK);
				setState(328);
				match(NEWLINE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(331);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_loop_statementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReassignmentContext reassignment() {
			return getRuleContext(ReassignmentContext.class,0);
		}
		public For_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).enterFor_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubsetJavaScriptListener ) ((SubsetJavaScriptListener)listener).exitFor_loop_statement(this);
		}
	}

	public final For_loop_statementContext for_loop_statement() throws RecognitionException {
		For_loop_statementContext _localctx = new For_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_for_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case CONST:
			case LET:
				{
				setState(333);
				assignment();
				}
				break;
			case VARIABLE:
				{
				setState(334);
				reassignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(337);
			match(T__0);
			setState(338);
			condition();
			setState(339);
			match(T__0);
			setState(340);
			arithmetic();
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
		"\u0004\u0001-\u0157\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0004\u00009\b\u0000\u000b\u0000\f\u0000:\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001\u0003"+
		"\u0001E\b\u0001\u0001\u0001\u0004\u0001H\b\u0001\u000b\u0001\f\u0001I"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003[\b\u0003\n\u0003\f\u0003"+
		"^\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004f\b\u0004\n\u0004\f\u0004i\t\u0004\u0001\u0004"+
		"\u0004\u0004l\b\u0004\u000b\u0004\f\u0004m\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u007f\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008c"+
		"\b\t\u0001\n\u0001\n\u0003\n\u0090\b\n\u0001\n\u0001\n\u0005\n\u0094\b"+
		"\n\n\n\f\n\u0097\t\n\u0001\n\u0001\n\u0001\n\u0005\n\u009c\b\n\n\n\f\n"+
		"\u009f\t\n\u0001\n\u0004\n\u00a2\b\n\u000b\n\f\n\u00a3\u0001\n\u0001\n"+
		"\u0003\n\u00a8\b\n\u0001\n\u0004\n\u00ab\b\n\u000b\n\f\n\u00ac\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00b2\b\u000b\n\u000b\f\u000b\u00b5"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00bc"+
		"\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00c9"+
		"\b\u000f\n\u000f\f\u000f\u00cc\t\u000f\u0001\u000f\u0003\u000f\u00cf\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00d5"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00da\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e0\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00ea\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u00ee\b\u0014\n\u0014\f\u0014\u00f1\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0004\u0015\u00fb\b\u0015\u000b\u0015\f\u0015\u00fc\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0107\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u010c\b\u0016\u0005\u0016\u010e\b\u0016\n\u0016\f\u0016\u0111"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u011b\b\u0017\n\u0017\f\u0017"+
		"\u011e\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0128\b\u0018\n\u0018"+
		"\f\u0018\u012b\t\u0018\u0001\u0018\u0004\u0018\u012e\b\u0018\u000b\u0018"+
		"\f\u0018\u012f\u0001\u0018\u0001\u0018\u0003\u0018\u0134\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u013e\b\u0019\n\u0019\f\u0019\u0141\t\u0019"+
		"\u0001\u0019\u0004\u0019\u0144\b\u0019\u000b\u0019\f\u0019\u0145\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u014a\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0150\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0000\u001b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.024\u0000\u0006\u0002\u0000)*--\u0001\u0000\u0015\u0017\u0001"+
		"\u0000#&\u0001\u0000\'(\u0001\u0000\u001a\u001f\u0001\u0000\f\r\u016f"+
		"\u00008\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004T"+
		"\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\b_\u0001\u0000"+
		"\u0000\u0000\nq\u0001\u0000\u0000\u0000\f~\u0001\u0000\u0000\u0000\u000e"+
		"\u0080\u0001\u0000\u0000\u0000\u0010\u0082\u0001\u0000\u0000\u0000\u0012"+
		"\u0087\u0001\u0000\u0000\u0000\u0014\u008d\u0001\u0000\u0000\u0000\u0016"+
		"\u00ae\u0001\u0000\u0000\u0000\u0018\u00b8\u0001\u0000\u0000\u0000\u001a"+
		"\u00bd\u0001\u0000\u0000\u0000\u001c\u00bf\u0001\u0000\u0000\u0000\u001e"+
		"\u00ce\u0001\u0000\u0000\u0000 \u00d0\u0001\u0000\u0000\u0000\"\u00d4"+
		"\u0001\u0000\u0000\u0000$\u00db\u0001\u0000\u0000\u0000&\u00e3\u0001\u0000"+
		"\u0000\u0000(\u00e7\u0001\u0000\u0000\u0000*\u00f4\u0001\u0000\u0000\u0000"+
		",\u0100\u0001\u0000\u0000\u0000.\u0114\u0001\u0000\u0000\u00000\u0121"+
		"\u0001\u0000\u0000\u00002\u0137\u0001\u0000\u0000\u00004\u014f\u0001\u0000"+
		"\u0000\u000069\u0003\u0002\u0001\u000079\u0003\u0014\n\u000086\u0001\u0000"+
		"\u0000\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<=\u0005\u0000\u0000\u0001=\u0001\u0001\u0000\u0000\u0000>B\u0003\n\u0005"+
		"\u0000?B\u0003\u0004\u0002\u0000@B\u0003\b\u0004\u0000A>\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BD\u0001\u0000"+
		"\u0000\u0000CE\u0005\u0001\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FH\u0005,\u0000\u0000GF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000J\u0003\u0001\u0000\u0000\u0000KU\u0003\u0010"+
		"\b\u0000LU\u0003\u001e\u000f\u0000MU\u0003*\u0015\u0000NU\u0003,\u0016"+
		"\u0000OU\u00030\u0018\u0000PU\u00032\u0019\u0000QU\u0003\u0018\f\u0000"+
		"RU\u0003\u0016\u000b\u0000SU\u0003.\u0017\u0000TK\u0001\u0000\u0000\u0000"+
		"TL\u0001\u0000\u0000\u0000TM\u0001\u0000\u0000\u0000TN\u0001\u0000\u0000"+
		"\u0000TO\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000TQ\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0005"+
		"\u0001\u0000\u0000\u0000V\\\u0003\"\u0011\u0000WX\u0003 \u0010\u0000X"+
		"Y\u0003\"\u0011\u0000Y[\u0001\u0000\u0000\u0000ZW\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]\u0007\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005"+
		"\u0018\u0000\u0000`a\u0005\u0002\u0000\u0000ab\u0003\u0006\u0003\u0000"+
		"bc\u0005\u0003\u0000\u0000cg\u0005\u0004\u0000\u0000df\u0005,\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000jl\u0003\u0002\u0001\u0000kj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000op\u0005\u0005\u0000\u0000p\t\u0001\u0000\u0000"+
		"\u0000qr\u0003\"\u0011\u0000rs\u0005\u0006\u0000\u0000st\u0003\u0004\u0002"+
		"\u0000tu\u0005\u0007\u0000\u0000uv\u0003\u0004\u0002\u0000v\u000b\u0001"+
		"\u0000\u0000\u0000w\u007f\u0005)\u0000\u0000x\u007f\u0005*\u0000\u0000"+
		"y\u007f\u0005-\u0000\u0000z\u007f\u0003\u0016\u000b\u0000{\u007f\u0003"+
		"$\u0012\u0000|\u007f\u0003&\u0013\u0000}\u007f\u0003(\u0014\u0000~w\u0001"+
		"\u0000\u0000\u0000~x\u0001\u0000\u0000\u0000~y\u0001\u0000\u0000\u0000"+
		"~z\u0001\u0000\u0000\u0000~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\r\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0007\u0000\u0000\u0000\u0081\u000f\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0007\u0001\u0000\u0000\u0083\u0084\u0005)\u0000\u0000\u0084\u0085"+
		"\u0005\u001e\u0000\u0000\u0085\u0086\u0003\f\u0006\u0000\u0086\u0011\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005)\u0000\u0000\u0088\u008b\u0005\u001e"+
		"\u0000\u0000\u0089\u008c\u0005)\u0000\u0000\u008a\u008c\u0003\f\u0006"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008f\u0005\u0011\u0000"+
		"\u0000\u008e\u0090\u0005)\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0095\u0005\u0002\u0000\u0000\u0092\u0094\u0003\f\u0006\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005\u0003\u0000\u0000\u0099\u009d\u0005\u0004\u0000\u0000\u009a"+
		"\u009c\u0005,\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\u0002\u0001\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005\u0005\u0000\u0000\u00a6\u00a8"+
		"\u0005\u0001\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00ab"+
		"\u0005,\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u0015\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		")\u0000\u0000\u00af\u00b3\u0005\u0002\u0000\u0000\u00b0\u00b2\u0003\f"+
		"\u0006\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\u0003\u0000\u0000\u00b7\u0017\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0005\u0012\u0000\u0000\u00b9\u00bc\u0003\f\u0006"+
		"\u0000\u00ba\u00bc\u0003,\u0016\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u0019\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0007\u0002\u0000\u0000\u00be\u001b\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005)\u0000\u0000\u00c0\u00c1\u0007\u0003\u0000\u0000\u00c1"+
		"\u001d\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\f\u0006\u0000\u00c3\u00c4"+
		"\u0003\u001a\r\u0000\u00c4\u00ca\u0003\f\u0006\u0000\u00c5\u00c6\u0003"+
		"\u001a\r\u0000\u00c6\u00c7\u0003\f\u0006\u0000\u00c7\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cf\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cf\u0003\u001c\u000e\u0000\u00ce\u00c2\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u001f\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0007\u0004\u0000\u0000\u00d1!\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d5\u0003\f\u0006\u0000\u00d3\u00d5\u0003\u001e\u000f\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d9\u0003 \u0010\u0000\u00d7"+
		"\u00da\u0003\f\u0006\u0000\u00d8\u00da\u0003\u001e\u000f\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da#\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0005)\u0000\u0000\u00dc\u00df\u0005\b"+
		"\u0000\u0000\u00dd\u00e0\u0003\u000e\u0007\u0000\u00de\u00e0\u0003\u001c"+
		"\u000e\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\t\u0000"+
		"\u0000\u00e2%\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005)\u0000\u0000\u00e4"+
		"\u00e5\u0005\n\u0000\u0000\u00e5\u00e6\u0005\u000b\u0000\u0000\u00e6\'"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e9\u0005\b\u0000\u0000\u00e8\u00ea\u0003"+
		"\f\u0006\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ef\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\n\u0000"+
		"\u0000\u00ec\u00ee\u0003\f\u0006\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\t\u0000\u0000\u00f3"+
		")\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005)\u0000\u0000\u00f5\u00f6\u0005"+
		"\n\u0000\u0000\u00f6\u00f7\u0007\u0005\u0000\u0000\u00f7\u00fa\u0005\u0002"+
		"\u0000\u0000\u00f8\u00fb\u0003\f\u0006\u0000\u00f9\u00fb\u0003$\u0012"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0003\u0000\u0000\u00ff+\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0003\f\u0006\u0000\u0101\u0102\u0005\n\u0000\u0000\u0102"+
		"\u0103\u0005\u000e\u0000\u0000\u0103\u0106\u0005\u0002\u0000\u0000\u0104"+
		"\u0107\u0003\f\u0006\u0000\u0105\u0107\u0003$\u0012\u0000\u0106\u0104"+
		"\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u010f"+
		"\u0001\u0000\u0000\u0000\u0108\u010b\u0005\u000f\u0000\u0000\u0109\u010c"+
		"\u0003\f\u0006\u0000\u010a\u010c\u0003$\u0012\u0000\u010b\u0109\u0001"+
		"\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u010e\u0001"+
		"\u0000\u0000\u0000\u010d\u0108\u0001\u0000\u0000\u0000\u010e\u0111\u0001"+
		"\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001"+
		"\u0000\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0005\u0003\u0000\u0000\u0113-\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005 \u0000\u0000\u0115\u0116\u0005\u0010\u0000"+
		"\u0000\u0116\u0117\u0005\u0002\u0000\u0000\u0117\u011c\u0003\f\u0006\u0000"+
		"\u0118\u0119\u0005\u000f\u0000\u0000\u0119\u011b\u0003\f\u0006\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d"+
		"\u011f\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0005\u0003\u0000\u0000\u0120/\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0005\u0013\u0000\u0000\u0122\u0123\u0005\u0002\u0000\u0000\u0123\u0124"+
		"\u0003\u0006\u0003\u0000\u0124\u0125\u0005\u0003\u0000\u0000\u0125\u0129"+
		"\u0005\u0004\u0000\u0000\u0126\u0128\u0005,\u0000\u0000\u0127\u0126\u0001"+
		"\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u0133\u0001"+
		"\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012e\u0003"+
		"\u0002\u0001\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001"+
		"\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001"+
		"\u0000\u0000\u0000\u0130\u0134\u0001\u0000\u0000\u0000\u0131\u0132\u0005"+
		"\"\u0000\u0000\u0132\u0134\u0005,\u0000\u0000\u0133\u012d\u0001\u0000"+
		"\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0005\u0005\u0000\u0000\u01361\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0005\u0014\u0000\u0000\u0138\u0139\u0005\u0002\u0000"+
		"\u0000\u0139\u013a\u00034\u001a\u0000\u013a\u013b\u0005\u0003\u0000\u0000"+
		"\u013b\u013f\u0005\u0004\u0000\u0000\u013c\u013e\u0005,\u0000\u0000\u013d"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f"+
		"\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		"\u0149\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142"+
		"\u0144\u0003\u0002\u0001\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u014a\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005\"\u0000\u0000\u0148\u014a\u0005,\u0000\u0000\u0149\u0143"+
		"\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u0005\u0000\u0000\u014c3\u0001"+
		"\u0000\u0000\u0000\u014d\u0150\u0003\u0010\b\u0000\u014e\u0150\u0003\u0012"+
		"\t\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u014e\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0001\u0000"+
		"\u0000\u0152\u0153\u0003\u0006\u0003\u0000\u0153\u0154\u0005\u0001\u0000"+
		"\u0000\u0154\u0155\u0003\u001e\u000f\u0000\u01555\u0001\u0000\u0000\u0000"+
		"\'8:ADIT\\gm~\u008b\u008f\u0095\u009d\u00a3\u00a7\u00ac\u00b3\u00bb\u00ca"+
		"\u00ce\u00d4\u00d9\u00df\u00e9\u00ef\u00fa\u00fc\u0106\u010b\u010f\u011c"+
		"\u0129\u012f\u0133\u013f\u0145\u0149\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}