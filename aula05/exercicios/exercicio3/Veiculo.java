package exercicios.exercicio3;

public class Veiculo {
    private String modelo, marca;
    private double consumo;

    public Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        alterarConsumo(consumo);
    }

    public void exibir() {
        System.out.println("Veiculo-> " + modelo + " : " + marca);
    }

    public double obterConsumo() {
        return consumo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void alterarConsumo(double consumo) {
        if (consumo > 0) {
            this.consumo = consumo;
        }
    }
    
    public void setConsumo(double consumo) {
        if (consumo > 0) {
            this.consumo = consumo;
        }
    }
}
