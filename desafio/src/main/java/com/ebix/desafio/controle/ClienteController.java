package com.ebix.desafio.controle;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ebix.desafio.desafio.modelo.Cliente;
import com.ebix.desafio.desafio.modelo.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired(required=true)
	private ClienteService clienteService;
	
	@RequestMapping("/")
	public String teste() {
      return "/cliente/formulario-cliente";
	}
	
	@RequestMapping(value = "/salvar", method=RequestMethod.POST)
	public String salvar() {
      return "/cliente/formulario-cliente";
	}
	
	@RequestMapping(value = "/listar")
	public ModelAndView listar(ModelAndView model) throws IOException {
		List<Cliente> clientes = clienteService.getClientes();
		
		model.addObject("clientes", clientes);
		model.setViewName("/cliente/formulario-client");
		return model;
	}
}