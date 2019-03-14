grammar Luscombe;

program : location* ('INVENTORY' inventory)? location* ;

inventory: '{' item* '}';

item: WORD+ '{' use* '}' ;

use: WORD+ (',' WORD+)* '{' command* '}';

location : WORD+ '{' properties '}' ;

properties
     : counters? actions? objects? intro?
     | actions? counters? objects? intro?
     | objects? counters? actions? intro?
     | counters? objects? actions? intro?
     | actions? objects? counters? intro?
     | objects? actions? counters? intro?
     | objects? actions? intro? counters?
     | actions? objects? intro? counters?
     | intro? objects? actions? counters?
     | objects? intro? actions? counters?
     | actions? intro? objects? counters?
     | intro? actions? objects? counters?
     | intro? counters? objects? actions?
     | counters? intro? objects? actions?
     | objects? intro? counters? actions?
     | intro? objects? counters? actions?
     | counters? objects? intro? actions?
     | objects? counters? intro? actions?
     | actions? counters? intro? objects?
     | counters? actions? intro? objects?
     | intro? actions? counters? objects?
     | actions? intro? counters? objects?
     | counters? intro? actions? objects?
     | intro? counters? actions? objects? ;

counters : 'COUNTERS' '{' command* '}';

declarations : WORD+ OPERATOR NUMBER
             | WORD+ OPERATOR WORD+;

command: declarations
       | PRINT
       | goto
       | add
       | drop
       | conditional ;

add : 'ADD' '{' WORD+ '}' ;

drop : 'DROP' '{' WORD+ '}' ;

goto : 'GOTO' '{' WORD+ '}' ;

conditional : if else? ;

if : 'IF' (comparision|WORD+) '{' command* '}' ;

else : 'ELSE' '{' command* '}';

comparision : WORD+ COMPAREOP NUMBER
            | WORD+ COMPAREOP WORD+;

intro : 'INTRO' '{' command* '}' ;

actions: 'ACTIONS' '{' action* '}' ;

action: WORD+ '{' command* '}' ;

objects: 'OBJECTS' '{' item* '}' ;

WS : [ \r\t\n]+ -> skip ;
WORD : [a-zA-Z][a-zA-Z0-9]* ;
NUMBER : [0-9]+ ;
OPERATOR : [+=\-/*] ;
COMPAREOP : ('=='|'<'|'>'|'>='|'<=') ;
PRINT : 'PRINT' ' '* '{' .*? '}' ;
COMMENT : '//' .*? [\r\n] -> skip ;