package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	// Vérification du statut d'admin du membre
	@GetMapping("isAdmin/{id}")
	public boolean verifyAdminStatus(@PathVariable Long id) {
		return membreRepo.findById(id).get().isAdmin();
	}
	
	// Création d'un membre
	@PostMapping("creation")
	public Membre createMembre(@RequestBody Membre m) {
		return membreRepo.save(m);
	}
}
