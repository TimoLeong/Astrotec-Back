package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Planet;
import fr.solutec.repositories.PlanetRepository;

@RestController
@CrossOrigin("*")
public class PlanetRest {
	@Autowired
	private PlanetRepository planetRepo;

	@GetMapping("planet")
	public Iterable<Planet> getAllPanete() {
		return planetRepo.findAll();
	}

	@GetMapping("planet/{id}")
	public Optional<Planet> getPlanete(@PathVariable Long id) {
		return planetRepo.findById(id);
	}
	
	@PutMapping("planet/article/{id}")
	public Planet modifArticle(@RequestBody Planet p, @PathVariable Long id) {
		p.setId(id); 
		return planetRepo.save(p);
	}
	
}
