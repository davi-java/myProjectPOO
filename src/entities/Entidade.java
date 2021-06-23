package entities;

import java.util.Date;

public class Entidade {

    private String nome;
    private Endereco endereco;
    private Date dataNascimento;

    public Entidade(String nome, Endereco endereco, Date dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Entidade{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
