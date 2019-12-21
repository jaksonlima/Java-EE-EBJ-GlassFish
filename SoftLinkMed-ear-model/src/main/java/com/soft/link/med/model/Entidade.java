package com.soft.link.med.model;

import com.soft.link.med.model.iinterface.Identificador;
import java.io.Serializable;

/**
 * @author jakson wilson bonfim de lima
 */
public abstract class Entidade implements Serializable, Identificador<Integer> {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
