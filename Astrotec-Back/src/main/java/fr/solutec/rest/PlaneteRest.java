package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Planete;
import fr.solutec.repositories.PlaneteRepository;

@RestController
@CrossOrigin("*")
public class PlaneteRest {
	@Autowired
	private PlaneteRepository planeteRepo;

	@GetMapping("planete")
	public Iterable<Planete> getAllPanete() {
		return planeteRepo.findAll();
	}

	@GetMapping("planete/{id}")
	public Optional<Planete> getPlanete(@PathVariable Long id) {
		return planeteRepo.findById(id);
	}
}
