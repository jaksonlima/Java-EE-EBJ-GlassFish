package com.soft.link.med.model.enuns;

import com.soft.link.med.model.iinterface.IEnum;

/**
 * @author jakson wilson bonfim de lima
 */
public enum SoftMedRuntimeExceptionConnection implements IEnum {

    QUERY_RESULT("Mais de um resultado encontrado para a mesma consulta ( getSingleResult ).");

    final private String value;

    private SoftMedRuntimeExceptionConnection(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

}
