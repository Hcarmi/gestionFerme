package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Animal;
import com.inti.entities.Ferme;

public interface IAnimalService {
	List<Animal> findAll();
	Animal findOne(Long idAnimal);
	Animal save(Animal animal);
	void delete(Long idAnimal);
	Animal findByIdAnimalAndFerme(Long idAnimal, Ferme ferme);
}
