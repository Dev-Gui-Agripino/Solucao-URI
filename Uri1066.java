import java.util.Locale;
import java.util.Scanner;

public class Uri1066 {

	public static void main(String[] args) {
		// Programa lê 5 numeros inteiros e mostra a quantidade de pares, 
		//impares, positivos e negativos.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = 5;
		int [] vet= new int [a];
		
		for(int i=0; i<a; i++) {
			vet[i]= sc.nextInt();		
		}
		
		int contPar= 0;
		int contImpar=0;
		int r = 0;
		for(int i=0; i<a; i++) {
			r = vet[i] % 2;
			if(r == 0) {
				contPar++;
			}
			else {
				contImpar++;
			}
		}
		
		int positivo = 0;
		int negativo = 0;
		for(int i=0; i<a; i++) {
			if(vet[i]>0) {
				positivo++;
			}
			else if (vet[i]< 0){
				negativo++;
			}
		}
			 
		System.out.println(contPar + " valor(es) par(es)");
		System.out.println(contImpar + " valor(es) impar(es)");
		System.out.println(positivo +" valor(es) positivo(s)");
		System.out.println(negativo +" valor(es) negativo(s)");
		
		sc.close();
	}

}
