package exercicios.exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        int numeroConta;
        ContaCorrente cc = null;
        ArrayList<ContaCorrente> contas = new ArrayList<>();

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
                    cc = new ContaCorrente(numeroConta);
                    contas.add(cc); 
                    break;
                case 2:
                    System.out.println("Opção 2");
                    break;
                case 3:
                    System.out.println("Opção 3");
                    break;
                case 4:
                    System.out.println("Opção 4");
                    break;
                case 5:
                    System.out.println("Opção 5");
                    break;
                case 6:
                    System.out.println(contas);
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
