package oop.java.drco.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotorcycleTest {

    @Test
    public void testMotorcycleRentalCostWithSidecar() {
        Motorcycle motorcycle = new Motorcycle("M001", "Harley Davidson", 50.0, true);
        double cost = motorcycle.calculateRentalCost(4); // Renting for 4 days
        assertEquals(4 * 50.0 + 4 * 10.0, cost); // Base cost + sidecar cost
    }

    @Test
    public void testMotorcycleRentalCostWithoutSidecar() {
        Motorcycle motorcycle = new Motorcycle("M002", "Yamaha R3", 30.0, false);
        double cost = motorcycle.calculateRentalCost(2); // Renting for 2 days
        assertEquals(2 * 30.0, cost); // Just the base cost
    }

    @Test
    public void testMotorcycleAvailability() {
        Motorcycle motorcycle = new Motorcycle("M003", "Ducati Monster", 80.0, false);
        motorcycle.setAvailable(false);
        assertFalse(motorcycle.isAvailable());
    }
}
