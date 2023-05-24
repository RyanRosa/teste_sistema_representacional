package br.sc.senac.mca.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
