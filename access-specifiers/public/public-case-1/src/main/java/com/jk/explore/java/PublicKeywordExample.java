package com.jk.explore.java;

import com.jk.explore.java.countries.AsianCountry;
import com.jk.explore.java.countries.Country;

import static java.lang.System.out;

public class PublicKeywordExample {

    public static void main(String[] args) {
        Country country = new Country();
        country.code = 91;
        country.name = "India";
        out.println("Country Name: "+ country.getName());
        out.println("Country Code is: "+ country.getCode());
        AsianCountry asianCountry = new AsianCountry();
        asianCountry.name = "India";
        asianCountry.code = 91;
        out.println("Asian Country Name: "+ asianCountry.getName());
        out.println("Asian Country Code: "+ asianCountry.getCode());
    }

}