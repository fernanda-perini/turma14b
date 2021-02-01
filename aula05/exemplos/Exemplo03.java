package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        String nome;

        nome = in.nextLine();
        System.out.println("Seu nome tem " + nome.length() + " letras");

        in.close();
    }
}
