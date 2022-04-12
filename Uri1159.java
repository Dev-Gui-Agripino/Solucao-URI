import java.util.Scanner;

public class Uri1159 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt() ;
		
		while (x != 0) {
			int soma = 0;
			int contPar= 0;
			do{
				int r = x % 2;
				if(r == 0) {
				soma += x;
				contPar++;
				}
				x++;
					
			}while(contPar != 5);
								
			System.out.println(soma);
			x = sc.nextInt();
		}

		sc.close();
	}

}
