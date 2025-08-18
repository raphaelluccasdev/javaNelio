package modulo_seis_estruturas_repetitivas;

import java.util.Scanner;

public class exercicio_um {
	
	public static void main (String agrs[]) {
	
	Scanner sc = new Scanner(System.in);
	
	int senhaCerta = sc.nextInt();
	
	while (senhaCerta != 2002) {
		System.out.println("Senha Invalida");
		senhaCerta = sc.nextInt();
	}
	
	System.out.println("Acesso Permitido");
	
	sc.close();

	}
}
