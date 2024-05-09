package org.launchcode;

public class SmartPhone extends Computer {

    //Field
    private double screenSize;

    //Constructor

    public SmartPhone(String brand, int ram, int memory, double screenSize) {
        super(brand, ram, memory);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    //Method
    @Override
    public void powerOn() {
        super.powerOn();
    }

    public void makeCall(String recipient) {
        System.out.println("Calling " + recipient);
    }
}
