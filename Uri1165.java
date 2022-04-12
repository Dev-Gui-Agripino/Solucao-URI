import java.util.Scanner;

public class Uri1165 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		

		for (int i = 0; i < test; i++) {
			int soma = 0;
			int numero = sc.nextInt();

			for (int j = 1; j <= numero; j++) {
				int r = numero % j;
				if (r == 0) {
					soma++;
				}
			}
			if (soma == 2) {
				System.out.printf("%d eh primo\n", numero);
			} else {
				System.out.printf("%d nao eh primo\n", numero);
			}
		}
		sc.close();
	}
}