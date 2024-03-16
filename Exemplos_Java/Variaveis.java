package exemplos;

public class Variaveis {

	public static void main(String[] args) {
		
		/*
		 * String- armazena texto, como "Olá". Os valores da string estão entre aspas duplas
           int- armazena inteiros (números inteiros), sem decimais, como 123 ou -123
           float- armazena números de ponto flutuante, com decimais, como 19,99 ou -19,99
           char- armazena caracteres únicos, como 'a' ou 'B'. Os valores de caracteres estão entre aspas simples
           boolean- armazena valores com dois estados: verdadeiro ou falso */
		
		// sintaxe: tipo nomeDaVariável = valor;
		
		// Exemplos:
		
		// String 
		
		String carro = "fiat Mobi"; // variáveis do tipo String são sempre acompanhadas de aspas duplas
		System.out.println("O meu carro é um "+ carro);
		
		// números inteiros
		
		int idade = 24; 
		System.out.println("Eu tenho "+ idade + " anos");
		
		// números flutuantes
		
		float preco = 10.90f; // números flutuantes devem sempre ser acompanhados de f no final
		System.out.println("O valor do refrigerante é de: "+ preco);
		
		// char caracteres únicos
		
		char umaLetra = 'J';
		System.out.println("O meu nome começa com a letra " + umaLetra);
		
		// boolean verdadeiro ou falso
		
		boolean souChata = true;
		System.out.println("Eu sou chata? " + souChata);
		
		// imprimindo variáveis multiplas:
		
		// em vez de escrever:
		
		int x = 5;
		int y = 6;
		int z = 50;
		System.out.println(x + y + z);
		
		// você pode escrever
		
		int a = 5, b = 6, c = 50;
		System.out.println(a + b + c);
		
	// Você também pode atribuir o mesmo valor a múltiplas variáveis ​​em uma linha:
		
		  int d, f, g;
          d = f = g = 50;
          System.out.println(d + f + g);

	}

}
