import java.util.Scanner;

public class Uri1172 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for(int i = 0; i<10; i++) {
			
			int n = sc.nextInt();
			if(n>0) {
				numeros[i] = n;	
			}else {
				numeros[i] = 1;
			}
			
		}
		
		for(int i = 0; i<10; i++) {
			
			System.out.printf("X[%d] = %d\n", i ,numeros[i]);
		}
		
		
		sc.close();
	}

}
