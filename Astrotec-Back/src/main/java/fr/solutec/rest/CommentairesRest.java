package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Commentaires;
import fr.solutec.repositories.CommentairesRepository;


@RestController
@CrossOrigin("*")
public class CommentairesRest {
	
	@Autowired 
	CommentairesRepository commentairesRepo;
	
	@GetMapping("commentaires_from/{comenteId}")
	public List<Commentaires> getCommentairesReceivedFromCommente(@PathVariable Long commenteId){
		return commentairesRepo.findByCommenteId(commenteId);
	}
	
	// Sauvegarde d'un nouveau commentaire
	@PostMapping("envoi_commentaires")
	public Commentaires newCommentaires(@RequestBody Commentaires c) {
		return commentairesRepo.save(c);

	}
	
	@GetMapping("commentaires_from/{sujetId")
	public List<Commentaires> getCommentairesReceivedFromSujet(@PathVariable Long sujetId){
		return commentairesRepo.findBySujetId(sujetId);
	}
	
}
