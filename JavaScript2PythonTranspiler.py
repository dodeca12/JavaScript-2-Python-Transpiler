from SubsetJavaScriptListener import SubsetJavaScriptListener
from SubsetJavaScriptParser import SubsetJavaScriptParser


class JavaScript2PythonTranspiler(SubsetJavaScriptListener):
    def __init__(self, output):
        self.output = output
        self.indent_level = 0
        self.ternary_statement_flag = False
        self.if_statement = False
        self.while_loop_flag = False
        self.bool_condition = False
        self.return_flag = False
        self.console_log_statement = False

    # Enter a parse tree produced by SubsetJavaScriptParser#line.
    def enterLine(self, ctx: SubsetJavaScriptParser.LineContext):
        if not self.ternary_statement_flag:
            self.output.write("%s" % ("\t"*self.indent_level))

    # Exit a parse tree produced by SubsetJavaScriptParser#line.
    def exitLine(self, ctx: SubsetJavaScriptParser.LineContext):
        self.output.write("\n")

    # Enter a parse tree produced by SubsetJavaScriptParser#arithmetic
    def enterArithmetic(self, ctx: SubsetJavaScriptParser.ArithmeticContext):
        if not self.ternary_statement_flag and "<class 'SubsetJavaScriptParser.SubsetJavaScriptParser.Unary_arithmeticContext'>" != str(ctx.children[0].__class__):
            self.output.write(ctx.getText())

    # Enter a parse tree produced by SubsetJavaScriptParser#unary_arithmetic.
    def enterUnary_arithmetic(self, ctx: SubsetJavaScriptParser.Unary_arithmeticContext):
        if not self.ternary_statement_flag:
            if ctx.UNARY_INCREMENT() != None:
                self.output.write("%s += 1" % (ctx.VARIABLE()))
            elif ctx.UNARY_DECREMENT() != None:
                self.output.write("%s -= 1" % (ctx.VARIABLE()))

    # Enter a parse tree produced by SubsetJavaScriptParser#expression.
    def enterExpression(self, ctx: SubsetJavaScriptParser.ExpressionContext):
        if self.bool_condition:
            for i in range(len(ctx.children)-1):
                self.output.write(ctx.children[i].getText())

    # Enter a parse tree produced by SubsetJavaScriptParser#expression.
    def exitExpression(self, ctx: SubsetJavaScriptParser.ExpressionContext):
        if not self.ternary_statement_flag and not self.bool_condition:
            text = ""
            for index in range(0, len(ctx.children)):
                if hasattr(ctx.children[index], 'text'):
                    text += ctx.children[index].text
                else:
                    text += ctx.children[index].getText()
            if not isinstance(ctx.parentCtx, SubsetJavaScriptParser.Ternary_statementContext):
                self.output.write(text)

    # Enter a parse tree produced by SubsetJavaScriptParser#value.
    def enterValue(self, ctx: SubsetJavaScriptParser.ValueContext):
        if ctx.array_length() != None:
            ctx.text = f"len({ctx.array_length().VARIABLE()})"

        if isinstance(ctx.parentCtx, SubsetJavaScriptParser.Return_statementContext):
            if ctx.getText() == "true" or ctx.getText() == "false":
                _temp = "True" if ctx.getText() == "true" else "False"
                self.output.write("%s" % (_temp))
            else:
                self.output.write("%s" % (ctx.getText()))

        if isinstance(ctx.parentCtx, SubsetJavaScriptParser.Array_operationContext):
            self.output.write("%s" % (ctx.getText()))

    # Enter a parse tree produced by SubsetJavaScriptParser#condition.
    def enterCondition(self, ctx: SubsetJavaScriptParser.ConditionContext):
        if len(ctx.children[0].value()) > 1 and (ctx.children[0].value()[1].getText() == "true" or ctx.children[0].value()[1].getText() == "false"):
            self.bool_condition = True
            pass
        if isinstance(ctx.parentCtx, SubsetJavaScriptParser.For_loop_statementContext):
            range_end_idx = ctx.expression()[0].value()[1].getText()
            self.output.write(" %s):\n" % (range_end_idx))

    # Exit a parse tree produced by SubsetJavaScriptParser#condition.
    def exitCondition(self, ctx: SubsetJavaScriptParser.ConditionContext):
        if self.bool_condition:
            self.bool_condition = False
            pass
        elif isinstance(ctx.parentCtx, SubsetJavaScriptParser.Ternary_statementContext):
            pass
        elif isinstance(ctx.parentCtx, SubsetJavaScriptParser.For_loop_statementContext):
            pass
        elif isinstance(ctx.parentCtx, SubsetJavaScriptParser.While_loopContext):
            self.output.write(":\n")
            pass
        else:
            self.output.write(":\n")

    # Exit a parse tree produced by SubsetJavaScriptParser#value.
    def exitValue(self, ctx: SubsetJavaScriptParser.ValueContext):
        if ctx.array_length():
            ctx.text = f"len({ctx.array_length().VARIABLE()})"

    # Enter a parse tree produced by SubsetJavaScriptParser#if_statement.
    def enterIf_statement(self, ctx: SubsetJavaScriptParser.If_statementContext):
        self.if_statement = True
        self.output.write("%s " % (ctx.IF()))

    # Enter a parse tree produced by SubsetJavaScriptParser#if_statement.
    def exitIf_statement(self, ctx: SubsetJavaScriptParser.If_statementContext):
        self.if_statement = False

    # Enter a parse tree produced by SubsetJavaScriptParser#else_if_statement.
    def enterElse_if_statement(self, ctx: SubsetJavaScriptParser.Else_if_statementContext):
        self.if_statement = True
        self.output.write("%s%s " % ('\t' * self.indent_level, "elif"))

    # Enter a parse tree produced by SubsetJavaScriptParser#else_if_statement.
    def exitElse_if_statement(self, ctx: SubsetJavaScriptParser.Else_if_statementContext):
        self.if_statement = False

    # Enter a parse tree produced by SubsetJavaScriptParser#else_statement.
    def enterElse_statement(self, ctx: SubsetJavaScriptParser.Else_statementContext):
        self.output.write("%s%s: \n" % ('\t' * self.indent_level, ctx.ELSE()))

    # Enter a parse tree produced by SubsetJavaScriptParser#conditional_block.
    def enterConditional_block(self, ctx: SubsetJavaScriptParser.Conditional_blockContext):
        self.indent_level += 1

    # Exit a parse tree produced by SubsetJavaScriptParser#conditional_block.
    def exitConditional_block(self, ctx: SubsetJavaScriptParser.Conditional_blockContext):
        self.indent_level -= 1

    # Enter a parse tree produced by SubsetJavaScriptParser#ternary_statement.
    def enterTernary_statement(self, ctx: SubsetJavaScriptParser.Ternary_statementContext):
        self.ternary_statement_flag = True
        condition = ctx.children[0].getText()
        statement1 = self.processStatement(ctx.statement()[0])
        statement2 = self.processStatement(ctx.statement()[1])

        self.output.write("%s if %s else %s" %
                          (statement1, condition, statement2))

    # Process a statement to remove the ternary statement flag
    def processStatement(self, statement):
        if isinstance(statement.getChild(0), SubsetJavaScriptParser.Console_logContext):
            valueNodes = statement.getChild(0).value()
            printedContent = ""
            first = True
            for node in valueNodes:
                if not first:
                    printedContent += ','
                first = False
                printedContent += node.getText()

            return "print(%s)" % printedContent

        return statement.getText()

    # Exit a parse tree produced by SubsetJavaScriptParser#ternary_statement.
    def exitTernary_statement(self, ctx: SubsetJavaScriptParser.Ternary_statementContext):
        self.ternary_statement_flag = False
        self.output.write("\n")

    # Enter a parse tree produced by SubsetJavaScriptParser#assignment.
    def enterAssignment(self, ctx: SubsetJavaScriptParser.AssignmentContext):
        if not self.ternary_statement_flag:
            has_function_call = ctx.value() and len(
                ctx.children) == 4 and "<class 'SubsetJavaScriptParser.SubsetJavaScriptParser.Function_callContext'>" == str(ctx.children[3].children[0].__class__)
            has_boolean = ctx.value() and (ctx.value().getText() ==
                                           "true" or ctx.value().getText() == "false")
            has_array_length = ctx.value() and "<class 'SubsetJavaScriptParser.SubsetJavaScriptParser.Array_lengthContext'>" == str(
                ctx.children[-1].children[-1].__class__)
            has_number_or_text = ctx.value() and len(ctx.children) == 4

            if has_function_call:
                self.output.write("%s = " %
                                  (ctx.VARIABLE()))
                pass
            elif has_boolean:
                _temp = "True" if ctx.value().getText() == "true" else "False"
                self.output.write("%s = %s" %
                                  (ctx.VARIABLE().getText(), _temp))
                pass
            elif has_array_length:
                self.output.write("%s = %s" % (
                    ctx.VARIABLE().getText(), f"len({ctx.value().array_length().VARIABLE()})"))
                pass
            elif has_number_or_text:
                self.output.write("%s = %s" %
                                  (ctx.VARIABLE(), ctx.children[3].getText()))
                pass
            else:
                self.output.write("%s = " %
                                  (ctx.VARIABLE()))

    # Enter a parse tree produced by SubsetJavaScriptParser#assignment.
    def enterReassignment(self, ctx: SubsetJavaScriptParser.AssignmentContext):
        if not self.ternary_statement_flag:
            # if len(ctx.VARIABLE()) > 1:
            #     self.output.write("%s = %s" %
            #                       (ctx.VARIABLE()[0], ctx.VARIABLE()[1]))
            # else:
            #     self.output.write("%s = %s" %
            #                       (ctx.VARIABLE()[0], ctx.value().getText()))
            has_function_call = ctx.value() and len(
                ctx.children) == 3 and "<class 'SubsetJavaScriptParser.SubsetJavaScriptParser.Function_callContext'>" == str(ctx.children[2].children[0].__class__)
            has_boolean = ctx.value() and (ctx.value().getText() ==
                                           "true" or ctx.value().getText() == "false")
            has_array_length = ctx.value() and ctx.value().array_length()
            has_number_or_text = ctx.value() and len(ctx.children) == 3

            if has_function_call:
                self.output.write("%s = " %
                                  (ctx.VARIABLE()))
                pass
            elif has_boolean:
                _temp = "True" if ctx.value().getText() == "true" else "False"
                self.output.write("%s = %s" %
                                  (ctx.VARIABLE().getText(), _temp))
                pass
            elif has_array_length:
                self.output.write("%s = %s" % (
                    ctx.VARIABLE().getText(), f"len({ctx.value().array_length().VARIABLE()})"))
                pass
            elif has_number_or_text:
                self.output.write("%s = %s" %
                                  (ctx.VARIABLE(), ctx.children[2].getText()))
                pass
            else:
                self.output.write("%s = " %
                                  (ctx.VARIABLE()))

    # Enter a parse tree produced by SubsetJavaScriptParser#array_operation.
    def enterArray_operation(self, ctx: SubsetJavaScriptParser.Array_operationContext):
        self.output.write("%s" % (ctx.VARIABLE()))
        if ctx.PUSH():
            self.output.write(".append(")
        else:
            self.output.write(".pop(")

    # Exit a parse tree produced by SubsetJavaScriptParser#array_operation.
    def exitArray_operation(self, ctx: SubsetJavaScriptParser.Array_operationContext):
        self.output.write(")")

    # Enter a parse tree produced by SubsetJavaScriptParser#Array_concatenation.
    def enterArray_concatenation(self, ctx: SubsetJavaScriptParser.Array_concatenationContext):
        self.output.write("%s.extend(" % (ctx.VARIABLE()))

    # Exit a parse tree produced by SubsetJavaScriptParser#Array_concatenation.
    def exitArray_concatenation(self, ctx: SubsetJavaScriptParser.Array_concatenationContext):
        self.output.write(")")

    # Enter a parse tree produced by SubsetJavaScriptParser#array_concat_params.
    def enterArray_concat_param(self, ctx: SubsetJavaScriptParser.Array_concat_paramContext):
        self.output.write("%s" % (ctx.getText()))

    # Enter a parse tree produced by SubsetJavaScriptParser#function.
    def enterFunction(self, ctx: SubsetJavaScriptParser.FunctionContext):
        self.output.write("def %s(" % (ctx.VARIABLE()))

    # Exit a parse tree produced by SubsetJavaScriptParser#function.
    def exitFunction(self, ctx: SubsetJavaScriptParser.FunctionContext):
        pass

    # Enter a parse tree produced by SubsetJavaScriptParser#function_block.
    def enterFunction_block(self, ctx: SubsetJavaScriptParser.Function_blockContext):
        self.indent_level += 1

    # Enter a parse tree produced by SubsetJavaScriptParser#function_block.
    def exitFunction_block(self, ctx: SubsetJavaScriptParser.Function_blockContext):
        self.indent_level -= 1

    # Enter a parse tree produced by SubsetJavaScriptParser#parameter_list.
    def enterParameter_list(self, ctx: SubsetJavaScriptParser.Parameter_listContext):
        self.output.write("%s" % (ctx.getText()))
        # End the function definition
        self.output.write("):\n")

    # Enter a parse tree produced by SubsetJavaScriptParser#function_call.
    def enterFunction_call(self, ctx: SubsetJavaScriptParser.Function_callContext):
        if not self.console_log_statement:
            self.output.write(ctx.getText())
            if self.if_statement:
                self.output.write(":\n")

    # Enter a parse tree produced by SubsetJavaScriptParser#return_statement.
    def enterReturn_statement(self, ctx: SubsetJavaScriptParser.Return_statementContext):
        self.output.write("%s " % (ctx.RETURN()))
        self.return_flag = True

    # Exit a parse tree produced by SubsetJavaScriptParser#return_statement.
    def exitReturn_statement(self, ctx: SubsetJavaScriptParser.Return_statementContext):
        self.return_flag = False

    # Enter a parse tree produced by SubsetJavaScriptParser#console_log.
    def enterConsole_log(self, ctx: SubsetJavaScriptParser.Console_logContext):
        self.console_log_statement = True
        if ctx.arithmetic():
            self.output.write("print(")

        elif not self.ternary_statement_flag:
            valueNodes = ctx.value()
            printedContent = ""
            first = True
            for node in valueNodes:
                if (not first):
                    printedContent += ','
                first = False
                printedContent += node.getText()
            self.output.write("print(%s)" % (printedContent))

    # Exit a parse tree produced by SubsetJavaScriptParser#console_log.
    def exitConsole_log(self, ctx: SubsetJavaScriptParser.Console_logContext):
        self.console_log_statement = False
        if ctx.arithmetic():
            self.output.write(")")
            pass

    # Enter a parse tree produced by SubsetJavaScriptParser#statement.
    def enterStatement(self, ctx: SubsetJavaScriptParser.StatementContext):
        if isinstance(ctx.parentCtx, SubsetJavaScriptParser.Ternary_statementContext):
            self.ternary_statement_flag = True

    # Enter a parse tree produced by SubsetJavaScriptParser#while_loop.
    def enterWhile_loop(self, ctx: SubsetJavaScriptParser.While_loopContext):
        self.while_loop_flag = True
        self.output.write("while ")

    # Exit a parse tree produced by SubsetJavaScriptParser#while_loop.
    def exitWhile_loop(self, ctx: SubsetJavaScriptParser.While_loopContext):
        self.while_loop_flag = False

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
        self.ternary_statement_flag = True

    # Exit a parse tree produced by SubsetJavaScriptParser#for_loop_statement.
    def exitFor_loop_statement(self, ctx: SubsetJavaScriptParser.For_loop_statementContext):
        self.ternary_statement_flag = False

    # Enter a parse tree produced by SubsetJavaScriptParser#loop_block.
    def enterLoop_block(self, ctx: SubsetJavaScriptParser.Loop_blockContext):
        self.indent_level += 1

    # Exit a parse tree produced by SubsetJavaScriptParser#loop_block.
    def exitLoop_block(self, ctx: SubsetJavaScriptParser.Loop_blockContext):
        self.indent_level -= 1

    # Enter a parse tree produced by SubsetJavaScriptParser#break_statement.
    def enterBreak_statement(self, ctx: SubsetJavaScriptParser.Break_statementContext):
        self.output.write("%s" % (ctx.BREAK()))

    # Enter a parse tree produced by SubsetJavaScriptParser#bool.
    def enterBool(self, ctx: SubsetJavaScriptParser.BoolContext):
        if self.while_loop_flag or self.if_statement and not self.return_flag:
            _temp = "True" if ctx.getText() == "true" else "False"
            self.output.write("%s:\n" % (_temp))
