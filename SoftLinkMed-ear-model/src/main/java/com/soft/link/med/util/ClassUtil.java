package com.soft.link.med.util;

import com.soft.link.med.execao.SoftLinkMedRuntimeException;
import java.lang.reflect.ParameterizedType;
import org.apache.commons.lang3.ClassUtils;

/**
 * @author jakson wilson bonfim de lima
 */
public class ClassUtil extends ClassUtils {

    public static <T> T createInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new SoftLinkMedRuntimeException(ex);
        }
    }

    public static <T> T createInstance(String nomeClass, ClassLoader loader) {
        try {
            Class createClass = createClass(nomeClass, true, loader);
            return (T) createInstance(createClass);
        } catch (Exception ex) {
            throw new SoftLinkMedRuntimeException(ex);
        }
    }

    public static Class createClass(String name, boolean initialize, ClassLoader loader) {
        try {
            return Class.forName(name, initialize, loader);
        } catch (Exception ex) {
            throw new SoftLinkMedRuntimeException(ex);
        }
    }

    public <T> Class<T> getParameterizedTypeGenericSuperclass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

}
