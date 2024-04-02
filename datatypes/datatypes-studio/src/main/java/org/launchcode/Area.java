package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        double radius;
//      Circle areaofacircle = new Circle(); // -  Instance method

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

        radius = input.nextDouble();
        input.close();

        double areaOfACircle  = Circle.getArea(radius);
        System.out.println("Area of the circle is: " + areaOfACircle);
//      System.out.println("Area of the circle is: " + areaofacircle.getArea(radius) ); // -  Instance method
    }
}

