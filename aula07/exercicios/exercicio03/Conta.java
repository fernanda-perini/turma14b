package exercicios.exercicio03;

public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

}
