package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Marcos", 1000);
        Gerente g = new Gerente("Carlos", 1000, 10);

        f.aumentarSalario(10);
        g.aumentarSalario(10); 

        System.out.println(f.getDados());
        System.out.println(g.getDados());


    }
}
