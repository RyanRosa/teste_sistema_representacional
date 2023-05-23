package br.sc.senac.mca.util;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/gerenciamento";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; //vai para o metod getConnection

    public static Connection getConexao() {
        Connection conexao = null; // inicializando o objeto conexao e atribuindo um valor nulo (tipo connection)

        try {
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);

            if (conexao != null) {
                System.out.println("Conexão estabelecida! ");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);// tratar com excecao SQL e dar nome de E que vai retornar uma mensagem p o usuario
        }
        return conexao;
    }
}






