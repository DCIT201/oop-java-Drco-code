package oop.java.drco.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TruckTest {

    @Test
    void testTruckRentalCost() {
        Truck truck = new Truck("T001", "Ford F-150", 100, 2.5);
        assertEquals(550.0, truck.calculateRentalCost(2), "Truck rental cost is incorrect.");
    }

    @Test
    void testTruckRentalCostWithHeavyLoad() {
        Truck truckHeavy = new Truck("T002", "Volvo FH", 150, 5.0);
        assertEquals(1200.0, truckHeavy.calculateRentalCost(2), "Truck rental cost with heavier load is incorrect.");
    }

    @Test
    void testTruckAvailability() {
        Truck truck = new Truck("T001", "Ford F-150", 100, 2.5);
        assertTrue(truck.isAvailable(), "Truck should be available initially.");
        truck.setAvailable(false);
        assertFalse(truck.isAvailable(), "Truck should be unavailable after rental.");
    }
}
