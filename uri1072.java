import java.util.Scanner;

public class uri1072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int i;
		int n = 0;
		int o = 0;
		
		for(i=0; i<x; i++) {
			int y = sc.nextInt();
			if(y>=10 && y<=20) {
				n += 1;	
			}
			else {
				o +=1;
			}
		}	
			System.out.println(n +" in");
			System.out.println(o +" out");
		
			
		sc.close();
	}

}