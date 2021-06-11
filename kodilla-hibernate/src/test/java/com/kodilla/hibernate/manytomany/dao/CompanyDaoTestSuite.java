package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee lindaKowalski = new Employee("Linda", "Kowalski");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarkson);
        dataMasters.getEmployees().add(lindaKowalski);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKowalski);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarkson.getCompanies().add(dataMasters);
        lindaKowalski.getCompanies().add(dataMasters);
        lindaKowalski.getCompanies().add(greyMatter);
        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMasters);
        int dataMastersId = dataMasters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMastersId);
        assertNotEquals(0, greyMatterId);
        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMastersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {

        }
    }

    @Test
    void testRetrieveEmployeeLastName() {
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
        List<Employee> employees = employeeDao.retrieveEmployee("Smith");
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

    @Test
    void testRetrieveCompanyStartsWithLetters() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");
        companyDao.save(softwareMachine);
        companyDao.save(dataMasters);
        companyDao.save(greyMatter);
        //When
        List<Company> companies = companyDao.retrieveCompaniesNamesStartWith("Sof%");
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
}
