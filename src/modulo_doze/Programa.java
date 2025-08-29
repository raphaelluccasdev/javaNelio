package modulo_doze;

import entities.ContratoHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelEmpregativo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Coloque o nome do departamento: ");
        String nomeDoDepartamento = sc.nextLine();
        System.out.println("Digite os dados do trabalhador:");
        System.out.print("Nome: ");
        String nomeDoTrabalhador = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelDoTrabalhador = sc.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeDoTrabalhador, NivelEmpregativo.valueOf(nivelDoTrabalhador), salarioBase, new Departamento(nomeDoDepartamento));

        System.out.print("Quantos contratos esse trabalhador tem? ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println("Digite a data do contrato #" + i + " 1: ");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int duracaoHoras = sc.nextInt();
            ContratoHora contrato = new ContratoHora(contractDate, valorHora, duracaoHoras);
            trabalhador.addContrato(contrato);
        }

        System.out.println();
        System.out.print("Digite o mes e o ano para calcular o salário (MM/YYYY): ");
        String mesEAno =  sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
        System.out.println("Ganhos extras " + mesEAno + ": " + String.format("%.2f",trabalhador.ganhos(ano, mes)));

        sc.close();

    }
}
