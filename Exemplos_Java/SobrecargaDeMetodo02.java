package exemplo;

public class SobrecargaDeMetodo02 {

	static int meuMetodo(int x, int y) {
		return x + y;
	}

	static double meuMetodo(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		int Num1 = meuMetodo(8, 5);
		double Num2 = meuMetodo(4.3, 6.26);
		System.out.println("A soma dos números é: " + Num1);
		System.out.println("A soma dos números é: " + Num2);
	}

}
