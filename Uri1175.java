import java.util.Scanner;

public class Uri1175 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] v = new int[20];
		int[] t = new int[20];
		
		for(int i = 0; i<v.length; i++) {
			v[i] = sc.nextInt();
			}
		
		for(int i = 0; i<v.length; i++) {
			t[i] = v[19 - i];
		}
		
		for(int i = 0; i<v.length; i++) {
			System.out.printf("N[%d] = %d\n", i , t[i]);
		}
		
		sc.close();
	}
}
