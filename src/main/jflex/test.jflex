package testJFlex;
%%
%class MyLexer
%integer
%unicode

%{
public static int nbA = 0, nbE = 0;  
%}

// definitions
a = a|A
e = e|E

%%

{a} 	{nbA++;}
{e} 	{nbE++;}
.		{ }