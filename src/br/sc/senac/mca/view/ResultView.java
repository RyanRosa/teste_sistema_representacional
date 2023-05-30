package br.sc.senac.mca.view;

import br.sc.senac.mca.model.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

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
    private JLabel lblDataNascimentoFix;
    private JLabel lblDataNascimento;
    private JLabel lblFase;
    private JLabel lblFaseFix;
    private JLabel lblCursoFix;
    private JLabel lblCurso;

    private Usuario usuario;

    public ResultView(Usuario usuario) {
        this.usuario = usuario;
        initializer();
        todosComponentes();
        mostrarDados();
    }

    private void initializer() {
        setVisible(true);
        setContentPane(pnlResult);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Resultado");
        setSize(350, 145);
        setLocationRelativeTo(null);
    }

    private void todosComponentes() {
        btnDeslogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginView loginView = new LoginView();
                dispose();

            }
        });
    }
    private void mostrarDados(){
        lblNome.setText(usuario.getNome());
        lblFase.setText(String.valueOf(usuario.getFase()));
        lblCurso.setText(usuario.getCurso());
        lblDataNascimento.setText(String.valueOf(usuario.getNascimento()));
        lblDigital.setText(String.valueOf(usuario.getTeste().getDigital()) + "%");
        lblAuditivo.setText(String.valueOf(usuario.getTeste().getAuditivo()) + "%");
        lblCinestésico.setText(String.valueOf(usuario.getTeste().getCinestesico()) + "%");
        lblVisual.setText(String.valueOf(usuario.getTeste().getVisual()) + "%");
    }
}
