package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RetrieverFacadeTest {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private RetrieverFacade retrieverFacade;

    @Test
    void retrieveCompaniesByFragment() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");
        companyDao.save(softwareMachine);
        companyDao.save(dataMasters);
        companyDao.save(greyMatter);
        //When
        List<Company> companies = retrieverFacade.retrieveCompaniesByFragment("achin");
        //Then
        try {
            assertEquals(1, companies.size());
        } catch (Exception e) {

        } finally {
            //CleanUp
            companyDao.deleteById(softwareMachine.getId());
            companyDao.deleteById(dataMasters.getId());
            companyDao.deleteById(greyMatter.getId());
        }
    }

    @Test
    void retrieveEmployeesByFragment() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee markSmith = new Employee("Mark", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee lindaKowalski = new Employee("Linda", "Kowalski");
        employeeDao.save(johnSmith);
        employeeDao.save(markSmith);
        employeeDao.save(stephanieClarkson);
        employeeDao.save(lindaKowalski);
        //When
        List<Employee> employees = retrieverFacade.retrieveEmployeesByFragment("it");
        //Then
        try {
            assertEquals(2, employees.size());
        } catch (Exception e) {

        } finally {
            //CleanUp
            employeeDao.deleteById(johnSmith.getId());
            employeeDao.deleteById(markSmith.getId());
            employeeDao.deleteById(stephanieClarkson.getId());
            employeeDao.deleteById(lindaKowalski.getId());
        }
    }
}
