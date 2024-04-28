package org.example;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Perform swapping without temporary variable
        str1 = str1 + str2; // Concatenate str1 and str2
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract str1 from concatenated string
        str1 = str1.substring(str2.length()); // Extract str2 from concatenated string

        System.out.println("\nAfter swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

}
