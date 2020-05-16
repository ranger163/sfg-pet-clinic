package me.inassar.sfgpetclinic.services;

import me.inassar.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Ahmed Nassar.
 * Date: 16 May, 2020
 * Time: 5:09 PM
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
