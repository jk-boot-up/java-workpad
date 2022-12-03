package com.jk.explore.java.privatekeyword.vehicles;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void testVehicleCase1() {
        Vehicle vehicle = new Vehicle("BMW");
        out.println("Vehicle name is: " + vehicle.getName());
        vehicle.start();
        vehicle.stop();
        assertEquals(vehicle.getName(), "BMW");
    }

}
