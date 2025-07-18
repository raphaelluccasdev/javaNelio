package exercicio_estrutura_condicional_modulo_cinco;
import java.util.Scanner;

public class exercico_dois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor1;
			
		valor1 = sc.nextInt();
		
		if(valor1 % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
	}
	
}
