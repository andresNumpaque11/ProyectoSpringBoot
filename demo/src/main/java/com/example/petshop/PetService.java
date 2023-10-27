package com.example.petshop;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    private final PetRepository petRepository;

    @Autowired
    public PetService(PetRepository pRepository) {
        this.petRepository = pRepository;
    }
    
    public List<Pet> getPets() {
        List<Pet> pets = petRepository.findAll();
        return pets;
    }

    public void newPet(Pet pet) {
        Optional<Pet> res = petRepository.findProductById(pet.getId());
        if (res.isPresent()) {
            throw new IllegalStateException("Ya existe la mascota con ese id");

        }
        petRepository.save(pet);
    }
}
