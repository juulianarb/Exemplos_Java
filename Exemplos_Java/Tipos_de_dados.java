package exemplos;

public class Tipos_de_dados {

	public static void main(String[] args) {
		
		// Tipos de dados primitivos - inclui byte, short, int, long, float, double, boolean e char.
		
		// byte - Guarda todos os números entre: -128 ao 127 - tamanho: 1 byte 
		
		byte myByte = 127;
		System.out.println(myByte);
		
		// short - Guarda todos os números entre: -32,768 ao 32,767 - tamanho: 2 bytes
		
		short myShort = 32767;
		System.out.println(myShort);
		
		// int - Guarda todos os números entre:  -2,147,483,648 ao 2,147,483,647 - tamanho: 4 bytes
		
		int myInt = 2147483647;
		System.out.println(myInt);
		
		// long - Guarda todos os números entre:  -9,223,372,036,854,775,808 ao 9,223,372,036,854,775,807 - tamanho: 8 bytes
		
		long myLong = 9223372036854775807L;
		System.out.println(myLong);
		
		// float - Guarda números fracionáis. Suficiente para guardar entre 6 á 7 digitos decimais - tamanho: 4 bytes
		
		float myFloat = 5.75f;
		System.out.println(myFloat);
		
		// double - Guarda números fracionáis. Suficiente para guardar 15 digitos decimais - tamanho: 8 bytes
		
		double myDouble = 19.99d;
		System.out.println(myDouble);
		
		// boolean - Guarda valor verdadeiro ou falso - tamanho 1 byte
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // retorna verdadeiro
		System.out.println(isFishTasty);   // retorna falso
		
		// char - Guarda um único caracterer/letra ou valores ASCII - tamanho: 2 bytes
		
		char myGrade = 'B';
		System.out.println(myGrade);
		
		// Tipos de dados não primitivos:
		
		// Tipos não primitivos podem ser usados ​​para chamar métodos para realizar determinadas operações, enquanto tipos primitivos não podem.
		// Um tipo primitivo sempre tem um valor, enquanto tipos não primitivos podem ser null.
		// Um tipo primitivo começa com uma letra minúscula, enquanto os tipos não primitivos começam com uma letra maiúscula.
		// Exemplos de tipos não primitivos são Strings , Arrays , Classes, Interface , etc.

		
	}

}
