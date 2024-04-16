package org.launchcode;

public class Runner {
    public static void main(String[] args) {
        String test = "[LaunchCode]";
        String test2 = "Launch[Code]";
        String test3 = "LaunchCode]";
        System.out.println(BalancedBrackets.hasBalancedBrackets(test));
        System.out.println(BalancedBrackets.hasBalancedBrackets(test2));
        System.out.println(BalancedBrackets.hasBalancedBrackets(test3));

    }

}
