package br.sc.senac.mca.view;

import br.sc.senac.mca.dao.DaoFactory;
import br.sc.senac.mca.dao.UsuarioDao;
import br.sc.senac.mca.model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class RegisterView extends JFrame {
    private JPanel pnlRegister;
    private JTextField txtDataDeNascimento;
    private JTextField txtNome;
    private JPasswordField pswSenha;
    private JTextField txtCurso;
    private JButton btnCadastrar;
    private JLabel lblSenha;
    private JLabel lblCurso;
    private JLabel lblNome;
    private JLabel lblDataDeNascimento;
    private JLabel lblFase;
    private JLabel lblCadastro;
    private JComboBox cbbFase;

    private UsuarioDao usuarioDao;

    public RegisterView() {
        initializer();
        allComponents();
        this.usuarioDao = DaoFactory.createUsuarioDao();
    }

    private void initializer() {
        setVisible(true);
        setSize(300, 210);
        setTitle("Cadastro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(pnlRegister);
        setLocationRelativeTo(null);
    }

    private void allComponents() {
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Usuario usuario = CriarUsuario();
                    //FormView formView = new FormView(usuario);
                    //dispose();
                    usuarioDao.insercao(usuario);
                    FormView formView = new FormView(usuario);
                    dispose();
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                }
            }
        });
    }

    private Usuario CriarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNome(txtNome.getText());
        usuario.setNascimento(Date.valueOf(txtDataDeNascimento.getText()));
        usuario.setCurso(txtCurso.getText());
        usuario.setFase(Integer.parseInt(String.valueOf(cbbFase.getSelectedItem())));
        usuario.setSenha(pswSenha.getText());

        return usuario;
    }


}
