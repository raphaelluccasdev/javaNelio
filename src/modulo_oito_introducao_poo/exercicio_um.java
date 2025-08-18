package modulo_oito_introducao_poo;

import java.util.Locale;
import java.util.Scanner;
import entities.exercicio_um_modulo_oito;

public class exercicio_um {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		exercicio_um_modulo_oito retangulo = new exercicio_um_modulo_oito();
		
		System.out.println("Enter rectangle width and height: " + retangulo.width + retangulo.height);
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
		
		sc.close();
	}
}
