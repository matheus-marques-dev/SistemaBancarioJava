package modelo;

public abstract class Conta {
    private String numero;
    private String titular;
    protected double saldo;

    public Conta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        }
    }

    public abstract boolean sacar(double valor);

    public void transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Falha na transferência.");
        }
    }

    public String getNumero() { return numero; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    @Override
    public String toString() {
        return "Conta: " + numero + " | Titular: " + titular + " | Saldo: R$ " + String.format("%.2f", saldo);
    }
}