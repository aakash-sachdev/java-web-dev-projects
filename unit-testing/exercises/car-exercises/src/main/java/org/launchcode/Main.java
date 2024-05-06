package org.launchcode;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 10, 50);
        System.out.println(car.getMake() + " - " + car.getModel());


        double requestedMiles = 1001.0; // Example: Requested distance to drive
        car.drive(requestedMiles);  // Call the drive method
        System.out.println("Gas tank level after driving: " + car.getGasTankLevel());
        System.out.println("Odometer reading after driving: " + car.getOdometer());

    }
}