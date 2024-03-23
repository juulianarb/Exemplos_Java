package exemplos;

import java.util.Scanner;

public class DiasdaSemana_ternario {

	public static void main(String[] args) {

		String resposta = "sim";

		Scanner sc = new Scanner(System.in);

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s")) {

			System.out.println("Digite um número de 1 a 7, correspondente aos dias da semana:");
			int diasDaSemana = sc.nextInt();

			String dias = diasDaSemana == 1 ? "Domingo"
					: diasDaSemana == 2 ? "Segunda-feira"
							: diasDaSemana == 3 ? "Terça-feira"
									: diasDaSemana == 4 ? "Quarta-feira"
											: diasDaSemana == 5 ? "Quinta-feira"
													: diasDaSemana == 6 ? "Sexta-feira"
															: diasDaSemana == 7 ? "Sábado"
																	: "Não existe dias da semana correspondente a este número";

			System.out.println(dias);

			System.out.println("Deseja continuar?");
			resposta = sc.next();
		}

		sc.close();
	}

}
