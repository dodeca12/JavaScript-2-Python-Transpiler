antlr: SubsetJavaScript.g4
	java -Xmx500M -cp "/usr/local/lib/antlr-4.11.1-complete.jar:${CLASSPATH}" org.antlr.v4.Tool -Dlanguage=Python3 SubsetJavaScript.g4

java: SubsetJavaScript.g4
	make clean
	java -Xmx500M -cp "/usr/local/lib/antlr-4.11.1-complete.jar:${CLASSPATH}" org.antlr.v4.Tool SubsetJavaScript.g4
	javac SubsetJavaScript*.java

clean:
	rm -f *.interp *.tokens SubsetJavaScriptParser.py SubsetJavaScriptListener.py SubsetJavaScriptLexer.py *.java *.class