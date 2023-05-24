#!/bin/bash

curl --remote-name https://www.antlr.org/download/antlr-4.11.1-complete.jar
sudo mv antlr4.11.1-complete.jar /usr/local/lib

if [[ "$OSTYPE" == "darwin"* ]]; then
    echo 'export CLASSPATH=".:/usr/local/lib/antlr-4.11.1-complete.jar:${CLASSPATH}"' >> ~/.zprofile
    echo 'alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.11.-complete.jar:${CLASSPATH}" org.antlr.v4.Tool'' >> ~/.zshrc
    'alias grun='java org.antlr.v4.gui.TestRig'' >> ~/.zshrc
    source ~/.zshrc
else
    echo 'export CLASSPATH=".:/usr/local/lib/antlr-4.11.1-complete.jar:${CLASSPATH}"' >> ~/.profile
    echo 'alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.11.-complete.jar:${CLASSPATH}" org.antlr.v4.Tool'' >> ~/.bashrc
    'alias grun='java org.antlr.v4.gui.TestRig'' >> ~/.bashrc
    source ~/.bashrc
fi