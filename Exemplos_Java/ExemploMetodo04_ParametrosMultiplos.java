package exemplos;

public class ExemploMetodo04_ParametrosMultiplos {

	
	static void familiaForbes(String nomes, int idades) {
		System.out.println("Nome: " + nomes + "  Idade: " + idades);
	}

	public static void main(String[] args){
		
		familiaForbes("Anya", 7);
		familiaForbes("Loid" , 30);
		familiaForbes("Yor" , 28);
		
	}
}
