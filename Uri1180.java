import java.util.Locale;
import java.util.Scanner;

public class Uri1180 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] X = new int[n];

		for (int i = 0; i < n; i++) {
			X[i] = sc.nextInt();
		}

		int menor = 0;
		int possi = 0;

		for (int i = 0; i < n; i++) {
			if (menor > X[i]) {
				menor = X[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (menor == X[i]) {
				possi = i;
			}
		}

		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + possi);

		sc.close();
	}

}
