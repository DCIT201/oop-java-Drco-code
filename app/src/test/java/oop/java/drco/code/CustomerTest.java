package oop.java.drco.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void testCustomerCreation() {
        Customer customer = new Customer("C001", "John Doe");
        assertEquals("John Doe", customer.getName(), "Customer name is incorrect.");
        assertEquals("C001", customer.getCustomerId(), "Customer ID is incorrect.");
        assertNotNull(customer.getRentalHistory(), "Rental history should be initialized.");
        assertTrue(customer.getRentalHistory().isEmpty(), "Rental history should be empty initially.");
    }

    @Test
    void testAddRental() {
        Customer customer = new Customer("C001", "John Doe");
        Car car = new Car("C002", "Toyota", "Camry", 60, true);
        RentalTransaction transaction = new RentalTransaction(customer, car, 3);

        customer.addRental(transaction);
        assertEquals(1, customer.getRentalHistory().size(), "Rental history size is incorrect.");
        assertEquals(transaction, customer.getRentalHistory().get(0), "Rental history does not contain the added transaction.");
    }
}
