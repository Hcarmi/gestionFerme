package com.inti.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Gerant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idGerant;
	private String nom;
	private String prenom;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Gerant_Ferme_Association", joinColumns = @JoinColumn(name = "idGerant", referencedColumnName = "idGerant"), inverseJoinColumns = @JoinColumn(name = "idFerme", referencedColumnName = "idFerme"))
	private Set<Ferme> fermes = new HashSet<>();
	
	
	public Gerant(long idGerant, String nom, String prenom) {
		super();
		this.idGerant = idGerant;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Gerant() {
	}

	public long getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(long idGerant) {
		this.idGerant = idGerant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Gerant [idGerant=" + idGerant + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
