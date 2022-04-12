import java.util.Locale;
import java.util.Scanner;

public class Uri1174 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n;
		double[] numeros = new double[100];
		int cont = 0;

		for (; cont < numeros.length; cont++) {
			n = sc.nextDouble();
			if (n <= 10) {
				numeros[cont] = n;
				}
		}

		for (int i = 0; i < numeros.length; i++) {

			System.out.printf("A[%d] = %.1f\n", i, numeros[i]);
		}

		sc.close();

	}

}