grammar SubsetJavaScript;

// Parser rules below 

program: (line | function)+ EOF;

line: statement ';'? NEWLINE+;

statement: (
		assignment
		| reassignment
		| arithmetic
		| array_operation
		| array_concatenation
		| while_loop
		| for_loop
		| function_return
		| function_call
		| console_log
		| conditional_statement
		| ternary_statement
	);

condition: expression (relop expression)*;

conditional_statement: if_statement (else_if_statement)* (else_statement)?;

if_statement: IF '(' condition ')' conditional_block;

else_if_statement: ELSE_IF '(' condition ')' conditional_block;

else_statement: ELSE conditional_block;

conditional_block: '{' NEWLINE* line+ '}';

ternary_statement: condition '?' statement ':' statement;

value: (
		VARIABLE
		| NUMBER
		| TEXT
		| function_call
		| array_item
		| array_length
		| array
	);

variable_number_text: ( VARIABLE | NUMBER | TEXT);

assignment: (VAR | CONST | LET) VARIABLE '=' value;

reassignment: VARIABLE '=' (VARIABLE | value);

function: (
		FUNCTION VARIABLE? '(' value* ')' '{' NEWLINE* line+ '}' ';'? NEWLINE+
	);

function_call: VARIABLE '(' value* ')';

function_return: RETURN (value | array_concatenation);

op: (ADD_OP | SUB_OP | MUL_OP | DIV_OP);

unary_arithmetic: VARIABLE (UNARY_INCREMENT | UNARY_DECREMENT);

arithmetic: ( (value op value (op value)*) | unary_arithmetic);

relop: (
		LESS_THAN
		| LESS_THAN_EQUAL
		| GREATER_THAN
		| GREATER_THAN_EQUAL
		| EQUALS
		| NOT_EQUALS
	);

expression: (value | arithmetic) relop (value | arithmetic);

array_item:
	VARIABLE '[' (variable_number_text | unary_arithmetic) ']';

array_length: VARIABLE '.' 'length';

array: '[' value? ( '.' value)* ']';

array_operation:
	VARIABLE '.' ('push' | 'pop') '(' (value | array_item)+ ')';

array_concatenation:
	value '.' 'concat' '(' (value | array_item) (
		',' (value | array_item)
	)* ')';

console_log: CONSOLE '.log' '(' value ( ',' value)* ')';

while_loop: WHILE '(' condition ')' loop_block;

for_loop: FOR '(' for_loop_statement ')' loop_block;

for_loop_statement: (assignment | reassignment) ';' condition ';' arithmetic;

loop_block: '{'
	NEWLINE*
	(
		line+
		| (BREAK NEWLINE)
	)
	'}';

// Lexer rules

fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment DIGIT: [0-9];
FUNCTION: 'function';
RETURN: 'return';
WHILE: 'while';
FOR: 'for';
VAR: 'var';
CONST: 'const';
LET: 'let';
IF: 'if';
ELSE: 'else';
ELSE_IF: 'else if';
LESS_THAN: '<';
LESS_THAN_EQUAL: '<=';
GREATER_THAN: '>';
GREATER_THAN_EQUAL: '>=';
EQUALS: '=';
NOT_EQUALS: '!=';
CONSOLE: 'console';
LOG: 'log';
BREAK: 'break';
ADD_OP: '+';
SUB_OP: '-';
MUL_OP: '*';
DIV_OP: '/';
UNARY_INCREMENT: '++';
UNARY_DECREMENT: '--';

VARIABLE: (LOWERCASE | UPPERCASE) (
		LOWERCASE
		| UPPERCASE
		| DIGIT
		| '_'
	)*;

NUMBER: DIGIT+ ([.,] DIGIT+)?;

WHITESPACE: (' ' | '\t')+ -> skip;

NEWLINE: ('\r'? '\n' | '\r')+;

TEXT: ('"' | '\'') ~['"]+ ('\'' | '"');