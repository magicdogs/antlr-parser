// Define a grammar called Func

grammar Func;

parse
 : start EOF
 ;

start
 : content*
 ;

content
 : if_stat
 | assignment
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;


assignment
 : VAR ID ASSIGN expr SCOL
 ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : OPAR expr CPAR stat_block
 ;

stat_block
 : OBRACE RET ret CBRACE
 | OBRACE if_stat CBRACE
 ;

ret
 : ID OPAR r CPAR SCOL
// | STR SCOL
 | STRING_LITERAL SCOL
// | NUM SCOL
 ;

r
 : ID
 ;

/*
blacklist_rules(data) != '1'
credit_limit(data) > 0
data["riskRuleScore"] < 496
*/

expr
 :  ID key op=(EQ | NEQ) atom              #exprEQNEQ
 |  ID key op=(LTEQ | GTEQ | LT | GT) atom #relationalExpr
 |  ID key                                 #assignmentExpr
 ;
//expr
// : expr POW<assoc=right> expr           #powExpr
// | MINUS expr                           #unaryMinusExpr
// | NOT expr                             #notExpr
// | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
// | expr op=(PLUS | MINUS) expr          #additiveExpr
// | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
// | expr op=(EQ | NEQ) expr              #equalityExpr
// | expr AND expr                        #andExpr
// | expr OR expr                         #orExpr
// | atom                                 #atomExpr
// ;
key
 : OPAR ID CPAR
 | LSQU STRING_LITERAL RSQU
 ;

atom
 : OPAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom
 | STRING_LITERAL #stringLITERAL
 ;

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';

SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
LSQU : '[' ;
RSQU : ']' ;

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
VAR : 'var';
//STR : [\u4E00-\u9FA5]+ ;
//NUM : [\u0030-\u0039]+ ;
STRING_LITERAL
 : '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"'
 | '\'' (~('\'' | '\\' | '\r' | '\n') | '\\' ('\'' | '\\'))* '\''
 ;
RET : 'return';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 |  '\'' (~["\r\n] | '\'\'')* '\''
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : .
 ;
