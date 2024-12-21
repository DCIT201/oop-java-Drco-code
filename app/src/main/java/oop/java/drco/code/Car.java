// This class represents a car that extends the Vehicle class
package oop.java.drco.code;

public class Car extends Vehicle {
    private boolean hasGPS;  // Whether the car has a GPS system

    // Constructor to create a car with id, name, rental rate, and GPS availability
    public Car(String id, String name, String model, double rentalRate, boolean hasGPS) {
        super(id, name, model, rentalRate, true); // Calls the Vehicle constructor
        this.hasGPS = hasGPS;
    }

    // This method calculates the rental cost of the car based on the number of rental days
    @Override
    public double calculateRentalCost(int days) {
        double cost = getRentalRate() * days;  // Basic rental cost

        // If the car has GPS, add an additional cost
        if (hasGPS) {
            cost += 15.0 * days; // Extra charge for GPS
        }

        return cost;
    }
}
