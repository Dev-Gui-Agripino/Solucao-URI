import java.util.Locale;
import java.util.Scanner;


public class uri1048 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if(salario<= 400.00) {
			
			double reajuste = (salario * 15.00) / 100.00;
			double salario2 = salario + reajuste;
			System.out.printf("Novo Salario: %.2f%n", salario2);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15 %");
	
		}
		else if (400.00 < salario && salario <= 800.00 ) {
			
			double reajuste = (salario * 10.00) / 100.00;
			double salario2 = salario + reajuste;
			System.out.printf("Novo Salario: %.2f%n", salario2);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
			
		}
		else if (800.00 < salario && salario <= 1200.00) {
			
			double reajuste = (salario * 8.00) / 100.00;
			double salario2 = salario + reajuste;
			System.out.printf("Novo Salario: %.2f%n", salario2);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 8 %");
		}
		else if(salario > 2000.00) {
			
			double reajuste = (salario * 4.00) / 100.00;
			double salario2 = salario + reajuste;
			System.out.printf("Novo Salario: %.2f%n", salario2);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4 %");
			
		}
		else {
					
			double reajuste = (salario * 7) / 100.00;
			double salario2 = salario + reajuste;
			System.out.printf("Novo Salario: %.2f%n", salario2);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		}
		
		
		sc.close();
	}

}
