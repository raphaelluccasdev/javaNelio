package modulo_nove;

import java.util.Locale;
import java.util.Scanner;

public class exercico_de_fixacao_modulo_nove {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        exercicio_de_fixacao_utils account;

        System.out.println("Digite o numero da conta de 5 digitos: ");
        int number = sc.nextInt();
        System.out.println("Digite o nome do titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Tem depósito inicial?(y/n)");
        char response = sc.next().charAt(0);
        int valorInicial = sc.nextInt();
        if (response == 'y') {
            System.out.println("Digite o valor inicial: ");
            double inicialDeposit = sc.nextDouble();
            account = new exercicio_de_fixacao_utils(number, holder, inicialDeposit);
        } else {
            account = new exercicio_de_fixacao_utils(number, holder);
            System.out.println("Digite o valor inicial: ");
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();
        System.out.print("Coloque um valor para depósito: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.print("Update account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Coloque um valor para depósito: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.print("Update account data: ");
        System.out.println(account);

        sc.close();


    }

}
