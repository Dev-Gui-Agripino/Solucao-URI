import java.util.Locale;
import java.util.Scanner;


public class uri1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);

		int P1, N1, P2, N2; 
		double V1, V2;
		
		P1 = sc.nextInt();
		N1 = sc.nextInt();
		V1 = sc.nextDouble();
		
		P2 = sc.nextInt();
		N2 = sc.nextInt();
		V2 = sc.nextDouble();
		
		
		double TOTAL =  (N1 * V1) + (N2 * V2);
		
				
		System.out.printf("VALOR A PAGAR = R$ %.2f\n", TOTAL);
		System.out.println(P1+ " " + P2);//não faz parte da solucao do problema.
		
		sc.close();
	}
}
