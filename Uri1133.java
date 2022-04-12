import java.util.Locale;
import java.util.Scanner;

public class Uri1133 {

	public static void main(String[] args) {
		// Programa lê 6 numeros inteiros e mostra os numeros positivos
		// e a média entre eles.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > y) {
			int r = 0;
			
			for (int i = y + 1; i < x; i++) {

				r = i % 5;


				if (r == 2 || r == 3) {
					System.out.println(i);
				}

			}
		} else {
			int r = 0;
			
			for (int i = x + 1; i < y; i++) {

				r = i % 5;
				
				if (r == 2 || r == 3) {
					System.out.println(i);
				}

			}

		}

		sc.close();
	}

}
