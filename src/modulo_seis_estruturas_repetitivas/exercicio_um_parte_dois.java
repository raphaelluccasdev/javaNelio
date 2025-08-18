package modulo_seis_estruturas_repetitivas;

import java.util.Scanner;

public class exercicio_um_parte_dois {
	
	public static void main (String agrs[]) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if ( i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
