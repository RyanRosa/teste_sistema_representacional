package br.sc.senac.mca.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView {
    private JPanel panel1;
    private JButton btnBack;
    private JButton btnConfirm;
    private JTextField txtPassword;
    private JTextField txtLogin;
    private JLabel lblPassword;
    private JLabel lblLogin;
    private JButton registerButton;

    public LoginView() {


}
private void allComponents(){
    btnConfirm.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });

    btnBack.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
