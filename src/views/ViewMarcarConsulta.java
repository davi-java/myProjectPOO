package views;

import entities.Consulta;
import entities.Lista;
import entities.Medico;
import entities.Paciente;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Exception.EntidadeException;
import Exception.ConsultaException;

public class ViewMarcarConsulta extends JPanel implements ActionListener, MouseListener {

    private JLabel data;
    private JLabel medico;
    private JLabel paciente;

    private JTextField txtData;

    private JComboBox comboBoxPaciente;
    private String[] listaPaciente;
    private JComboBox comboBoxMedico;
    private String[] listaMedico;

    private JButton btnAgendar;

    public ViewMarcarConsulta(){
        data = new JLabel("Data: ");
        medico = new JLabel("Medico: ");
        paciente = new JLabel("Paciente: ");

        txtData = new JTextField(15);



        listaPaciente = new String[Lista.listPaciente.size() + 1];
        listaPaciente[0] = "Selecione Paciente";
        for (int i = 1; i <= Lista.listPaciente.size(); i++){
            listaPaciente[i] = Lista.listPaciente.get(i - 1).getNome();
        }
        comboBoxPaciente = new JComboBox(listaPaciente);
        comboBoxPaciente.setBounds(50,50,90,20);

        //Lista.createList();
        listaMedico = new String[Lista.listMedico.size() + 1];
        listaMedico[0] = "Selecione Medico";
        for (int i = 1; i <= Lista.listMedico.size(); i++){
            listaMedico[i] = Lista.listMedico.get(i - 1).getNome();
        }
        comboBoxMedico = new JComboBox(listaMedico);
        comboBoxMedico.setBounds(50,50,90,20);


        btnAgendar = new JButton("Agendar");
        btnAgendar.addActionListener(this);

        setBorder(new TitledBorder("<<Marcar Consulta>>"));

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.insets = new Insets(10,10,10,10);
        gbc.anchor = GridBagConstraints.EAST;

        add(data,gbc);

        gbc.gridy++;
        add(medico,gbc);

        gbc.gridy++;
        add(paciente,gbc);

        gbc.gridy = 0;
        gbc.gridx = 1;
        add(txtData,gbc);

        gbc.gridy++;
        add(comboBoxMedico,gbc);

        gbc.gridy++;
        add(comboBoxPaciente,gbc);


        gbc.gridy++;
        add(btnAgendar,gbc);

        gbc.gridy = 0;
        gbc.gridx = 2;
        add(new JLabel("dd/MM/YYYY"),gbc);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnAgendar){
            try {
                String nomeMedico = comboBoxMedico.getSelectedItem().toString();
                String nomePaciente = comboBoxPaciente.getSelectedItem().toString();
                Medico medico = null;
                Paciente paciente = null;
                for (Medico md: Lista.listMedico){
                    if(md.getNome().equals(nomeMedico)){
                        medico = new Medico(md.getNome(),
                                md.getEndereco(),
                                md.getDataNascimento(),
                                md.getCRM(),
                                md.getEspecialidade());
                    }
                }
                for (Paciente pc: Lista.listPaciente){
                    if(pc.getNome().equals(nomePaciente)){
                        paciente = new Paciente(pc.getNome(),
                                pc.getEndereco(),
                                pc.getDataNascimento(),
                                pc.getCPF());
                    }
                }
                String data = txtData.getText();
                Consulta consulta = new Consulta(data,medico,paciente);
                Lista.addConsulta(consulta);
                System.out.println(consulta);
            }catch (ConsultaException e){
                JOptionPane.showMessageDialog(new JFrame(),e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
