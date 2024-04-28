package org.example;

public class Task7 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        int wordCount = countWords(str);
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String str) {
        // Split the string into tokens based on spaces or punctuation
        String[] tokens = str.split("[\\s\\p{Punct}]+");
        // Count the number of tokens
        return tokens.length;
    }
}
