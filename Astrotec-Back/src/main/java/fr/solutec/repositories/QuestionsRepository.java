package fr.solutec.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Questions;

public interface QuestionsRepository extends CrudRepository<Questions, Long>{

}
