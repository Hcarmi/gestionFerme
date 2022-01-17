package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Ferme;
import com.inti.entities.Ferme;
import com.inti.repositories.FermeRepository;
import com.inti.service.interfaces.IFermeService;

@Service
public class FermeService implements IFermeService {

	@Autowired
	FermeRepository fermeRepository;

	@Override
	public List<Ferme> findAll() {
		return fermeRepository.findAll();
	}

	@Override
	public Ferme findOne(Long idFerme) {
		return fermeRepository.findById(idFerme).get();
	}

	@Override
	public Ferme save(Ferme ferme) {
		return fermeRepository.save(ferme);
	}

	@Override
	public void delete(Long idFerme) {
		fermeRepository.deleteById(idFerme);
	}

	@Override
	public Ferme findByidFermeAndNom(Long idFerme, String nom) {
		return fermeRepository.findByidFermeAndNom(idFerme, nom);
	}

}
