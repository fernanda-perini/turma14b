package exemplos;

public class Exemplo06 {
    public static void main(String[] args) {
        int n1, n2;
        double media;

        n1 = 6;
        n2 = 7;

        media = (double)(n1 + n2) / 2; // casting temporário de 'int' para 'double'

        System.out.println(media);
    }
}
