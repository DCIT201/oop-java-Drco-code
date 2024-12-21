package oop.java.drco.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testCreateCar() {
        // Create a Car object
        Car car = new Car("Toyota", "Camry", 2020, 5);
        
        // Test that the number of doors is correct
        assertEquals(5, car.getNumberOfDoors());
        
        // Optionally, manually verify details output
        car.displayDetails();
    }

    @Test
    public void testCreateMotorcycle() {
        // Create a Motorcycle object
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2021, false);
        
        // Test that the motorcycle has a sidecar (should be false)
        assertEquals(false, motorcycle.hasSidecar());
        
        // Optionally, manually verify details output
        motorcycle.displayDetails();
    }

    @Test
    public void testCreateTruck() {
        // Create a Truck object
        Truck truck = new Truck("Ford", "F-150", 2022, 2.5);
        
        // Test that the truck load capacity is correct
        assertEquals(2.5, truck.getLoadCapacity());
        
        // Optionally, manually verify details output
        truck.displayDetails();
    }

    @Test
    public void testDisplayAllVehicleDetails() {
        // Create objects of different vehicles
        Car car = new Car("Toyota", "Camry", 2020, 5);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2021, false);
        Truck truck = new Truck("Ford", "F-150", 2022, 2.5);

        // Display details for each vehicle type
        System.out.println("---- Vehicle Details ----");
        car.displayDetails();
        motorcycle.displayDetails();
        truck.displayDetails();
    }
}
