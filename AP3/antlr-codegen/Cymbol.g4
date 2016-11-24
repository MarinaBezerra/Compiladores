grammar Cymbol;



file: (functionDecl | varDecl)+;

varDecl: type ID ('=' expr)? ';';

type: 'int' | 'void';

functionDecl: type ID '(' formalParameters? ')' block;

formalParameters: formalParameter (',' formalParameter)*;

formalParameter: type ID;

block: '{' stat* '}';

stat:   varDecl                                #VarDecStat
    |   'if' expr 'then' block ('else' block)? #IfThenElseStat
    |   'return' expr? ';'                     #ReturnStat
    |   expr '=' expr ';'                      #AssignStat
    |   expr ';'                               #FunctionCallStat
    ;

expr:   ID '(' exprList? ')'            #FunCallExpr
    |   '!' expr                        #NotExpr
    |   expr ('<'|'>'|'<='|'>=') expr   #ComparisonExpr
    |   expr ('*'|'/') expr             #MulDivExpr
    |   expr ('+'|'-') expr             #AddSubExpr
    |   expr '==' expr                  #EqExpr
    |   ID                              #VarIdExpr
    |   INT                             #NameExpr
    |   '(' expr ')'                    #ParenExpr
    ;

exprList : expr (',' expr)* ;



ID : LETTER (LETTER | [0-9])* ;
fragment LETTER : [a-zA-Z] ;
INT : [0-9]+ ;
WS : [ \t\n\r]+ -> skip ;
SL_COMMENT : '//' .*? '\n' -> skip;