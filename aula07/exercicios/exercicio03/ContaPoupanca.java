package exercicios.exercicio03;

public class ContaPoupanca extends Conta {
    // ststic - atributo de classe
    private static double taxa;

    public ContaPoupanca(int numero) {
        super(numero);
        taxa = 0.1;
    }

    @Override
    public boolean saque(double valor) {
        if (valor <= getSaldo() + taxa){
            return super.saque(valor + taxa);
        }
        return false;
    }

    public static void setTaxa(double novaTaxa) {
        if (novaTaxa > 0) {
            taxa = novaTaxa;
        }
    }

    @Override
    public String toString() {
        return "CP: " + getNumero() + " saldo: " + getSaldo();
    }
}
