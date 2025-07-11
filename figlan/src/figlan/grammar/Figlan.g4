grammar Figlan;

/*───────────────────────── PARSER ─────────────────────────*/

// ——— Topo
program : statement* EOF ;

// ——— Instruções
// NOTA: 'readStmt' foi removido. A atribuição 'var = read ...' é tratada por 'assignStmt'.
statement
    : ( varDecl
      | assignStmt
      | showStmt
      | hideStmt
      | pauseStmt
      | printStmt
      ) ';'
    | forStmt
    ;

// ——— Declaração
varDecl : type varInit (',' varInit)* ;
varInit : ID ('=' expression)? ;

// ——— Atribuição (cobre 'a = 10', 'a += 1', e 'a = read "..."')
assignStmt : ID (op=('=' | '+=') ) expression ;

// ——— show / hide: para desenhar ou esconder figuras [cite: 9, 15, 16]
showStmt : SHOW exprList ;
hideStmt : HIDE ( ALL | exprList ) ;

// ——— Pausa
pauseStmt : PAUSE expression ;

// ——— print / println: para escrita no standard output [cite: 12]
printStmt : (PRINT | PRINTLN) ( '(' printArgs ')' | printArgs ) ;
printArgs   : expression (','? expression)* ; // A vírgula é opcional entre argumentos

// ——— Ciclo for: para iteração num intervalo de inteiros [cite: 17]
forStmt
    : FOR (type? ID '=') expression TO expression DO
      statement*
      END
    ;

/*──────────────────── EXPRESSÕES ───────────────────*/

expression
    : type '(' expression ')'                  # TypeConversion // Converte tipos, ex: integer("10") 
    | newExpr                                  # NewObj         // Cria novos objetos, ex: new point() 
    | readExpr                                 # ReadExpression // Lê do input, ex: read "prompt" 
    | expression op=('*'|'/'|'%'|'//') expression  # MulDivMod      // Operadores com mesma precedência [cite: 10]
    | expression op=('+'|'-') expression       # AddSub         // Add/Sub e concatenação de texto [cite: 11]
    | pointLiteral                             # PointLit
    | lineLiteral                              # LineLit
    | circleLiteral                            # CircleLit
    | '(' expression ')'                       # Parens
    | literal                                  # LiteralExpr
    | ID                                       # Id
    ;

// ——— Criação de Objetos
// NOTA: Alterado de 'identifier' para 'type', pois só se podem criar instâncias de tipos.
newExpr: NEW type ('(' (expression (',' expression)*)? ')')? ;

// ——— Leitura
readExpr: READ expression? ;

// ——— Lista de Expressões (usada por 'show' e 'hide')
exprList : expression (',' expression)* ;

/*─────── Literais Gráficos ──────────*/
pointLiteral  : LBRACK expression ',' expression RBRACK ;
lineLiteral   : pointLiteral DASHDASH pointLiteral ;
circleLiteral : pointLiteral PIPE expression ;

/*─────── Literais Simples ───────────*/
literal : INT | REAL | STRING ;

/*─────── Tipos ──────────────────────*/
// NOTA: Usa os tokens do Lexer em vez de literais de string.
type
    : INTEGER_KW | REAL_KW | TEXT_KW
    | POINT_KW   | LINE_KW | CIRCLE_KW
    | FIGURE_KW
    ;


/*───────────────────────── LEXER ─────────────────────────*/

// ——— Palavras-chave (todas definidas explicitamente)
FOR     : 'for' ;
TO      : 'to' ;
DO      : 'do' ;
END     : 'end' ;
NEW     : 'new' ;
SHOW    : 'show' ;
HIDE    : 'hide' ;
ALL     : 'all' ;
PAUSE   : 'pause' ;
PRINT   : 'print' ;
PRINTLN : 'println' ;
READ    : 'read' ;

// Palavras-chave de Tipos [cite: 4, 6]
INTEGER_KW : 'integer' ;
REAL_KW    : 'real' ;
TEXT_KW    : 'text' ;
POINT_KW   : 'point' ;
LINE_KW    : 'line' ;
CIRCLE_KW  : 'circle' ;
FIGURE_KW  : 'figure' ;

// ——— Símbolos
LBRACK    : '[' ;
RBRACK    : ']' ;
PIPE      : '|' ;
DASHDASH  : '--' ;

// ——— Tokens de Base
// NOTA: A regra ID vem DEPOIS de todas as palavras-chave.
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
INT     : [0-9]+ ;
REAL    : [0-9]+ '.' [0-9]+ ;
STRING  : '"' ( ~["\\] | '\\' . )* '"' ;

// ——— Comentários (a serem ignorados)
COMMENT_SLASH : '//' ~[\r\n]* -> skip ;
COMMENT_HASH  : '#'  ~[\r\n]* -> skip ;
COMMENT_BLOCK : '##' .*? '##' -> skip ;

// ——— Espaço em Branco (a ser ignorado)
WS : [ \t\r\n]+ -> skip ;