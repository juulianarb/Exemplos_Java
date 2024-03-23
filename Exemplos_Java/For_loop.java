package exemplos;

public class For_loop {

	public static void main(String[] args) {

		// Quando você souber exatamente quantas vezes deseja percorrer um bloco de
		// código, use o forloop em vez de um whileloop

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		/*
		 * A instrução 1 define uma variável antes do início do loop (int i = 0).
		 * 
		 * A instrução 2 define a condição para a execução do loop (i deve ser menor que
		 * 5). Se a condição for verdadeira, o loop será reiniciado; se for falsa, o
		 * loop será finalizado.
		 * 
		 * A instrução 3 aumenta um valor (i++) cada vez que o bloco de código no loop é
		 * executado.
		 */
		
		
		

		/*
		 * Também é possível colocar um loop dentro de outro loop. Isso é chamado de
		 * loop aninhado .
		 * 
		 * O "loop interno" será executado uma vez para cada iteração do "loop externo":
		 */
		
		// Outer loop.
	    for (int h = 1; h <= 2; h++) {
	      System.out.println("Outer: " + h); // Executes 2 times
	      
	      // Inner loop
	      for (int j = 1; j <= 3; j++) {
	        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
	      }
	    } 
	    
	}

}
