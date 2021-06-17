package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveCompaniesNamesStartWith",
        query = "SELECT * FROM COMPANY" +
                " WHERE COMPANY_NAME LIKE :LETTERS",
        resultClass = Company.class
)

@NamedQuery(
        name = "Company.retrieveCompaniesContains",
        query = "FROM Company WHERE companyName LIKE CONCAT('%',:FRAGMENT,'%')"
)

@Entity
public class Company {

    private int id;
    private String companyName;
    private List<Employee> employees = new ArrayList<>();

    public Company() {

    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    public String getCompanyName() {
        return companyName;
    }

    @ManyToMany(cascade = CascadeType.ALL, targetEntity = Employee.class, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
