package exemplos;

public class Array_loop01 {

	public static void main(String[] args) {

		/*
		 * Você pode percorrer os elementos da matriz com o forloop e usar a length
		 * propriedade para especificar quantas vezes o loop deve ser executado. O
		 * exemplo a seguir gera todos os elementos do array cars :
		 * 
		 */

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
