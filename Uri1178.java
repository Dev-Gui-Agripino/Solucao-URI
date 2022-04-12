import java.util.Locale;
import java.util.Scanner;

public class Uri1178 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double[] N = new double[100];
		
		N[0] = x; 
		for (int i = 1; i < N.length; i++) {
			N[i] = N[i-1]/2.0;
			}
		
		
		for (int i = 0; i < N.length; i++) {
			System.out.printf("N[%d] = %.4f%n", i, N[i]);
		}
		sc.close();
	}
}