package org.example;

public class Calculator {
        // Addition method
        public int add(int a, int b) {
            return a + b;
        }

        // Subtraction method
        public int subtract(int a, int b) {
            return a - b;
        }

        // Multiplication method
        public int multiply(int a, int b) {
            return a * b;
        }

        // Division method
        public double divide(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return (double) a / b;
        }
}
