package oop.java.drco.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RentalTransactionTest {

    private RentalTransaction transaction;
    private Customer customer;
    private Car car;

    @BeforeEach
    public void setUp() {
        customer = new Customer("CU001", "John Doe");
        car = new Car("C001", "Toyota Camry", 50.0, true);
        transaction = new RentalTransaction(customer, car, 5);
    }

    @Test
    public void testTransactionDetails() {
        assertEquals(customer, transaction.getCustomer());
        assertEquals(car, transaction.getVehicle());
        assertEquals(5, transaction.getDaysRented());
        assertEquals(5 * 50.0, transaction.calculateTotalCost()); // Base rental cost
    }

    @Test
    public void testTransactionAvailability() {
        car.setAvailable(false); // Make car unavailable
        assertFalse(transaction.getVehicle().isAvailable()); // Vehicle should be unavailable
    }
}
