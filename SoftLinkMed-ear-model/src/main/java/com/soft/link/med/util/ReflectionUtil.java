package com.soft.link.med.util;

import com.soft.link.med.execao.SoftLinkMedRuntimeException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.PropertyUtilsBean;

/**
 * @author jakson wilson bonfim de lima
 */
public class ReflectionUtil {

    public static <T> List<T> toListResultSetObject(Class<T> entityClass, ResultSet resultSet) {
        try {
            final Class<T> typeClass = entityClass;
            final List<Field> fieldsClass = Arrays.asList(typeClass.getDeclaredFields());

            T instanceClass;
            List<T> listInstanceClass = null;

            while (resultSet.next()) {
                listInstanceClass = Objects.isNull(listInstanceClass) ? new ArrayList() : listInstanceClass;
                instanceClass = typeClass.newInstance();

                BeanUtilsBean beanUtils = BeanUtilsBean.getInstance();
                PropertyUtilsBean propertyUtils = beanUtils.getPropertyUtils();

                for (Field filed : fieldsClass) {
                    String filedNome = filed.getName();
                    Object objectFiled = null;
                    if (Objects.nonNull(filedNome)) {
                        objectFiled = resultSet.getObject(filedNome);
                    }
                    if (Objects.nonNull(objectFiled)) {
                        propertyUtils.setProperty(instanceClass, filedNome, objectFiled);
                    }
                }

                listInstanceClass.add(instanceClass);
            }

            return listInstanceClass;
        } catch (SecurityException | SQLException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new SoftLinkMedRuntimeException(e);
        }
    }

}
