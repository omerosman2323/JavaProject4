package org.example;

public class Task5 {
    public static void main(String[] args) {
        String str = "documentation";
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        // Convert the string to lowercase to handle both lowercase and uppercase vowels
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
