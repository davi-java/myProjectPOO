package entities;

public class Prontuario {

    private String diagnostico;
    private String descricao;

    public Prontuario(String diagnostico, String descricao) {
        this.diagnostico = diagnostico;
        this.descricao = descricao;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Prontuario{" +
                "diagnostico='" + diagnostico + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
