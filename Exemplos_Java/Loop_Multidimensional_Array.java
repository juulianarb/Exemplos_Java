package exemplos;

public class Loop_Multidimensional_Array {

	public static void main(String[] args) {
		
		
		/* Também podemos usar um for loopdentro de outro for looppara obter os elementos de um array bidimensional 
		 * (ainda temos que apontar para os dois índices): */
		
		 int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	     for (int i = 0; i < myNumbers.length; ++i) {
	        for(int j = 0; j < myNumbers[i].length; ++j) {
	           System.out.println(myNumbers[i][j]);
	        }
	     }

	}

}
