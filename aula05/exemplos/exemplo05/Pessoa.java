package exemplos.exemplo05;

// acrecentar o atributo 'salário'
// acrescentar o método 'exibir' para mostrar os dados

public class Pessoa {
    // atributo (característica) da Pessoa
    String nome;
    double salario;

    // Construtor da classe Pessoa
    // this se refere ao atributo (ao próprio objeto)
    Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // método (ação) da Pessoa
    void apresentar() {
        System.out.println("Olá! Eu sou a(o) " + nome);
    }

    void exibir(){
        System.out.println(nome + " : "+ salario);
    }
}
