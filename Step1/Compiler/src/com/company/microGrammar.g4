grammar microGrammar;

empty : ;

SET : ':=' ;

ADD : '+' ;

SUB : '-' ;

MUL : '*' ;

DIV : '/' ;

EQ : '=' ;

NEQ : '!=' ;

LT : '<' ;

GT : '>' ;

LP : '(' ;

RP : ')' ;

SC : ';' ;

CM : ',' ;

LTQ : '<=' ;

GTQ : '>=' ;



WS : [ \t\n\r]+ -> skip ;

IDENTIFIER : [a-zA-Z] [a-zA-Z0-9]* ;

INTLITERAL : [0-9]+ ;

FLOATLITERAL : [0-9]* '.' [0-9]+ ;

STRINGLITERAL : '"' .*? '"' ;

COMMENT : '--' .*? '\n' ;

PROGRAM : 'PROGRAM' ;

BEGIN : 'BEGIN' ;

END : 'END' ;

FUNCTION : 'FUNCTION' ;

READ : 'READ' ;

WRITE : 'WRITE' ;

IF : 'IF' ;

ELSE : 'ELSE' ;

ENDIF : 'ENDIF' ;

WHILE : 'WHILE' ;

ENDWHILE : 'ENDWHILE' ;

CONTINUE : 'CONTINUE' ;

BREAK : 'BREAK' ;

RETURN : 'RETURN' ;

INT : 'INT' ;

VOID : 'VOID' ;

STRING : 'STRING' ;

FLOAT : 'FLOAT' ;



