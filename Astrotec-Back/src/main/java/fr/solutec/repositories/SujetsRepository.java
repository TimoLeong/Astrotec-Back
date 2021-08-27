package fr.solutec.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Sujets;

public interface SujetsRepository extends CrudRepository<Sujets, Long> {


	public SujetsRepository findByAuteurId(Long auteurId);

			
}
