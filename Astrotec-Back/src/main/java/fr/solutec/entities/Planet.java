package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Planet {
	@Id@GeneratedValue
	private Long id;
	
	private String name;
	private Double diameter;
	private Double mass;
	private Double gravity;
	private Double length_of_day;
	private Double distance_from_sun;
	private Double orbital_period;
	private	Double mean_temperature;
	private Double number_of_moons;
	private Boolean has_ring_system;
	private Boolean has_global_magnetic_field;
/*
Mass (10^24kg)
Diameter (km)
Density (kg/m3)
Gravity (m/s2)
Escape Velocity (km/s)
Rotation Period (hours)
Length of Day (hours)
Distance from Sun (106 km)
Perihelion (106 km)
Aphelion (106 km)
Orbital Period (days)
Orbital Velocity (km/s)
Orbital Inclination (degrees)
Orbital Eccentricity
Obliquity to Orbit (degrees)
Mean Temperature (C)
Surface Pressure (bars)
Number of Moons (number)
Ring System? (Yes/No)
Global Magnetic Field? (Yes/No)
*/
	
}
