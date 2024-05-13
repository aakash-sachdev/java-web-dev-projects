package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        int a = 10;
        int b = 0;

        Divide(a,b);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String, String> student : studentFiles.entrySet())
            System.out.println(student.getKey() + " : " + CheckFileExtension(student.getValue()));
    }

    public static void Divide(int x, int y)
    {
        try {
            int grade = x/y;
            System.out.println("The student's grade is " + grade);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero!");
            e.printStackTrace();
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        try {
            if (fileName.isEmpty() || fileName == null) {
                throw new FileNameException("The file name is empty or null.");
            }
            int endIndex = fileName.length();
            int startIndex = fileName.length() - 5;
            String sub = fileName.substring(startIndex, endIndex);

            if(sub.equals(".java")) {
//                System.out.println(sub);
                return 1;
            }
            else
            {
//                System.out.println(sub);
                return 0;
            }
        } catch (FileNameException e){
            e.printStackTrace();
            return -1;
        }
    }
}