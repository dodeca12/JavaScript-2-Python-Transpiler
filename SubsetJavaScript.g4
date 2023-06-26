grammar SubsetJavaScript;

// Parser rules below 

program: (line | function)* EOF;

line: statement (';'? NEWLINE+)?;

statement: (
		assignment
		| reassignment
		| arithmetic
		| array_operation
		| array_concatenation
		| while_loop
		| for_loop
		| function_call
		| function
		| return_statement
		| console_log
		| conditional_statement
		| ternary_statement
		| break_statement
	);

condition: expression (relop expression)*;

conditional_statement:
	if_statement (else_if_statement)* (else_statement)?;

if_statement:
	IF '(' (bool | condition | function_call) ')' conditional_block;

else_if_statement:
	ELSE_IF '(' (bool | condition | function_call) ')' conditional_block;

else_statement: ELSE conditional_block;

conditional_block: NEWLINE* '{' NEWLINE* line+ '}';

ternary_statement: expression '?' statement ':' statement;

value: (
		VARIABLE
		| NUMBER
		| TEXT
		| bool
		| function_call
		| array_item
		| array_length
		| array
	);

variable_number_text: ( VARIABLE | NUMBER | TEXT);

assignment: (VAR | CONST | LET) VARIABLE '=' (value | arithmetic);

reassignment: VARIABLE '=' (value | arithmetic);

function:
	FUNCTION VARIABLE '(' parameter_list ')' function_block;

function_block: '{' NEWLINE* line* '}';

return_statement:
	RETURN (value | arithmetic | array_concatenation)?;

parameter_list: VARIABLE? (',' VARIABLE)*;

function_call: VARIABLE '(' VARIABLE? (',' VARIABLE)* ')';

op: (ADD_OP | SUB_OP | MUL_OP | DIV_OP | MOD_OP | EXP_OP);

unary_arithmetic: VARIABLE (UNARY_INCREMENT | UNARY_DECREMENT);

arithmetic: ((value op value (op value)*) | unary_arithmetic);

relop: (
		LESS_THAN
		| LESS_THAN_EQUAL
		| GREATER_THAN
		| GREATER_THAN_EQUAL
		| EQUALS
		| NOT_EQUALS
	);

bool: BOOLEAN;

expression: (value | arithmetic) relop (value | arithmetic);

array_item:
	VARIABLE '[' (variable_number_text | unary_arithmetic) ']';

array_length: VARIABLE '.' LENGTH;

array: '[' array_elements? ']';

array_elements: value (',' value)*;

array_operation: VARIABLE '.' (PUSH | POP) '(' value? ')';

array_concatenation:
	VARIABLE '.' 'concat' '(' array_concat_param ')';

array_concat_param: (value ( ',' value)*);

console_log:
	CONSOLE '.log' '(' ((value ( ',' value)*) | arithmetic) ')';

while_loop: WHILE '(' (bool | condition) ')' loop_block;

for_loop: FOR '(' for_loop_statement ')' loop_block;

for_loop_statement: (assignment | reassignment) ';' condition ';' arithmetic;

loop_block: '{' NEWLINE* (line+) '}' NEWLINE*;

break_statement: BREAK;


// Lexer rules

fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment DIGIT: [0-9];
BOOLEAN: 'true' | 'false';
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
PUSH: 'push';
POP: 'pop';
LENGTH: 'length';
LESS_THAN: '<';
LESS_THAN_EQUAL: '<=';
GREATER_THAN: '>';
GREATER_THAN_EQUAL: '>=';
EQUALS: '==';
NOT_EQUALS: '!=';
CONSOLE: 'console';
LOG: 'log';
BREAK: 'break';
ADD_OP: '+';
SUB_OP: '-';
MUL_OP: '*';
DIV_OP: '/';
MOD_OP: '%';
EXP_OP: '**';
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