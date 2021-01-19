package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
			cliente1.setId(001L);
			cliente1.setNome("Max");
			cliente1.setEmail("maxssilva@yahoo.com.br");
			cliente1.setTelefone("34-992329193");
		
		var cliente2 = new Cliente();
		cliente2.setId(002L);
		cliente2.setNome("Lauriane");
		cliente2.setEmail("laurianesc@yahoo.com.br");
		cliente2.setTelefone("34-991812723");
		
		return Arrays.asList(cliente1, cliente2);
		
		
	}

}
