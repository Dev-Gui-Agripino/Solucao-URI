import java.util.Scanner;

public class uri1078 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i;
		
		if (n > 2 && n<1000) {
		for(i= 1; i < 11; i++) {
			
			int r = n * i ;
			System.out.println(i +" X "+ n + " = " + r );
			}
		}
		
		sc.close();
	}

}
