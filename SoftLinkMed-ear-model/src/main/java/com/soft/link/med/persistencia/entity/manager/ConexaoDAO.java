package com.soft.link.med.persistencia.entity.manager;

import com.soft.link.med.execao.SoftLinkMedRuntimeException;
import com.soft.link.med.model.Entidade;
import com.soft.link.med.model.enuns.SoftMedRuntimeExceptionConnection;
import com.soft.link.med.model.iinterface.ConexaoProviderDAO;
import com.soft.link.med.util.ListUtil;
import com.soft.link.med.util.NumericUtil;
import com.soft.link.med.util.ReflectionUtil;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * @author jakson wilson bonfim de lima
 * @param <T>
 */
public class ConexaoDAO<T extends Entidade> {

    private ConexaoProviderDAO conexaoProviderDAO;

    private PreparedStatement preparedStatement;

    private ResultSet resultSet;

    private final Class<T> entityClass;

    public ConexaoDAO() {
        this.entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public Class<T> getEntityClass() {
        return this.entityClass;
    }

    private ConexaoProviderDAO getConnectionProvider() {
        if (Objects.isNull(this.conexaoProviderDAO)) {
            return this.conexaoProviderDAO = ConexaoProviderFactoryDAO.getConexaoProviderDAO();
        }
        return this.conexaoProviderDAO;
    }

    public Connection getConnection() {
        return getConnectionProvider().getConnection();
    }

    public ResultSet getResultSet() {
        return this.resultSet;
    }

    private PreparedStatement getPreparedStatement() {
        return this.preparedStatement;
    }

    public void closeAll() {
        SoftLinkMedRuntimeException.voidChecked(() -> {
            getPreparedStatement().close();
            getResultSet().close();
            getConnection().close();
        });
    }

    public ConexaoDAO getPreparedStatement(String sql) {
        SoftLinkMedRuntimeException.getChecked(() -> this.preparedStatement = getConnection().prepareStatement(sql));
        return this;
    }

    public ConexaoDAO getPreparedStatement(StringBuilder sql) {
        getPreparedStatement(sql.toString());
        return this;
    }

    public ConexaoDAO executeQuery() {
        SoftLinkMedRuntimeException.getChecked(() -> this.resultSet = this.preparedStatement.executeQuery());
        return this;
    }

    public List<T> getResultList() {
        List<T> toListResultSetObject = ReflectionUtil.toListResultSetObject(getEntityClass(), getResultSet());
        closeAll();

        return toListResultSetObject;
    }

    public Object getSingleResult() {
        if (NumericUtil.MaiorOuIgual(getQueryResult(), 2)) {
            throw new SoftLinkMedRuntimeException(SoftMedRuntimeExceptionConnection.QUERY_RESULT);
        }
        List<T> toListResultSetObject = ReflectionUtil.toListResultSetObject(getEntityClass(), getResultSet());
//        closeAll();

        return ListUtil.first(toListResultSetObject);
    }

    private Integer getQueryResult() {
        try {
            int countRegister = 0;
            ResultSet resultCount = getResultSet();
            while (resultCount.next()) {
                countRegister++;
            }
            return countRegister;
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }
        return null;
    }
}
