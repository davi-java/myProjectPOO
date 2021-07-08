package entities;

import java.util.ArrayList;

public class Lista {

    public static ArrayList<Consulta> listConsulta = new ArrayList<>();
    public static ArrayList<Paciente> listPaciente = new ArrayList<>();
    public static ArrayList<Medico> listMedico = new ArrayList<>();

    public static void createList(){
        listMedico.add(new Medico(
                "Mateus",
                new Endereco("13","23","baia","nioaque","MS"),
                "25/26/28","!@#$","clinico geral"));
        listMedico.add(new Medico(
                "Maria",
                new Endereco("13","23","baia","nioaque","MS"),
                "25/26/28","!@#$","clinico geral"));
    }

    public static void addMedico(Medico medico){
        listMedico.add(medico);
    }
    public static void mostrarMedico(){
        System.out.println("medicos");
        for (Medico medico: listMedico){
            System.out.println(medico);
        }
    }


    public static void addConsulta(Consulta consulta){
        listConsulta.add(consulta);
    }
    public static void mostrarConsulta(){
        for (Consulta consulta: listConsulta){
            System.out.println(consulta);
        }
    }

    public static void addPaciente(Paciente paciente){
        listPaciente.add(paciente);
    }
    public static void mostrarPaciente(){
        System.out.println("Lista");
        for (Paciente paciente: listPaciente){
            System.out.println(paciente.getNome());
        }
    }
}
