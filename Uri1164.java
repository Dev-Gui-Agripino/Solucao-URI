import java.util.Scanner;

public class Uri1164 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int i = 0; i < test; i++) {

			int numero = sc.nextInt();
			int soma = 0;

			for (int j = 1; j < numero; j++) {
				int r = numero % j;
				if (r == 0) {
					soma += j;
				}
			}

			if (soma == numero) {
				System.out.printf("%d eh perfeito\n", numero);
			} else {
				System.out.printf("%d nao eh perfeito\n", numero);

			}
		}
		sc.close();
	}
}
