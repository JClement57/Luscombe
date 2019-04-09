grammar Luscombe;

program : location* ('INVENTORY' inventory)? location* ;

inventory: '{' item* '}';

item: name '{' use* '}' ;

use: name (',' name)* '{' command* '}';

location : name '{' properties* '}' ;

properties: counters
          | actions
          | objects
          | intro ;

counters : 'COUNTERS' '{' declarations* '}';

declarations : name OPERATOR NUMBER
             | name OPERATOR name;

command: declarations
       | PRINT
       | gotolocation
       | add
       | drop
       | conditional ;

add : 'ADD' '{' name '}' ;

drop : 'DROP' '{' name '}' ;

gotolocation : 'GOTO' '{' name '}' ;

conditional : ifblock elseblock? ;

ifblock : 'IF' (comparision|name) '{' command* '}' ;

elseblock : 'ELSE' '{' command* '}';

comparision : name COMPAREOP NUMBER
            | name COMPAREOP name;

intro : 'INTRO' '{' command* '}' ;

actions: 'ACTIONS' '{' action* '}' ;

action: name (',' name)* '{' command* '}' ;

objects: 'OBJECTS' '{' item* '}' ;

name: WORD+ ;

WS : [ \r\t\n]+ -> skip ;
WORD : [a-zA-Z][a-zA-Z0-9]* ;
NUMBER : [0-9]+ ;
OPERATOR : [+=\-/*] ;
COMPAREOP : ('=='|'<'|'>'|'>='|'<=') ;
PRINT : 'PRINT' ' '* '{' .*? '}' ;
COMMENT : '//' .*? [\r\n] -> skip ;