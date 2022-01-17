package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Animal;
import com.inti.entities.Ferme;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Long>{
	
	Animal findByIdAnimalAndFerme(Long idAnimal, Ferme ferme);
}
