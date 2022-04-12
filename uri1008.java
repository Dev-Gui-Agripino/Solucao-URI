import java.util.Locale;
import java.util.Scanner;


public class uri1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);

		int NUM,HORA ; 
		double valorHora;
		
		
		NUM = sc.nextInt();
		HORA = sc.nextInt();
		valorHora = sc.nextDouble();
		
		double SAL =  HORA * valorHora;
		
				
		System.out.println("NUMBER = " + NUM);
		System.out.printf("SALARY = U$ %.2f\n", SAL);
		
		sc.close();
	}
}