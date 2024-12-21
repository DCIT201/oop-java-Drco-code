package oop.java.drco.code;

import java.util.ArrayList;
import java.util.List;

// Main class to test the application
public class App {
    public static void main(String[] args) {
        // Create instances of different vehicle types
        Car car1 = new Car("C001", "Toyota", "Camry", 50.00, true);
        Car car2 = new Car("C002", "Honda", "Civic", 40.00, false);

        Motorcycle bike1 = new Motorcycle("M001", "Yamaha R3", 30.00, false);
        Motorcycle bike2 = new Motorcycle("M002", "Harley Davidson", 45.00, true);

        Truck truck1 = new Truck("T001", "Ford F-150", 100, 2.5);
        Truck truck2 = new Truck("T002", "Volvo FH", 150, 5.0);

        // Create instances of customers
        Customer customer1 = new Customer("CU001", "John Doe");
        Customer customer2 = new Customer("CU002", "Jane Smith");
        Customer customer3 = new Customer("CU003", "Alice Johnson");

        // Create a list to manage vehicles
        List<Vehicle> vehicleFleet = new ArrayList<>();
        vehicleFleet.add(car1);
        vehicleFleet.add(car2);
        vehicleFleet.add(bike1);
        vehicleFleet.add(bike2);
        vehicleFleet.add(truck1);
        vehicleFleet.add(truck2);

        // Create a rental scenario
        System.out.println("=== Vehicle Rental System Test ===");

        // Print details of all vehicles
        System.out.println("\n--- Available Vehicles ---");
        for (Vehicle vehicle : vehicleFleet) {
            System.out.println(vehicle);
        }

        // Simulate rental process
        System.out.println("\n--- Rental Process ---");
        System.out.println(customer1.getName() + " is renting " + car1.getModel() + " for 5 days.");
        System.out.println("Rental cost: $" + car1.calculateRentalCost(5));
        car1.setAvailable(false); // Mark the car as rented

        System.out.println("\n" + customer2.getName() + " is renting " + bike2.getModel() + " for 3 days.");
        System.out.println("Rental cost: $" + bike2.calculateRentalCost(3));
        bike2.setAvailable(false); // Mark the motorcycle as rented

        System.out.println("\n" + customer3.getName() + " is renting " + truck2.getModel() + " for 7 days.");
        System.out.println("Rental cost: $" + truck2.calculateRentalCost(7));
        truck2.setAvailable(false); // Mark the truck as rented

        // Check availability of vehicles
        System.out.println("\n--- Vehicle Availability ---");
        for (Vehicle vehicle : vehicleFleet) {
            System.out.println(vehicle.getModel() + " is " + (vehicle.isAvailable() ? "available" : "not available") + " for rental.");
        }

        // Test abstraction, polymorphism, and overriding
        System.out.println("\n--- Testing Overriding ---");
        System.out.println("Details of Car1: " + car1.toString());
        System.out.println("Details of Truck1: " + truck1.toString());

        System.out.println("\n--- Testing Polymorphism ---");
        for (Vehicle vehicle : vehicleFleet) {
            System.out.println(vehicle.getModel() + " rental cost for 2 days: $" + vehicle.calculateRentalCost(2));
        }

        // Return a rented vehicle and make it available again
        System.out.println("\n--- Returning Vehicles ---");
        System.out.println(customer1.getName() + " is returning " + car1.getModel() + ".");
        car1.setAvailable(true);
        System.out.println(car1.getModel() + " is now " + (car1.isAvailable() ? "available" : "not available") + " for rental.");
    }
}