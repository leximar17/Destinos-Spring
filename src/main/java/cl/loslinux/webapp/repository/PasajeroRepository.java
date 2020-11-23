package cl.loslinux.webapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import cl.loslinux.webapp.model.Pasajero;


@Repository

public interface PasajeroRepository extends PagingAndSortingRepository<Pasajero, Integer> {

}
