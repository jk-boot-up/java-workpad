package com.jk.explore.java;

import com.jk.explore.java.employees.Employee;

import static java.lang.System.out;

public class PackageKeywordExample {

    public static void main(String[] args) {
        out.println("The PublicKeywordExample class is defined in the package: "+ PackageKeywordExample.class.getPackage());
        out.println("The Employee class is defined in the package: "+ Employee.class.getPackage());
        Employee employee = new Employee("XYZ", 1);
        out.println("Employee name: "+ employee.getName());
        out.println("Employee id is: " + employee.getId());
    }

}