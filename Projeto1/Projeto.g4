grammar Projeto;

pgm : (dir | cod)*					#Program				
    ;
	
dir : '#define' ID INT 				#DefineBin
	| '#define' ID 					#DefineUn
	| '#undef' ID					#Undefine
	| '#ifdef' ID pgm '#endif' 		#IfDefined
	| '#ifndef' ID pgm '#endif'		#IfNotDefined
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
