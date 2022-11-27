package com.jk.explore.java.employees;

import com.jk.explore.java.countries.Country;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void employeeTest1() {
        Country country = new Country();
        country.name = "India";
        country.code = 91;
        Employee employee = new Employee(country);
        assertEquals(employee.getCountry().name, "India");
        assertEquals(employee.getCountry().code, 91);
    }
}
