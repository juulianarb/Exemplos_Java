package exemplos;

public class ExemploMetodo08_Ifelse {

	  static void verificaIdade(int idade) {

	    
	    if (idade < 18) {
	      System.out.println("Acesso negado - Você não é velho o suficiente!"); 
	      
	    } else {
	      System.out.println("Acesso concedido - Você é velho o suficiente!"); 
	    }
	    
	  } 

	  public static void main(String[] args) { 
	    verificaIdade(20);
	  } 
}
