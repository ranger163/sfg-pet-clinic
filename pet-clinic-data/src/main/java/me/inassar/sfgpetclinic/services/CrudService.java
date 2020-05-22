package me.inassar.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Ahmed Nassar.
 * Date: 22 May, 2020
 * Time: 2:20 PM
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
