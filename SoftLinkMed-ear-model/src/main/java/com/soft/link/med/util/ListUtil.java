package com.soft.link.med.util;

import java.util.Collection;
import org.apache.commons.collections.ListUtils;

/**
 * @author jakson wilson bonfim de lima
 */
public class ListUtil extends ListUtils {

    public static <L> L first(Collection<L> colections) {
        return ((toListNotNull(colections)) ? colections.stream().iterator().next() : null);
    }

    public static <L> boolean toListIsNotNull(Collection<L> collection) {
        return collection == null && collection.isEmpty();
    }

    public static <L> boolean toListNotNull(Collection<L> collection) {
        return !toListIsNotNull(collection);
    }

}
