package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetrieverFacade {

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    public RetrieverFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> retrieveCompaniesByFragment(String fragment) {
        return companyDao.retrieveCompaniesContains(fragment);
    }

    public List<Employee> retrieveEmployeesByFragment(String fragment) {
        return employeeDao.retrieveEmployeesContains(fragment);
    }
}
