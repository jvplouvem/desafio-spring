package com.ebix.desafio.desafio.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ebix.desafio.desafio.modelo.Cliente;
import com.ebix.desafio.desafio.modelo.dao.ClienteDAO;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteDAO clienteDAO;
	
	@Override
	public Cliente obterPorId(Long id) {
		return clienteDAO.obterPorId(id);
	}
	
	@Override
	public List<Cliente> getClientes() {
		return clienteDAO.listar();
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void criar(Cliente cliente) {
		clienteDAO.criar(cliente);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void alterar(Cliente cliente) {
		clienteDAO.alterar(cliente);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void excluir(Long id) {
		clienteDAO.excluir(id);
	}
}