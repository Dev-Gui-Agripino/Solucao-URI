import java.util.Locale;
import java.util.Scanner;

public class uri1079 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		double i, x, y, z;
		double media;
				
		for (i= 0; i<n; i++) {
			
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			
			media = (x*2.0 + y*3.0 +z*5.0)/10.0;
			System.out.printf("%.1f%n", media);
			
		}
			
			
	sc.close();
	}

}