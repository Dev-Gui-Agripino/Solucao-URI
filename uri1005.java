import java.util.Locale;
import java.util.Scanner;


public class uri1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		double x, y, MED; 
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		MED = (x * 3.5 + y * 7.5)/11;
		
		System.out.printf("MEDIA = %.5f\n", MED);
		
		sc.close();
	}
}
