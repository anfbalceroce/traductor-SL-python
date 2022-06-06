grammar SL;

start : ('programa' ID)? header* main sub*;
header : 'const' const+ | 'tipos' tipo_p+ | 'var' var+ ;
var : ID (',' ID)* ':' tipo (';' | /* epsilon */)  ;
const : ID '=' expresion (';' | /* epsilon */)  ;
tipo_p : ID ':' tipo (';' | /* epsilon */)  ;

main : 'inicio' sentencia* 'fin' ;
sentencia : call SEP?
          | assingment SEP?
          | if SEP?
          | while SEP?
          | do_while SEP?
          | switch SEP?
          | for SEP? ;

call :  ID '(' params ')' ;
assingment : ID id_extend '=' (expresion  | '{' m_expresion '}')  ;
if :  'si' '(' expresion ')' '{' sentencia+ sinosi* sino? '}';
sinosi : 'sino' 'si' '(' expresion ')' sentencia+ ;
while : 'mientras' '(' expresion ')' '{' sentencia+ '}' ;
do_while : 'repetir' sentencia+ 'hasta' '(' expresion ')' ;
switch : 'eval' '{' 'caso' '(' expresion ')' sentencia+ case* sino? '}' ;
case : 'caso' '(' expresion ')' sentencia+ ;
sino : 'sino' sentencia+ ;
for : 'desde' ID '=' num_expresion 'hasta' num_expresion ('paso' num_expresion)? '{' sentencia+ '}' ;


m_expresion : m_term m_expresion_p  | /* epsilon */  ;
m_expresion_p : ',' m_term m_expresion_p  | /* epsilon */  ;
m_term : m_factor  ;
m_factor : '{' m_expresion '}'  | '.' '.' '.'  | expresion  ;
expresion : logic_term logic_expresion_p  ;
logic_expresion_p : OP_OR logic_term logic_expresion_p  | /* epsilon */  ;
logic_term : logic_factor logic_term_p  ;
logic_term_p : OP_AND logic_factor logic_term_p  | /* epsilon */  ;
logic_factor : logic_element  | OP_NOT logic_element  ;
logic_element : bool  | relation_expresion  ;
bool : 'TRUE'  | 'FALSE'  | 'SI'  | 'NO' ;
relation_expresion : relation_term relation_expresion_p  ;
relation_expresion_p : OP_REL relation_term relation_expresion_p | /* epsilon */  ;
relation_term : num_expresion  ;
num_expresion : num_term num_expresion_p  ;
num_expresion_p : OP_ADD num_term num_expresion_p  | OP_SUB num_term num_expresion_p  | /* epsilon */  ;
num_term : num_factor num_term_p  ;
num_term_p : OP_PROD num_factor num_term_p  | OP_DIV num_factor num_term_p  | OP_MOD num_factor num_term_p  | /* epsilon */  ;
num_factor : num_factor_p  | OP_ADD num_factor_p  | OP_SUB num_factor_p  ;
num_factor_p : base_element num_factor_pp  ;
num_factor_pp : OP_EXP base_element num_factor_pp  | /* epsilon */  ;
base_element : STRING  | NUM  | '(' expresion ')'  | calls  | ID id_extend;

sub : 'subrutina' ID '(' args ')' (header* submain | 'retorna' tipo header* submainr)  ;
args : ref ID (',' ID)* ':' tipo (';' ref ID (',' ID)* ':' tipo)*  | /* epsilon */  ;
ref : 'ref'  | /* epsilon */  ;

submain : 'inicio' sentencia+ 'fin' ;
submainr: 'inicio' sentencia+ 'retorna' '(' expresion ')' 'fin' ;

calls :  ID '(' params ')' ;
tipo : tipos  | type_vector  | type_matrix  | register  ;
tipos : 'cadena'  | 'logico'  | 'numerico'  | ID  ;
type_vector : 'vector' '[' v_len  ;
v_len : num_expresion ']' tipo  | '*' ']' tipo  ;
type_matrix : 'matriz' '[' dimention_list  ;
dimention_list : '*' next_dimention ']' tipo  | dimention next_dimention ']' tipo  ;
next_dimention : ',' next_dimention_p  | /* epsilon */  ;
next_dimention_p : '*' next_dimention  | dimention next_dimention  ;
dimention : ID  | NUM  ;

register : 'registro' '{' var+ '}'  ;

id_extend : ids_options+  | /* epsilon */  ;
ids_options : '[' num_expresion matrix ']'  | '.' ID  ;

params : expresion next_param  | /* epsilon */  ;
next_param : ',' expresion next_param  | /* epsilon */  ;
matrix : ',' num_expresion matrix  | /* epsilon */  ;

OP_OR : 'or' ;
OP_AND : 'and' ;
OP_NOT : 'not' ;
OP_REL : '<' | '>' | '<=' | '>=' | '==' | '<>' ;
OP_ADD : '+' ;
OP_SUB : '-' ;
OP_PROD : '*' ;
OP_DIV : '/' ;
OP_MOD : '%' ;
OP_EXP : '^' ;
ID : 	[a-zA-Z\u00F1\u00D1_] [a-zA-Z\u00F1\u00D1_0-9]* ;
NUM : [0-9]+('.'[0-9])?[0-9]*([eE][+-]?[0-9])?[0-9]* ;
STRING : '"' ~["\n]* '"' | '\'' ~['\n]* '\'' | ('“'|'”') ~['\n]* ('“'|'”') | '‘' ~['\n]* '’' ;
SEP : ';' ;
COMMENT1 : '//' ~[\n]* -> skip;
COMMENT2 :  '/*' .*? '*/' -> skip;
ESP : [ \t\r\n]+ -> skip ;