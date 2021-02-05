package exercicios.exercicio03;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        int numeroConta;
        double limite;
        double valor;

        GerenciaConta gerencia = new GerenciaConta();

        do {
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Popança");
            System.out.println("4-Saque");
            System.out.println("5-Depósito");
            System.out.println("6-Saldo");
            System.out.println("7-Sair");
            System.out.print("--> ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    gerencia.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite:");
                    limite = teclado.nextDouble();
                    gerencia.novaContaEspecial(numeroConta, limite);
                    break;

                case 3:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    gerencia.novaContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do saque:");
                    valor = teclado.nextDouble();

                    boolean sucesso = gerencia.saque(numeroConta, valor);

                    if( sucesso ){
                        System.out.println("saque realizado com sucesso!");
                    }else{
                        System.out.println("falha ao realizar o saque.");
                    }

                    break;

                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do depósito:");
                    valor = teclado.nextDouble();

                    boolean depositou = gerencia.deposito(numeroConta, valor);

                    if (depositou) {
                        System.out.println("Depósito realizado.");
                    } else {
                        System.out.println("Depósito não realizado.");
                    }

                    break;

                case 6:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();

                    System.out.println(gerencia.exibirSaldo(numeroConta));

                    break;

                case 7:
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 7);

        teclado.close();
    }
}
