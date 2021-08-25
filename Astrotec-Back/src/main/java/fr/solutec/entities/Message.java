package fr.solutec.entities;

import java.sql.Timestamp;
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
public class Message {
	
	@Id @GeneratedValue
	private Long id;
	
	@NonNull
	private String text;
	
	@CreationTimestamp
	private Timestamp dateEnvoi;
	
	
}
