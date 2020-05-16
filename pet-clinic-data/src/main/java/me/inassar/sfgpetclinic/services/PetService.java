package me.inassar.sfgpetclinic.services;

import me.inassar.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Ahmed Nassar.
 * Date: 16 May, 2020
 * Time: 5:12 PM
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
