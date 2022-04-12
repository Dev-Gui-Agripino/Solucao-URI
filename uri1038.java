import java.util.Scanner;
import java.util.Locale;


public class uri1038 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		double total;
				
		switch(x) {
		case(1):
			total = y * 4.00;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case(2):
			total = y * 4.50;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case(3):
			total = y * 5.00;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case(4):
			total = y * 2.00;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case(5):
			total = y * 2.00;
			System.out.printf("Total: R$ %.2f%n ", total);
			break;
		
		}
		
		sc.close();
		
	}

}
