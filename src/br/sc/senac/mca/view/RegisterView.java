package br.sc.senac.mca.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterView extends JFrame{
    private JPanel pnlRegister;
    private JTextField txtDataDeNascimento;
    private JTextField txtNome;
    private JPasswordField pswSenha;
    private JTextField textField3;
    private JTextField txtCurso;
    private JButton btnCadastrar;
    private JLabel lblSenha;
    private JLabel lblCurso;
    private JLabel lblNome;
    private JLabel lblDataDeNascimento;
    private JLabel lblFase;
    private JLabel lblCadastro;

    public RegisterView() {
    initializer();
    allComponents();
}

public void initializer(){
    setVisible(true);
    setSize(300,210);
    setTitle("Cadastro");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setContentPane(pnlRegister);
    setLocationRelativeTo(null);

}
public void allComponents(){
    btnCadastrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
            dispose();
            FormView formView = new FormView();
        }
    });
}
}
