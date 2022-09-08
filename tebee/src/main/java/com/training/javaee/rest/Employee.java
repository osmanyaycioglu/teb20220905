package com.training.javaee.rest;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Employee {

    @NotEmpty(message = "name boş olamaz")
    @NotBlank
    @Size(min = 2, max = 15)
    private String  name;
    @NotEmpty(message = "surname boş olamaz")
    @NotBlank
    @Size(min = 2, max = 15)
    private String  surname;
    @NotEmpty(message = "username boş olamaz")
    @NotBlank
    @Size(min = 6, max = 15)
    private String  username;
    @NotEmpty(message = "password boş olamaz")
    @NotBlank
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")
    private String  password;
    @Max(300)
    @Min(10)
    @Positive
    private Integer weight;
    @Max(250)
    @Min(50)
    @Positive
    private Integer height;

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

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String passwordParam) {
        this.password = passwordParam;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(final Integer weightParam) {
        this.weight = weightParam;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(final Integer heightParam) {
        this.height = heightParam;
    }

    @Override
    public String toString() {
        return "Employee [name="
               + this.name
               + ", surname="
               + this.surname
               + ", username="
               + this.username
               + ", password="
               + this.password
               + ", weight="
               + this.weight
               + ", height="
               + this.height
               + "]";
    }


}
