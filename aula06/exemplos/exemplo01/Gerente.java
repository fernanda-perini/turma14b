package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int nFuncionarios;

    public Gerente(String nome, double salario, int nFuncionarios) {
        super(nome, salario); // chamada ao construtor da superclasse 'Funcionario'
        this.nFuncionarios = nFuncionarios;
    }

    // Overload
    public Gerente(String nome) {
        super(nome); // chamada ao construtor da superclasse 'Funcionario'
    }

    @Override // anotação indicando a sobreescrita
    public String getDados() {
        return super.getDados() + " : " + nFuncionarios;
    }

    @Override
    public void aumentarSalario(double percentual) {
        super.aumentarSalario(percentual + 20);
    }
}
