package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Reponses;
import fr.solutec.repositories.ReponsesRepository;

@RestController @CrossOrigin("*")
public class ReponsesRest {
	
	@Autowired
	private ReponsesRepository reponsesRepos;
	
	@PostMapping("reponses")
	public Reponses saveReponses(@RequestBody Reponses r) {
		return reponsesRepos.save(r);
	}
	
	@GetMapping("reponses")
	public Iterable<Reponses> getAllReponses(){
		return reponsesRepos.findAll();
	}
	
	@GetMapping("reponses/questions/{id}")
	public List<Reponses> getAllResponsesInQuestion(@PathVariable Long id){
		return reponsesRepos.findByQuestionId(id);
	}

}
