// Time.g4
lexer grammar Time;

Time12H: Default|Noon|Midnight;

fragment Default: ('12:00'|(([1-9]|'1'[01])':'[0-5][0-9]))WS[ap]'.m.';
fragment Noon: 'Noon'|'12 noon';
fragment Midnight: 'Midnight'|'12 midnight';

WS: [ \t\r\n]+ -> skip;