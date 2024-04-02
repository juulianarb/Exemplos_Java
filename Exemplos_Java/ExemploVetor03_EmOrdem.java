package exemplos;

import java.util.Arrays;

public class ExemploVetor03_EmOrdem {

	public static void main(String[] args) {
		
		
		double valores[] = {9, 63, 2,4, -5.6, 8.75};
		Arrays.sort(valores);
		
		for (double valor: valores) {
			
			System.out.println(valor);
		}

	}

}
