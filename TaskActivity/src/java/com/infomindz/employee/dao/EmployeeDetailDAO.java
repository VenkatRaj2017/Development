/*
 * EmployeeDetailDAO.java
 *
 * Created on Jul 26, 2017, 6:00:33 PM
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
package com.infomindz.employee.dao;

import com.infomindz.employee.dto.EmployeeTO;
import com.infomindz.employee.entity.Employee;
import com.infomindz.employee.interfaces.TaskActivity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @since 1.0
 * @author venkatesan
 */
public class EmployeeDetailDAO implements TaskActivity
{

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SamplePU");
    EntityManager managerFactory;

    public EmployeeDetailDAO()
    {
    }

    /**
     *
     * @return
     */
    public String addEmployeeDetails(EmployeeTO employeeBean)
    {

        return null;
    }

    @Override
    public void storeEmployeeDetails(EmployeeTO employeeBean)
    {
        managerFactory = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = managerFactory.getTransaction();
        transaction.begin();

        if (employeeBean != null)
        {
            Employee employee = new Employee();
            employee.setEmpName(employeeBean.getEmpName());
            employee.setEmpAge(employeeBean.getEmpAge());
            employee.setEmpRole(employeeBean.getEmpRole());
            employee.setEmpAddress(employeeBean.getEmpAddress());
            managerFactory.persist(employee);
            transaction.commit();
        }
        managerFactory.close();
        entityManagerFactory.close();
    }
}
