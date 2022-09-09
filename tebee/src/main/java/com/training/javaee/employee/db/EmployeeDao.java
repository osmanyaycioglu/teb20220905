package com.training.javaee.employee.db;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.training.javaee.rest.Employee;

@Stateless
@LocalBean
// @TransactionManagement(TransactionManagementType.CONTAINER)
public class EmployeeDao {

    @PersistenceContext(unitName = "tebee")
    private EntityManager entityManager;

    // @Transactional
    public void add(final Employee employeeParam) {
        this.entityManager.persist(employeeParam);
    }

    public void update(final Employee employeeParam) {
        if (!this.entityManager.contains(employeeParam)) {
            Employee mergeLoc = this.entityManager.merge(employeeParam);
        }
    }

    public Employee getEmployee(final Long emIp) {
        return this.entityManager.find(Employee.class,
                                       emIp);
    }

    public void removeEmployee(final Employee employeeParam) {
        this.entityManager.remove(employeeParam);
    }

    public List<Employee> getByName(final String name) {
        TypedQuery<Employee> createQueryLoc = this.entityManager.createQuery("select e from Employee e where e.name=?1",
                                                                             Employee.class);
        createQueryLoc.setParameter(1,
                                    name);
        return createQueryLoc.getResultList();

    }

    public List<Employee> getByName2(final String name) {
        TypedQuery<Employee> createQueryLoc = this.entityManager.createQuery("select e from Employee e where e.name=:paramName",
                                                                             Employee.class);
        createQueryLoc.setParameter("paramName",
                                    name);
        return createQueryLoc.getResultList();
    }

    public List<Employee> getByNameNative(final String name) {
        Query createNativeQueryLoc = this.entityManager.createNativeQuery("select * from calisan e where e.isim=?1",
                                                                          Employee.class);
        createNativeQueryLoc.setParameter(1,
                                          name);
        return createNativeQueryLoc.getResultList();
    }

    public List<Employee> getAll() {
        TypedQuery<Employee> createQueryLoc = this.entityManager.createQuery("select e from Employee e",
                                                                             Employee.class);
        return createQueryLoc.getResultList();
    }


}
