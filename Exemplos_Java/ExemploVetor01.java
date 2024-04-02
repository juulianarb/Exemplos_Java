package exemplos;

public class ExemploVetor01 {

	public static void main(String[] args) {

		int vetorSoma[] = { 2, 5, 9, 4, 6 };

		System.out.println("O total de casas de VetorSoma é de: " + vetorSoma.length);

		for (int posicao = 0; posicao < 5; posicao++) {
			System.out.println("Na posição " + posicao + " o valor do vetor é de : " + vetorSoma[posicao]);
		}

	}

}
