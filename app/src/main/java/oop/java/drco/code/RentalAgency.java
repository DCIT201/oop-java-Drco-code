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
    public boolean rentVehicle(Customer customer, Vehicle vehicle, int rentalDays) {
        if (vehicle.isAvailable()) {
            vehicle.setAvailable(false);
            RentalTransaction transaction = new RentalTransaction(customer, vehicle, rentalDays);
            customer.addRental(transaction);
            return true;
        }
        return false;
    }
    

    // Method to return a rented vehicle
    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);  // Mark the vehicle as available again
    }
}
