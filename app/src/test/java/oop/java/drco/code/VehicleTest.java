package oop.java.drco.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    // Test for the Vehicle class, which is abstract, so we cannot instantiate it directly.
    private class TestVehicle extends Vehicle {
        public TestVehicle(String vehicleId, String model, double baseRentalRate) {
            super(vehicleId, model, baseRentalRate);
        }

        @Override
        public double calculateRentalCost(int days) {
            return getBaseRentalRate() * days;
        }

        @Override
        public boolean isAvailableForRental() {
            return isAvailable();
        }
    }

    @Test
    public void testVehicleGetters() {
        Vehicle vehicle = new TestVehicle("V001", "Generic Model", 100.0);
        assertEquals("V001", vehicle.getVehicleId());
        assertEquals("Generic Model", vehicle.getModel());
        assertEquals(100.0, vehicle.getBaseRentalRate());
    }

    @Test
    public void testVehicleAvailability() {
        Vehicle vehicle = new TestVehicle("V001", "Generic Model", 100.0);
        assertTrue(vehicle.isAvailable());
        vehicle.setAvailable(false);
        assertFalse(vehicle.isAvailable());
    }
}
