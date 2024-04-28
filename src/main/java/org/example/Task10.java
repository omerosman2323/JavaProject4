package org.example;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("apple");
        arrayList.add("orange");
        arrayList.add("banana");

        System.out.println("ArrayList with duplicates: " + arrayList);

        removeDuplicates(arrayList);

        System.out.println("ArrayList after removing duplicates: " + arrayList);
    }

    public static void removeDuplicates(List<String> arrayList) {
        // Create a set to store unique elements
        Set<String> set = new HashSet<>(arrayList);
        // Clear the original list
        arrayList.clear();
        // Add all unique elements back to the list
        arrayList.addAll(set);


    }
}
