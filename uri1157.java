import java.util.Scanner;

public class uri1157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i, m;
				
		for (i=1; i<=n; i++) {
			
			m =  n % i;
			if(m == 0) {
				System.out.println(i);	
			}
		}
		
		
	sc.close();
	}
}