package oop.java.drco.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class MotorcycleTest {

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
    void testMotorcycleAvailability() {
        Motorcycle motorcycle = new Motorcycle("M001", "Yamaha", "R3", 30, false);
        assertTrue(motorcycle.isAvailable(), "Motorcycle should be available initially.");
        motorcycle.setAvailable(false);
        assertFalse(motorcycle.isAvailable(), "Motorcycle should be unavailable after rental.");
    }
}
