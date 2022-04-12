import java.util.Scanner;

public class Uri1073 {

	public static void main(String[] args) {
		// Programa lê 1 numeros inteiros e mostra o quadrados dos
		// numeros pares ate ele.

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int y = 1;

		do {
			if (y <= n) {
				int r = y % 2;
				if (r == 0) {
					int x = (int) Math.pow(y, 2);
					System.out.println(y + "^" + 2 + " = " + x);
				}
			}
			y++;
			
		} while (y <= n);

		sc.close();
	}

}
