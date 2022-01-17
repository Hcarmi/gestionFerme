package com.inti.entities;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Animal {
	
	private Long idAnimal;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_ferme")
	private Ferme ferme;

	public Long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}

	public Ferme getFerme() {
		return ferme;
	}

	public void setFerme(Ferme ferme) {
		this.ferme = ferme;
	}

	public Animal() {
	}

	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", ferme=" + ferme + "]";
	}
	
	
}
