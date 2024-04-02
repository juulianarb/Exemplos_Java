package exemplos;

import java.util.Arrays;

public class ExemploVetor05_PreenchendoVetor {

	public static void main(String[] args) {
		
		int vetor[] = new int[5];
		Arrays.fill(vetor, 0);
		
		for (int v: vetor) {
			System.out.print(v + " ");
		}

	}

}
