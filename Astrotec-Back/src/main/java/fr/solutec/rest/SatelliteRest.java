package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.solutec.entities.Satellite;
import fr.solutec.repositories.SatelliteRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController@CrossOrigin("*")
public class SatelliteRest {
	@Autowired
	private SatelliteRepository satelliteRepo;
	@GetMapping("satellite")
	private Iterable<Satellite>getAllSatellite() {
		return satelliteRepo.findAll();
	}
	@GetMapping("satellite/{id}")
	private Optional<Satellite> getSatellite(@PathVariable Long id) {
		return satelliteRepo.findById(id);
	}
	
	@GetMapping("satellite/planet/{id}")
	private List<Satellite> getPlanetSatellite(@PathVariable Long id) {
		return satelliteRepo.findByplanetid(id);
	}
	 
	@GetMapping("satellite/name/{name}")
	private List<Satellite> getSatelliteByName(@PathVariable String name){
		return satelliteRepo.findByName(name);
	}
	//@GetMapping("satellite")
		
}	
