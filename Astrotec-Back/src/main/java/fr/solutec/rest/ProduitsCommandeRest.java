package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.ProduitsCommande;
import fr.solutec.repositories.ProduitsCommandeRepository;

@RestController
@CrossOrigin("*")
public class ProduitsCommandeRest {

	@Autowired
	private ProduitsCommandeRepository produitCommandeRepo;
	
	
	// Ajouter un produit et sa quantité à une commande
	@PostMapping("produits_commande")
	public ProduitsCommande addProduitsInCommande(@RequestBody ProduitsCommande pc) {
		return produitCommandeRepo.save(pc);
	}
}
