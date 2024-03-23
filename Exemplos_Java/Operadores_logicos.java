package exemplos;

public class Operadores_logicos {

	public static void main(String[] args) {

		// Exemplos de operadores lógicos

		// Exemplo 1: && e

		int a = 5;
		System.out.println("Exemplo 1: " + (a > 3 && a < 10)); // retorna verdadeiro porque 5 é maior que 3 E 5 é menor
																// que 10

		// Exemplo 2: || Ou

		int b = 5;
		System.out.println("Exemplo 2: " + (b > 3 || b < 4)); // retorna verdadeiro porque uma das condições é
																// verdadeira (5 é maior que 3, mas 5 não é menor que 4)

		// Exemplo 3: ! NOT
		
		int x = 5;
	    System.out.println(!(( x > 3 && x < 10))); // retorna falso porque ! (not) é usado para reverter o resultado
	}

}
