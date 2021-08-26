package fr.solutec.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Commande {
	
	@Id @GeneratedValue
	private Long id;
	
	@CreationTimestamp
	private Timestamp dateCreation;
	
	@ManyToOne
	private Membre membre;	
	
}
