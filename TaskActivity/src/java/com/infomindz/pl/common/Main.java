/*
 * Main.java
 *
 * Created on Jul 28, 2017, 9:55:55 AM
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

import javax.faces.component.html.HtmlForm;

/**
 * @since 1.0
 * @author venkatesan
 */
public class Main
{

    private HtmlForm initForm;

    private void initializePageAttribute()
    {
        
    }

    /**
     * @return the initForm
     */
    public HtmlForm getInitForm()
    {
        initializePageAttribute();
        return initForm;
    }

    /**
     * @param initForm the initForm to set
     */
    public void setInitForm(HtmlForm initForm)
    {
        this.initForm = initForm;
    }
}
