package fr.solutec.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Commentaires;

public interface CommentairesRepository extends CrudRepository<Commentaires, Long> {
	

	public List<Commentaires> findByCommenteId(Long commenteId);

	public List<Commentaires> findBySujetId(Long sujetId);

}
