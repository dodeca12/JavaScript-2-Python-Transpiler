// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SubsetJavaScriptParser}.
 */
public interface SubsetJavaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SubsetJavaScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SubsetJavaScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SubsetJavaScriptParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SubsetJavaScriptParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SubsetJavaScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SubsetJavaScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SubsetJavaScriptParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SubsetJavaScriptParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(SubsetJavaScriptParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(SubsetJavaScriptParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#ternary_statement}.
	 * @param ctx the parse tree
	 */
	void enterTernary_statement(SubsetJavaScriptParser.Ternary_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#ternary_statement}.
	 * @param ctx the parse tree
	 */
	void exitTernary_statement(SubsetJavaScriptParser.Ternary_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SubsetJavaScriptParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SubsetJavaScriptParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#variable_number_text}.
	 * @param ctx the parse tree
	 */
	void enterVariable_number_text(SubsetJavaScriptParser.Variable_number_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#variable_number_text}.
	 * @param ctx the parse tree
	 */
	void exitVariable_number_text(SubsetJavaScriptParser.Variable_number_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SubsetJavaScriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SubsetJavaScriptParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#reassignment}.
	 * @param ctx the parse tree
	 */
	void enterReassignment(SubsetJavaScriptParser.ReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#reassignment}.
	 * @param ctx the parse tree
	 */
	void exitReassignment(SubsetJavaScriptParser.ReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SubsetJavaScriptParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SubsetJavaScriptParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(SubsetJavaScriptParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(SubsetJavaScriptParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#function_return}.
	 * @param ctx the parse tree
	 */
	void enterFunction_return(SubsetJavaScriptParser.Function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#function_return}.
	 * @param ctx the parse tree
	 */
	void exitFunction_return(SubsetJavaScriptParser.Function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(SubsetJavaScriptParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(SubsetJavaScriptParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#unary_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterUnary_arithmetic(SubsetJavaScriptParser.Unary_arithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#unary_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitUnary_arithmetic(SubsetJavaScriptParser.Unary_arithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(SubsetJavaScriptParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(SubsetJavaScriptParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(SubsetJavaScriptParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(SubsetJavaScriptParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SubsetJavaScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SubsetJavaScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#array_item}.
	 * @param ctx the parse tree
	 */
	void enterArray_item(SubsetJavaScriptParser.Array_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#array_item}.
	 * @param ctx the parse tree
	 */
	void exitArray_item(SubsetJavaScriptParser.Array_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#array_length}.
	 * @param ctx the parse tree
	 */
	void enterArray_length(SubsetJavaScriptParser.Array_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#array_length}.
	 * @param ctx the parse tree
	 */
	void exitArray_length(SubsetJavaScriptParser.Array_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(SubsetJavaScriptParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(SubsetJavaScriptParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#array_operation}.
	 * @param ctx the parse tree
	 */
	void enterArray_operation(SubsetJavaScriptParser.Array_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#array_operation}.
	 * @param ctx the parse tree
	 */
	void exitArray_operation(SubsetJavaScriptParser.Array_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#array_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterArray_concatenation(SubsetJavaScriptParser.Array_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#array_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitArray_concatenation(SubsetJavaScriptParser.Array_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#console_log}.
	 * @param ctx the parse tree
	 */
	void enterConsole_log(SubsetJavaScriptParser.Console_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#console_log}.
	 * @param ctx the parse tree
	 */
	void exitConsole_log(SubsetJavaScriptParser.Console_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(SubsetJavaScriptParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(SubsetJavaScriptParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(SubsetJavaScriptParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(SubsetJavaScriptParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubsetJavaScriptParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_statement(SubsetJavaScriptParser.For_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubsetJavaScriptParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_statement(SubsetJavaScriptParser.For_loop_statementContext ctx);
}