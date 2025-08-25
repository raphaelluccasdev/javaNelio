package modulo_dez;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_de_fixacao_oito {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, maioridade, posicaomaior;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome do pessoa: ");
            nomes[i] = sc.next();
            System.out.print("Idade do pessoa: ");
            idades[i] = sc.nextInt();
        }

        maioridade = idades[0];
        posicaomaior = 0;

        for (int i = 0; i < nomes.length; i++) {
            if (idades[i] > maioridade) {
                maioridade = idades[i];
                posicaomaior = i;
            }
        }

        System.out.println("Maior pessoa: " + nomes[posicaomaior]);

        sc.close();

    }
}
