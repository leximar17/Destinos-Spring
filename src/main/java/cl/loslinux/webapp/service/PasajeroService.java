package cl.loslinux.webapp.service;

import java.util.List;

import cl.loslinux.webapp.model.Pasajero;


public interface PasajeroService  {

	
	void save (Pasajero pasajero);
	List<Pasajero> findAll();

	
	

	
}
