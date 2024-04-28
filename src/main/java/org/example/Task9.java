package org.example;

public class Task9 {
    public static void main(String[] args) {
        String str = "abracadabra";
        char firstNonRepeatingChar = findFirstNonRepeatingChar(str);
        System.out.println("First non-repeating character: " + firstNonRepeatingChar);
    }

    public static char findFirstNonRepeatingChar(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }

        return '\0';
    }
}
