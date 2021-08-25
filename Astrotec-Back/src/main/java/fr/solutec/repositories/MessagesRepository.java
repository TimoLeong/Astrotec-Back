package fr.solutec.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Membre;
import fr.solutec.entities.Message;
import lombok.NonNull;

public interface MessagesRepository extends CrudRepository<Message, Long>{

	String findById(@NonNull String text);

	String findByText(String t);
	
	//public static Membre findByIdAndPseudo(Long id2, @NonNull String pseudo2) {
	//	return null;
	//}

	//MessagesRepository findByMembreId(@NonNull );
			
	//public Membre findByPseudo(String pseudo);
	//public Optional<Messagerie> findById(Long id);
	
}
