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
import lombok.NonNull;

@Entity

@NoArgsConstructor @AllArgsConstructor @Data
public class Commentaires {
	@Id @GeneratedValue
	private Long id;
	
	@ManyToOne @NonNull
	private Membre commente;
	
	@NonNull
	private String commentaire;
	
	@CreationTimestamp
	private Timestamp dateCom;
	
	@ManyToOne
	private Sujets sujet;

}
