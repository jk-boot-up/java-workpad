package com.jk.explore;

import com.jk.explore.employees.Employee;

public class Application {

    public static void main(String[] args) {
        Employee employee = new Employee("XYZ", 1);
        System.out.println("Employee name: "+ employee.getName());
        System.out.println("Employee id is: " + employee.getId());
    }

}