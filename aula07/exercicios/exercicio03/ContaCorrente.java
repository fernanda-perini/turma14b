package exercicios.exercicio03;

public class ContaCorrente extends Conta {
    // final- constante -  não pode mudar de valor
    private final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public void saque(double valor) {
        if (valor <= getSaldo()) {
            super.saque(valor);
        }
    }

    @Override
    public void deposito(double valor) {
        if(valor >= TAXA_DEPOSITO) {
            super.deposito(valor - TAXA_DEPOSITO);
        }
    }

}
