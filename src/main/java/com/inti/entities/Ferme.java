package com.inti.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Ferme {
	private Long idFerme;
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date dateAchat;

	@OneToMany(mappedBy="ferme")
	Set<Animal> animal = new HashSet<>();

	
	
	public Ferme(Long idFerme, String nom, Date dateAchat) {
		super();
		this.idFerme = idFerme;
		this.nom = nom;
		this.dateAchat = dateAchat;
	}

	public Ferme() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdFerme() {
		return idFerme;
	}

	public void setIdFerme(Long idFerme) {
		this.idFerme = idFerme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Set<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(Set<Animal> animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "Ferme [idFerme=" + idFerme + ", nom=" + nom + ", dateAchat=" + dateAchat + "]";
	}

	
	
	
}
