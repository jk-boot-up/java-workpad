package com.jk.explore.java;

import com.jk.explore.java.countries.Country;

import static java.lang.System.out;

public class PublicKeywordExample {

    public static void main(String[] args) {
        Country country = new Country("India", 91);;
        out.println("Country Name: "+ country.getName());
        out.println("Country code is: "+ country.getCode());
    }

}