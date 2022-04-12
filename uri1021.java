import java.util.Locale;
import java.util.Scanner;



public class uri1021 {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N;
		int resto, z, c, q, v, d, f, t, A, H, I, J, L, M ;
				
		N = sc.nextDouble(); 
		z = (int) ((N * 100) + 0.5);
		
		 c = z / 10000;
		resto = z % 10000;
		
		 q =  resto / 5000;
		resto = resto % 5000;
		
		 v =  resto / 2000;
		resto = resto % 2000;
		
		 d =  resto / 1000;
		resto = resto % 1000;
		
		 f = resto / 500;
		resto = resto % 500;
		
		 t =  resto  / 200;
		 resto =  resto  % 200;
		 
		 A = resto / 100 ;
		 resto = resto % 100;
		
		 H = resto / 50;
		 resto = resto % 50;
		 
		 I = resto / 25;
		 resto = resto % 25;
		
		 J = resto / 10;
		 resto = resto % 10;
		
		 L = resto / 5;
		 M = resto % 5;
				  
		System.out.println("NOTAS:");
		System.out.println(c + " nota(s) de R$ 100.00");
		System.out.println(q + " nota(s) de R$ 50.00" );
		System.out.println(v + " nota(s) de R$ 20.00");
		System.out.println(d + " nota(s) de R$ 10.00");
		System.out.println(f + " nota(s) de R$ 5.00");
		System.out.println(t + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(A + " moeda(s) de R$ 1.00");
		System.out.println(H + " moeda(s) de R$ 0.50" );
		System.out.println(I + " moeda(s) de R$ 0.25");
		System.out.println(J + " moeda(s) de R$ 0.10");
		System.out.println(L + " moeda(s) de R$ 0.05");
		System.out.println(M + " moeda(s) de R$ 0.01");
		
		
		sc.close();
		
	}

}