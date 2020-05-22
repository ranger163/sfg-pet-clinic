package me.inassar.sfgpetclinic.services;

import me.inassar.sfgpetclinic.model.Owner;

/**
 * Created by Ahmed Nassar.
 * Date: 16 May, 2020
 * Time: 5:09 PM
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
