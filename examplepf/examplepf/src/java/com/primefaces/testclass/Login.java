/*
 * Login.java
 *
 * Created on Dec 14, 2016, 6:50:12 PM
 *
 * Copyright © 2013-2014 InfoMindz R&D Sdn. Bhd.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * InfoMindz R&D Sdn. Bhd.("Confidential Information"). You shall
 * not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered
 * into with InfoMindz.
 */
package com.primefaces.testclass;

import java.util.ArrayList;
import java.util.List;
import javax.faces.component.html.HtmlForm;

public class Login
{
    private HtmlForm initForm;
    private List<String> images;

    private void init()
    {
        System.out.println("entered into init method !");
//        images = new ArrayList<String>();
//        for (int i = 1; i <= 7; i++)
//        {
//            images.add(i + ".jpg");
//        }
//        System.out.println("images : "+images);
    }

    public List<String> getImages()
    {
        return images;
    }

    /**
     * @param images the images to set
     */
    public void setImages(List<String> images)
    {
        this.images = images;
    }

    /**
     * @return the initForm
     */
    public HtmlForm getInitForm()
    {
        init();
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
