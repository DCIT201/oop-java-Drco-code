
// This class represents a motorcycle that extends the Vehicle class
package oop.java.drco.code;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;  // Whether the motorcycle has a sidecar

    // Constructor to create a motorcycle with id, name, rental rate, and sidecar availability
    public Motorcycle(String id, String name, double rentalRate, boolean hasSidecar) {
        super(id, name, "defaultType", rentalRate, true); // Calls the Vehicle constructor with default type
        this.hasSidecar = hasSidecar;
    }

    // This method calculates the rental cost of the motorcycle based on the number of rental days
    @Override
    public double calculateRentalCost(int days) {
        double cost = getRentalRate() * days;  // Basic rental cost

        // If the motorcycle has a sidecar, add an additional cost
        if (hasSidecar) {
            cost += 20.0 * days; // Extra charge for sidecar
        }

        return cost;
    }
}