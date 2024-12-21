// This class represents a customer who rents vehicles
package oop.java.drco.code;

import java.util.ArrayList;  // For storing the customer's rental history
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<RentalTransaction> rentalHistory; // List to store all rental transactions

    // Constructor to create a customer with an id and name
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>(); // Initialize an empty rental history list
    }

    // Getter methods to access the customer information
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    // Method to add a rental transaction to the customer's rental history
    public void addRental(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }
}