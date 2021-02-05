package exercicios.exercicio03;

import java.util.ArrayList;

public class GerenciaConta {
    private ArrayList<Conta> contas;

    public GerenciaConta(){
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        contas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        contas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        contas.add(new ContaPoupanca(numeroConta));
    }

    public boolean saque(int numeroConta, double valor){
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta.saque(valor);
            }
        }
        return false; // não achou  a conta
    }

    public boolean deposito(int numeroConta, double valor) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta.deposito(valor);
            }
        }
        return false; // não achou a conta
    }

    public String exibirSaldo(int numeroConta){
        for (Conta conta : contas) { 
            if (conta.getNumero() == numeroConta) {
                return conta.toString();
            }
        }
        return "Conta inválida";
    }
}
