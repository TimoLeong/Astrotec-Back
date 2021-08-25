package fr.solutec.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Sujets {
	
	@Id @GeneratedValue
	private Long id;
	
	
	@NonNull @Column
	private String sujet;
	
	@CreationTimestamp
	private Timestamp datePublication;
	
	

}
