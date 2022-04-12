import java.util.Scanner;

	public class uri1114 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int senha = 2002;
			int x = sc.nextInt();

			while (x != senha) {
				System.out.println("Senha Invalida");
				x = sc.nextInt();
			}
			
			System.out.println("Acesso Permitido");
			
			sc.close();
		}
}