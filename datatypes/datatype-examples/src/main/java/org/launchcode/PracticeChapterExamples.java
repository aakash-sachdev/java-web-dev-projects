package org.launchcode;

public class PracticeChapterExamples {

    public static void main(String[] args) {

        String str = "Rutabaga      ";
        // String Methods in Java
        System.out.println(str.charAt(3));  // Returns the character at index 3, ('a').
        System.out.println(str.substring(2,5)); // Returns the characters from indexes 2 - 5, ("ta").
        System.out.println(str.length()); // str.length()
        System.out.println(str.indexOf('a')); // Returns the index for the first occurrence of ‘a’, (3).
        // System.out.println(str.split("delimiter")); //Splits the string into sections at each delimiter and stores the sections as elements in an array.
        // System.out.println(str.concat(string2).concat(string3)); - In Java, concat concatenates only two strings. To join multiple strings, method chaining is required.`
        System.out.println(str.trim()); // Removes any whitespace at the beginning or end of the string.
        System.out.println(str.toUpperCase()); // Changes all alphabetic characters in the string to UPPERCASE or lowercase, respectively.
        System.out.println(str.toLowerCase()); // same as above.
        // System.out.println(str.contains("text")); // Searches for the specified text within a string and returns true or false.
        // System.out.println(str.equals(otherString)); // Compares strings for equality and returns a boolean.

    }
}