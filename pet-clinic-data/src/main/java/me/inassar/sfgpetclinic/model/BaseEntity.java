package me.inassar.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by Ahmed Nassar.
 * Date: 16 May, 2020
 * Time: 5:22 PM
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
