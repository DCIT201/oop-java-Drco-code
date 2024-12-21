package oop.java.drco.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CarTest {

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
    void testCarAvailability() {
        Car car = new Car("C001", "Toyota", "Camry", 50, true);
        assertTrue(car.isAvailable(), "Car should be available initially.");
        car.setAvailable(false);
        assertFalse(car.isAvailable(), "Car should be unavailable after rental.");
    }
}
