package oop.java.drco.code;

// RentalTransaction class to handle vehicle rentals
public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;

    // Constructor to initialize rental transaction
    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    // Method to calculate the rental cost based on days
    public double calculateRentalCost() {
        double dailyRate = vehicle.getRentalRate();  // Assuming getRentalRate() is a method in Vehicle class
        return dailyRate * rentalDays;
    }

    // Method to display transaction details
    public void displayTransactionDetails() {
        System.out.println("Rental Transaction Details:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Vehicle: " + vehicle.getMake() + " " + vehicle.getModel());
        System.out.println("Days Rented: " + rentalDays);
        System.out.println("Total Cost: " + calculateRentalCost());
    }
}
