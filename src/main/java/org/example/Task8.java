package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Apricot");
        strings.add("orange");
        strings.add("Avocado");

        List<String> filteredStrings = filterAndConvertToLower(strings);
        System.out.println("Filtered strings starting with 'A' in lowercase:");
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }

    public static List<String> filterAndConvertToLower(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();
        for (String str : strings) {
            if (str.startsWith("A")) {
                filteredStrings.add(str.toLowerCase());
            }
        }
        return filteredStrings;
    }
}
