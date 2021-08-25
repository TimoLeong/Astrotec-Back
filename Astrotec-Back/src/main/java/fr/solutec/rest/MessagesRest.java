package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Message;
import fr.solutec.repositories.MessagesRepository;

@RestController
@CrossOrigin("*")
public class MessagesRest {
	
	@Autowired
	private MessagesRepository messageRepos;
	
	//recupération d'un message
	
	@GetMapping("Message/text/{text}")
	
	public String inputMessage(@PathVariable String t) {
		return messageRepos.findByText(t);
	}
	
	//affichage d'un message
	
	@PostMapping("Message/text/{text}")
	
	public int writeMessage(@RequestBody Message t) {
		messageRepos.findById(t.getText());
		messageRepos.save(t);
			return 1;
	}
	
	// association emeteur du message 
	// @GetMapping("Membre/pseudo/{pseudo}")
	 
	// public Message verifyMembre(@RequestBody )
	
	//heure d'envoie du message
}
