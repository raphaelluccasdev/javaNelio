import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor;
		
		
		valor = sc.nextInt();
		
		if(valor > 0) {
			System.out.println("POSITIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		sc.close();

	}

}
