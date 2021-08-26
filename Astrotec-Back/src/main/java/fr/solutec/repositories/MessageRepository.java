package fr.solutec.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Message;


public interface MessageRepository extends CrudRepository<Message, Long>{

	public List<Message> findBySenderIdAndReceiverId(Long SenderId, Long ReceiverId);

}
