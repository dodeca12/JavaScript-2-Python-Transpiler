# Generated from SubsetJavaScript.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SubsetJavaScriptParser import SubsetJavaScriptParser
else:
    from SubsetJavaScriptParser import SubsetJavaScriptParser

# This class defines a complete listener for a parse tree produced by SubsetJavaScriptParser.
class SubsetJavaScriptListener(ParseTreeListener):

    # Enter a parse tree produced by SubsetJavaScriptParser#program.
    def enterProgram(self, ctx:SubsetJavaScriptParser.ProgramContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#program.
    def exitProgram(self, ctx:SubsetJavaScriptParser.ProgramContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#line.
    def enterLine(self, ctx:SubsetJavaScriptParser.LineContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#line.
    def exitLine(self, ctx:SubsetJavaScriptParser.LineContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#statement.
    def enterStatement(self, ctx:SubsetJavaScriptParser.StatementContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#statement.
    def exitStatement(self, ctx:SubsetJavaScriptParser.StatementContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#condition.
    def enterCondition(self, ctx:SubsetJavaScriptParser.ConditionContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#condition.
    def exitCondition(self, ctx:SubsetJavaScriptParser.ConditionContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#conditional_statement.
    def enterConditional_statement(self, ctx:SubsetJavaScriptParser.Conditional_statementContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#conditional_statement.
    def exitConditional_statement(self, ctx:SubsetJavaScriptParser.Conditional_statementContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#if_statement.
    def enterIf_statement(self, ctx:SubsetJavaScriptParser.If_statementContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#if_statement.
    def exitIf_statement(self, ctx:SubsetJavaScriptParser.If_statementContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#else_if_statement.
    def enterElse_if_statement(self, ctx:SubsetJavaScriptParser.Else_if_statementContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#else_if_statement.
    def exitElse_if_statement(self, ctx:SubsetJavaScriptParser.Else_if_statementContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#else_statement.
    def enterElse_statement(self, ctx:SubsetJavaScriptParser.Else_statementContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#else_statement.
    def exitElse_statement(self, ctx:SubsetJavaScriptParser.Else_statementContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#conditional_block.
    def enterConditional_block(self, ctx:SubsetJavaScriptParser.Conditional_blockContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#conditional_block.
    def exitConditional_block(self, ctx:SubsetJavaScriptParser.Conditional_blockContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#ternary_statement.
    def enterTernary_statement(self, ctx:SubsetJavaScriptParser.Ternary_statementContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#ternary_statement.
    def exitTernary_statement(self, ctx:SubsetJavaScriptParser.Ternary_statementContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#value.
    def enterValue(self, ctx:SubsetJavaScriptParser.ValueContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#value.
    def exitValue(self, ctx:SubsetJavaScriptParser.ValueContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#variable_number_text.
    def enterVariable_number_text(self, ctx:SubsetJavaScriptParser.Variable_number_textContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#variable_number_text.
    def exitVariable_number_text(self, ctx:SubsetJavaScriptParser.Variable_number_textContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#assignment.
    def enterAssignment(self, ctx:SubsetJavaScriptParser.AssignmentContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#assignment.
    def exitAssignment(self, ctx:SubsetJavaScriptParser.AssignmentContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#reassignment.
    def enterReassignment(self, ctx:SubsetJavaScriptParser.ReassignmentContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#reassignment.
    def exitReassignment(self, ctx:SubsetJavaScriptParser.ReassignmentContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#function.
    def enterFunction(self, ctx:SubsetJavaScriptParser.FunctionContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#function.
    def exitFunction(self, ctx:SubsetJavaScriptParser.FunctionContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#function_block.
    def enterFunction_block(self, ctx:SubsetJavaScriptParser.Function_blockContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#function_block.
    def exitFunction_block(self, ctx:SubsetJavaScriptParser.Function_blockContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#return_statement.
    def enterReturn_statement(self, ctx:SubsetJavaScriptParser.Return_statementContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#return_statement.
    def exitReturn_statement(self, ctx:SubsetJavaScriptParser.Return_statementContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#parameter_list.
    def enterParameter_list(self, ctx:SubsetJavaScriptParser.Parameter_listContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#parameter_list.
    def exitParameter_list(self, ctx:SubsetJavaScriptParser.Parameter_listContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#function_call.
    def enterFunction_call(self, ctx:SubsetJavaScriptParser.Function_callContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#function_call.
    def exitFunction_call(self, ctx:SubsetJavaScriptParser.Function_callContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#op.
    def enterOp(self, ctx:SubsetJavaScriptParser.OpContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#op.
    def exitOp(self, ctx:SubsetJavaScriptParser.OpContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#unary_arithmetic.
    def enterUnary_arithmetic(self, ctx:SubsetJavaScriptParser.Unary_arithmeticContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#unary_arithmetic.
    def exitUnary_arithmetic(self, ctx:SubsetJavaScriptParser.Unary_arithmeticContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#arithmetic.
    def enterArithmetic(self, ctx:SubsetJavaScriptParser.ArithmeticContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#arithmetic.
    def exitArithmetic(self, ctx:SubsetJavaScriptParser.ArithmeticContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#relop.
    def enterRelop(self, ctx:SubsetJavaScriptParser.RelopContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#relop.
    def exitRelop(self, ctx:SubsetJavaScriptParser.RelopContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#bool.
    def enterBool(self, ctx:SubsetJavaScriptParser.BoolContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#bool.
    def exitBool(self, ctx:SubsetJavaScriptParser.BoolContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#expression.
    def enterExpression(self, ctx:SubsetJavaScriptParser.ExpressionContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#expression.
    def exitExpression(self, ctx:SubsetJavaScriptParser.ExpressionContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#array_item.
    def enterArray_item(self, ctx:SubsetJavaScriptParser.Array_itemContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#array_item.
    def exitArray_item(self, ctx:SubsetJavaScriptParser.Array_itemContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#array_length.
    def enterArray_length(self, ctx:SubsetJavaScriptParser.Array_lengthContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#array_length.
    def exitArray_length(self, ctx:SubsetJavaScriptParser.Array_lengthContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#array.
    def enterArray(self, ctx:SubsetJavaScriptParser.ArrayContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#array.
    def exitArray(self, ctx:SubsetJavaScriptParser.ArrayContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#array_elements.
    def enterArray_elements(self, ctx:SubsetJavaScriptParser.Array_elementsContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#array_elements.
    def exitArray_elements(self, ctx:SubsetJavaScriptParser.Array_elementsContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#array_operation.
    def enterArray_operation(self, ctx:SubsetJavaScriptParser.Array_operationContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#array_operation.
    def exitArray_operation(self, ctx:SubsetJavaScriptParser.Array_operationContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#array_concatenation.
    def enterArray_concatenation(self, ctx:SubsetJavaScriptParser.Array_concatenationContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#array_concatenation.
    def exitArray_concatenation(self, ctx:SubsetJavaScriptParser.Array_concatenationContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#array_concat_param.
    def enterArray_concat_param(self, ctx:SubsetJavaScriptParser.Array_concat_paramContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#array_concat_param.
    def exitArray_concat_param(self, ctx:SubsetJavaScriptParser.Array_concat_paramContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#console_log.
    def enterConsole_log(self, ctx:SubsetJavaScriptParser.Console_logContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#console_log.
    def exitConsole_log(self, ctx:SubsetJavaScriptParser.Console_logContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#while_loop.
    def enterWhile_loop(self, ctx:SubsetJavaScriptParser.While_loopContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#while_loop.
    def exitWhile_loop(self, ctx:SubsetJavaScriptParser.While_loopContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#for_loop.
    def enterFor_loop(self, ctx:SubsetJavaScriptParser.For_loopContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#for_loop.
    def exitFor_loop(self, ctx:SubsetJavaScriptParser.For_loopContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#for_loop_statement.
    def enterFor_loop_statement(self, ctx:SubsetJavaScriptParser.For_loop_statementContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#for_loop_statement.
    def exitFor_loop_statement(self, ctx:SubsetJavaScriptParser.For_loop_statementContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#loop_block.
    def enterLoop_block(self, ctx:SubsetJavaScriptParser.Loop_blockContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#loop_block.
    def exitLoop_block(self, ctx:SubsetJavaScriptParser.Loop_blockContext):
        pass


    # Enter a parse tree produced by SubsetJavaScriptParser#break_statement.
    def enterBreak_statement(self, ctx:SubsetJavaScriptParser.Break_statementContext):
        pass

    # Exit a parse tree produced by SubsetJavaScriptParser#break_statement.
    def exitBreak_statement(self, ctx:SubsetJavaScriptParser.Break_statementContext):
        pass



del SubsetJavaScriptParser