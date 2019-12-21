package com.soft.link.med.util;

import java.util.Map;
import java.util.Objects;

/**
 * @author jakson wilson bonfim de lima
 */
public class Utils {

    public static boolean isEmpty(Object obj) {
        return Objects.isNull(obj);
    }

    public static boolean isEmpty(Map map) {
        return Objects.isNull(map);
    }

    public static boolean isEmpty(String strt) {
        return Objects.isNull(strt);
    }

    public static <T> T nvl(Object object, T type) {
        return (T) ((Objects.nonNull(type)) ? type : object);
    }
}
