/*
 * TestClass.java
 *
 * Created on Aug 21, 2017, 3:21:01 PM
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
package testclass;

import com.infomindz.employee.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @since 1.0
 * @author venkatesan
 */
public class TestClass
{

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SamplePU");
    EntityManager managerFactory;

    private void addEmployee()
    {
        managerFactory = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = managerFactory.getTransaction();
        transaction.begin();
        Employee employee = new Employee();
        employee.setEmpName("Mannan");
        employee.setEmpRole("Developer");
        employee.setEmpAddress("KL");
        employee.setEmpAge("24");
        managerFactory.persist(employee);
        transaction.commit();
        managerFactory.close();
    }

    private void removeEmployee(boolean isSingle)
    {
        managerFactory = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = managerFactory.getTransaction();
        transaction.begin();

        if (isSingle)
        {
            Long i = 9l;
            Employee employee = managerFactory.find(Employee.class, i);
            managerFactory.remove(employee);
        }
        else
        {
            Query q3 = managerFactory.createNativeQuery("DELETE FROM employeedetail where employee_id = 6");
            q3.executeUpdate();
        }
        transaction.commit();
        managerFactory.close();
    }

    private void updateEmployee()
    {
        managerFactory = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = managerFactory.getTransaction();
        transaction.begin();
        Long i = 11l;
        Employee employee = managerFactory.find(Employee.class, i);
        employee.setEmpName("Kumar");
        transaction.commit();
        managerFactory.close();
    }

    private void searchEmployee()
    {
        managerFactory = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = managerFactory.getTransaction();
        //transaction.begin();
        List<Employee> resultList = managerFactory.createQuery("SELECT a FROM Employee a").getResultList();
        System.out.println("resultList Size :" + resultList.size());
//        transaction.commit();

        for (Employee employee : resultList)
        {
            System.out.println("Name :" + employee.getEmpName());
        }
        managerFactory.close();
    }

    public static void main(String[] args)
    {
        TestClass testClass = new TestClass();
//        testClass.addEmployee();
//        testClass.removeEmployee(true);
//        testClass.searchEmployee();
        testClass.updateEmployee();
    }
}
