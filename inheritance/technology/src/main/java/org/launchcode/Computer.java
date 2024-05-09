package org.launchcode;

public class Computer extends AbstractEntity {

    //Fields
    private String brand;
    private int ram;
    private int memory;

    //Constructor
    public Computer(String brand, int ram, int memory) {
        this.brand = brand;
        this.ram = ram;
        this.memory = memory;
    }

   //getters
    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public double getMemory() {
        return memory;
    }

    //Methods
    public void powerOn() {
        System.out.println("System is powering on...");
    }

    public void shutDown() {
        System.out.println("System is shutting down...");

    }
}
