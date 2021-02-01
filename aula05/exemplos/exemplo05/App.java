package exemplos.exemplo05;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Emerson", 1000);
        Pessoa pessoa2 = new Pessoa("Amanda", 2000);

        // pessoa1.nome = "Emerson";
        pessoa1.apresentar();
        pessoa1.exibir();
        
        // pessoa2.nome = "Amanda";
        pessoa2.apresentar();
        pessoa2.exibir();

    }
}
