package services;

import entities.Consulta;

import java.util.Date;

public class ServicoAtendimento {

    private Date data;

    public ServicoAtendimento(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void realizarConsulta(Consulta consulta){

    }

    public void prescreverProntuario(){

    }

    public void prescreverReceita(){

    }

}
