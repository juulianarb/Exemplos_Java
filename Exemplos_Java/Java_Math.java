package exemplos;

public class Java_Math {

	public static void main(String[] args) {
		
		// A classe Java Math possui muitos métodos que permitem realizar tarefas matemáticas em números.
		
		// Math.max: O método pode ser usado para encontrar o valor mais alto de x e y : Math.max(x,y)
		
		System.out.println(Math.max(5, 10));  
		
		// Math.min: O método pode ser usado para encontrar o valor mais baixo de x e y : Math.min(x,y)
		
		System.out.println(Math.min(5, 10));  
		
		// Math.sqrt: O método retorna a raiz quadrada de x : Math.sqrt(x)

		System.out.println(Math.sqrt(64));  
		
		// Math.abs: O método retorna o valor absoluto (positivo) de x : Math.abs(x)
		
		System.out.println(Math.abs(-4.7)); 
		
		// Math.random() retorna um número aleatório entre 0,0 (inclusive) e 1,0 (exclusivo):
		
		System.out.println(Math.random()); 
		
		// Para obter mais controle sobre o número aleatório, por exemplo, se quiser apenas um número aleatório entre 0 e 100, você pode usar a seguinte fórmula:
		
		int randomNum = (int)(Math.random() * 101);  // 0 a 100
	    System.out.println(randomNum);
	}

}
