package modulo_dez;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_de_fixacao_pensionato {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("Quartos alugados: ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println();
            System.out.println("Locador " + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email :");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int roomNUmber = sc.nextInt();

            vect[roomNUmber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Quartos alugados: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
