import java.util.Locale;
import java.util.Scanner;


public class uri1011 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		double raio;		
		double pi = 3.14159;
		
		raio = sc.nextDouble();
				
		 double v = (4.0/3) * pi * Math.pow(raio, 3);
		 
				
		System.out.printf( "VOLUME = %.3f\n", v );
		
		sc.close();
	}
}