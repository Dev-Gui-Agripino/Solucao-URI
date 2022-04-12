import java.util.Scanner;

public class Uri1151 {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
        
	    int N = sc.nextInt();
        int proximo, anterior = 0, atual = 1;
        
        for (int i = 1; i <= N; i++) {
        	if (i == N) {
        		System.out.println(anterior);
        	}
        	else {
        		System.out.print(anterior + " ");
        	
        	proximo = anterior + atual;
        	anterior = atual;
        	atual = proximo;
        	}
        }
        
        sc.close();
    }
	
}