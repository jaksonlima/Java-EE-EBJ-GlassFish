package com.soft.link.med.persistencia.entity.manager;

import com.soft.link.med.execao.SoftLinkMedRuntimeException;
import com.soft.link.med.model.iinterface.ConexaoProviderDAO;
import com.soft.link.med.util.ClassUtil;

/**
 *
 * @author jakson wilson bonfim de lima
 */
public class ConexaoProviderFactoryDAO {

    public static String CONNECTIONDAO = "com.soft.link.med.persistencia.ConexaoProviderFactoryDAOImpl";

    public static ConexaoProviderDAO getConexaoProviderDAO() {
        try {
            return ClassUtil.createInstance(CONNECTIONDAO, Thread.currentThread().getContextClassLoader());
        } catch (Exception ex) {
            throw new SoftLinkMedRuntimeException(ex);
        }
    }
}
