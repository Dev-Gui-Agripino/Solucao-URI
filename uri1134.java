import java.util.Scanner;

public class uri1134 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int a, g, d;
		a = 0;
		g = 0;
		d = 0;
				
	while (x != 4) {
		while(x > 4 || x < 1) {
			x = sc.nextInt();
		}
		if (x == 1) {
			a = a + 1;
			x = sc.nextInt();
		}
		else if (x == 2) {
			g = g + 1;
			x = sc.nextInt();
		}
		else if (x == 3) {
			d = d + 1;
			x = sc.nextInt();
		}
	}

		System.out.println("Muito Obrigado");
		System.out.println("Alcool: "+ a);
		System.out.println("Gasolina: "+ g);
		System.out.println("Diesel: " + d);
		
		sc.close();
  }
		
}
