package exemplo;

public class SobrecargaDeMetodo01 {

		static int meuMetodoSomaInt(int x, int y) {
			return x + y;
		}

		static double meuMetodoSomaDouble(double x, double y) {
			return x + y;
		}

		public static void main(String[] args) {
			int Num1 = meuMetodoSomaInt(8, 5);
			double Num2 = meuMetodoSomaDouble(4.3, 6.26);
			System.out.println("A soma dos números é: " + Num1);
			System.out.println("A soma dos números é:  " + Num2);
		}

	}

