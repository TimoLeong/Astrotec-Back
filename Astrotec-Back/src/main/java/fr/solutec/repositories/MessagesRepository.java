package fr.solutec.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Membre;
import fr.solutec.entities.Messagerie;

public interface MessagesRepository extends CrudRepository<Messagerie, Long>{
			
	//public Membre findByPseudo(String pseudo);
	//public Optional<Messagerie> findById(Long id);
	
}
