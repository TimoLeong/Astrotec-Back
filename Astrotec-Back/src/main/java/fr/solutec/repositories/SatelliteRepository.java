package fr.solutec.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Satellite;

public interface SatelliteRepository extends CrudRepository<Satellite, Long>{
	
	public Iterable<Satellite> findByPlanetId(Long id);
}
