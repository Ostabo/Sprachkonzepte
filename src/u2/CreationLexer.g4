// CreationLexer.g4
lexer grammar CreationLexer;

KEYWORD : 'new' ;

NAME : [A-Za-z]+ ;
NUM : [0-9]+ [lL]?;

COMMA : ',' ;

PAR_OPEN : '(' ;
PAR_CLOSE : ')' ;

WS : [ \t\r\n]+ ;

InvalidChar: . ;