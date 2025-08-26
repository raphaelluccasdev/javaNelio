package modulo_dez;

import java.util.Scanner;

public class exercicio_matriz {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int [][] matriz = new int[n][n];

    for (int i=0; i< matriz.length; i++){
        for (int j=0; j<matriz[i].length; j++){
            matriz[i][j] = sc.nextInt();
        }
    }

        System.out.println("Diagonal matriz");
        for (int i=0; i<matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }

        int contar = 0;
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                if (matriz[i][j] < 0){
                    contar++;
                }
            }
        }
        System.out.println();
        System.out.println("Numeros Negativos: " + contar);

    sc.close();
    }
}