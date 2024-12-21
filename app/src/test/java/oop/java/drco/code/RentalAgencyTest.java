package oop.java.drco.code;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RentalAgencyTest {

    private RentalAgency agency;
    private Car car1, car2;
    private Motorcycle bike1, bike2;
    private Truck truck1, truck2;
    private Customer customer1;

    @BeforeEach
    public void setUp() {
        agency = new RentalAgency();
        
        car1 = new Car("C001", "Toyota", "Camry", 50, true);
        car2 = new Car("C002", "Honda", "Civic", 40, false);
        bike1 = new Motorcycle("M001", "Yamaha", "R3", 30, false);
        bike2 = new Motorcycle("M002", "Harley", "Davidson", 45, true);
        truck1 = new Truck("T001", "Ford F-150", 100, 2.5);
        truck2 = new Truck("T002", "Volvo FH", 150, 5.0);

        customer1 = new Customer("CU001", "John Doe");

        agency.addVehicle(car1);
        agency.addVehicle(car2);
        agency.addVehicle(bike1);
        agency.addVehicle(bike2);
        agency.addVehicle(truck1);
        agency.addVehicle(truck2);
    }

    @Test
    public void testAddVehicle() {
        List<Vehicle> vehicles = agency.getAllVehicles();
        assertEquals(6, vehicles.size(), "Agency should have 6 vehicles after adding.");
    }

    @Test
    public void testRentVehicle() {
        assertTrue(agency.rentVehicle(customer1, car1, 0), "Renting car1 should succeed.");
        assertFalse(car1.isAvailable(), "Car1 should no longer be available after rental.");
    }

    @Test
    public void testRentUnavailableVehicle() {
        agency.rentVehicle(customer1, car2, 0);
        assertFalse(agency.rentVehicle(customer1, car2, 0), "Renting an unavailable vehicle should fail.");
    }

    @Test
    public void testReturnVehicle() {
        agency.rentVehicle(customer1, car1, 0);
        agency.returnVehicle(car1);
        assertTrue(car1.isAvailable(), "Car1 should be available after returning.");
    }
}
