package me.inassar.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ahmed Nassar.
 * Date: 22 May, 2020
 * Time: 2:42 PM
 */
public abstract class AbstractMapService<T,ID> {
    protected Map<ID,T> map=new HashMap<>();
    Set<T>findAll(){
        return new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }
    T save(ID id,T object){
         map.put(id,object);
         return object;
    }
    void deleteByID(ID id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
