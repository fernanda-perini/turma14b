package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        int retorno;

        retorno = soma(5, 10);
        System.out.println("A soma vale: " + retorno);
    }

    // void - 'sem' retorno
    public static int soma(int a, int b) {
        int resultado;

        resultado = a + b;

        return resultado; // devolve o valor, encerrando a execução do método

    }
}
