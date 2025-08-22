package modulo_oito_introducao_poo;

public class exercicio_de_fixacao_utils {

	
	public static double dolar() {
		double valorDolar = 3.10;
		return valorDolar;
		
	}
	
	public static double taxaDolar() {
		double taxa = 0.6;
		return taxa;
	}
	
	public static double valorDolarDepositado() {
		double dinheiro = 200.00;
		return dinheiro;
	}
	
	public static double valorTaxa() {
		double valorDaTaxa = dolar() * taxaDolar();
		return valorDaTaxa;
	}
	
	public static double porcentagemDolar() {
		double valorTotal = valorTaxa() * valorDolarDepositado() ;
		return valorTotal;
		
	}
	
}
