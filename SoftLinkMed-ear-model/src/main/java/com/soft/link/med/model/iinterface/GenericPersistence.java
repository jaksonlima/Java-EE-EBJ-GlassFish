package com.soft.link.med.model.iinterface;

import com.soft.link.med.execao.SoftLinkMedRuntimeException;
import java.util.List;

/**
 * @author Jakson
 * @param <T>
 */
public interface GenericPersistence<T> {

    Class<T> getEntityClass();

    void clear();

    void refresh(T entity);

    T getReference(Integer primaryKey);

    void detach(Object obj);

    void persist(T entity);

    T merge(T entity);

    T mergeOrPersist(T entity);

    List<T> findAll();

    T find(Integer id);

    T find(T entity);

    <E> E find(Class<E> entityClass, Integer id);

    T findAndValidate(Integer id);

    T findLock(Integer id);

    T findLockNoWait(Integer id);

    T findRefresh(Integer id);

    Integer getNextVal(String sequenceName) throws SoftLinkMedRuntimeException;

    void remove(T entity);

    void lock(T entity);

    void lockNoWait(T entity);
}
