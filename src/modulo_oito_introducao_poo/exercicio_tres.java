package modulo_oito_introducao_poo;

import java.util.Locale;
import java.util.Scanner;

import entities.exercicio_tres_modulo_oito;

public class exercicio_tres {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		exercicio_tres_modulo_oito estudante = new exercicio_tres_modulo_oito();
		
		estudante.nome = sc.nextLine();
		estudante.semestre1 = sc.nextDouble();
		estudante.semestre2 = sc.nextDouble();
		estudante.semestre3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n" + estudante.soma());
		if (estudante.soma() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTANDO  %.2f PONTOS%n", estudante.media());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}
}
