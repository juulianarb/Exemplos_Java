package exemplos;

public class Type_Casting {

	public static void main(String[] args) {
		
		/* A conversão de tipo ocorre quando você atribui um valor de um tipo de dados primitivo a outro tipo.

		Em Java, existem dois tipos de conversão:

		Widening Casting (automaticamente) - convertendo um tipo menor em um tamanho de tipo maior
		byte -> short -> char -> int -> long -> float -> double

		Narrowing Casting (manualmente) - convertendo um tipo maior em um tipo de tamanho menor
		double-> float -> long -> int -> char -> short-> byte */
		
		// Exemplo Widening Casting:
		
		int myInt = 9;
	    double myDouble = myInt; // conversão automática: int para double

	    System.out.println(myInt);      // retorna 9
	    System.out.println(myDouble);   // retorna 9.0
	    
	    // Exemplo Narrowing Casting:
	    
	    double meuDouble = 9.78d;
	    int meuInt = (int) meuDouble; // conversão manual: double para int

	    System.out.println(meuDouble);   // retorna 9.78
	    System.out.println(meuInt);      // retorna 9

	}

}
