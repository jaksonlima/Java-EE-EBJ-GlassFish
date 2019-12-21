package com.soft.link.med.cdi.provider.bean.impl;

import com.soft.link.med.execao.SoftLinkMedRuntimeException;
import com.soft.link.med.model.iinterface.CDIProviderInject;
import com.soft.link.med.util.ClassUtil;

/**
 *
 * @author jakson wilson bonfim de lima
 */
public class CDIProviderBean {

    private final static String CDIBEANINJECT = "com.soft.link.med.cdi.provider.bean.CDIProviderBeanImpl";

    public static CDIProviderInject getCDIProviderInject() {
        try {
            return ClassUtil.createInstance(CDIBEANINJECT, Thread.currentThread().getContextClassLoader());
        } catch (Exception ex) {
            throw new SoftLinkMedRuntimeException(ex);
        }
    }

}
