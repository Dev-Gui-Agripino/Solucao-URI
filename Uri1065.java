import java.util.Locale;
import java.util.Scanner;

public class Uri1065 {

	public static void main(String[] args) {
		// Programa lê 5 numeros inteiros e mostra os numeros pares.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = 5;
		int [] vet= new int [a];
		
		for(int i=0; i<a; i++) {
			vet[i]= sc.nextInt();		
		}
		
		int cont= 0;
		int r = 0;
		for(int i=0; i<a; i++) {
			r = vet[i] % 2;
			if(r == 0) {
				cont++;
			}
		}
			 
		System.out.println(cont + " valores pares");
		
		sc.close();
	}

}
