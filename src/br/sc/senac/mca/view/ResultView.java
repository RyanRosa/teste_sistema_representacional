package br.sc.senac.mca.view;

import javax.swing.*;

public class ResultView extends JFrame{
    private JPanel pnlResult;
    private JLabel lblGetNome;
    private JLabel lblNome;

    public ResultView(){
        initializer();
    }
    public void initializer(){
        setVisible(true);
        setContentPane(pnlResult);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Resultado");
        setSize(100, 100);
        lblGetNome.setText("Ryan");
        setLocationRelativeTo(null);
    }
}
