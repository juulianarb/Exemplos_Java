package exemplos;

public class Caracteres_especiais {

	public static void main(String[] args) {
		
		// A sequência \"  insere aspas duplas em uma string:
		
		String txt = "We are the so-called \"Vikings\" from the north.";
	    System.out.println(txt);
	    
	    // A sequência \'  insere uma aspa simples em uma string:
	    
	    String txtTwo = "It\'s alright.";
	    System.out.println(txtTwo);
	    
	    //  A sequência \\  insere uma única barra invertida em uma string:

	    String txtThree = "The character \\ is called backslash.";
	    System.out.println(txtThree);
	    
	    // Nova linha \n
	    
	    String txtFour = "Hello\nWorld!";
	    System.out.println(txtFour);
	    
	    // \t Tab
	    
	    String txtFive = "Hello\tWorld!";
	    System.out.println(txtFive);
	    
	    
	}

}
