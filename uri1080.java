import java.util.Scanner;

public class uri1080 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int maior = sc.nextInt(); 
		int posicao = 0;

		for (int i=1; i<=100; i++) {
			int x = sc.nextInt();
			if (x > maior) {
				maior = x;
				posicao = i;
			}
		}

		System.out.println(maior);
		System.out.println(posicao);

		sc.close();
	}
}