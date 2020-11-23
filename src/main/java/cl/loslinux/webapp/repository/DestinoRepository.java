package cl.loslinux.webapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import cl.loslinux.webapp.model.Destino;


@Repository
public interface DestinoRepository  extends PagingAndSortingRepository<Destino, Integer>{

}
