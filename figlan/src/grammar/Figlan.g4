grammar Figlan;

/*───────────────────────── PARSER ─────────────────────────*/

// ——— topo
program : statement* EOF ;

// ——— instruções
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

// ——— declaração
varDecl : type varInit (',' varInit)* ;
varInit : ID ('=' expression)? ;

// ——— atribuição
assignStmt : ID ( '=' | '+=' ) expression ;

// ——— show / hide
showStmt : 'show' exprList ;
hideStmt : 'hide' ( 'all' | exprList ) ;

// ——— pausa
pauseStmt : 'pause' expression ;

// ——— print / println  (parênteses opcionais; separador vírgula OU espaço)
printStmt
    : ('print' | 'println')
      ( '(' printArgs ')'           // println("Total:", n)
      |   printArgs                 // println "Total:" n
      )
    ;
printArgs   : expression (argumentSep expression)* ;
argumentSep : ',' |  ;              // vírgula ou nada (= espaço)

// ——— read  (3 variantes em instrução)
readStmt
    : ID '=' readExpr               // n = read "msg"
    | 'read' '(' ID ')'             // read(n)
    | 'read' ID                     // read n
    ;

// ——— ciclo for
forStmt
    : 'for' (type? ID '=') expression 'to' expression 'do'
      statement* 'end'
    ;

/*──────────────────── EXPRESSÕES ───────────────────*/
expression
    : newExpr                                # NewObj
    | readExpr                               # ReadExpression   //  « read … » agora é parte da gramática de expressões
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

// new <identifier>  [ ( arg1, … ) ]
newExpr
    : 'new' identifier ( '(' (expression (',' expression)*)? ')' )?
    ;

// read  "texto"?   ou   read  expressão
readExpr
    : 'read' (expression)?                   // read            | read "msg" | read t+": "
    ;

// chamadas a funções/construtores
functionCall
    : identifier '(' (expression (',' expression)*)? ')'
    ;

// lista de expressões (show p,c  etc.)
exprList : expression (',' expression)* ;

/*─────── literais gráficos ──────────*/
pointLiteral  : '[' expression ',' expression ']' ;
lineLiteral   : pointLiteral DASHDASH pointLiteral ;
circleLiteral : pointLiteral PIPE expression ;

/*─────── literais simples ───────────*/
literal : INT | REAL | STRING ;

/*─────── tipos ──────────────────────*/
type
    : 'integer' | 'real' | 'text'
    | 'point'   | 'line' | 'circle'
    | 'figure'
    ;

/*─────── identificador flexível ─────*/
identifier
    : ID
    | 'point' | 'line' | 'circle'
    | 'integer' | 'real' | 'text'
    | 'read' | 'print' | 'println'
    ;

/*───────────────────────── LEXER ─────────────────────────*/

// símbolos dos literais gráficos
LBRACK   : '[' ;
RBRACK   : ']' ;
PIPE     : '|' ;
DASHDASH : '--' ;

// tokens básicos
ID     : [a-zA-Z_][a-zA-Z0-9_]* ;
INT    : [0-9]+ ;
REAL   : [0-9]+ '.' [0-9]+ ;
STRING : '"' ( ~["\\] | '\\' . )* '"' ;

// comentários
COMMENT_SLASH : '//' ~[\r\n]* -> skip ;
COMMENT_HASH  : '#'  ~[\r\n]* -> skip ;
COMMENT_BLOCK : '##' .*? '##' -> skip ;

// espaço em branco
WS : [ \t\r\n]+ -> skip ;
