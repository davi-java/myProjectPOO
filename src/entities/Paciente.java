package entities;

import java.util.Date;

public class Paciente extends Entidade {
    private String CPF;

    public Paciente(String nome, Endereco endereco, Date dataNascimento, String CPF) {
        super(nome, endereco, dataNascimento);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void solicitarConsulta(){
        System.out.println("SolicitarConsulta");
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "CPF='" + CPF + '\'' +
                '}' +
                super.toString();
    }
}
