import java.util.Scanner;

public class Uri1176 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			if (n> 1) {
			int[] fib = new int[n];
			fib[0] = 1;
			fib[1] = 1;
			
			for (int j = 2; j < n; j++) {
				fib[j] = fib[j-1] + fib[j-2];
			}
				
			
				
			} else {
				System.out.println("Fib[0] = 0");
			}
			
		}

		sc.close();
	}
}
