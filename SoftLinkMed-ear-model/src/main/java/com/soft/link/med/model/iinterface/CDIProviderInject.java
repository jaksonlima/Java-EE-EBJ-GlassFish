package com.soft.link.med.model.iinterface;

import java.util.List;

/**
 * @author jakson wilson bonfim de lima
 */
public interface CDIProviderInject {

    public <T> T getReference(Class<T> type);

    default <T> List<T> getReferences(Class<T> type) {
        throw new UnsupportedOperationException("Sem implementação");
    }

    default <T> T getRequiredReference(Class<T> type) {
        throw new UnsupportedOperationException("Sem implementação");
    }

}
