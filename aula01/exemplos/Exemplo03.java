package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        // TIPO nome [,nome2] ;
        int valor;
        int valor2;

        valor = 10; // atribuição

        System.out.println("valor");
        System.out.println(valor);

        valor = 20; // sobrepõe o valor 10
        System.out.println(valor);

        valor2 = valor + 5;

        System.out.println("valor2 = " + valor2);

        System.out.println(valor2 + 5);
        System.out.println(valor2);

        valor = valor + 5;
        System.out.println(valor);

    }
}
