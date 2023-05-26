package br.sc.senac.mca.dao;

import br.sc.senac.mca.model.Teste;

public interface TesteDao {

	public Teste acharPorId();

	public void delete();

	public void insercao();

}
