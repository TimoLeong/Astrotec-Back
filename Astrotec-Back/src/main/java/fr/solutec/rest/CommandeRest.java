package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Commande;
import fr.solutec.repositories.CommandeRepository;

@RestController
@CrossOrigin("*")
public class CommandeRest {
	
	@Autowired
	private CommandeRepository commandeRepo;
	
	// Ajouter une commande à la database
	@PostMapping("ajout_commande")
	public Commande addCommande(@RequestBody Commande c) {
		return commandeRepo.save(c);
	}

}
