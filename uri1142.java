import java.util.Scanner;

public class uri1142 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int c = 1;
		
		for (int i=1; i<=n; i++) {
			
			int s = c + 1;
			int t = c + 2;
			System.out.printf("%d %d %d PUM%n", c, s, t);

			c = c + 4;
		}
		
		sc.close();
	}
}