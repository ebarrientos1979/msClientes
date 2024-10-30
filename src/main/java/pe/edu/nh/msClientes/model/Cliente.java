package pe.edu.nh.msClientes.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Cliente")
@Data
@ToString
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer clienteId;
	private String nombre;
	private String apePaterno;
	private String apeMaterno;
	private String direccion;
	private String telefono;
	private String email;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro = new Date();
}
