package org.example;

public class Task2 {
    public static void main(String[] args) {
        String str = "Hello World123";
        int alphaCount = countAlphaCharacters(str);
        System.out.println("Number of alphabetic characters: " + alphaCount);
    }

    public static int countAlphaCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isAlphabetic(c)) {
                count++;
            }
        }
        return count;

    }
}
