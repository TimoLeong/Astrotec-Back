package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Sujets;
import fr.solutec.repositories.SujetsRepository;

@RestController
@CrossOrigin("*")
public class SujetsRest {
	
	@Autowired
	private SujetsRepository sujetsRepo;
	
	
	// afficher un sujet de forum 
	@GetMapping("from_sujets/{sujet}")
	public SujetsRepository addSujet(@RequestBody Long auteurId) {
		return sujetsRepo.findByAuteurId(auteurId);
	}
	//sauvegarde sujet
	
	@PostMapping("save_sujets")
	public Sujets newSujets(@RequestBody Sujets s) {
		return sujetsRepo.save(s);
	}
	
}
