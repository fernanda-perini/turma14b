package exercicios.exercicio03;

public class AppConta {
    public static void main(String[] args) {
        ContaPoupanca cp1 = new ContaPoupanca(123);
        ContaPoupanca cp2 = new ContaPoupanca(321);

        ContaPoupanca.setTaxa(0.1);

        System.out.println(cp1);
        System.out.println(cp2);

    }
}
