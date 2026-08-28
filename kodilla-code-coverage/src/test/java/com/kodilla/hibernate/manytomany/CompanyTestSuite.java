package com.kodilla.hibernate.manytomany;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTestSuite {

    @Test
    void shouldCreateCompanyAndAssignEmployees() {
        // Given
        Company company = new Company("Kodilla");
        List<Employee> employees = new ArrayList<>();

        // When
        company.setEmployees(employees);

        // Then
        assertEquals("Kodilla", company.getName());
        assertEquals(employees, company.getEmployees());
        assertTrue(company.getEmployees().isEmpty());
    }
}