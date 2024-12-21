package oop.java.drco.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void testCustomerDetails() {
        Customer customer = new Customer("CU001", "John Doe");
        assertEquals("CU001", customer.getCustomerId());
        assertEquals("John Doe", customer.getName());
    }
}
