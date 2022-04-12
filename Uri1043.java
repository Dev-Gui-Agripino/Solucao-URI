import java.util.Scanner;

public class Uri1043 {

	public static void main(String[] args) {
		
		double A, B, C, area, perimetro;

		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		if ((A < (float) (B + C)) && (B < (float) (A + C)) && (C < (float) (B + A))) {
			perimetro = A + B + C;
			System.out.printf("Perimetro = %.1f\n", perimetro);
		} else {
			area = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n", area);
		}
		sc.close();
	}

}