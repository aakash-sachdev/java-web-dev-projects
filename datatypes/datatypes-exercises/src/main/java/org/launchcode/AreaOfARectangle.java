package org.launchcode;

import java.util.Scanner;

public class AreaOfARectangle {

    public static void main(String[] args) {

        double area;
        double length;
        double width;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        width = input.nextDouble();
        input.close();

        area = length * width;
        System.out.println("Area of the rectangle is: " + area );
    }
}
