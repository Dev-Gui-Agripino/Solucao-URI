import java.util.Scanner;

public class uri1143 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d, c, m;
		
		for (int i=1; i<=n; i++) {
			
			m = i;
			d = (int) Math.pow(i, 2);
			c = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d%n", m, d, c);
			
		}

		sc.close();
	}

}
