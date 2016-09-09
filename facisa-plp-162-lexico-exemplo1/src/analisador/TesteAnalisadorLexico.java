package analisador;

import java.io.IOException;
import java.io.StringReader;

public class TesteAnalisadorLexico {

	public static void main(String[] args) throws IOException {

		String expr = "for(int i = 0; i < 5; i++) { }";

		Lexer lexer = new Lexer(new StringReader(expr));

		String resultado = "";

		while (true) {

			Token token = lexer.yylex();

			if (token == null) {
				System.out.println(resultado);
				return;
			}

			switch (token) {
				case PALAVRA: resultado = resultado + "<Palavra_Reservada> " + lexer.lexeme + "\n";
				break;
				
			case OPERADOR_ARITMETICO:
				resultado = resultado + "<Operador_Aritm�tico> " + lexer.lexeme + "\n";
				break;
				
			case OPERADOR_LOGICO:
				resultado = resultado + "<Operador_L�gico> " + lexer.lexeme + "\n";
				break;
				
			case OP_ATRIBUICAO:
				resultado = resultado + "<Operador_Atribui��o> " + lexer.lexeme + "\n";
				break;
				
			case OP_RELACIONAL:
				resultado = resultado + "<Operador_Relacional> " + lexer.lexeme + "\n";
				break;
				
			case OP_BOOLEANO:
				resultado = resultado + "<Operador_Booleano> " + lexer.lexeme + "\n";
				break;
				
			case SEPARADOR:
				resultado = resultado + "<Separador> " + lexer.lexeme + "\n";
				break;
				
			case ESPECIAL:
				resultado = resultado + "<Caracter_Especial> " + lexer.lexeme + "\n";
				break;
				
			case COMENTARIO:
				resultado = resultado + "<Comentario> " + lexer.lexeme + "\n";
				break;
				
			case ERROR:
				resultado = resultado + "<Erro, s�mbolo n�o reconhecido> \n";
				break;
				
			case ID:
				resultado = resultado + "<ID> " + lexer.lexeme + "\n";
				break;
				
			case NUMERO:
				resultado = resultado + "<Numero> " + lexer.lexeme + "\n";
				break;
				
			default:
				resultado = resultado + "<" + lexer.lexeme + ">";
			}
		}
	}
}
