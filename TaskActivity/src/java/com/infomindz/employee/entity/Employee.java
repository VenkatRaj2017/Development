/*
 * Employee.java
 *
 * Created on Jul 26, 2017, 5:52:10 PM
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
package com.infomindz.employee.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since 1.0
 * @author venkatesan
 */
@Entity
@Table(name = "employeedetail")
public class Employee implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id", unique = true)
    private Long id;
    @Column(name = "emloyee_name", nullable = false)
    private String empName;
    @Column(name = "emloyee_age", nullable = false)
    private String empAge;
    @Column(name = "emloyee_role", nullable = false)
    private String empRole;
    @Column(name = "emloyee_address", nullable = false)
    private String empAddress;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee))
        {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.infomindz.employee.Employee[ id=" + id + " ]";
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
