import java.util.Locale;
import java.util.Scanner;

public class Uri1181 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[][] M = new double[12][12];
		
		int L = sc.nextInt();
		String T = sc.next();
		
		//preenche a matriz
		for(int i =0; i<12; i++) {
			for(int j=0; j<12; j++) {
				M[i][j] = sc.nextDouble();
			}
		}
		
		double soma = 0;
		double media=0;
		
		if(T.equalsIgnoreCase("S")) {
				for(int j=0; j<12; j++) {
					soma += M[L][j]; 
				}
				System.out.printf("%.1f\n", soma);
				
			}else if(T.equalsIgnoreCase("M")) {
				for(int j=0; j<12; j++) {
					soma += M[L][j]; 
				}
				media = soma/12;
				System.out.printf("%.1f%n", media);
			}
			
		
		
		sc.close();
	}

}
