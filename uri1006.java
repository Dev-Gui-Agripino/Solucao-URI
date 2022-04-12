import java.util.Locale;
import java.util.Scanner;


public class uri1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		double A, B, C, MED; 
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		MED = (A * 2 + B * 3 + C*5)/10;
		
		System.out.printf("MEDIA = %.1f\n", MED);
		
		sc.close();
	}
}