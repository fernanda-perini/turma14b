package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String textoDigitado;

        try {
            System.out.println("Informe um valor:");
            // num = entrada.nextInt();
            textoDigitado = entrada.nextLine();
            num = Integer.parseInt(textoDigitado);
            System.out.println("Você digitou " + num);
        } catch(InputMismatchException e) {
            System.out.println("Entrada inválida.");
        } catch(NumberFormatException e) {
            System.out.println("Número inválido.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Erro na entrada dos dados.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Fechando conexões...");
            entrada.close();
        }

        System.out.println("Fim do programa.");

    }
}
