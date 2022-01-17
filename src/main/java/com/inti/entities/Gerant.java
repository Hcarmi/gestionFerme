package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Gerant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idGerant;
	private String nom;
	private String prenom;
	
	@ManyToMany
	@JoinTable (name="Gerants_Fermes_Associations", joinColumns=@JoinColumn(name="idGerant"), inverseJoinColumns=@JoinColumn(name="idFerme"))
	private <Ferme> fermes = new ArrayList<>();
	
	public Gerant() {
		super();
	}
	
	
}
