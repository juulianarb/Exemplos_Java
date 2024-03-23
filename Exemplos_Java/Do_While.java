package exemplos;

public class Do_While {

	public static void main(String[] args) {

		// O do/whileloop é uma variante do whileloop.
		// Este loop executará o bloco de código uma vez, antes de verificar se a
		// condição é verdadeira,
		// e então repetirá o loop enquanto a condição for verdadeira.

		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 5);
	}

}
