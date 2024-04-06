package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
    String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        System.out.println("Please enter a sentence");
//        String myString = input.nextLine();
    HashMap<Character, Integer> charDict = new HashMap<>();
    char[] charactersInString = myString.toCharArray();
    for (char c: charactersInString){
        if (!charDict.containsKey(c)){
            charDict.put(c, 1);
        } else {
            int sum = charDict.get(c) + 1;
            charDict.put(c, sum);
        }
    }
    for (Map.Entry<Character, Integer> entry : charDict.entrySet()){
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
}

// ArrayListPractice
//package org.launchcode;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ArrayListPractice {
//    public static void main(String[] args) {
//
//
//        // Create an ArrayList with at least 10 integers
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(3);
//        numbers.add(5);
//        numbers.add(8);
//        numbers.add(12);
//        numbers.add(15);
//        numbers.add(17);
//        numbers.add(20);
//        numbers.add(23);
//        numbers.add(25);
//        numbers.add(30);
//
//        // Call the method to find the sum of even numbers
//        int evenSum = sumEven(numbers);
//        System.out.println("Sum of even numbers: " + evenSum);
//        System.out.println("-----------------------------------------------------------------------------------------");
//
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("apple");
//        fruits.add("banana");
//        fruits.add("orange");
//        fruits.add("grape");
//        fruits.add("lemon");
//        fruits.add("kiwi");
//        fruits.add("melon");
//
//        // Call the method to print words with exactly 5 letters
//        System.out.println("Words with exactly the number letters given by user:");
//        fiveLetterWords(fruits);
//    }
//
//    public static int sumEven(ArrayList<Integer> arr) {
//
//        int total = 0;
//        for (int integer : arr) {
//            if (integer % 2 == 0) {
//                total += integer;
//            }
//        }
//        return total;
//    }
//
//    public static void fiveLetterWords (ArrayList <String> words){
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a word length: ");
//        int numChars = input.nextInt();
//
//        for (String word : words) {
//
//            if(word.length() == numChars ){
//                System.out.println(word);
//            }
//
//        }
//
//    }
//}

