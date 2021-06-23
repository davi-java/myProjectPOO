package entities;

public class Consultorio {

    private String nome;
    private Endereco endereco;
    private String descricao;

    public Consultorio(String nome, Endereco endereco, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Consultorio{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
