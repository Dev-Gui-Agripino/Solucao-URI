import java.util.Locale;
import java.util.Scanner;

public class uri1116 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i;
		
		
		for(i=0; i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			double r;
			
			if(y!= 0) {
				r = (double) x / y;
				
				System.out.printf("%.1f%n",r);
				
			}
			else {
				System.out.println("divisao impossivel");
			}
			
			
		}
			
			
	sc.close();
	}

}