grammar Projeto;

pgm : (dir | cod)*					#Directives				
    ;
	
dir : '#define' ID INT 				#DefineBin
	| '#define' ID 					#DefineUn
	| '#undef' ID					#Undefine
	| '#ifdef' ID dir 				#IfDefinedRec
	| '#ifdef' ID 					#IfDefinedBase
	| '#ifndef' ID dir 				#IfNotDefinedRec
	| '#ifndef' ID 					#IfNotDefinedBase
	| '#endif' 						#EndIf
    ;
	
cod : ID 							#TextID
	| INT 							#TextNumber
	| SY 							#TextSymbol
	;

// fragments (are not tokens by itself)
fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
fragment SYMBOL: [\u0021-\u00FF_];

// lexer tokens
INT : DIGIT+;
ID : LETTER (LETTER | DIGIT)*;
SY : SYMBOL+;
WS :  [ \t\r\n]+ -> skip;
