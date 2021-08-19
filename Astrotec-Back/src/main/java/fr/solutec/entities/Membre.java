package fr.solutec.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
	@NonNull private String email;
	@NonNull  String pseudo;
	@NonNull private String mdp;
	private String nom;
	private String prenom;
	private Date ddn;
	
	@CreationTimestamp
	private Timestamp dateCreation;
	
	@Value("${admin:false}")
	private boolean admin;
	
}
