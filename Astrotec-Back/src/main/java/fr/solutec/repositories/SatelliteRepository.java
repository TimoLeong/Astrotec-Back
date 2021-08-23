package fr.solutec.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Satellite;

public interface SatelliteRepository extends CrudRepository<Satellite, Long>{
	
	public List<Satellite> findByplanetid(Long id);
	public List<Satellite> findByName(String name);
} 
