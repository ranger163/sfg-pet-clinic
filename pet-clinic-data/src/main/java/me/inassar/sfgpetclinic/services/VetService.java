package me.inassar.sfgpetclinic.services;

import me.inassar.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Ahmed Nassar.
 * Date: 16 May, 2020
 * Time: 5:13 PM
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
