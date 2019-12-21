package main;

import com.soft.link.med.cdi.provider.bean.impl.CDIProviderBean;

/**
 * @author jakson wilson bonfim de lima
 */
public class Main01 {

    public static void main(String[] args) {
        CDIProviderBean.getCDIProviderInject().getReference(null);
    }

}
