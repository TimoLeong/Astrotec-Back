package fr.solutec.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Membre;


public interface MembreRepository extends CrudRepository<Membre, Long> {

	public Membre findByPseudoAndMdp(String pseudo, String mdp);
	public Membre findByPseudo(String pseudo);
	public Membre findByEmail(String email);
	
	//public List<Membre> isLogin();
}
