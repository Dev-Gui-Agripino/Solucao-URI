import java.util.Locale;
import java.util.Scanner;


public class uri1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		String Nome;
		double salario, vendas, C, S;		
		
		Nome = sc.next();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		
		Nome = ""; //não faz parte da solucao do problema.
		C = vendas * 0.15;
		S = salario + C;
		
				
		System.out.printf( "TOTAL = R$ %.2f\n", S , Nome);
		
		sc.close();
	}
}