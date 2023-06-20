parser grammar PARSER;
options{ tokenVocab = LEXER ;}

start_program: ((flutter_class|class)* main_class (flutter_class|class)*);
flutter_class: decler_class EXTENDS (widget|list );
widget: STATELESSWIDGET CURLYOPEN element* CURLYCLOSE;
element: vareble | constructer | build;
build: OVERRIDE WIDGET BUILD BRACOPEN BUILDCONTEXT CONTEXT BRACCLOSE CURLYOPEN build_inst* CURLYCLOSE;
build_inst: RETURN (inwell |scafold_fun*);
inwell: INKWEL BRACOPEN inkwell_child BRACCLOSE SEMI;
inkwell_child: ontap child*;
ontap: ONTAP COLOMN ONPRESSED COMA;
child: CHILD COLOMN  (
                padding_cull
                |cliprrect
                |container
                |center
                |text
                |image_asset
                |column
                |icon
                |textbutton
                );
                navigator:NAVIGATOR DOT NAME BRACOPEN CONTEXT BRACCLOSE DOT name BRACOPEN name DOT name BRACCLOSE SEMI;
                textbutton:TEXTBUTTON BRACOPEN onpressed child BRACCLOSE COMA;
                onpressed:ONPRESSED COLOMN BRACOPEN BRACCLOSE CURLYOPEN navigator? CURLYCLOSE COMA  ;
                width:WIDTH COLOMN NUMBER COMA (HEIGHT COLOMN NUMBER COMA child)? ;
 icon:ICON BRACOPEN NAME DOT name COMA (SIZE COLOMN NUMBER )? BRACCLOSE COMA;
                column:COLUMN BRACOPEN NAME COLOMN name DOT name COMA CHILDREN COLOMN (BIG WIDGET SMALL)?
                SEQOPEN (padding_cull|(circleAvatar?
                  (sizebox COMA container  COMA)*|
                  (text)?
                  (container  COMA (sizebox COMA)?)*)|((textFromField textFromField)onpressed? child)  ) SEQCLOSE COMA BRACCLOSE COMA;
                textFromField: TEXTFIELD BRACOPEN decoration BRACCLOSE COMA;
                decorationn:DECORATION COLOMN INPUT BRACOPEN labeltext BRACCLOSE  COMA;
                labeltext: LABELTEXT COLOMN CHAR COMA;
                sizebox:SIZEBOX BRACOPEN HEIGHT COLOMN NUMBER COMA BRACCLOSE;
circleAvatar:CIRCLEAVATAR BRACOPEN backgroundcolor child RADIUS COLOMN NUMBER COMA BRACCLOSE COMA;
backgroundcolor:BACKGROUNDCOLOR COLOMN name DOT NAME COMA ;
 text:
                TEXT BRACOPEN (NAME|CHAR) COMA style?  BRACCLOSE COMA
                ;
 style:
                STYLE COLOMN textstyle
                ;
 textstyle:
                TEXTSTYLE BRACOPEN color BRACCLOSE COMA
                ;
 center:
                CENTER BRACOPEN child  BRACCLOSE COMA
                ;
 container:
                CONTAINER BRACOPEN container_child*  BRACCLOSE
                ;
 container_child:
                (HEIGHT COLOMN NUMBER COMA)
                |((ALIGMENT COLOMN NAME DOT NAME COMA child )COMA)
                |(width)
                |(color child? width? )
                |(decoration)
                |onpressed child
                ;
                decoration:(decorationn)|(DECORATION COLOMN BOXDECORATION BRACOPEN BORDER COLOMN NAME DOT name BRACOPEN color BRACCLOSE BRACCLOSE COMA WIDTH COLOMN NUMBER COMA HEIGHT COLOMN NUMBER COMA child );
image_asset:
                NAME DOT NAME BRACOPEN URL COMA  FIT COLOMN NAME DOT NAME COMA BRACCLOSE COMA child
                ;
 cliprrect:
                CLIPRRECT BRACOPEN child COMA BRACCLOSE COMA
                ;
 padding_cull:
                (PADDING BRACOPEN padding_child  BRACCLOSE COMA)
                ;
 padding_child:
                padd child
                ;
 padd:
                PADD COLOMN CONST? NAME DOT NAME BRACOPEN (NUMBER|NAME COLOMN NUMBER DOT NUMBER) BRACCLOSE COMA
                ;
constructer:
                CONST NAME BRACOPEN CURLYOPEN atrbute  CURLYCLOSE  BRACCLOSE SEMI
                ;
atrbute:
                decler_var (COMA decler_var)*
                ;
scafold_fun:
                SCAFOLD BRACOPEN (appbar? body) COMA?  BRACCLOSE SEMI
                ;
body:
                BODY COLOMN (center|padding_cull)
                ;
appbar:
                APPBARR COLOMN APPBAR BRACOPEN  (title|text)   BRACCLOSE COMA
                ;
title:
                TITLE COLOMN text
                 ;
color:
                COLOR COLOMN NAME DOT NAME COMA
                ;


decler_class:
                CLASS (NAME)
                ;
main_class:
                main_dart
                ;
main_dart:
                header_main
                ;
header_main:
                VOID  BRACOPEN BRACCLOSE CURLYOPEN body_element* CURLYCLOSE
                ;
class:
                decler_class (EXTENDS ((NAME)))?  CURLYOPEN class_body* CURLYCLOSE
                ;
list:
                NAME BIG name SMALL CURLYOPEN element*  CURLYCLOSE
                ;
create_function:
                OVERRIDE? decler_fun BRACOPEN (var_param)? BRACCLOSE
                CURLYOPEN body_element* returN? CURLYCLOSE
                ;
var_param:
                decler_var (COMA decler_var)*
                ;
class_body:
                vareble
                |array
                |create_function
                ;
decler_fun:
                (VOID
                |name
                ) NAME
                ;
returN:
                RETURN (
                NAME
                |cull_function
                );
body_element:
                (vareble
                |array
                |cull_function
                |loop
                |condetion
                |print
                |encaps) ;
print:
                PRINT BRACOPEN (
                STRING
                |NAME
                |CHAR
                )
                 BRACCLOSE SEMI
                 ;
array:
                decler_var SEQOPEN (
                NAME
                |NUMBER
                ) SEQCLOSE SEMI
                ;
vareble:
                decler_var  SEMI
                ;
after_var:
                var_equal
                |SIGNALS
                ;
var_equal:
                EQUAL others oper?
                ;
oper:
                OPER side
                ;
others:
                (NAME
                |NUMBER
                |CHAR
                |STRING
                );
decler_var:
                key? ((TYPE|name)? NAME)
                |(REQUIRED THIS DOT NAME)
                ;
key:
                (CONST
                |FINAL
                |LATE
                );
parameter:
                NAME
                |STRING
                |CHAR
                |URL
                |cunstructer
                |cull_function
                ;
argument:
                parameter (COMA parameter)*?
                ;
name:
                NAME
                ;

cunstructer:
                NAME COLOMN ((cull_function)
                |(encaps))
                ;
encaps:
                NAME DOT (name
                |cull_function
                );
cull_function:
                NAME? name BRACOPEN argument? BRACCLOSE SEMI?
                ;
condetion:
                iF
                |iF_Else
                ;
loop:
                for_loop
                |while_loop
                |for_each
                ;
iF:
                IF BRACOPEN (if_condetion ((OR)if_condetion)*) BRACCLOSE CURLYOPEN body_element* CURLYCLOSE
                ;

if_condetion:
                (NOT NAME
                |NAME
                |TRUE
                |FALSE
                |operation
                );
iF_Else:
                iF elsE
                ;
elsE:
                ELSE CURLYOPEN body_element* CURLYCLOSE
                ;
for_loop:
                FOR BRACOPEN vareble operation SEMI operationd  BRACCLOSE
                CURLYOPEN body_element* CURLYCLOSE
                ;
while_loop:
                WHILE BRACOPEN operation BRACCLOSE
                CURLYOPEN body_element* CURLYCLOSE
                ;

for_each:
                 FOR BRACOPEN decler_var IN NAME BRACCLOSE
                 CURLYOPEN body_element* CURLYCLOSE
                 ;
side:
                NAME
                |NUMBER
                ;
operation:
                side COMPARISON side
                ;
operationd:
                (side SIGNAL side)
                |(NAME SIGNALS)
                ;


