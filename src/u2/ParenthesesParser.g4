// ParenthesesParser.g4
parser grammar ParenthesesParser;
options { tokenVocab=ParenthesesLexer; }

expr: expr OPERATOR expr | roundExpr | squareExpr | curlyExpr | atom;

roundExpr: ROUND_OPEN expr ROUND_CLOSE;
squareExpr: SQUARE_OPEN expr SQUARE_CLOSE;
curlyExpr: CURLY_OPEN expr CURLY_CLOSE;

atom: VARIABLE | NUMBER;