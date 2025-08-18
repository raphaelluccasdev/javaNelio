package modulo_seis_estruturas_repetitivas;

import java.util.Scanner;

public class exercicio_quatro_parte_dois {

	public static void main (String agrs[]) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
	}
		
}
	

