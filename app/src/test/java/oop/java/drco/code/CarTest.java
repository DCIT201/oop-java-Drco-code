package oop.java.drco.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testCarRentalCostWithGPS() {
        Car car = new Car("C001", "Toyota Camry", 50.0, true);
        double cost = car.calculateRentalCost(5); // Renting for 5 days
        assertEquals(5 * 50.0 + 5 * 5, cost); // Base cost + GPS cost
    }

    @Test
    public void testCarRentalCostWithoutGPS() {
        Car car = new Car("C002", "Honda Civic", 40.0, false);
        double cost = car.calculateRentalCost(3); // Renting for 3 days
        assertEquals(3 * 40.0, cost); // Just the base cost
    }

    @Test
    public void testCarAvailability() {
        Car car = new Car("C003", "Ford Focus", 60.0, true);
        car.setAvailable(false);
        assertFalse(car.isAvailable());
    }
}
