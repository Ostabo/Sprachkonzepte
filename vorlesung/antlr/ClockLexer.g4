// ClockLexer.g4
lexer grammar ClockLexer;

Time: (Hour (Seperator Minute (Day | Night)) | (Midnight | Noon)) | (MidnightBig | NoonBig);

Hour: ('12'|'11'|'10'|[1-9]);
Seperator: (':');
Minute: ([0-5][0-9]);
Day: 'a.m.';
Night: 'p.m.';
Midnight: 'midnight';
Noon: 'noon';
MidnightBig: 'Midnight';
NoonBig: 'Noon';

WS: [ \t\r\n]+ -> skip;