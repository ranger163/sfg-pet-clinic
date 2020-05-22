package me.inassar.sfgpetclinic.services.map;

import me.inassar.sfgpetclinic.model.Owner;
import me.inassar.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by Ahmed Nassar.
 * Date: 22 May, 2020
 * Time: 2:55 PM
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}