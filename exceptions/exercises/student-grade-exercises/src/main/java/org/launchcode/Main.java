package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        int result1 = Divide(10, 2);
        int result2 = Divide(8, 0);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("John", null);

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            try {
                int points = CheckFileExtension(studentFiles.get(student));
                System.out.println(student + " received " + points + " points.");
            } catch (IllegalArgumentException e) {
                System.out.println(student + " - Exception caught: " + e.getMessage());
            }
        }
    }

    public static int Divide(int x, int y) {
        // Write code here!
        try {
            if (y == 0) {
                throw new ArithmeticException("Dividing by zero is not allowed.");
            }
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            return 0;
        }
    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("File name is null or empty. Student loses 1 point.");
        }
        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}