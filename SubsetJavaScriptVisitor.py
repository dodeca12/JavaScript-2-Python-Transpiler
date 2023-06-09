# Generated from SubsetJavaScript.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SubsetJavaScriptParser import SubsetJavaScriptParser
else:
    from SubsetJavaScriptParser import SubsetJavaScriptParser

# This class defines a complete generic visitor for a parse tree produced by SubsetJavaScriptParser.

class SubsetJavaScriptVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SubsetJavaScriptParser#program.
    def visitProgram(self, ctx:SubsetJavaScriptParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#line.
    def visitLine(self, ctx:SubsetJavaScriptParser.LineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#statement.
    def visitStatement(self, ctx:SubsetJavaScriptParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#condition.
    def visitCondition(self, ctx:SubsetJavaScriptParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#conditional_statement.
    def visitConditional_statement(self, ctx:SubsetJavaScriptParser.Conditional_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#if_statement.
    def visitIf_statement(self, ctx:SubsetJavaScriptParser.If_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#ternary_statement.
    def visitTernary_statement(self, ctx:SubsetJavaScriptParser.Ternary_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#value.
    def visitValue(self, ctx:SubsetJavaScriptParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#variable_number_text.
    def visitVariable_number_text(self, ctx:SubsetJavaScriptParser.Variable_number_textContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#assignment.
    def visitAssignment(self, ctx:SubsetJavaScriptParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#reassignment.
    def visitReassignment(self, ctx:SubsetJavaScriptParser.ReassignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#function.
    def visitFunction(self, ctx:SubsetJavaScriptParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#function_call.
    def visitFunction_call(self, ctx:SubsetJavaScriptParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#function_return.
    def visitFunction_return(self, ctx:SubsetJavaScriptParser.Function_returnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#op.
    def visitOp(self, ctx:SubsetJavaScriptParser.OpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#unary_arithmetic.
    def visitUnary_arithmetic(self, ctx:SubsetJavaScriptParser.Unary_arithmeticContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#arithmetic.
    def visitArithmetic(self, ctx:SubsetJavaScriptParser.ArithmeticContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#relop.
    def visitRelop(self, ctx:SubsetJavaScriptParser.RelopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#expression.
    def visitExpression(self, ctx:SubsetJavaScriptParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#array_item.
    def visitArray_item(self, ctx:SubsetJavaScriptParser.Array_itemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#array_length.
    def visitArray_length(self, ctx:SubsetJavaScriptParser.Array_lengthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#array.
    def visitArray(self, ctx:SubsetJavaScriptParser.ArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#array_operation.
    def visitArray_operation(self, ctx:SubsetJavaScriptParser.Array_operationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#array_concatenation.
    def visitArray_concatenation(self, ctx:SubsetJavaScriptParser.Array_concatenationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#console_log.
    def visitConsole_log(self, ctx:SubsetJavaScriptParser.Console_logContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#while_loop.
    def visitWhile_loop(self, ctx:SubsetJavaScriptParser.While_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#for_loop.
    def visitFor_loop(self, ctx:SubsetJavaScriptParser.For_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SubsetJavaScriptParser#for_loop_statement.
    def visitFor_loop_statement(self, ctx:SubsetJavaScriptParser.For_loop_statementContext):
        return self.visitChildren(ctx)



del SubsetJavaScriptParser