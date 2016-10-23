/**
 * Define a grammar called Hello
 */
grammar Exp;
eval : (equation)*;

/* */  
equation : op atomExp atomExp  # evalEquation   
          |  op atomExp equation # evalEquations
          ; 
          
atomExp : number | var | equation;

var : ID;
ID : [a-z]+ ;
number : NUM ;
NUM : [1-9]+(.[0-9]+)?;

op : MULT | DIV | ADD | MIN | EQU ;

MULT : '*' ;
DIV : '/' ;
ADD : '+' ;
MIN : '-' ;
EQU : '=' ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

