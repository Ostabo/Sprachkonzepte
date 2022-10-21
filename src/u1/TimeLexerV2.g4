// TimeLexerV2.g4
lexer grammar TimeLexerV2;

TIME : HOUR SEPERATOR MINUTE (AM | PM)
     | TWELVE SEPERATOR '00' (AM | PM)
     | TWELVE 'noon'
     | TWELVE 'midnight'
     | 'Noon'
     | 'Midnight';

TWELVE : '12';

HOUR : '1'[0-1]|[0-9];
MINUTE : [0-5][0-9];
SEPERATOR : ':';

AM : 'a.m.' ;
PM : 'p.m.' ;

WS: [ \t\r\n]+ -> skip;