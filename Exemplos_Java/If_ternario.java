package exemplos;

public class If_ternario {

	public static void main(String[] args) {

		int numero = 20;

		String resposta = numero < 16 ? "Não pode votar" : numero < 18 ? "Voto opicional" : "Voto obrigatório";
		System.out.println(resposta);

	}

}
