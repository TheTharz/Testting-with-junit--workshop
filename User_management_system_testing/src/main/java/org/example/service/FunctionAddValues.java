package org.example.service;

import java.util.ArrayList;
import java.util.List;

public class FunctionAddValues {
    private static List<String> valuesList = new ArrayList<>();

    // Method to add a value to the list
    public static void addValue(String value) {
        valuesList.add(value);
        System.out.println("Added value: " + value);
    }

    // Method to list all values in the list
    public static String listValues() {
        return String.join(", ", valuesList);
    }

    // Method to simulate saving values (printing for demonstration)
    public static void saveValues() {
        System.out.println("Saving values...");
        System.out.println("Values saved: " + listValues());
    }
}
