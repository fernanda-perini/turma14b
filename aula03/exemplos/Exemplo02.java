package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        // int i;

        /*         i = 1;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        } */
        
/*         for (i = 1;; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break; // interrompe o laço
            }
        } */

        for (int i = 1; i < 5; i++) { // 'i' local ao for
            System.out.print(i + " ");
        }

        // System.out.print("final : " + i);

    }
}
