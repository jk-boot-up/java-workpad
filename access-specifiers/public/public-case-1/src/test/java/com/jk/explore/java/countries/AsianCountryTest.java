package com.jk.explore.java.countries;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AsianCountryTest {

    @Test
    public void asianCountryTest1() {
        AsianCountry asianCountry = new AsianCountry();
        asianCountry.code = 91;
        asianCountry.name = "India";
        assertEquals(asianCountry.getName(), "India");
        assertEquals(asianCountry.getCode(), 91);
    }
}
