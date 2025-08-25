package modulo_dez;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_de_fixacao_seis {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.println("Quantidade de elementos do vetor");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero");
            vetor[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        media = soma / n;

        System.out.printf("\nMEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MÉDOA");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == media) {
                System.out.printf("%.1f%n", vetor[i]);
            }
        }

        sc.close();

    }

}
