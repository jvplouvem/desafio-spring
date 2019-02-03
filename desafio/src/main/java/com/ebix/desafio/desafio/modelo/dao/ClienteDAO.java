package com.ebix.desafio.desafio.modelo.dao;

import java.util.List;

import com.ebix.desafio.desafio.modelo.Cliente;

public interface ClienteDAO {

	List<Cliente> listar();

	void alterar(Cliente cliente);

	void criar(Cliente cliente);
	
	void excluir(Long id);

	Cliente obterPorId(Long id);

}