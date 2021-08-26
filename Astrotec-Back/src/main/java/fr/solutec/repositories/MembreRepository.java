package fr.solutec.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Membre;


public interface MembreRepository extends CrudRepository<Membre, Long> {

	public Membre findByPseudoAndMdp(String pseudo, String mdp);
	public Membre findByPseudo(String pseudo);
	public Membre findByEmail(String email);
	public void deleteById(Long id);
	
	//public List<Membre> isLogin();//
}
