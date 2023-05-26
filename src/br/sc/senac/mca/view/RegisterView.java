package br.sc.senac.mca.view;

import br.sc.senac.mca.model.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterView extends JFrame{
    private JPanel pnlRegister;
    private JTextField txtDataDeNascimento;
    private JTextField txtNome;
    private JPasswordField pswSenha;
    private JTextField txtFase;
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
            try {
                Usuario usuario = new Usuario(txtNome.getText(), new SimpleDateFormat("dd/MM/yyyy").parse(txtDataDeNascimento.getText()), txtCurso.getText(), Integer.parseInt(txtFase.getText()), pswSenha.getText());
                FormView formView = new FormView(usuario);
                dispose();
            }catch(Exception exception){
                System.out.println(exception.getMessage());
            }

        }
    });
}
}
