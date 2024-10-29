package pe.edu.nh.msClientes.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.nh.msClientes.dto.ClienteDTO;
import pe.edu.nh.msClientes.service.ClienteService;

@RestController
@RequestMapping("/v1/cliente")
@CrossOrigin(origins="*")
public class ClienteController {
	private final ClienteService clienteService;
	
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	
	@GetMapping("listar")
	public ResponseEntity<List<ClienteDTO>> getClientes(){
		return ResponseEntity.ok(this.clienteService.getAllClientes());
	}
}
