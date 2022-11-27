package com.jk.explore.java.countries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryTest {

    @Test
    public void countryTest1() {
        Country country = new Country();
        country.name = "India";
        country.code = 91;
        assertEquals(country.getCode(), 91);
        assertEquals(country.getName(), "India");
    }

}