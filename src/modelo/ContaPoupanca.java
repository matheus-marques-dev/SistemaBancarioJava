package modelo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numero, String titular) {
        super(numero, titular);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
}
