package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Produit {
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String description;
	private String image;
	private double prix;
	private int stock;
}
