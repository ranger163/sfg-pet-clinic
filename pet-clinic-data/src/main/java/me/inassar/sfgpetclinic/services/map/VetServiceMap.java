package me.inassar.sfgpetclinic.services.map;

import me.inassar.sfgpetclinic.model.Vet;
import me.inassar.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by Ahmed Nassar.
 * Date: 22 May, 2020
 * Time: 3:03 PM
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}