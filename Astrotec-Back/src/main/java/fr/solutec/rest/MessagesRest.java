package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Message;
import fr.solutec.repositories.MessageRepository;

@RestController
@CrossOrigin("*")
public class MessagesRest {
	
	@Autowired
	private MessageRepository messageRepo;
	
	@GetMapping("message_from/{senderId}/{receiverId}")
	public List<Message> getMessageReceivedFromSender(@PathVariable Long senderId, @PathVariable Long receiverId){
		return messageRepo.findBySenderIdAndReceiverId(senderId, receiverId);
	}
	
	// Sauvegarde d'un nouveau message
	@PostMapping("envoi_message")
	public Message newMessage(@RequestBody Message m) {
		return messageRepo.save(m);
	}
	
}
