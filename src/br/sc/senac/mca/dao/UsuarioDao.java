package br.sc.senac.mca.dao;

import br.sc.senac.mca.model.Usuario;

public interface UsuarioDao {

	public Usuario acharPorId(Integer id);

	public void delete();

	public boolean autenticacao();

	public void insercao(Usuario usuario);
}