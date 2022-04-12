import java.util.Scanner;



public class uri1020 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		
		int dias;
		int d, m, a;
		int resto;
				
		dias = sc.nextInt(); 
		
		a = dias / 365;
		resto = dias % 365;
		
		m = resto / 30;
		d = resto % 30;
		
		 		
		System.out.println(a + " ano(s)");
		System.out.println(m + " mes(es)" );
		System.out.println(d + " dia(s)");
		
		sc.close();
		
	}

}
