import java.util.Scanner;

public class Uri1173 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] numeros = new int[10];

		if (n <= 50) {
			numeros[0] = n;

			for (int i = 1; i < 10; i++) {
				numeros[i] = numeros[i - 1] * 2;
			}

			for (int i = 0; i < 10; i++) {

				System.out.printf("N[%d] = %d\n", i, numeros[i]);
			}
		}

		sc.close();

	}

}
