// TimeLexer.g4
lexer grammar TimeLexer;

Time12H: Default|Noon|Midnight;

fragment Default: ('12:00'|(([1-9]|'1'[01])':'[0-5][0-9]))WS(AM|PM);
fragment Noon: 'Noon'|'12 noon';
fragment Midnight: 'Midnight'|'12 midnight';

AM: 'a.m.'|'AM'|'am';
PM: 'p.m.'|'PM'|'pm';
WS: [ \t\r\n]+ -> skip;