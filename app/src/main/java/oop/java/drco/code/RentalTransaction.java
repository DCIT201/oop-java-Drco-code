// This class handles the rental transaction between a customer and a vehicle
package oop.java.drco.code;

import java.time.LocalDate; // To store the date of the rental

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;
    private LocalDate rentalDate;
    private double cost;

    // Constructor to create a rental transaction with customer, vehicle, and number of rental days
    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.rentalDate = LocalDate.now();  // Set the rental date to the current date
        this.cost = vehicle.calculateRentalCost(rentalDays);  // Calculate the rental cost
    }

    // Getter methods to access the transaction details
    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public double getCost() {
        return cost;
    }
    
    @Override
public String toString() {
    return "RentalTransaction [customer=" + customer.getName() + ", vehicle=" + vehicle.getModel() + 
           ", rentalDays=" + rentalDays + ", rentalDate=" + rentalDate + ", cost=$" + cost + "]";
}

}
