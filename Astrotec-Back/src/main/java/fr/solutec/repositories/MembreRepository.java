package fr.solutec.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Membre;


public interface MembreRepository extends CrudRepository<Membre, Long> {

	public Membre findByPseudoAndMdp(String pseudo, String mdp);
}
