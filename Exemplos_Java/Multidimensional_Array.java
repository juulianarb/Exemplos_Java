package exemplos;

public class Multidimensional_Array {

	public static void main(String[] args) {
		
		/*Para acessar os elementos do array myNumbers , especifique dois índices: um para o array e outro para o elemento dentro desse array. 
		 * Este exemplo acessa o terceiro elemento (2) na segunda matriz (1) de myNumbers:*/

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		System.out.println(myNumbers[1][2]);
	}
}
