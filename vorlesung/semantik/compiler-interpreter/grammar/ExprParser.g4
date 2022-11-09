// ExprParser.g4
parser grammar ExprParser;

options { tokenVocab=ExprLexer; }

start
    : expr EOF
    ;

expr
    : multExpr
    | expr (PLUS | MINUS) multExpr
    ;

multExpr
    : primary
    | multExpr (MUL | DIV) primary
    ;

primary
    : LPAREN expr RPAREN
    | value
    ;

value
    : (PLUS | MINUS)? Number
    ;

