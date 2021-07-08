package views;

import entities.Lista;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class viewLista extends JPanel {
    private JLabel lblNomeCabecalho;
    private JLabel lblNome;
    public viewLista(){
        lblNomeCabecalho = new JLabel("Nome: ");

        setBorder(new TitledBorder("Lista de Pacientes:"));


        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.insets = new Insets(10,10,10,10);
        gbc.anchor = GridBagConstraints.WEST;

        for(int i = 0; i < Lista.listPaciente.size(); i++){
            add(new JLabel("Nome: "),gbc);
            gbc.gridx++;
            add(new JLabel(Lista.listPaciente.get(i).getNome()),gbc);
            gbc.gridx = 0;
            gbc.gridy++;

            add(new JLabel("CFP: "),gbc);
            gbc.gridx++;
            add(new JLabel(Lista.listPaciente.get(i).getCPF()),gbc);
            gbc.gridx = 0;
            gbc.gridy++;

            add(new JLabel("Endereco: "),gbc);
            gbc.gridx++;
            String rua = Lista.listPaciente.get(i).getEndereco().getRua();
            String numero = Lista.listPaciente.get(i).getEndereco().getNumero();
            String bairro = Lista.listPaciente.get(i).getEndereco().getBairro();
            String cidade = Lista.listPaciente.get(i).getEndereco().getCidade();
            String estado = Lista.listPaciente.get(i).getEndereco().getEstado();
            String endereco = rua + " " + numero + " " + bairro + " " + cidade + " " + estado;
            add(new JLabel(endereco),gbc);
            gbc.gridx = 0;
            gbc.gridy++;

            add(new JLabel(),gbc);
            gbc.gridx++;
            add(new JLabel(),gbc);
            gbc.gridx = 0;
            gbc.gridy++;
        }

    }

}
