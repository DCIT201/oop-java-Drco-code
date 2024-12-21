package oop.java.drco.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class RentalTransactionTest {

    @Test
    void testRentalTransactionCreation() {
        Customer customer = new Customer("C001", "John Doe");
        Car car = new Car("C002", "Toyota", "Camry", 60, true);
        int rentalDays = 3;

        RentalTransaction transaction = new RentalTransaction(customer, car, rentalDays);

        assertNotNull(transaction.getRentalDate(), "Rental date should be set.");
        assertEquals(customer, transaction.getCustomer(), "Customer is incorrect.");
        assertEquals(car, transaction.getVehicle(), "Vehicle is incorrect.");
        assertEquals(rentalDays, transaction.getRentalDays(), "Rental days are incorrect.");
        assertEquals(195.0, transaction.getCost(), "Rental cost is incorrect.");
    }
}
