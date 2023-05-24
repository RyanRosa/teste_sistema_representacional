package br.sc.senac.mca.application.kl;

import br.sc.senac.mca.util.ConnectionFactory;
import br.sc.senac.mca.view.LoginView;

import java.sql.Connection;

public class Main {
    public static void main(String[]args){
        Connection conn = ConnectionFactory.getConexao();
        LoginView loginView = new LoginView();
    }
}
