package com.training.java.collections;

import java.util.Objects;

public class Employee {

    private String name;
    private String surname;


    public Employee(final String nameParam,
                    final String surnameParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    @Override
    public String toString() {
        return "Employee [name=" + this.name + ", surname=" + this.surname + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name,
                            this.surname);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        return Objects.equals(this.name,
                              other.name)
               && Objects.equals(this.surname,
                                 other.surname);
    }


}
