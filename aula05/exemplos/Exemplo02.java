package exemplos;

public class Exemplo02 {

    public static void main(String[] args) {
        linha(10, '-'); // chamada de método com parâmetro
        String texto = "Programa Itau v.0.1";
        System.out.println(texto);
        linha(texto.length(), '_'); //length - o tamanho do texto
        System.out.println("Escoha a opção mais adequada");
        linha(30, '*');
    }

    public static void linha(int tamanho, char tipo) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(tipo);
        }
        System.out.println(); // pular para a próxima linha
    }


}
