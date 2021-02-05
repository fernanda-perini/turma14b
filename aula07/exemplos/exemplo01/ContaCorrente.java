package exemplos.exemplo01;

public class ContaCorrente implements Contas {
    private double saldo;

    public ContaCorrente() {
        saldo = 0;
    }

    @Override
    public void saque(double valor) {
        saldo -= valor;
    }

    @Override
    public void deposito(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
