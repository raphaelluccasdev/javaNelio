package modulo_oito_introducao_poo;

import java.util.Locale;

public class exercico_de_fixacao {
	
public static void main(String[] args) {
	
		exercicio_de_fixacao_utils valorGringo = new exercicio_de_fixacao_utils();
		
		Locale.setDefault(Locale.US);
		System.out.println("What is the dollar price? " + valorGringo.dolar());
		System.out.println("How many dollars will be bought? " + valorGringo.valorDolarDepositado());
		System.out.println("Amount to be paid in reais = " + valorGringo.valorTaxa());
		
	}

}
