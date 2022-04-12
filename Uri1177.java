import java.util.Scanner;

public class Uri1177 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] N = new int[1000];
		int cont = 0;

		if (T >= 2 && T <= 50) {
			for (; cont < N.length;) {
				if (cont < 1001)
					break;
				for (int i = 0; i < T; i++) {
					N[cont] = i;
					System.out.println("N[" + cont + "] = " + N[cont]);
					cont++;
				}
			}
		}

		sc.close();
	}

}