package exercicios.exercicio03;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double limite) {
        super(numero);
        setLimite(limite);
    }

    public void setLimite(double valor) {
        if (valor >= 0) {
            limite = valor;
        }
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public boolean saque(double valor) {
        if (valor > 0 && valor <= getSaldo() + limite) {
            return super.saque(valor);
        }
        return false; // saldo + limite insuficiente ou valor negativo
    }

    @Override
    public String toString() {
        return "CE: " + getNumero() + " saldo: " + getSaldo() + " limite: " + limite;
    }

}
