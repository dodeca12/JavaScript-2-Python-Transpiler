import sys
from antlr4 import *
from SubsetJavaScriptLexer import SubsetJavaScriptLexer
from SubsetJavaScriptParser import SubsetJavaScriptParser
from JavaScript2PythonTranspiler import JavaScript2PythonTranspiler


def main(argv):
    input = FileStream(argv[1])
    lexer = SubsetJavaScriptLexer(input)
    stream = CommonTokenStream(lexer)
    parser = SubsetJavaScriptParser(stream)
    tree = parser.program()

    with open("output.py","w") as output:
        JavaScript2PythonListen = JavaScript2PythonTranspiler(output)
        walker = ParseTreeWalker()
        walker.walk(JavaScript2PythonListen, tree)
        
    output.close()      

if __name__ == '__main__':
    main(sys.argv)