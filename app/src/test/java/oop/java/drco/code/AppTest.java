package oop.java.drco.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testAppFunctionality() {
        // This test focuses on checking the *logic* of the App's actions,
        // rather than the exact output printed to the console.

        // Create some vehicles
        Car car1 = new Car("C001", "Toyota", "Camry", 50, true);
        Truck truck1 = new Truck("T001", "Ford F-150", 100, 2.5);

        // Simulate a rental
        double carRentalCost = car1.calculateRentalCost(5);
        car1.setAvailable(false); // Simulate setting the car as rented

        // Check if the rental cost is calculated correctly
        assertEquals(275.0, carRentalCost, "Car rental cost calculation is incorrect");

        // Check if the car is marked as unavailable
        assertFalse(car1.isAvailable(), "Car should be unavailable after rental");

        // Simulate returning the car
        car1.setAvailable(true);

        // Check if the car is available again
        assertTrue(car1.isAvailable(), "Car should be available after return");

        // Test Truck cost
        double truckRentalCost = truck1.calculateRentalCost(2);
        assertEquals(550.0, truckRentalCost, "Truck rental cost calculation is incorrect");

        //You can add more assertions here to test other logic from your App class
        //For Example:
        Motorcycle bike1 = new Motorcycle("M001", "Yamaha", "R3", 30, true);
        double bikeRentalCost = bike1.calculateRentalCost(5);
        assertEquals(200.0, bikeRentalCost, "Motorcycle rental cost with sidecar incorrect");
    }
}