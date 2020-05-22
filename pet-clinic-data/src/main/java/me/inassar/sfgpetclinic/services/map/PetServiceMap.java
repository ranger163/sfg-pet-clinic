package me.inassar.sfgpetclinic.services.map;

import me.inassar.sfgpetclinic.model.Pet;
import me.inassar.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Ahmed Nassar.
 * Date: 22 May, 2020
 * Time: 3:02 PM
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}