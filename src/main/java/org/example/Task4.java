package org.example;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {


        String str = "listen";
        String str1 = "silent";

        char[] arr1 = str.toCharArray();
        char[] arr2 = str1.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        String strSorted = Arrays.toString(arr1);
        String str1Sorted = Arrays.toString(arr2);

        if (strSorted.equals(str1Sorted)) {
            System.out.println("Anagram");
        } else
            System.out.println("Not Anagram");
    }
}
