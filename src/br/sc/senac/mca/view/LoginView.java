package br.sc.senac.mca.view;

import br.sc.senac.mca.dao.DaoFactory;
import br.sc.senac.mca.dao.impl.UsuarioDaoJDBC;
import br.sc.senac.mca.model.Teste;
import br.sc.senac.mca.model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class LoginView extends JFrame{
    private JPanel pnlLogin;
    private JButton btnSair;
    private JButton btnLogin;
    private JTextField txtPassword;
    private JTextField txtLogin;
    private JLabel lblPassword;
    private JLabel lblLogin;
    private JButton btnRegistrar;

    public LoginView() {
        allComponents();
        initializer();
    }
private void initializer(){
        setContentPane(pnlLogin);
        setTitle("Login");
        setVisible(true);
        setMinimumSize(new Dimension(400,120));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
}
private void allComponents(){
    btnLogin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	Usuario usuario = UsuarioDaoJDBC.
            ResultView resultView = new ResultView(new Usuario("Ryan", Date.valueOf("2001-01-01"), "ADS", 2, "123", teste));
            dispose();
        }
    });
    btnSair.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    });

    btnRegistrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            RegisterView registerView = new RegisterView();
        }
    });
}
}
