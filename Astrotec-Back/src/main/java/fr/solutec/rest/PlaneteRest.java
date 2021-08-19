package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.repositories.PlaneteRepository;

@RestController @CrossOrigin("*")
public class PlaneteRest {
	@Autowired
	private PlaneteRepository planeteRepo;
	
}
