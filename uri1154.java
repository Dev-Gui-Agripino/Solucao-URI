import java.util.Locale;
import java.util.Scanner;

public class uri1154 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		int cont = 0;
		
		while(x >=0) {
			soma = soma + x;
			cont = cont + 1;
			
			x = sc.nextInt();
			
		}
		
		double media = (double) soma / cont;
		System.out.printf("%.2f%n", media);

		sc.close();
	}

}
