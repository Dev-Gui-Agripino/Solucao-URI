import java.util.Scanner;



public class uri1018 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		
		int N;
		int resto, c, q, v, d, f, t, o;
		int resto2, resto3, resto4, resto5;
		
		
		N = sc.nextInt(); 
		
		 c =  N / 100;
		resto = N % 100;
		
		 q =  resto / 50;
		resto2 = resto % 50;
		
		 v =  resto2 / 20;
		resto3 = resto2 % 20;
		
		 d =  resto3 / 10;
		resto4 = resto3 % 10;
		
		 f = resto4 / 5;
		resto5 = resto4 % 5;
		
		 t =  resto5 / 2;
		 o =  resto5 % 2;
		
		System.out.println( N );
		System.out.println(c + " nota(s) de R$ 100,00");
		System.out.println(q + " nota(s) de R$ 50,00" );
		System.out.println(v + " nota(s) de R$ 20,00");
		System.out.println(d + " nota(s) de R$ 10,00");
		System.out.println(f + " nota(s) de R$ 5,00");
		System.out.println(t + " nota(s) de R$ 2,00");
		System.out.println(o + " nota(s) de R$ 1,00");
		
		sc.close();
		
	}

}
