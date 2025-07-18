package exercicio_estrutura_condicional_modulo_cinco;
import java.util.Scanner;

public class exercicio_um {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor1;
			
		valor1 = sc.nextInt();
		
		if(valor1 < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
	}
	
	
}
