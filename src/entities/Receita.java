package entities;

import java.util.ArrayList;
import java.util.Date;

public class Receita {

    private Date data;
    private ArrayList<Remedio> listaRemedio;
    private String descricao;

    public Receita(Date data, String descricao) {
        this.data = data;
        this.descricao = descricao;
        this.listaRemedio = new ArrayList<>();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public void addRemedio(Remedio remedio){
        listaRemedio.add(remedio);
    }

    public void removerRemedio(Remedio remedio){
        listaRemedio.removeIf(x -> x.getNome().equals(remedio.getNome()));
    }

    public void mostrarListaRemedio(){
        for (Remedio remedio: listaRemedio){
            System.out.println(remedio);
        }
    }

    @Override
    public String toString() {
        return "Receita{" +
                "data=" + data +
                ", listaRemedio=" + listaRemedio +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
