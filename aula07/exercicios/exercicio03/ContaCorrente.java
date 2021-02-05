package exercicios.exercicio03;

public class ContaCorrente extends Conta {
    // final- constante - não pode mudar de valor
    private final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean saque(double valor) {
        if (valor <= getSaldo()) {
            return super.saque(valor);
        }
        return false;// saldo insuficiente
    }

    @Override
    public boolean deposito(double valor) {
        if (valor >= TAXA_DEPOSITO) {
            return super.deposito(valor - TAXA_DEPOSITO);
        }
        return false;
    }

    @Override
    public String toString() {
        return "CC: " + getNumero() + " saldo: " + getSaldo();
    }

}
