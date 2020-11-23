package cl.loslinux.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.loslinux.webapp.model.Destino;
import cl.loslinux.webapp.repository.DestinoRepository;

@Service
public class DestinoServiceImpl implements DestinoService   {

	
	@Autowired
	DestinoRepository dao;
	
	
	@Override
	public void save(Destino destino) {
dao.save(destino);	
	}

	@Override
	public List<Destino> findAll() {
		return (List<Destino>) dao.findAll();
	}

}
