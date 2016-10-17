grammar Projeto;

ini : (dir | text)*							#Directives				
    ;
	
dir : '#define' ID INT 				#DefineI
	| '#define' ID 					#Define
	| '#undef' ID					#Undefine
	| '#ifdef' ID dir 				#IfDefinedRec
	| '#ifdef' ID 					#IfDefinedBase
	| '#ifndef' ID dir 				#IfNotDefinedRec
	| '#ifndef' ID 					#IfNotDefinedBase
	| '#endif' 						#EndIf
    ;
	
text : ID | INT | SY;

// fragments (are not tokens by itself)
fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
fragment SYMBOL: [\u0021-\u00FF_];

// lexer tokens
INT : DIGIT+;
ID : LETTER (LETTER | DIGIT)*;
SY : SYMBOL+;
WS :  [ \t\r\n]+ -> skip;
