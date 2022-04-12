import java.util.Locale;
import java.util.Scanner;

public class Uri1150 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int z = sc.nextInt();
		int cont = 0;

		while (x >= z) {
			
			z = sc.nextInt();
		}

		int soma = 0;
			do {
				soma = soma + x;
				x ++;
				cont++;

			} while (soma < z);

		
		
		System.out.println(cont);

		sc.close();
	}

}
