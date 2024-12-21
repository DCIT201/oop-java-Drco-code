package oop.java.drco.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class VehicleTest {

    @Test
    void testCarRentalCostWithGPS() {
        Car car = new Car("C001", "Toyota", "Camry", 50, true);
        assertEquals(165.0, car.calculateRentalCost(3), "Car rental cost with GPS is incorrect.");
    }

    @Test
    void testCarRentalCostWithoutGPS() {
        Car carNoGPS = new Car("C002", "Honda", "Civic", 40, false);
        assertEquals(120.0, carNoGPS.calculateRentalCost(3), "Car rental cost without GPS is incorrect.");
    }

    @Test
    void testMotorcycleRentalCostWithSidecar() {
        Motorcycle motorcycle = new Motorcycle("M001", "Yamaha", "R3", 30, true);
        assertEquals(200.0, motorcycle.calculateRentalCost(5), "Motorcycle rental cost with sidecar is incorrect.");
    }

    @Test
    void testMotorcycleRentalCostWithoutSidecar() {
        Motorcycle motorcycleNoSidecar = new Motorcycle("M002", "Kawasaki", "Ninja", 35, false);
        assertEquals(175.0, motorcycleNoSidecar.calculateRentalCost(5), "Motorcycle rental cost without sidecar is incorrect.");
    }

    @Test
    void testTruckRentalCost() {
        Truck truck = new Truck("T001", "Ford F-150", 100, 2.5);
        assertEquals(550.0, truck.calculateRentalCost(2), "Truck rental cost is incorrect.");
    }

    @Test
    void testVehicleAvailability() {
        Car car = new Car("C001", "Toyota", "Camry", 50, true);
        assertTrue(car.isAvailable(), "Vehicle should be available initially.");
        car.setAvailable(false);
        assertFalse(car.isAvailable(), "Vehicle availability update failed.");
    }
}
