package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Satellite {
	@Id@GeneratedValue
	private Long id;

	
	
	private Long planetid;
	
	private String name;
	private Double gm;
	private Double radius;
	private Double density;
	private Double magnitude;
	private Double albedo;
	private String text;
 /*planet: owning planet of the satellite
name: name of the satellite
gm: GM (km3/sec2)
radius: Mean radius (km)
density: Mean density (g/cm3)
magnitude: Magnitude V0 or R
albedo: Geometric Albedo*/
}
