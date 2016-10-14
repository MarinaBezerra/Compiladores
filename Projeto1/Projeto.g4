grammar Projeto;

ini : dir*							#Directives				
    ;

dir : '#define' ID INT				#Define
	| '#undef' ID 					#Undefine
	| '#ifdef' ID dir 				#IfDefinedRec
	| '#ifdef' ID 					#IfDefinedBase
	| '#ifndef' ID dir 				#IfNotDefinedRec
	| '#ifndef' ID 					#IfNotDefinedBase
	| '#endif'						#EndIf
    ;

// fragments (are not tokens by itself)
fragment NUMBER: [0-9];
fragment LETTER: [a-zA-Z];	 

// lexer tokens
INT : NUMBER+ ;
ID : LETTER (LETTER | NUMBER)*;

COMMENT : '//' .*? '\n' -> skip;
WS :  [ \t\r\n]+ -> skip;