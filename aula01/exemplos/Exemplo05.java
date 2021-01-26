package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        int valorInteiro;
        double valorDouble;

        valorInteiro = 789;
        valorDouble = 45.9876;

        // valorDouble = valorInteiro; //ok
        valorInteiro = (int) valorDouble; //casting - conversão explicita

        System.out.println(valorInteiro);
        System.out.println(valorDouble);
    }
}
