package modelo;

public class ContaCorrente extends Conta {
    private double taxaSaque = 0.50;

    public ContaCorrente(String numero, String titular) {
        super(numero, titular);
    }

    @Override
    public boolean sacar(double valor) {
        double valorTotal = valor + taxaSaque;
        if (valorTotal <= saldo) {
            saldo -= valorTotal;
            System.out.println("Saque de R$" + valor + " realizado (Taxa: R$ " + taxaSaque + ").");
            return true;
        } else {
            System.out.println("Saldo insuficiente (Valor + Taxa maior que saldo).");
            return false;
        }
    }
}