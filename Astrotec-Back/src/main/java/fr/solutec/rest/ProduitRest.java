package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("produit/{id}")
	public Optional<Produit> getProduit(@PathVariable Long id) {
		return produitRepository.findById(id);
	}
	
	@PostMapping("produit")
	public void addProduit(@RequestBody Produit p) {
		produitRepository.save(p);
	}
	
	@PutMapping("produit/{id}")
	public boolean modifProduct(@PathVariable Long id,@RequestBody Produit p) {
		Optional<Produit>  pr = produitRepository.findById(id);
		if(pr.isPresent()) {
			pr.get().setNom(p.getNom());
			pr.get().setDescription(p.getDescription());
			pr.get().setImage(p.getImage());
			pr.get().setPrix(p.getPrix());
			pr.get().setStock(p.getStock());
			produitRepository.save(pr.get());
			return true;
		}else {
			return false;
		}
	}
	
	
}
