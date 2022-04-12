import java.util.Scanner;

public class uri1153 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i;
		int m = 1;
		
		for (i=n; i>0; i--) {
			
			m =  m * i;
		}
		
		System.out.println(m);

	sc.close();
	}
}