package org.launchcode;

import org.w3c.dom.ls.LSOutput;

public class Program {

    public static void main(String[] args) {

    SmartPhone iPhone = new SmartPhone("Apple", 16,128,6.7);

    iPhone.powerOn();
    iPhone.makeCall("Aakash");
    System.out.println(iPhone.getScreenSize() + " inch");

    Laptop Dell = new Laptop("Dell",64,512,false);
    Dell.sleep();
    }



}
