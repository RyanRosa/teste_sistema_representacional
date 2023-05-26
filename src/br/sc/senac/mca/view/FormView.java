package br.sc.senac.mca.view;

import br.sc.senac.mca.dao.DaoFactory;
import br.sc.senac.mca.dao.UsuarioDao;
import br.sc.senac.mca.dao.impl.UsuarioDaoJDBC;
import br.sc.senac.mca.model.Teste;
import br.sc.senac.mca.model.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormView extends JFrame{
    private JComboBox cbxQuestion1_1;
    private JComboBox cbxQuestion1_2;
    private JComboBox cbxQuestion1_3;
    private JComboBox cbxQuestion1_4;
    private JButton btnEnviar;
    private JComboBox cbxQuestion2_1;
    private JComboBox cbxQuestion2_2;
    private JComboBox cbxQuestion2_3;
    private JComboBox cbxQuestion2_4;
    private JComboBox cbxQuestion3_1;
    private JComboBox cbxQuestion3_2;
    private JComboBox cbxQuestion3_3;
    private JComboBox cbxQuestion3_4;
    private JComboBox cbxQuestion4_1;
    private JComboBox cbxQuestion4_2;
    private JComboBox cbxQuestion4_3;
    private JComboBox cbxQuestion4_4;
    private JComboBox cbxQuestion5_1;
    private JComboBox cbxQuestion5_2;
    private JComboBox cbxQuestion5_3;
    private JComboBox cbxQuestion5_4;
    private JPanel pnlForm;
    private Usuario usuario;
    private UsuarioDao usuarioDao;

    public FormView(Usuario usuario) {
        this.usuario = usuario;
        allComponents();
        initializer();
        this.usuarioDao = DaoFactory.createUsuarioDao();
}
public void initializer(){
    setTitle("Formulário");
    setVisible(true);
    setSize(600, 1000);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setContentPane(pnlForm);
    setLocationRelativeTo(null);
    pack();
}
public void allComponents(){
    btnEnviar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Enviado com sucesso");
            Teste teste = new Teste();
            usuarioDao.insercao(usuario);
            ResultView resultView = new ResultView(usuario);
            dispose();
        }
    });
}
}
