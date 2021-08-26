package fr.solutec.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Questions;

public interface QuestionsRepository extends CrudRepository<Questions, Long>{

}
