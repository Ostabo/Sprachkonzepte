// CreationParser.g4
parser grammar CreationParser;
options { tokenVocab=CreationLexer; }

start : expr EOF;

expr : KEYWORD WS NAME PAR_OPEN params PAR_CLOSE ;

params : (param (COMMA WS? param)*)? ;

param : (expr | NAME | NUM) ;