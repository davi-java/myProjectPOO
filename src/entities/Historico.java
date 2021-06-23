package entities;

import java.util.ArrayList;

public class Historico {

    private ArrayList<Consulta> listConsulta;
    private ArrayList<Paciente> listPaciente;

    public Historico() {
        this.listConsulta = new ArrayList<>();
        this.listPaciente = new ArrayList<>();
    }

    public void addConsulta(Consulta consulta){
        this.listConsulta.add(consulta);
    }
    public void mostrarConsulta(){
        for (Consulta consulta: this.listConsulta){
            System.out.println(consulta);
        }
    }

    public void addPaciente(Paciente paciente){
        this.listPaciente.add(paciente);
    }
    public void mostrarPaciente(){
        for (Paciente paciente: this.listPaciente){
            System.out.println(paciente);
        }
    }
}
