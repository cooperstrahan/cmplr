grammar microGrammar;

empty : ;

OPERATOR : ( ':=' | '+' | '-' | '*' | '/' | '=' | '!=' 
         | '<' | '>' | '(' | ')' | ';' | ',' | '<=' | '>=' ) ;

KEYWORD :
	( 'PROGRAM' | 'BEGIN' | 'END' | 'FUNCTION' | 'READ'
	| 'WRITE' | 'IF' | 'ELSE' | 'ENDIF' | 'WHILE' 
	| 'ENDWHILE' | 'CONTINUE' | 'BREAK' | 'RETURN'
	| 'INT' | 'VOID' | 'STRING' | 'FLOAT' ) ;


WS : [ \t\n\r]+ -> skip ;

IDENTIFIER : [a-zA-Z] [a-zA-Z0-9]* ;

INTLITERAL : [0-9]+ ;

FLOATLITERAL : [0-9]* '.' [0-9]+ ;

STRINGLITERAL : '"' .*? '"' ;

COMMENT : '--' .*? '\n' ;

