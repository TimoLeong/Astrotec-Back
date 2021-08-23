package fr.solutec.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Membre {
	
	@Id @GeneratedValue
	private Long id;
	
	// Il ne peut pas y avoir plusieurs membre avec le même pseudo ou email
	@NonNull @Column(unique=true)
	private String email;
	@NonNull @Column(unique=true)
	private String pseudo;
	
	@NonNull private String mdp;
	private String nom;
	private String prenom;
	private Date ddn;
	
	@CreationTimestamp
	private Timestamp dateCreation;
	
	@Value("${admin:false}")
	private boolean admin;
	
}
