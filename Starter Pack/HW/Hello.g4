/**
 * Define a grammar called Hello
 */
grammar Hello;
r  :  (f | i | oi | oh | WS | ID)*  ;         // match keyword hello followed by an identifier
f : FLOAT ;
i: INT ;
oi: OCTINT ;
oh: OCTHEX ;
ID : [a-z]+ ;             // match lower-case identifiers

INT : ('-')?[1-9][0-9]*;

FLOAT : ('-')?('0' | [0-9]*)'.'[0-9]'E'[0-9]* ;

OCTINT : [0-7]+ ;

OCTHEX :  ('0x'[A-F0-9]* | '0X'[A-F0-9]*); 

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

