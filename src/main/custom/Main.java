package testJFlex;

import java.io.IOException;
import java.io.StringReader;

public class Main {

	public static void main(String[] args) {
		MyLexer lexer = new MyLexer(new StringReader("Le petit chat est mort"));
		try {
			lexer.yylex();
		} catch(IOException e) {
			 e.printStackTrace();
		} finally {
			System.out.format("counted %d 'a' and %d 'e'", lexer.nbA, lexer.nbE);
		}
	}

}
