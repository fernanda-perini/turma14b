package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        double altura;

        System.out.println("Digite sua idade:");
        idade = teclado.nextInt(); // ler o teclado e guardar na variável 'idade'

        System.out.println("Informe sua altura:");
        altura = teclado.nextDouble();

        System.out.println("Sua idade " + idade);
        System.out.println("Sua altura:" + altura);

        teclado.close();
    }
}
