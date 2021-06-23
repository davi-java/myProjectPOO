package entities;

import java.util.Date;

public class Consulta {

    private Date data;
    private Consultorio consultorio;
    private Medico medico;
    private Paciente paciente;
    private Prontuario prontuario;
    private Receita receita;
    private String status;

    public Consulta(Date data, Consultorio consultorio, Medico medico, Paciente paciente, String status) {
        this.data = data;
        this.consultorio = consultorio;
        this.medico = medico;
        this.paciente = paciente;
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "data=" + data +
                ", consultorio=" + consultorio +
                ", medico=" + medico +
                ", paciente=" + paciente +
                ", prontuario=" + prontuario +
                ", receita=" + receita +
                ", status='" + status + '\'' +
                '}';
    }
}
