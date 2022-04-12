import java.util.Locale;
import java.util.Scanner;


public class uri1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);

		int X ; 
		double Y;
		
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		double CON =  X / Y;
		
				
		System.out.printf("%.3f km/l%n", CON );
		
		sc.close();
	}
}