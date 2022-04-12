import java.util.Scanner;

public class Uri1478 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N;

		do {
			N = sc.nextInt();
			if (N > 1) {
				int[][] M = new int[N][N];

				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (i < j || i>j) {
							M[i][j] = 2;
						} else {
							for (i = 0; i < N; i++) {
								for (j = 0; j < N; j++) {
									if (i == j) {
										M[i][j] = 1;
									}
								}
							}
						}
					}

				}

				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						System.out.print(M[i][j] + " ");
					}
					System.out.println();
				}
			} else if (N == 1) {
				System.out.println("1");
			}

		} while (N != 0);

		sc.close();
	}
}
