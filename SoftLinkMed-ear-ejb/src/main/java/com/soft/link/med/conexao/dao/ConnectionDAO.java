package com.soft.link.med.conexao.dao;

import com.soft.link.med.util.ClassUtil;
import java.io.Serializable;

/**
 * @author jakson wilson bonfim de lima
 */
public class ConnectionDAO implements Serializable {

    public static ConsultorioDAO getConsultorioDAO() {
        return ClassUtil.createInstance(ConsultorioDAO.class);
    }

}
