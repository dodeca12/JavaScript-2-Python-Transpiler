import sys
from SubsetJavaScriptListener import SubsetJavaScriptListener
from SubsetJavaScriptParser import SubsetJavaScriptParser

class JavaScript2PythonTranspiler(SubsetJavaScriptListener):
    def __init__(self, output):
        self.output = output
        self.indent_level = 0
        self.loop_condition_flag = False

    # Enter a parse tree produced by SubsetJavaScriptParser#line.
    def enterLine(self, ctx:SubsetJavaScriptParser.LineContext):
        self.output.write("%s" % ("\t"*self.indent_level))

    # Exit a parse tree produced by SubsetJavaScriptParser#line.
    def exitLine(self, ctx:SubsetJavaScriptParser.LineContext):
        self.output.write("\n")

    # Enter a parse tree produced by SubsetJavaScriptParser#unary_arithmetic.
    def enterUnary_arithmetic(self, ctx:SubsetJavaScriptParser.Unary_arithmeticContext):
        if not self.loop_condition_flag:
            if ctx.UNARY_ADD() != None:
                self.output.write("%s += 1" % (ctx.VARIABLE()))
            elif ctx.UNARY_MINUS() != None:
                self.output.write("%s -= 1" % (ctx.VARIABLE()))

    # Enter a parse tree produced by SubsetJavaScriptParser#condition.
    def exitExpression(self, ctx:SubsetJavaScriptParser.ExpressionContext):
        if not self.loop_condition_flag:
            text = ""
            for index in range(0,len(ctx.children)):
                if hasattr(ctx.children[index],'text'):
                    text += ctx.children[index].text
                else:
                    text += ctx.children[index].getText()
            if not isinstance(ctx.parentCtx,SubsetJavaScriptParser.Ternary_statementContext):
                self.output.write(text)

    # Enter a parse tree produced by SubsetJavaScriptParser#value.
    def enterValue(self, ctx:SubsetJavaScriptParser.ValueContext):
        if ctx.array_length() != None:
            ctx.text = f"len({ctx.array_length().VARIABLE()})"

    # Enter a parse tree produced by SubsetJavaScriptParser#condition.
    def enterCondition(self, ctx: SubsetJavaScriptParser.ConditionContext):
        if not self.loop_condition_flag:
            pass
        else:
            range_end_idx = ctx.expression()[0].value()[1].getText()
            self.output.write(" %s):\n" % (range_end_idx))
        
    # Exit a parse tree produced by SubsetJavaScriptParser#condition.
    def exitCondition(self, ctx:SubsetJavaScriptParser.ConditionContext):
        if not self.loop_condition_flag:
            self.output.write(":\n")
        
    # Exit a parse tree produced by SubsetJavaScriptParser#value.
    def exitValue(self, ctx:SubsetJavaScriptParser.ValueContext):
        if ctx.array_length():
            ctx.text = f"len({ctx.array_length().VARIABLE()})"

    # Enter a parse tree produced by SubsetJavaScriptParser#conditional_statement.
    def enterConditional_statement(self, ctx:SubsetJavaScriptParser.Conditional_statementContext):
        self.indent_level += 1

    # Exit a parse tree produced by SubsetJavaScriptParser#conditional_statement.
    def exitConditional_statement(self, ctx:SubsetJavaScriptParser.Conditional_statementContext):
        self.indent_level -= 1

    # Enter a parse tree produced by SubsetJavaScriptParser#if_statement.
    def enterIf_statement(self, ctx:SubsetJavaScriptParser.If_statementContext):
        self.current_line_last_line_of_conditional_statement = False
        self.output.write("%s " % (ctx.IF()))

    # Enter a parse tree produced by SubsetJavaScriptParser#else_if_statement. 
    def enterElse_if_statement(self, ctx:SubsetJavaScriptParser.Else_if_statementContext):
        self.current_line_last_line_of_conditional_statement = False
        self.output.write("%s " % ("elif"))

    # Enter a parse tree produced by SubsetJavaScriptParser#else_statement.
    def enterElse_statement(self, ctx:SubsetJavaScriptParser.Else_statementContext):
        self.output.write("%s: \n" % (ctx.ELSE()))

    # Enter a parse tree produced by SubsetJavaScriptParser#ternary_statement.
    def enterTernary_statement(self, ctx:SubsetJavaScriptParser.Ternary_statementContext):
        self.output.write("%s if %s else %s" % (
            ctx.statement()[0].getText().replace("push","append"),
            ctx.expression().getText(),
            ctx.statement()[1].getText().replace("push","append")))

    # Exit a parse tree produced by SubsetJavaScriptParser#ternary_statement.
    def exitTernary_statement(self, ctx:SubsetJavaScriptParser.Ternary_statementContext):
        self.output.write("\n")

    # Enter a parse tree produced by SubsetJavaScriptParser#assignment.
    def enterAssignment(self, ctx:SubsetJavaScriptParser.AssignmentContext):
        if not self.loop_condition_flag:
            if ctx.value().array_length() != None:
                self.output.write("%s = %s" % (ctx.VARIABLE(),f"len({ctx.value().array_length().VARIABLE()})"))
            else:
                self.output.write("%s = %s" % (ctx.VARIABLE(),ctx.value().getText()))
        
    # Enter a parse tree produced by SubsetJavaScriptParser#assignment.
    def enterReassignment(self, ctx:SubsetJavaScriptParser.AssignmentContext):
        if not self.loop_condition_flag:
            if len(ctx.VARIABLE()) > 1:
                self.output.write("%s = %s" % (ctx.VARIABLE()[0],ctx.VARIABLE()[1]))
            else:
                self.output.write("%s = %s" % (ctx.VARIABLE()[0],ctx.value().getText()))
 

    # Enter a parse tree produced by SubsetJavaScriptParser#Array_concatenation.
    def enterArray_concatenation(self, ctx:SubsetJavaScriptParser.Array_concatenationContext):
        concatStr = ""
        for i in range(2,-1,-1):
            concatStr = ctx.value()[i].getText() + concatStr
            if i != 0:
                concatStr = '+' + concatStr
        self.output.write("%s" % (concatStr))

    # Enter a parse tree produced by SubsetJavaScriptParser#function.
    def enterFunction(self, ctx:SubsetJavaScriptParser.FunctionContext):
        # Tab and def
        self.output.write("%sdef " % ('\t' * self.indent_level))

        # Function name
        self.output.write("%s(" % (ctx.VARIABLE()))

        if (len(ctx.value())):
            self.output.write("%s" % (ctx.value()[0].getText()))

        # End the function definition
        self.output.write("):\n")
        
        # Increase tab count
        self.indent_level += 1
        

    # Exit a parse tree produced by SubsetJavaScriptParser#function.
    def exitFunction(self, ctx:SubsetJavaScriptParser.FunctionContext): 
        # Decreaase tab count
        self.indent_level -= 1

    # Enter a parse tree produced by SubsetJavaScriptParser#function_return.
    def enterFunction_return(self, ctx:SubsetJavaScriptParser.Function_returnContext):
        self.output.write("%s " % (ctx.RETURN()))
        if(ctx.value()):
            self.output.write("%s\n" % (ctx.value().getText()))
        else:
            pass

    # Enter a parse tree produced by SubsetJavaScriptParser#console_log.
    def enterConsole_log(self, ctx:SubsetJavaScriptParser.Console_logContext):
        valueNodes = ctx.value()
        printedContent = ""
        first = True
        for node in valueNodes:
            if(not first):
                printedContent += ','
            first = False
            printedContent += node.getText()

        self.output.write("print(%s)\n" % (printedContent))

    # Enter a parse tree produced by SubsetJavaScriptParser#while_loop.
    def enterWhile_loop(self, ctx:SubsetJavaScriptParser.While_loopContext):
        self.output.write("while ")
        self.indent_level += 1

    # Exit a parse tree produced by SubsetJavaScriptParser#while_loop.
    def exitWhile_loop(self, ctx:SubsetJavaScriptParser.While_loopContext):
        pass

    # Enter a parse tree produced by SubsetJavaScriptParser#for_loop.
    def enterFor_loop(self, ctx: SubsetJavaScriptParser.For_loopContext):
        self.output.write("for ")
    
    # Enter a parse tree produced by SubsetJavaScriptParser#for_loop_statement.
    def enterFor_loop_statement(self, ctx: SubsetJavaScriptParser.For_loop_statementContext):
        range_start_idx = 0
        variable_str = None
        if ctx.assignment() != None:
            range_start_idx = ctx.assignment().value().getText()
            variable_str = ctx.assignment().VARIABLE().getText()
        else:
            if len(ctx.reassignment().VARIABLE()) > 1:
                range_start_idx = ctx.reassignment().VARIABLE()[1].getText()
            else:
                range_start_idx = ctx.reassignment().value().getText()
            variable_str = ctx.reassignment().VARIABLE()[0].getText()
        self.output.write("%s in range(%s," % (variable_str, range_start_idx))
        self.loop_condition_flag = True
     
    # Exit a parse tree produced by SubsetJavaScriptParser#for_loop_statement.
    def exitFor_loop_statement(self, ctx: SubsetJavaScriptParser.For_loop_statementContext):
        self.loop_condition_flag = False

    # Enter a parse tree produced by SubsetJavaScriptParser#loop_block.
    def enterLoop_block(self,ctx:SubsetJavaScriptParser.Loop_blockContext):
        self.indent_level += 1

    # Exit a parse tree produced by SubsetJavaScriptParser#loop_block.
    def exitLoop_block(self,ctx:SubsetJavaScriptParser.Loop_blockContext):
        self.indent_level -= 1

