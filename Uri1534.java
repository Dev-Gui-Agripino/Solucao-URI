import java.util.Scanner;

public class Uri1534 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		while (N != 0) {

			int[][] M = new int[N][N];

			// preenche a matriz
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (i + j == N - 1) {
						M[i][j] = 2;
					} else if (i == j) {
						M[i][j] = 1;
					} else {
						M[i][j] = 3;
					}
					System.out.print(M[i][j]);
				}
				System.out.println();
			}
			N = sc.nextInt();
		}
		sc.close();
	}
}
