package modulo_dez;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_de_fixacao_cinco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Valor de cada vetor");
        n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Digite o valor de A");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Digite o valor de B");

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("VETOR RESULTANTE");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", c[i]);
        }

        sc.close();

    }
}
