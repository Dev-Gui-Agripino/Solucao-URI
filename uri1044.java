import java.util.Scanner;


public class uri1044 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
				
		int div1 = B % A;
		int div2 = A % B;
		
		if ( div1 == 0 || div2 ==0 ) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
		
	}

}