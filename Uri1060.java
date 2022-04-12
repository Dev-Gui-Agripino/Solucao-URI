import java.util.Locale;
import java.util.Scanner;

public class Uri1060 {

	public static void main(String[] args) {
		// Programa lê 6 numeros inteiros e mostra os numeros positivos.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = 6;
		double [] vet= new double [a];
		
		for(int i=0; i<a; i++) {
			vet[i]= sc.nextDouble();		
		}
		
		int cont= 0;
		for(int i=0; i<a; i++) {
			if(vet[i] > 0) {
				cont++;
			}
		}

		System.out.println(cont + " valores positivos");
		
		sc.close();
	}

}
