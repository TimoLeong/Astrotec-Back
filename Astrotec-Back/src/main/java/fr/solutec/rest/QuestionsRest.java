package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Questions;
import fr.solutec.repositories.QuestionsRepository;

@RestController @CrossOrigin("*")
public class QuestionsRest {

	@Autowired
	private QuestionsRepository questionsRepos;
	
	@PostMapping("questions")
	public Questions saveQuestions(@RequestBody Questions q) {
		return questionsRepos.save(q);
	}
	
	@GetMapping("questions")
	public Iterable<Questions> getAllQuestions(){
		return questionsRepos.findAll();
	}
}
