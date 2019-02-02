package com.ebix.desafio.desafio.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebix.desafio.desafio.modelo.Cliente;
import com.ebix.desafio.desafio.modelo.dao.ClienteDAO;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteDAO clienteDAO;
	
	@Override
	public List<Cliente> getClientes() {
		return clienteDAO.getClientes();
	}
}