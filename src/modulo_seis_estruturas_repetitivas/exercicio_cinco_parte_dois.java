package modulo_seis_estruturas_repetitivas;

import java.util.Scanner;

public class exercicio_cinco_parte_dois {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int fatorial = 1;
		for (int i=1; i<=N; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}

}
