// This is an abstract class that all vehicle types will inherit from
// It contains common properties and methods for vehicles.
package oop.java.drco.code;

public abstract class Vehicle {
    private String id;
    private String name;
    private String model;
    private double rentalRate;
    private boolean available;


    // Constructor to initialize a vehicle with its id, name, rental rate, and availability
    public Vehicle(String id, String name, String model, double rentalRate, boolean available) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.rentalRate = rentalRate;
        this.available = available;
    }

    public Vehicle(String id2, String name2, double rentalRate2, boolean b) {
        //TODO Auto-generated constructor stub
    }

    // Abstract method that will be implemented by each vehicle type
    public abstract double calculateRentalCost(int days);

    // Getter methods to access the properties of a vehicle
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getModel() {
        return model;
    }

    // Setter method to change the availability of a vehicle
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
