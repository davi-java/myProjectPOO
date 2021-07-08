package views;

import entities.Endereco;
import entities.Lista;
import entities.Paciente;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ViewPaciente extends JPanel implements ActionListener, MouseListener {

    private JLabel nome;
    private JLabel CFP;
    private JLabel dataNascimento;
    private JLabel rua;
    private JLabel numero;
    private JLabel bairro;
    private JLabel cidade;
    private JLabel estado;

    private JTextField txfNome;
    private JTextField txtCPF;
    private JTextField txtDataNascimento;
    private JTextField txtRua;
    private JTextField txtNumero;
    private JTextField txtBairro;
    private JTextField txtCidade;
    private JTextField txtEstado;

    private JButton btnCadastrar;

    public ViewPaciente(){
        nome = new JLabel("Nome: ");
        CFP = new JLabel("CPF: ");
        dataNascimento = new JLabel("Data Nascimento: ");
        rua = new JLabel("Rua: ");
        numero = new JLabel("Numero: ");
        bairro = new JLabel("Bairro: ");
        cidade = new JLabel("Cidade: ");
        estado = new JLabel("Estado: ");

        txfNome = new JTextField(15);
        txtCPF = new JTextField(15);
        txtDataNascimento = new JTextField(15);
        txtRua = new JTextField(15);
        txtNumero = new JTextField(15);
        txtBairro = new JTextField(15);
        txtCidade = new JTextField(15);
        txtEstado = new JTextField(15);

        btnCadastrar = new JButton("Cadastrar");

        btnCadastrar.addActionListener(this);

        setBorder(new TitledBorder("<<Paciente>>"));

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.insets = new Insets(10,10,10,10);
        gbc.anchor = GridBagConstraints.EAST;

        add(nome,gbc);

        gbc.gridy++;
        add(CFP,gbc);

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

        gbc.gridy = 0;
        gbc.gridx = 1;
        add(txfNome,gbc);

        gbc.gridy++;
        add(txtCPF,gbc);

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
        add(btnCadastrar,gbc);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.btnCadastrar){
            Endereco endereco = createEndereco();
            Paciente paciente = createPaciente(endereco);

            Lista.addPaciente(paciente);
            Lista.mostrarPaciente();

            clearTextFields();

        }
    }

    private void clearTextFields() {
        txfNome.setText("");
        txtCPF.setText("");
        txtDataNascimento.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtEstado.setText("");

        txfNome.grabFocus();
    }

    private Paciente createPaciente(Endereco endereco) {
        String nome = txfNome.getText();
        String CPF = txtCPF.getText();
        String dataNascimento = txtDataNascimento.getText();
        Paciente paciente = new Paciente(nome,endereco,dataNascimento,CPF);
        return paciente;
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
