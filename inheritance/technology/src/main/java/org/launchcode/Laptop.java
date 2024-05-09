package org.launchcode;

public class Laptop extends Computer{

    //Field
    private boolean hasTouchScreen;

    //Constructor

    public Laptop(String brand, int ram, int memory, boolean touchScreen) {
        super(brand, ram, memory);
        this.hasTouchScreen = touchScreen;
    }

    public boolean isTouchScreen() {
        return hasTouchScreen;
    }

    //method

    @Override
    public void powerOn() {
        super.powerOn();
    }

    public void sleep() {
        System.out.println("Laptop is going to sleep...");
    }
}
