package pe.edu.nh.msClientes.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import pe.edu.nh.msClientes.dto.ClienteDTO;
import pe.edu.nh.msClientes.model.Cliente;
import pe.edu.nh.msClientes.repository.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	private final ModelMapper modelMapper;
	
	public ClienteService(ClienteRepository clienteRepository, ModelMapper modelMapper) {
		this.clienteRepository = clienteRepository;
		this.modelMapper = modelMapper;
	}
	
	public List<ClienteDTO> getAllClientes(){
		List<Cliente> clientes = clienteRepository.findAll();
		List<ClienteDTO> clienteDTOs = clientes.stream().
				map(cliente -> modelMapper.map(cliente, ClienteDTO.class)).toList();
		return clienteDTOs;
	}
	
}
