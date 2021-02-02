package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int nFuncionarios;

    public Gerente(String nome, double salario) {
        super(nome, salario); // chamada ao construtor da superclasse 'Funcionario'
    }

    // Overload
    public Gerente(String nome) {
        super(nome); // chamada ao construtor da superclasse 'Funcionario'
    }
    
}
