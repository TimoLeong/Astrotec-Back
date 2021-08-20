package fr.solutec.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Planet;

public interface PlanetRepository extends CrudRepository<Planet, Long>{

}
