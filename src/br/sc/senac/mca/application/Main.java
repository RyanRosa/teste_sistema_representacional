package br.sc.senac.mca.application;

import br.sc.senac.mca.util.ConnectionFactory;
import br.sc.senac.mca.view.LoginView;
import br.sc.senac.mca.view.ResultView;

import java.sql.Connection;

public class Main {
    public static void main(String[]args){
        Connection conn = ConnectionFactory.getConexao();
        ResultView resultView = new ResultView();
    }
}
