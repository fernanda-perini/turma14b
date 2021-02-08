package br.paduan.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // classe será mapeada no BD
@Table(name = "clientes")
public class Cliente {

    @Id // indica chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1, 2, 3, ...
    @Column(name = "id") // nome da coluna no BD
    private int id;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "cpf", length = 11, nullable = false, unique = true)
    private String cpf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
