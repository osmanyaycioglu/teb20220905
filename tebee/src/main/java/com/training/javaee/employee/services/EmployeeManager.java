package com.training.javaee.employee.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.training.javaee.employee.db.EmployeeDao;
import com.training.javaee.rest.Employee;

@Singleton
@LocalBean
public class EmployeeManager {

    @EJB
    private EmployeeDao employeeDao;

    public void add(final Employee employeeParam) {
        this.employeeDao.add(employeeParam);
    }

    public List<Employee> getByName(final String name) {
        return this.employeeDao.getByName(name);
    }

    public List<Employee> getAll() {
        return this.employeeDao.getAll();
    }

    public Employee getOne(final Long employeeIdParam) {
        return this.employeeDao.getEmployee(employeeIdParam);
    }

}
