package com.soft.link.med.cdi.provider.bean;

import com.soft.link.med.model.iinterface.CDIProviderInject;
import com.soft.link.med.util.ListUtil;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;

/**
 * @author jakson wilson bonfim de lima
 */
public class CDIProviderBeanImpl implements CDIProviderInject {

    @Override
    public <T> List<T> getReferences(Class<T> type) {
        BeanManager managerBean = CDI.current().getBeanManager();
        Set<Bean<?>> cdiBeans = managerBean.getBeans(type);

        List<T> referencesBeans = cdiBeans.stream()
                .map(bean -> {
                    CreationalContext<?> createCreationalContext = managerBean.createCreationalContext(bean);
                    Object reference = managerBean.getReference(bean, type, createCreationalContext);
                    return (T) reference;
                }).collect(Collectors.toList());

        return referencesBeans;
    }

    @Override
    public <T> T getReference(Class<T> type) {
        return ListUtil.first(getReferences(type));
    }

}
