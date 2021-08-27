package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class ProduitsCommande {
	
	@Id @GeneratedValue
	private Long id;
	
	@ManyToOne
	private Produit produit;
	
	@ManyToOne
	private Commande commande;
	
	private int quantite;

}
