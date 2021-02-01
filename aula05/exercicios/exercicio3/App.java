package exercicios.exercicio3;

public class App {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Vectra", "Chevrolet", 7.5);

        veiculo.exibir();
        System.out.printf("Consumo: %.2f\n" , veiculo.obterConsumo());

        // veiculo.consumo = 0;
        veiculo.alterarConsumo(-7);

        System.out.printf("Consumo: %.2f\n" , veiculo.obterConsumo());
    }
}

