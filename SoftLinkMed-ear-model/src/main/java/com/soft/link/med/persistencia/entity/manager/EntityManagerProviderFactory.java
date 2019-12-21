package com.soft.link.med.persistencia.entity.manager;

import com.soft.link.med.model.iinterface.EntityManagerProvider;
import com.soft.link.med.util.ClassUtil;
import com.soft.link.med.util.Utils;

/**
 *
 * @author jakson wilson bonfim de lima
 */
public class EntityManagerProviderFactory {

    private static final String ENTITYMANAGERJNDI = "com.soft.link.med.persistencia.jndi.EntityManagerProviderImpl";

    private static EntityManagerProvider entityManagerProvider;

    public EntityManagerProvider getEntityManagerProvider() {
        if (Utils.isEmpty(this.entityManagerProvider)) {
            return ClassUtil.createInstance(ENTITYMANAGERJNDI, Thread.currentThread().getContextClassLoader());
        }

        return this.entityManagerProvider;
    }
}
