package pe.edu.nh.msClientes.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO implements Serializable {
	private Integer clienteId;
	private String nombre;
	private String apePaterno;
	private String apeMaterno;
	private String direccion;
	private String telefono;
	private String email;
	private Date fechaRegistro;
}
