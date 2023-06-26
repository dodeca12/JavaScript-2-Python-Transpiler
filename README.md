# JavaScript 2 Python Transpiler

## :building_construction: :warning: :construction: Project is currently a work in progress :warning:

This project is an exploration in using [ANTLR4](https://antlr.org) grammars to create a simple transpiler that converts a subset of JavaScript lexical grammar to valid Python3 grammar.

## Prerequisites

- Java
- ANTLR4
- Python3
- make
- venv (optional)
- Node.js (optional, to run and verify JavaScript programs that will be transpiled to Python)

## ANTLR4 setup

ANTLR needs a bit of setup, run the following commands:

```bash
# Install ANTLR4
curl --remote-name https://www.antlr.org/download/antlr-4.11.1-complete.jar
sudo mv antlr4.11.1-complete.jar /usr/local/lib

if [[ "$OSTYPE" == "darwin"* ]]; then
    echo 'export CLASSPATH=".:/usr/local/lib/antlr-4.11.1-complete.jar:${CLASSPATH}"' >> ~/.zprofile
    echo 'alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.11.-complete.jar:${CLASSPATH}" org.antlr.v4.Tool'' >> ~/.zshrc
    echo 'alias grun='java org.antlr.v4.gui.TestRig'' >> ~/.zshrc
    source ~/.zshrc
else
    echo 'export CLASSPATH=".:/usr/local/lib/antlr-4.11.1-complete.jar:${CLASSPATH}"' >> ~/.profile
    echo 'alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.11.-complete.jar:${CLASSPATH}" org.antlr.v4.Tool'' >> ~/.bashrc
    echo 'alias grun='java org.antlr.v4.gui.TestRig'' >> ~/.bashrc
    source ~/.bashrc
fi
```

Alternatively, you can just run [antlr-setup.sh](antlr-setup.sh).

### Current Progress

- [x] `console.log()` to `print()` ([`hello-world.js`](./examples/hello-world.js))
- [x] variable assignment supporting `let`, `var` and `const` ([`variable-assignment.js`](./examples/variable-assignment.js))
- [x] variable reassignment ([`variable-reassignment.js`](./examples/variable-reassignment.js))
- [x] arithmetic (supporting addition `+`, subtraction `-`, multiplication `*`, division `/`, modulus `%`, exponentiation `**`, increment `++`, decrement `--`) ([`arithmetic.js`](./examples/arithmetic.js))
- [x] array declaration, access, concatenation, push, pop, and length ([`array.js`](./examples/array.js))
- [x] while loop ([`while-loop.js`](./examples/while-loop.js))