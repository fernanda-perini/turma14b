package exemplos.exemplo01;

/**
 * Funcionario
 */
public class Funcionario {
    private String nome;
    private double salario;

    // construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Overload - sobrecarga exige pelo menos 1 parâmetro diferente
    public Funcionario(String nome) {
        this.nome = nome;
    }

    /*
     * public Funcionario() { // default }
     */

    public String getNome() {
        return nome;
    }

    public String getNome(String titulo) {
        return titulo + " " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDados() {
        return nome + ", R$ " + salario;
    }

    public void aumentarSalario(double percentual) {
        if( percentual > 0 && percentual <= 100) {
            salario = salario + salario * percentual / 100;
        }
    }
}