package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Marcos", 3000);
        Funcionario f2 = new Funcionario("Julia");
        // Funcionario f3 = new Funcionario();

         Gerente g = new Gerente("Amanda");

        // f.setNome("Antônio");
        System.out.println("Funcionario: " + f.getNome());

        // g.setNome("Carlos");
        System.out.println("Gerente: " + g.getNome());
        System.out.println("Gerente: " + g.getNome("sra."));
    }
}
