package com.soft.link.med.model.iinterface;

import javax.persistence.EntityManager;

/**
 * @author jakson wilson bonfim de lima
 */
public interface EntityManagerProvider {

    EntityManager getEntityManager();

}
