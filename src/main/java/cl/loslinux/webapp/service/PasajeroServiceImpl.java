package cl.loslinux.webapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.loslinux.webapp.model.Pasajero;
import cl.loslinux.webapp.repository.PasajeroRepository;

@Service
public class PasajeroServiceImpl implements PasajeroService {

	@Autowired
	PasajeroRepository dao;

	@Override
	public void save(Pasajero pasajero) {
		dao.save(pasajero);
	}

	@Override
	public List<Pasajero> findAll() {
		
		List<Pasajero> pasajeros = new ArrayList<Pasajero>();
				
		pasajeros=	(List<Pasajero>) dao.findAll();
		
		
		System.out.println(pasajeros);
		
		return pasajeros ;
	}

}
