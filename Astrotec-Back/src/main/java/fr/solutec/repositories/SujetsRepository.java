package fr.solutec.repositories;

import java.sql.Timestamp;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Sujets;
import lombok.NonNull;

public interface SujetsRepository extends CrudRepository<Sujets, Long> {

	SujetsRepository findBySujet(@NonNull String sujet);

	Timestamp getDate();
			
}
