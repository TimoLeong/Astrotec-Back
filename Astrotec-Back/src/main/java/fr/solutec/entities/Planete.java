package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Planete {
	@Id@GeneratedValue
	private Long id;
	
	private String name;
	private Long diameter;
	private Long mass;
	private Long gravity;
	private Long length_of_day;
	private Long distance_from_sun;
	private Long orbital_period;
	private	Long mean_temperature;
	private Long number_of_moons;
	private Boolean has_ring_system;
	private Boolean has_global_magnetic_field;
	
}
