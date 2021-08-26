package fr.solutec.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Reponses;

public interface ReponsesRepository extends CrudRepository<Reponses, Long>{
	
	public List<Reponses> findByQuestionId(Long id);
	
}
