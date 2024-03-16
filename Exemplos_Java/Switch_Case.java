package exemplos;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {

		String resposta = "sim";

		Scanner sc = new Scanner(System.in);

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s")) {

			System.out.println("Digite um número inteiro de 1 a 7, correspondente ao dia da semana:");
			int dia = sc.nextInt();

			switch (dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Não existe número correspondente");
				break;
			}

			System.out.println("Deseja continuar?");
			resposta = sc.next();

		}
		sc.close();

	}

}
