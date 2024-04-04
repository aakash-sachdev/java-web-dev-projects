package org.launchcode;

import java.util.Scanner;

public class PracticeExamples {
    public static void main(String[] args) {

        //for Loop -->
        //Example 1 -
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        System.out.println("****************************************************************************************");

        //Example 2 -
        for (int i = 100; i >= 0; i -= 5) {
            System.out.println(i);
        }
        System.out.println("****************************************************************************************");

        //for-each Loop --.
        //EXAMPLE 1 -
        int nums[] = {1, 1, 2, 3, 5, 8, 13, 21};

        for (int i : nums) {
            System.out.println(i);
        }
        System.out.println("****************************************************************************************");

        //Example 2-  to iterate through a String in this way, Java requires an extra String method, .toCharArray(), to convert the String to an Array of characters.

        String msg = "Hello World";

        for (char c : msg.toCharArray()) { //  convert the String to an Array of characters method
            System.out.println(c);
        }
        System.out.println("****************************************************************************************");

        //while Loop -->
        //Example 1-

        int j = 0;
        while (j < 3) {
            System.out.println(j);
            j++;
        }
        System.out.println("****************************************************************************************");

        //do-while Loop -->
        //Example 1-

        do {
            System.out.println("Hello, World");
        } while (false);
        System.out.println("****************************************************************************************");

        // Break Statements in Loops -->
        // Example 1-

        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;
        for (int oneInt : someInts) {
            if (oneInt == searchTerm) {
                System.out.println("Found it!");
                break;
            }
        }
        System.out.println("****************************************************************************************");

        // Continue Statements in Loops -->
        // Example 1-
        int[] someInt = {1, 10, 2, 3, 5, 8, 10};
        int lookingTerm = 10;
        for (int oneInt : someInt) {
            if (oneInt == lookingTerm) {
                System.out.println("Found it!");
                continue;
            }
            System.out.println("Not here");
        }
        System.out.println("****************************************************************************************");

        // Question 1-

        char[] chars = {'p', 'l', 'r', 's', 't'};

        for (char i : chars) {
            System.out.println(i);
        }
        System.out.println("****************************************************************************************");

        // Question 2-

        do {
            System.out.println("Hello world!");
        } while (3 < 2); // 1 time cuz the condition is never true.
        System.out.println("****************************************************************************************");

    }
}