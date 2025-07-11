grammar Figlan;

//—  REGRAS DE ALTO NÍVEL  ——————————————————————————
program      : statement* EOF ;

statement
    : varDecl ';'
    | assignStmt ';'
    | showStmt ';'
    | hideStmt ';'
    | pauseStmt ';'
    | printStmt ';'
    | readStmt ';'
    | forStmt
    ;

// declaração de variáveis (opcionalmente inicializadas)
varDecl      : type varInit (',' varInit)* ;
varInit      : ID ('=' expression)? ;

// atribuição (=) ou acumulação (+=)
assignStmt   : ID ( '=' | '+=' ) expression ;

// mostrar / ocultar
showStmt     : 'show' exprList ;
hideStmt     : 'hide' ( 'all' | exprList ) ;

// pausa em ms
pauseStmt    : 'pause' expression ;

// print / println sem parênteses
printStmt    : ('print' | 'println') printArgs ;
printArgs    : expression (',' expression)* ;

// leitura para variável:  id = read "texto"
readStmt     : ID '=' readExpr ;
readExpr     : 'read' STRING? ;

// ciclo  for  …  to  …  do  … end
forStmt      : 'for' (type? ID '=') expression 'to' expression 'do'
               statement* 'end' ;

//—  EXPRESSÕES  ————————————————————————————————
expression
    : expression op=('*'|'/') expression      # MulDiv
    | expression op=('+'|'-') expression      # AddSub
    | expression op=('%'|'//') expression     # ModDiv
    | pointLiteral                            # PointLit
    | lineLiteral                             # LineLit
    | circleLiteral                           # CircleLit
    | functionCall                            # FunCall
    | '(' expression ')'                      # Parens
    | literal                                 # LiteralExpr
    | ID                                      # Id
    ;

exprList     : expression (',' expression)* ;

// chamadas genéricas (text(10), integer(t), new circle(...))
functionCall : ('new')? ID '(' (expression (',' expression)*)? ')' ;

// literais gráficos
pointLiteral   : '[' expression ',' expression ']' ;
lineLiteral    : pointLiteral '--' pointLiteral ;
circleLiteral  : pointLiteral '|' expression ;

//—  LITERAIS  ————————————————————————————————
literal      : INT | REAL | STRING ;

//—  TIPOS  ————————————————————————————————
type         : 'integer' | 'real' | 'text'
             | 'point' | 'line' | 'circle' | 'figure' ;

//—  LEXER  ————————————————————————————————
ID           : [a-zA-Z_][a-zA-Z0-9_]* ;
INT          : [0-9]+ ;
REAL         : [0-9]+ '.' [0-9]+ ;
STRING       : '"' ( ~["\\] | '\\' . )* '"' ;

// comentários
COMMENT_SLASH : '//' ~[\r\n]*            -> skip ;
COMMENT_HASH  : '#'  ~[\r\n]*            -> skip ;
COMMENT_BLOCK : '##' .*? '##'            -> skip ;

// espaço em branco
WS           : [ \t\r\n]+                -> skip ;
