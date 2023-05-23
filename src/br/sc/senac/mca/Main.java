package br.sc.senac.mca;

import br.sc.senac.mca.util.ConnectionFactory;

import java.sql.Connection;

public class Main {
    public static void main(String[]args){
        Connection conn = ConnectionFactory.getConexao();
    }
}
