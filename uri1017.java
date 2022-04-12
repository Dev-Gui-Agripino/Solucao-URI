import java.util.Locale;
import java.util.Scanner;


public class uri1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);

		int X, K ; 
		double L;		
		
		X = sc.nextInt();
		K = sc.nextInt();
		
		L = (double) X * K / 12;
		
				
		System.out.printf( "%.3f\n", L );
		
		sc.close();
	}
}