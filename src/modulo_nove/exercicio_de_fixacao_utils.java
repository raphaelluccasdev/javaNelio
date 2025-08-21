package modulo_nove;

public class exercicio_de_fixacao_utils {

    private int number;
    private String loder;
    private double balance;

    public exercicio_de_fixacao_utils(int number, String loder) {
        this.number = number;
        this.loder = loder;
    }

    public exercicio_de_fixacao_utils(int number, String loder, double initialDeposit) {
        this.number = number;
        this.loder = loder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getLoder() {
        return loder;
    }

    public void setLoder(String loder) {
        this.loder = loder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account number: " + number + "\nLoder: " + loder + "\nBalance $: " + balance;
    }
}
