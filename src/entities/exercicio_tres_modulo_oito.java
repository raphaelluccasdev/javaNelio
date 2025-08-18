package entities;

import java.util.Scanner;

public class exercicio_tres_modulo_oito {
	
		public String nome;
		public double semestre1;
		public double semestre2;
		public double semestre3;	
		
		public double soma() {
			return semestre1 + semestre2 + semestre3;
		}
				
		public double media() {
			if(soma() < 60.0) {
			return 60.0 - soma();
		} else {
			return 0.0;
		}
	}
}
