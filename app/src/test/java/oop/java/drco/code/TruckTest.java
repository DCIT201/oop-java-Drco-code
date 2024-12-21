package oop.java.drco.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TruckTest {

    @Test
    public void testTruckRentalCost() {
        Truck truck = new Truck("T001", "Ford F-150", 100.0, 3.0); // 3 tons
        double cost = truck.calculateRentalCost(5); // Renting for 5 days
        assertEquals(5 * 100.0 + 5 * 3.0 * 15.0, cost); // Base cost + load capacity cost
    }

    @Test
    public void testTruckAvailability() {
        Truck truck = new Truck("T002", "Volvo FH", 150.0, 5.0);
        truck.setAvailable(false);
        assertFalse(truck.isAvailable());
    }
}
