import java.util.Scanner;

public class Uri1070 {

	public static void main(String[] args) {
		// Programa lê 1 numeros inteiros e mostra os 6 numeros impares 
		// subsequentes.

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int [] vet = new int[6];
		
		int cont = 0;
		do {
			int r = x % 2;
			if(r!=0){
				
				vet[cont]= x;
				cont++;
			}
			x = x + 1;
		}while (cont != 6);
		
		for(int i=0; i<6; i++) {
			System.out.println(vet[i]);
			}
	
		sc.close();
	}

}
