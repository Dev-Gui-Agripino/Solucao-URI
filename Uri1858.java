import java.util.Scanner;

public class Uri1858 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int menor = 0;
		int p = 0;
		
		for(int i =0; i < N; i++) {
			int t= sc.nextInt();
			if(t > 0 && t!=p) {
				menor++;
				p = t;
			}
		}
		System.out.println(menor);
		
		sc.close();
	}
}
