package exemplo;

public class ExemploFuncaoRecursiva {

	public static void main(String[] args) {
		
		int resultado = soma(5);
		System.out.println(resultado);

	}

	public static int soma(int k) {
		
		if (k > 0) {
			return (k * soma(k - 1));
			
		} else {
			
			return 0;
		}
	} 
}
