package br.sc.senac.mca.dao;

import br.sc.senac.mca.dao.impl.UsuarioDaoJDBC;
import br.sc.senac.mca.util.ConnectionFactory;

public class DaoFactory {
	
	public static UsuarioDao createUsuarioDao() {
		return new UsuarioDaoJDBC(ConnectionFactory.getConexao());
	}

}
