package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Produit;
import fr.solutec.repositories.ProduitRepository;

@RestController
@CrossOrigin("*")
public class ProduitRest {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@GetMapping("produit")
	public Iterable<Produit> getAllProduit() {
		return produitRepository.findAll();
	}
}
