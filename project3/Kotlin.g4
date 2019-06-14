/* Kotlin Basic Syntax */
grammar Kotlin;

 
//Parser rules
prog: packageList? importList* declaration*;
packageList: 'package' Id ('.' Id)+;
importList: 'import' Id ('.' Id)+ '.' '*';
declaration: function | simpleStmt;
function: 'fun' Id '(' paramList? ')' (':' Type)? functionBody?;
functionBody: compoundStmt | '=' expression;
identifier: Id;
paramList: identifier ':' Type (',' identifier ':' Type)+;
compoundStmt: '{' stmtList? '}';
stmtList: stmt+;
stmt: declaration | forStmt | callStmt | expression;
simpleStmt: ('var' | 'val')? Id (':' Type)?  ('=' expression)?;
forStmt: 'for' '(' (variable | multiVariable) 'in' expression ')' compoundStmt?;
ifExpression: 'if' '(' declaration ')' (compoundStmt | expression | ';')? | 'if' '(' expression ')' compoundStmt? expression? ';'? 'else' (compoundStmt | ';');
callStmt: call;
call: Id '(' argList? ')';
argList: expression ((',' expression)+ | ('+' expression)+);
variable: Id (':' Type)?;
multiVariable: '(' variable (',' variable)* ')';
expression: functionCall | opExpression | rangeExpression | elvis | stringLiteral | ifExpression | returnExpression | Id | num | Type;
functionCall: Id ('(' (argList | expression) ')' | '.' Id);
opExpression: (num | Id) (opOperator (num | Id | Type))+;
opOperator: '+' | '-' | '*' | '/' | '%' | 'is';
num: INT | REAL;
elvis: '?' | ':' | '!';
rangeExpression: rangeOperation | downTo;
rangeOperation: num ('..' num)* ('step' num)*;
downTo: num ('downTo' num)? ('step' num)*;
returnExpression: 'return' expression;
stringLiteral: '"' (stringContent | stringExpression)* '"';
stringContent: strText | strRef;
stringExpression: '${' expression '}';
strText: ~('"' | '$')+ | '$';
strRef: '$' Id;

 
//Lexer rules
Type: 'Int' | 'Unit' | 'Any' | 'Long' | 'String' | 'Double' | 'Boolean';
Id: [A-Za-z]+[0-9]*;
INT: [0-9]+;
REAL: [0-9]+'.'[0-9]+; 
WhiteSpace : [ \t]+ -> skip;
Newline : ( '\r' '\n'? | '\n' ) -> skip;
