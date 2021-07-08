package Main;

import entities.*;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("13 de maio","692","Centro","Nioaque","MS");
        Medico medico = new Medico("Daniel",endereco,"25/04/1991","123321","Cardiologista");
        Paciente paciente = new Paciente("Davi",endereco,"25/04/1991","04158518156");
        Consultorio consultorio = new Consultorio("ConsulSaude",endereco,"perto da praça");


        Remedio r1 = new Remedio("Azitromician",10);
        Remedio r2 = new Remedio("Ubrupfone",10);
        Remedio r3 = new Remedio("AS",10);
        Receita receita = new Receita(new Date(),"8 em 8 hrs");

        Prontuario prontuario = new Prontuario("Bronquite","Bronquite leve");

        //Consulta consulta = new Consulta("12/02/2022",medico,paciente);

        //System.out.println(consulta);

    }
}
