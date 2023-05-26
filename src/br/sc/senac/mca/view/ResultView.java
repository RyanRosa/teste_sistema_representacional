package br.sc.senac.mca.view;

import br.sc.senac.mca.model.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultView extends JFrame {
    private JPanel pnlResult;
    private JLabel lblNome;
    private JLabel lblNomeFix;
    private JButton btnDeslogar;
    private JLabel lblDigitalFix;
    private JLabel lblAuditivoFix;
    private JLabel lblCinestesicoFix;
    private JLabel lblVisualFix;
    private JLabel lblDigital;
    private JLabel lblAuditivo;
    private JLabel lblCinestésico;
    private JLabel lblVisual;

    private Usuario usuario;

    public ResultView(Usuario usuario) {
        initializer();
        todosComponentes();
        this.usuario = usuario;

    }

    private void initializer() {
        setVisible(true);
        setContentPane(pnlResult);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Resultado");
        setSize(100, 100);
        lblNome.setText("Ryan");
        setLocationRelativeTo(null);
    }

    private void todosComponentes() {
        btnDeslogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginView loginView = new LoginView();
            }
        });
    }
    private void mostrarDados(){
        /*lblNome.setText(usuario.getNome());
        lblDigital.setText(usuario.getTeste().getDigital());
        lblAuditivo.setText(usuario.getTeste().getAuditivo());
        lblCinestésico.setText(usuario.getTeste().getCinestesico());
        lblVisual.setText(usuario.getTeste().getVisual());*/
    }
}
