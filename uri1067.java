import java.util.Scanner;

public class uri1067 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int i;
		
		for(i=0; i<=X; i++) {
			int R = i % 2;
			if( R != 0) {
				System.out.println(i);
			}
				
		}
			
		sc.close();
	}

}
