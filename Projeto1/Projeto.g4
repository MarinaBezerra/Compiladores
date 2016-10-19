grammar Projeto;

pgm : (dir | cod | WS)*						#Program				
    ;
	
dir : '#define' WS ID WS INT WS 			#DefineBin
	| '#define' WS ID WS 					#DefineUn
	| '#undef' WS ID WS						#Undefine
	| '#ifdef' WS ID WS pgm WS '#endif' WS	#IfDefined
	| '#ifndef' WS ID WS pgm WS '#endif' WS	#IfNotDefined
    ;
	
cod : ID 									#TextID
	| INT 									#TextNumber
	| SY 									#TextSymbol
	;

// fragments (are not tokens by itself)
fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
fragment SYMBOL: [\u0021-\u00FF_];

// lexer tokens
INT : DIGIT+;
ID : LETTER (LETTER | DIGIT)*;
SY : SYMBOL+;
WS :  [ \t\r\n]+;
