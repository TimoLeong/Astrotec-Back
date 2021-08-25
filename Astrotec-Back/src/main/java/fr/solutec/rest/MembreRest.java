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

@RestController
@CrossOrigin("*")
public class MembreRest {

	@Autowired
	private MembreRepository membreRepo;

	// Verification du login et mdp d'un utilisateur, retourne un utilisateur si
	// vérifié et rien sinon
	@PostMapping("login")
	public Membre verifyLogin(@RequestBody Membre m) {
		return membreRepo.findByPseudoAndMdp(m.getPseudo(), m.getMdp());
	}

	// Vérification du statut d'admin du membre
	@GetMapping("isAdmin/{id}")
	public boolean verifyAdminStatus(@PathVariable Long id) {
		return membreRepo.findById(id).get().isAdmin();
	}

	// Création d'un membre
	@PostMapping("creation")
	public int createMembre(@RequestBody Membre m) {
		if (membreRepo.findByEmail(m.getEmail()) != null && membreRepo.findByPseudo(m.getPseudo()) != null) {
			return 3;
		} else if (membreRepo.findByEmail(m.getEmail()) != null) {
			return 1;
		} else if (membreRepo.findByPseudo(m.getPseudo()) != null) {
			return 2;
		} else {
			membreRepo.save(m);
			return 0;
		}
	}

	// Vérification d'un email déjà existant
	@GetMapping("verification_email/{email}")
	public boolean verifyUniqueEmail(@PathVariable String email) {
		if (membreRepo.findByEmail(email) != null)
			return false;
		else
			return true;
	}

	// Vérification d'un pseudo déjà existant
	@GetMapping("verification_pseudo/{pseudo}")
	public boolean verifyUniquePseudo(@PathVariable String pseudo) {
		if (membreRepo.findByPseudo(pseudo) != null)
			return false;
		else
			return true;
	}
	
	//@GetMapping("reccuperer_membre/{id}")
	 
	

}
