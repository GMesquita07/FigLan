grammar Figlan;

program         : (statement)* EOF ;

statement
    : varDecl ';'
    | assignment ';'
    | drawStmt ';'
    | eraseStmt ';'
    | pauseStmt ';'
    | printStmt ';'
    | readStmt ';'
    | loopStmt
    ;

varDecl         : type ID (',' ID)* ;

assignment
    : ID '=' expression
    | ID '=' 'new' type ;

drawStmt        : 'draw' '(' ID ')' ;

eraseStmt       : 'erase' '(' ID ')' ;

pauseStmt       : 'pause' '(' expression ')' ;

printStmt       : ('print' | 'println') '(' expression ')' ;

readStmt        : ID '=' 'read' '(' ')' ;

loopStmt        : 'loop' ID 'in' expression '..' expression block ;

block           : '{' (statement)* '}' ;

expression
    : expression op=('*'|'/') expression      # MulDivExpr
    | expression op=('+'|'-') expression      # AddSubExpr
    | expression op=('%'|'//') expression     # ModDivExpr
    | '(' expression ')'                      # ParensExpr
    | functionCall                            # FunctionExpr
    | literal                                 # LiteralExpr
    | ID                                      # IdExpr
    ;

functionCall    : ID '(' (expression (',' expression)*)? ')' ;

literal
    : INT
    | REAL
    | STRING
    ;

type            : 'integer' | 'real' | 'text' | 'point' | 'line' | 'circle' ;

ID              : [a-zA-Z_][a-zA-Z0-9_]* ;
INT             : [0-9]+ ;
REAL            : [0-9]+ '.' [0-9]+ ;
STRING          : '"' (~["\\] | '\\' .)* '"' ;

COMMENT         : '//' ~[\r\n]* -> skip ;
WS              : [ \t\r\n]+ -> skip ;
