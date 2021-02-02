package exercicios.exercicio01;

public class App {
    public static void main(String[] args) {
        Placar placar1 = new Placar();
        Placar placar2 = new Placar("Palmeiras", "São Paulo");
        Placar placar3 = new Placar("Palmeiras", "Santos", 2, 1);

        placar1.exibir();
        placar2.exibir();
        placar3.exibir();
    }
}
