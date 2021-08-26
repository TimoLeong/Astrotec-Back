package fr.solutec.rest;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Sujets;
import fr.solutec.repositories.SujetsRepository;

@RestController
@CrossOrigin("*")
public class SujetsRest {
	
	@Autowired
	private SujetsRepository sujetsRepos;
	
	
	// afficher un sujet de forum 
	@PostMapping("Sujets/sujet/{sujet}")
	public SujetsRepository addSujet(@RequestBody Sujets s) {
		sujetsRepos.save(s);
		return sujetsRepos.findBySujet(s.getSujet());
	}
	
	// vérifier la date de publication

	//@GetMapping("Sujets/datePblication/{datePublication}")
	//public Timestamp recupDate(@PathVariable Timestamp date) {
	//	return sujetsRepos.getDate();
	//}




}
