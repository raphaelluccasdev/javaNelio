package modulo_dezesseis;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class fixacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.println("Digite o numero do contrato: ");
        int numero = sc.nextInt();
        System.out.print("Digite a data do contrato neste formato (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.println("Digite o valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(numero, date, totalValue);

        System.out.print("Entre com o numero de parcelas do contrato: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, n);
        System.out.println("Parcelas: ");
        for (Installment installment : obj.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();

    }
}
