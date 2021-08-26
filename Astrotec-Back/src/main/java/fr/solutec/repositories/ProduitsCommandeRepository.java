package fr.solutec.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.ProduitsCommande;

public interface ProduitsCommandeRepository extends CrudRepository<ProduitsCommande, Long> {

}
