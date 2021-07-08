package views;

import entities.Endereco;
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

public class ViewMedico extends JPanel implements ActionListener, MouseListener {
    private JLabel nome;
    private JLabel CRM;
    private JLabel dataNascimento;
    private JLabel rua;
    private JLabel numero;
    private JLabel bairro;
    private JLabel cidade;
    private JLabel estado;
    private JLabel especialidade;

    private JTextField txfNome;
    private JTextField txtCRM;
    private JTextField txtDataNascimento;
    private JTextField txtRua;
    private JTextField txtNumero;
    private JTextField txtBairro;
    private JTextField txtCidade;
    private JTextField txtEstado;
    private JTextField txtEspecialidade;

    private JButton btnCadastrar;

    public ViewMedico(){
        nome = new JLabel("Nome: ");
        CRM = new JLabel("CRM: ");
        dataNascimento = new JLabel("Data Nascimento: ");
        rua = new JLabel("Rua: ");
        numero = new JLabel("Numero: ");
        bairro = new JLabel("Bairro: ");
        cidade = new JLabel("Cidade: ");
        estado = new JLabel("Estado: ");
        especialidade = new JLabel("Especialidade: ");

        txfNome = new JTextField(15);
        txtCRM = new JTextField(15);
        txtDataNascimento = new JTextField(15);
        txtRua = new JTextField(15);
        txtNumero = new JTextField(15);
        txtBairro = new JTextField(15);
        txtCidade = new JTextField(15);
        txtEstado = new JTextField(15);
        txtEspecialidade = new JTextField(15);

        btnCadastrar = new JButton("Cadastrar");

        btnCadastrar.addActionListener(this);

        setBorder(new TitledBorder("<<Medico>>"));

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.insets = new Insets(10,10,10,10);
        gbc.anchor = GridBagConstraints.EAST;

        add(nome,gbc);

        gbc.gridy++;
        add(CRM,gbc);

        gbc.gridy++;
        add(dataNascimento,gbc);

        gbc.gridy++;
        add(rua,gbc);

        gbc.gridy++;
        add(numero,gbc);

        gbc.gridy++;
        add(bairro,gbc);

        gbc.gridy++;
        add(cidade,gbc);

        gbc.gridy++;
        add(estado,gbc);

        gbc.gridy++;
        add(especialidade,gbc);

        gbc.gridy = 0;
        gbc.gridx = 1;
        add(txfNome,gbc);

        gbc.gridy++;
        add(txtCRM,gbc);

        gbc.gridy++;
        add(txtDataNascimento,gbc);

        gbc.gridy++;
        add(txtRua,gbc);

        gbc.gridy++;
        add(txtNumero,gbc);

        gbc.gridy++;
        add(txtBairro,gbc);

        gbc.gridy++;
        add(txtCidade,gbc);

        gbc.gridy++;
        add(txtEstado,gbc);

        gbc.gridy++;
        add(txtEspecialidade,gbc);

        gbc.gridy++;
        add(btnCadastrar,gbc);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.btnCadastrar){
            Endereco endereco = createEndereco();
            Medico medico = createMedico(endereco);

            Lista.addMedico(medico);
            Lista.mostrarMedico();

            clearTextFields();

        }
    }

    private void clearTextFields() {
        txfNome.setText("");
        txtCRM.setText("");
        txtDataNascimento.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtEspecialidade.setText("");

        txfNome.grabFocus();
    }

    private Medico createMedico(Endereco endereco) {
        String nome = txfNome.getText();
        String CRM = txtCRM.getText();
        String dataNascimento = txtDataNascimento.getText();
        String especialidade = txtEspecialidade.getText();
        Medico medico = new Medico(nome,endereco,dataNascimento,CRM,especialidade);
        return medico;
    }

    private Endereco createEndereco() {
        String rua = txtRua.getText();
        String numero = txtNumero.getText();
        String bairro = txtBairro.getText();
        String cidade = txtCidade.getText();
        String estado = txtEstado.getText();
        Endereco endereco = new Endereco(rua,numero,bairro,cidade,estado);
        return endereco;
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
