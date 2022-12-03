package com.jk.explore.java.privatekeyword;

import com.jk.explore.java.privatekeyword.vehicles.Vehicle;

import static java.lang.System.out;

public class PrivateExample {
    public static void main(String[] args) {
        out.println("Hello world!");
        Vehicle vehicle = new Vehicle("BMW");
        out.println("Vehicle name is: " + vehicle.getName());
        vehicle.start();
        vehicle.stop();
    }

}

