/*
 * AddEmployeeDetail.java
 *
 * Created on Jul 26, 2017, 6:07:49 PM
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
package com.infomindz.pl.employee;

import com.infomindz.employee.dao.EmployeeDetailDAO;
import com.infomindz.employee.dto.EmployeeTO;

/**
 * @since 1.0
 * @author venkatesan
 */
public class AddEmployeeDetail
{

    private String empName;
    private String empAge;
    private String empRole;
    private String empAddress;

    /**
     *
     * @return
     */
    public String addButtonAction()
    {
        EmployeeTO employeeBean = new EmployeeTO();
        employeeBean.setEmpAge(empAge);
        employeeBean.setEmpRole(empRole);
        employeeBean.setEmpName(empName);
        employeeBean.setEmpAddress(empAddress);
        
        
        EmployeeDetailDAO detail = new EmployeeDetailDAO();
        detail.addEmployeeDetails(employeeBean);
        return null;
    }

    /**
     *
     * @return
     */
    public String initializePageAttributes()
    {
        empName = "";
        empAge = "";
        empRole = "";
        empAddress = "";
        return null;
    }

    /**
     * @return the empName
     */
    public String getEmpName()
    {
        return empName;
    }

    /**
     * @param empName the empName to set
     */
    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    /**
     * @return the empAge
     */
    public String getEmpAge()
    {
        return empAge;
    }

    /**
     * @param empAge the empAge to set
     */
    public void setEmpAge(String empAge)
    {
        this.empAge = empAge;
    }

    /**
     * @return the empRole
     */
    public String getEmpRole()
    {
        return empRole;
    }

    /**
     * @param empRole the empRole to set
     */
    public void setEmpRole(String empRole)
    {
        this.empRole = empRole;
    }

    /**
     * @return the empAddress
     */
    public String getEmpAddress()
    {
        return empAddress;
    }

    /**
     * @param empAddress the empAddress to set
     */
    public void setEmpAddress(String empAddress)
    {
        this.empAddress = empAddress;
    }
}
