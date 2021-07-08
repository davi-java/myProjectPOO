package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ViewHome extends JFrame implements ActionListener, MouseListener {

    private JMenuBar menuBar;

    private JMenu menuConsulta;
    private JMenu menuPaciente;
    private JMenu menuMedico;
    private JMenu menuLista;

    private JMenuItem menuItemMarcar;
    private JMenuItem menuItemCancelar;
    private JMenuItem menuItemRemarcar;
    private JMenuItem menuItemRealizar;

    private JMenuItem menuItemCadastrarPaciente;
    private JMenuItem menuItemAtualizarPaciente;
    private JMenuItem menuItemArquivarPaciente;

    private JMenuItem menuItemCadastrarMedico;
    private JMenuItem menuItemAtualizarMedico;
    private JMenuItem menuItemArquivarMedico;

    private JMenuItem menuItemListaPaciente;
    private JMenuItem menuItemListaConsulta;

    private JPanel panelMenu;
    private JPanel panelForm;

    public ViewHome(String title){
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);
        setVisible(true);

        menuBar = new JMenuBar();

        menuConsulta = new JMenu("Consulta");
        menuPaciente = new JMenu("Paciente");
        menuMedico = new JMenu("Medico");
        menuLista = new JMenu("Lista");

        menuItemMarcar = new JMenuItem("Marcar");
        menuItemRemarcar = new JMenuItem("Remarcar");
        menuItemCancelar = new JMenuItem("Cancelar");
        menuItemRealizar = new JMenuItem("Realizar");
        menuItemCadastrarPaciente = new JMenuItem("Cadastrar");
        menuItemAtualizarPaciente = new JMenuItem("Atualizar");
        menuItemArquivarPaciente = new JMenuItem("Arquivar");
        menuItemCadastrarMedico = new JMenuItem("Cadastrar");
        menuItemAtualizarMedico = new JMenuItem("Atualizar");
        menuItemArquivarMedico = new JMenuItem("Arquivar");
        menuItemListaPaciente = new JMenuItem("Paciente");
        menuItemListaConsulta = new JMenuItem("Consulta");

        menuConsulta.add(menuItemMarcar);
        menuConsulta.add(menuItemRemarcar);
        menuConsulta.add(menuItemCancelar);
        menuConsulta.add(menuItemRealizar);
        menuPaciente.add(menuItemCadastrarPaciente);
        menuPaciente.add(menuItemAtualizarPaciente);
        menuPaciente.add(menuItemArquivarPaciente);
        menuMedico.add(menuItemCadastrarMedico);
        menuMedico.add(menuItemAtualizarMedico);
        menuMedico.add(menuItemArquivarMedico);
        menuLista.add(menuItemListaPaciente);
        menuLista.add(menuItemListaConsulta);

        menuBar.add(menuConsulta);
        menuBar.add(menuPaciente);
        menuBar.add(menuMedico);
        menuBar.add(menuLista);

        menuItemCadastrarPaciente.addActionListener(this);
        menuItemCadastrarMedico.addActionListener(this);
        menuItemMarcar.addActionListener(this);
        menuItemListaPaciente.addActionListener(this);

        setLayout(new GridBagLayout());

        panelMenu = createPanelMeneu(menuBar);
        //panelForm = createPanelForm();
        createPanelForm();

        //panelMenu.setBorder(new TitledBorder("Menu"));

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0,0,20,0);

        add(panelMenu,gbc);

        gbc.gridy++;
        gbc.weighty = 1;
        add(panelForm,gbc);

        pack();
    }

    private void createPanelForm() {
        panelForm = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        //panel.setBorder(new TitledBorder("Form"));
        panelForm.setPreferredSize(new Dimension(800,600));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;

        panelForm.add(new ViewPaciente(),gbc);
    }

    private JPanel createPanelMeneu(JMenuBar menuBar) {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setPreferredSize(new Dimension(100,400));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(menuBar,gbc);
        return panel;
    }

    private static GridBagConstraints newGbc(){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        return gbc;
    }

    public static void main(String[] args) {
        new ViewHome("Consul");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == menuItemCadastrarPaciente){
            panelForm.removeAll();
            panelForm.add(new ViewPaciente(),newGbc());
            panelForm.revalidate();
            panelForm.repaint();

        }else if(actionEvent.getSource() == menuItemCadastrarMedico){
            panelForm.removeAll();
            panelForm.add(new ViewMedico(),newGbc());
            panelForm.revalidate();
            panelForm.repaint();
        }else if (actionEvent.getSource() == menuItemMarcar){
            panelForm.removeAll();
            panelForm.add(new ViewMarcarConsulta(),newGbc());
            panelForm.revalidate();
            panelForm.repaint();
        }else if (actionEvent.getSource() == menuItemListaPaciente){
            panelForm.removeAll();
            JScrollPane scrollPane = new JScrollPane(new viewLista());
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            panelForm.add(scrollPane,newGbc());
            //panelForm.add(new viewLista(),newGbc());
            panelForm.revalidate();
            panelForm.repaint();
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
