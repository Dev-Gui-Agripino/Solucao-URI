import java.util.Locale;
import java.util.Scanner;

public class Uri1149 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
					
		while(n<=0) {
			n= sc.nextInt();
		}

		int soma= 0;
		for(int i =1; i<=n; i++) {
			soma += x;
			x++;
		}
		
		
		System.out.println(soma);

		sc.close();
	}

}

