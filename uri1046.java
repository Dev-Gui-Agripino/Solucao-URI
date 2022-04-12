import java.util.Scanner;


public class uri1046 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
				
		if (A > 12) {
			int hora = (24 - A) + B;
			System.out.println("O JOGO DUROU " + hora + " HORA(S)");
		}
		else if (A == B) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else {
			int hora = B - A;
			System.out.println("O JOGO DUROU " + hora + " HORA(S)");
			
		}
		
		sc.close();
		
	}

}