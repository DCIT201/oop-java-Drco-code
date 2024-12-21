package oop.java.drco.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class RentalAgencyTest {

    private RentalAgency rentalAgency;
    private Car car;
    private Motorcycle motorcycle;
    private Truck truck;

    @BeforeEach
    public void setUp() {
        rentalAgency = new RentalAgency();
        car = new Car("C001", "Toyota Camry", 50.0, true);
        motorcycle = new Motorcycle("M001", "Yamaha R3", 30.0, false);
        truck = new Truck("T001", "Ford F-150", 100.0, 3.0);
    }

    @Test
    public void testAddVehicle() {
        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(motorcycle);
        rentalAgency.addVehicle(truck);

        List<Vehicle> vehicles = rentalAgency.getAvailableVehicles();
        assertEquals(3, vehicles.size()); // Ensure all vehicles were added
    }

    @Test
    public void testRentVehicle() {
        rentalAgency.addVehicle(car);
        rentalAgency.rentVehicle("CU001", car);
        assertFalse(car.isAvailable()); // Car should be marked as rented
    }

    @Test
    public void testGetAvailableVehicles() {
        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(motorcycle);
        rentalAgency.addVehicle(truck);
        List<Vehicle> availableVehicles = rentalAgency.getAvailableVehicles();
        assertTrue(availableVehicles.contains(car)); // Ensure car is available
    }
}
