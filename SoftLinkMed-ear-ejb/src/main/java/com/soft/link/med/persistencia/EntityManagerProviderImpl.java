package com.soft.link.med.persistencia;

import com.soft.link.med.model.iinterface.EntityManagerProvider;
import com.soft.link.med.model.iinterface.IDataSourceJNDI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author jakson wilson bonfim de lima
 */
@PersistenceContext(name = IDataSourceJNDI.ENTITYMANAGERJNDI, unitName = "SoftLinkMed")
public class EntityManagerProviderImpl implements EntityManagerProvider {

    @Override
    public EntityManager getEntityManager() {
        try {
            return (EntityManager) new InitialContext().lookup(IDataSourceJNDI.ENTITYMANAGERJNDI);
        } catch (NamingException ex) {
            Logger.getLogger(EntityManagerProviderImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
