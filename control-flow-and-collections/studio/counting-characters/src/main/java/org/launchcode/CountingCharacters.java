package org.launchcode;

import java.util.HashMap;
import java.util.Map;

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
