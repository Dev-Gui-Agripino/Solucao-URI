import java.util.Locale;
import java.util.Scanner;

public class Uri1184 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[][] M = new double[12][12];

		String O = sc.next();

		// preenche a matriz
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				M[i][j] = sc.nextDouble();
			}
		}

		double soma = 0;
		double media = 0;
		double cont = 0;

		if (O.equalsIgnoreCase("S")) {
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 12; j++) {
					if (i > j) {
						soma += M[i][j];
					}
				}
			}
			System.out.printf("%.1f\n", soma);

		} else if (O.equalsIgnoreCase("M")) {
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 12; j++) {
					if (i > j) {
						soma += M[i][j];
						cont++;
					}
				}
			}
			media = soma / cont;
			System.out.printf("%.1f\n", media);
		}


		sc.close();
	}

}