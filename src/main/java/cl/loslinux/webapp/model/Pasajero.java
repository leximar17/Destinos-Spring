package cl.loslinux.webapp.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pasajero {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String rut;
	private String nombre;
	private String apellido;
	private int edad;
	private String ciudadNatal;
	

	@OneToMany(cascade= CascadeType.ALL, mappedBy = "pasajero")
    private List<Destino> destino;
	

	
}
