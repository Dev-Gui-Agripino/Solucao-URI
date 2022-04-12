import java.util.Locale;
import java.util.Scanner;

public class uri1131 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Calculo = 1;
		int gremio = 0;
		int inter = 0;
		int empate = 0;
		int cont = 0;
		
		while (Calculo == 1) {
			 int x = sc.nextInt();
			 int y = sc.nextInt();
			if (x > y) {
				gremio = gremio + 1;
				cont = cont +1;
			} 
			else if (x < y) {
				inter = inter + 1;
				cont = cont +1;
			}
			else {
				empate = empate + 1;
				cont = cont + 1; 
			}
			
			System.out.println("novo calculo (1-sim 2-nao)");
			Calculo = sc.nextInt();
			while (Calculo != 1 && Calculo != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				Calculo = sc.nextInt();
				
			}

		}
		
				
		System.out.println(cont +" grenais");
		System.out.println("Inter:" + inter);
		System.out.println("Gremio:" + gremio);
		System.out.println("Empate:" + empate);
		
		if(inter > gremio && inter > empate) {
			System.out.println("Inter venceu mais");
		}
		else if(inter < gremio && gremio > empate) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}
		
		sc.close();
	}
}