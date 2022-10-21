// ParenthesesLexer.g4
lexer grammar ParenthesesLexer;

ROUND_OPEN : '(';
ROUND_CLOSE : ')';
SQUARE_OPEN : '[';
SQUARE_CLOSE : ']';
CURLY_OPEN : '{';
CURLY_CLOSE : '}';

VARIABLE : [a-z];

NUMBER : [1-9][0-9]*;

OPERATOR: [+\-*/];

WS : [ \t\r\n]+ -> skip;