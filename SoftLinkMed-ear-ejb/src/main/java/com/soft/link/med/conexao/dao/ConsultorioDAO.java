package com.soft.link.med.conexao.dao;

import com.soft.link.med.persistencia.entity.manager.ConexaoDAO;
import com.soft.link.model.dao.Consultorio;
import java.util.List;

/**
 * @author jakson wilson bonfim de lima
 */
public class ConsultorioDAO extends ConexaoDAO<Consultorio> {

    public List<Consultorio> litar() {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT *  \n"
                + "  FROM \"STM_CONSULTORIO\" "
                + "WHERE id_consultorio in (1,2) ; ");

        return getPreparedStatement(sql)
                .executeQuery()
                .getResultList();
    }

    public Consultorio litarv2() {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT *  \n"
                + "  FROM \"STM_CONSULTORIO\" "
                + "   where id_consultorio = 3;  ");

        return (Consultorio) getPreparedStatement(sql)
                .executeQuery()
                .getSingleResult();
    }
}
