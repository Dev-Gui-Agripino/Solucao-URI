import java.util.Scanner;

public class uri1074 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i, r;
				
		for(i=0; i<n; i++) {
			int y = sc.nextInt();
			if(y>0) {
				r = y % 2;
				if(r == 0) {
				System.out.println("EVEN POSITIVE");	
				}
				else {
					System.out.println("ODD POSITIVE");
				}
					
			}
			else if(y<0){
				r = Math.abs(y % 2);
				if(r == 0) {
					System.out.println("EVEN NEGATIVE");	
					}
					else {
						System.out.println("ODD NEGATIVE");
					}
			}
			else {
				System.out.println("NULL");
			}
		}	
	sc.close();
	}

}