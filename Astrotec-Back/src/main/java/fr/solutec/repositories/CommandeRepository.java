package fr.solutec.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Commande;

public interface CommandeRepository extends CrudRepository<Commande, Long> {

}
