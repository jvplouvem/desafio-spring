package com.ebix.desafio.desafio.modelo.service;

import java.util.List;

import com.ebix.desafio.desafio.modelo.Cliente;

public interface ClienteService {

	List<Cliente> getClientes();

	void excluir(Cliente cliente);

	void alterar(Cliente cliente);

	void criar(Cliente cliente);

	Cliente obterPorId(Long id);

}