package com.jk.explore.java.employees;

import com.jk.explore.java.countries.Country;

public class Employee {

    private Country country;

    public Employee(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
