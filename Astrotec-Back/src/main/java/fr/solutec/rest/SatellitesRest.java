package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.solutec.entities.Satellites;
import fr.solutec.repositories.SatellitesRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController@CrossOrigin("*")
public class SatellitesRest {
	@Autowired
	private SatellitesRepository satellitesRepo;
	@GetMapping("satellites")
	private Iterable<Satellites>getAllSatellites() {
		return satellitesRepo.findAll();
	}
	@GetMapping("satellites/{id}")
	private Optional<Satellites> getSatellites(@PathVariable Long id) {
		return satellitesRepo.findById(id);
	}
}
