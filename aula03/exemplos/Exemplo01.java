package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int cont;

        cont = 1; //inicialização

        while (cont < 5) {
            System.out.println(cont);
            cont++; // cont = cont + 1;
            // cont += 2; // cont = cont + 2;
            // cont--;
        }

        System.out.println("fim: " + cont);
    }
}