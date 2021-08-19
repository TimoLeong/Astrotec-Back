package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Membre;
import fr.solutec.repositories.MembreRepository;

@RestController @CrossOrigin("*")
public class MembreRest {

	@Autowired
	private MembreRepository membreRepo;
	
	// Verification du login et mdp d'un utilisateur, retourne un utilisateur si vérifié et rien sinon
	@PostMapping("login")
	public Membre verifyLogin(@RequestBody Membre m){
		return membreRepo.findByPseudoAndMdp(m.getPseudo(), m.getMdp());
	}
}
