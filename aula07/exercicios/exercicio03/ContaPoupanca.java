package exercicios.exercicio03;

public class ContaPoupanca extends Conta {
    //ststic - atributo de classe
    private static double taxa;

    public ContaPoupanca(int numero) {
        super(numero);
    }

    @Override
    public void saque(double valor) {
        if(valor <= getSaldo() + taxa)
        super.saque(valor + taxa);
    }
    
    public static void setTaxa(double novaTaxa) {
        if(novaTaxa > 0) {
            taxa = novaTaxa;
        }
    }
    
    @Override
    public String toString() {
        return getNumero() + " : " + getSaldo() + " : " + taxa;
    }
}
