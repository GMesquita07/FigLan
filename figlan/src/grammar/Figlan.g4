grammar Figlan;

/*───────────────────────── PARSER ─────────────────────────*/

// —— topo
program : statement* EOF ;

// —— instruções
statement
    : varDecl   ';'
    | assignStmt ';'
    | showStmt  ';'
    | hideStmt  ';'
    | pauseStmt ';'
    | printStmt ';'
    | readStmt  ';'
    | forStmt
    ;

// —— declaração
varDecl : type varInit (',' varInit)* ;
varInit : ID ('=' expression)? ;

// —— atribuição
assignStmt : ID ( '=' | '+=' ) expression ;

// —— show / hide
showStmt : 'show' exprList ;
hideStmt : 'hide' ( 'all' | exprList ) ;

// —— pausa
pauseStmt : 'pause' expression ;

// —— print / println   (parênteses opcionais)
printStmt
    : ('print' | 'println')
      ( '(' printArgs ')'            // ex.: println("msg", n)
      |   printArgs                  // ex.: println "msg", n
      )
    ;
printArgs : expression (',' expression)* ;

// —— read  (três variantes)
readStmt
    : ID '=' readExpr                // a = read "txt"
    | 'read' '(' ID ')'              // read(a);
    | 'read' ID                      // read a;
    ;
readExpr : 'read' STRING? ;

// —— ciclo for
forStmt
    : 'for' (type? ID '=') expression 'to' expression 'do'
      statement* 'end'
    ;

/*──────────── EXPRESSÕES ───────────*/
expression
    : newExpr                                # NewObj
    | functionCall                           # FunCall
    | expression op=('*'|'/') expression     # MulDiv
    | expression op=('+'|'-') expression     # AddSub
    | expression op=('%'|'//') expression    # ModDiv
    | pointLiteral                           # PointLit
    | lineLiteral                            # LineLit
    | circleLiteral                          # CircleLit
    | '(' expression ')'                     # Parens
    | literal                                # LiteralExpr
    | ID                                     # Id
    ;

newExpr
    : 'new' identifier ( '(' (expression (',' expression)*)? ')' )?
    ;

functionCall
    : identifier '(' (expression (',' expression)*)? ')'
    ;

exprList : expression (',' expression)* ;

/*────────── literais gráficos ─────────*/
pointLiteral  : '[' expression ',' expression ']' ;
lineLiteral   : pointLiteral DASHDASH pointLiteral ;
circleLiteral : pointLiteral PIPE expression ;

/*────────── literais simples ──────────*/
literal : INT | REAL | STRING ;

/*────────── tipos ─────────────────────*/
type
    : 'integer' | 'real' | 'text'
    | 'point' | 'line' | 'circle'
    | 'figure'
    ;

/*────────── identificador flexível ────*/
identifier
    : ID
    | 'point' | 'line' | 'circle'
    | 'integer' | 'real' | 'text'
    | 'read' | 'print' | 'println'   // se usados como funções
    ;

/*───────────────────────── LEXER ─────────────────────────*/

// símbolos literais
LBRACK   : '[' ;
RBRACK   : ']' ;
PIPE     : '|' ;
DASHDASH : '--' ;

// tokens base
ID     : [a-zA-Z_][a-zA-Z0-9_]* ;
INT    : [0-9]+ ;
REAL   : [0-9]+ '.' [0-9]+ ;
STRING : '"' ( ~["\\] | '\\' . )* '"' ;

// comentários
COMMENT_SLASH : '//' ~[\r\n]* -> skip ;
COMMENT_HASH  : '#'  ~[\r\n]* -> skip ;
COMMENT_BLOCK : '##' .*? '##' -> skip ;

// espaço
WS : [ \t\r\n]+ -> skip ;
