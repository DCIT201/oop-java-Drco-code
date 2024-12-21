// This class manages the vehicles and rentals in the agency
package oop.java.drco.code;

import java.util.ArrayList;  // To store the list of all vehicles
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles;

    // Constructor to initialize the list of vehicles
    public RentalAgency() {
        vehicles = new ArrayList<>();
    }

    // Method to add a vehicle to the agency
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Method to get a list of all vehicles in the agency
    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }

    // Method to rent a vehicle to a customer
    public boolean rentVehicle(Customer customer, Vehicle vehicle) {
        if (vehicle.isAvailable()) {  // Check if the vehicle is available
            vehicle.setAvailable(false);  // Mark the vehicle as rented
            RentalTransaction transaction = new RentalTransaction(vehicle, customer, 3);  // Create a new rental transaction
            customer.addRental(transaction);  // Add the transaction to the customer's rental history
            return true;  // Successfully rented the vehicle
        }
        return false;  // The vehicle is not available
    }

    // Method to return a rented vehicle
    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);  // Mark the vehicle as available again
    }
}