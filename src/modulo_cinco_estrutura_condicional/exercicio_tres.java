package modulo_cinco_estrutura_condicional;
import java.util.Scanner;

public class exercicio_tres {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();;
		int B = sc.nextInt();;
		
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não são Multiplos");
		}
		
		sc.close();
		
	}

}
