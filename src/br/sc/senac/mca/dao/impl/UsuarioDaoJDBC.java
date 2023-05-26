package br.sc.senac.mca.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.sc.senac.mca.dao.UsuarioDao;
import br.sc.senac.mca.model.Usuario;

public class UsuarioDaoJDBC implements UsuarioDao{

	Connection conn = null;
	
	public UsuarioDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public Usuario acharPorId(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("insert into usuario(nome, dataAniversario, curso, fase, senha)"
					+ "values(?, ?, ?, ?, ?)");
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean autenticacao() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void insercao(Usuario usuario) {
		PreparedStatement st = null;
		try {
		st = conn.prepareStatement("insert into usuario(id, nome, dataAniversario, curso, fase, senha)"
				+ "values(?, ?, ?, ?, ?, ?)");
		st.setInt(1, usuario.getId());
		st.setString(2, usuario.getNome());
		st.setDate(3, new Date(usuario.getNascimento().getTime()));
		st.setString(4, usuario.getCurso());
		st.setInt(5, usuario.getFase());
		st.setString(6, usuario.getSenha());
		st.executeUpdate();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
