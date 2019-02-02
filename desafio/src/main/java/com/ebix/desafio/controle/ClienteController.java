package com.ebix.desafio.controle;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ebix.desafio.desafio.modelo.Cliente;
import com.ebix.desafio.desafio.modelo.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping("/")
	public String teste() {
      return "/cliente/formulario-cliente";
	}
	
	@RequestMapping(value = "/criar", method=RequestMethod.POST)
	public String criar(@RequestParam("nome") String nome) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		clienteService.criar(cliente);
		
		return "/cliente/formulario-cliente";
	}
	
	@RequestMapping(value = "/detalhar", method=RequestMethod.POST)
	public String detalhar(@RequestParam("id") Long id, @RequestParam("nome") String nome) {
		Cliente cliente = new Cliente();
		cliente.setId(id);
		cliente.setNome(nome);
		clienteService.alterar(cliente);
		return "/cliente/formulario-cliente";
	}
	
	@RequestMapping(value = "/alterar", method=RequestMethod.POST)
	public String alterar(@RequestParam("id") Long id, @RequestParam("nome") String nome) {
		Cliente cliente = new Cliente();
		cliente.setId(id);
		cliente.setNome(nome);
		clienteService.alterar(cliente);
		return "/cliente/formulario-cliente";
	}
	
	@RequestMapping(value = "/listar")
	public ModelAndView listar(ModelAndView model) throws IOException {
		List<Cliente> clientes = clienteService.getClientes();
		
		model.addObject("clientes", clientes);
		model.setViewName("/cliente/listagem-cliente");
		return model;
	}
}