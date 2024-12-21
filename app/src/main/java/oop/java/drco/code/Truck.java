// This class represents a truck that extends the Vehicle class
package oop.java.drco.code;

public class Truck extends Vehicle {
    private double loadCapacity;  // The load capacity of the truck

    // Constructor to create a truck with id, name, rental rate, and load capacity
    public Truck(String id, String name, double rentalRate, double loadCapacity) {
        super(id, name, rentalRate, true); // Calls the Vehicle constructor
        this.loadCapacity = loadCapacity;
    }

    // This method calculates the rental cost of the truck based on the number of rental days
    @Override
    public double calculateRentalCost(int days) {
        // Basic cost + additional charge based on load capacity
        return getRentalRate() * days + (loadCapacity * 50); // Extra charge for heavier loads
    }
}
