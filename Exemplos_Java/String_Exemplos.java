package exemplos;

public class String_Exemplos {

	public static void main(String[] args) {

		// length

		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("O length da variável txt é : " + txt.length()); // usado para contar a quantidade de
																			// caracteres da string

		// toUpperCase: maiúsculo

		String txtTwo = "Hello World";
		System.out.println(txtTwo.toUpperCase()); // retorna em maiúsculo "HELLO WORLD"

		// toLowerCase: minúsculo

		System.out.println(txtTwo.toLowerCase()); // retorna em minúsculo "hello world"

		// indexOf: método retorna o índice (a posição) da primeira ocorrência de um
		// texto especificado em uma string (incluindo espaços em branco)

		String txtThree = "Por favor localize onde 'localize' aparece!";
		System.out.println(txtThree.indexOf("localize"));
		
		// Concatenação
		
		  String firstName = "John";
		  String lastName = "Doe";
		  System.out.println(firstName + " " + lastName);
		  
		  String primeiroNome = "John ";
		  String ultimoNome = "Doe";
		  System.out.println(primeiroNome.concat(ultimoNome));
		
	}

}
