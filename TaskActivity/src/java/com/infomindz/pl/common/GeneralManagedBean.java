/*
 * GeneralManagedBean.java
 *
 * Created on Jul 28, 2017, 5:19:27 PM
 *
 * Copyright © 2007-2009 InfoMindz R&D Sdn. Bhd.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * InfoMindz R&D Sdn. Bhd.("Confidential Information"). You shall
 * not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered
 * into with InfoMindz.
 */
package com.infomindz.pl.common;

import javax.el.ELResolver;
import javax.faces.context.FacesContext;

/**
 * @since 1.0
 * @author venkatesan
 */
public class GeneralManagedBean
{

    public GeneralManagedBean()
    {
    }

    /**
     * This method returns the managed bean object for the given class name
     *
     * @param className
     * @return Object, object of the given managed bean class name
     */
    public Object getManagedBeanObject(String className)
    {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELResolver resolver = facesContext.getApplication().getELResolver();
        return resolver.getValue(facesContext.getELContext(), null, className);
    }
}
