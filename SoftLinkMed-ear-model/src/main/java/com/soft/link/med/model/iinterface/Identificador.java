package com.soft.link.med.model.iinterface;

import java.io.Serializable;

/**
 *
 * @author Jakson
 * @param <T>
 */
public interface Identificador<T> extends Serializable {

    default public T getId() {
        return null;
    }
}
