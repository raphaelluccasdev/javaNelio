package modulo_oito_introducao_poo;

import java.util.Locale;
import java.util.Scanner;

import entities.exercicio_dois_modulo_oito;

public class exercicio_dois {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		exercicio_dois_modulo_oito salario = new exercicio_dois_modulo_oito();
		
		System.out.print("Enter your name: ");
		salario.name = sc.nextLine();
		System.out.print("Enter your gross salary: ");
		salario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		salario.tax = sc.nextDouble();
		
		System.out.printf("Employee: " + salario);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
	
		double percentage = sc.nextDouble();
		salario.increaseSalary(percentage);
		System.out.println("Updated data: " + salario);
				
		sc.close();
	}

}
