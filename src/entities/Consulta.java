package entities;

import java.util.Date;
import Exception.ConsultaException;

public class Consulta {

    private String data;
    private Consultorio consultorio;
    private Medico medico;
    private Paciente paciente;
    private Prontuario prontuario;
    private Receita receita;
    private String status;

    public Consulta(String data,Medico medico, Paciente paciente) throws ConsultaException {
        if (data.equals("")){
            throw new ConsultaException("Data Invalida");
        }
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
        this.status = "Agendada";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
