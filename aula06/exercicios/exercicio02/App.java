package exercicios.exercicio02;

public class App {
    public static void main(String[] args) {
        // Pessoa p = new Pessoa("Adriano", "9876-9876");
        Estudante e = new Estudante("Bia", "987654321", "Programação Java");
        Professor prof = new Professor("Ricardo", "123456789", 4000);

        Pessoa p1 = new Estudante("João", "123123123", "Magica avançada");
        Pessoa p2 = new Professor("João", "123123123", 5000);

        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(e);
        System.out.println(prof);
    }
}
