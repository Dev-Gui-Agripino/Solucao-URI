import java.util.Scanner;

public class uri1144 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			
			int s = (int)Math.pow(i, 2);
			int t = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d%n", i, s, t);
			System.out.printf("%d %d %d%n", i, s + 1, t + 1);
		}
		
		sc.close();
	}
}