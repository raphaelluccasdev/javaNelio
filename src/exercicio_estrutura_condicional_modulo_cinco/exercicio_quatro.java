package exercicio_estrutura_condicional_modulo_cinco;
import java.util.Scanner;

public class exercicio_quatro {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int duracao;
		
		if(A < B) {
			duracao = A - B;
		}else {
			duracao = 24 - A + B;
		}
		
		System.out.println("o jogo durou " + duracao + " horas");
		
		sc.close();
		
		
	}

}
