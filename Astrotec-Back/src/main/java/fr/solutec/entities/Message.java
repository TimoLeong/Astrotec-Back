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
public class Message {
	
	@Id @GeneratedValue
	private Long id;
	
	@ManyToOne @NonNull
	private Membre sender;
	
	@ManyToOne @NonNull
	private Membre receiver;
	
	@NonNull
	private String message;
	
	@CreationTimestamp
	private Timestamp dateSent;
	
	
}
