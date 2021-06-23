package entities;

import java.util.Date;

public class Medico extends Entidade{
    private String CRM;
    private String especialidade;

    public Medico(String nome, Endereco endereco, Date dataNascimento, String CRM, String especialidade) {
        super(nome, endereco, dataNascimento);
        this.CRM = CRM;
        this.especialidade = especialidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void realizarConsultar(){
        System.out.println("Solicitar Consulta");
    }

    @Override
    public String toString() {
        return "Medico{" +
                "CRM='" + CRM + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}' + super.toString();
    }
}
