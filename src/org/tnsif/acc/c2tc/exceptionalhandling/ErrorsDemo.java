package org.tnsif.acc.c2tc.exceptionalhandling;

public class ErrorsDemo {
    public static void main(String[] args) {
        try {
            // Example: StackOverflowError (caused by infinite recursion)
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Caught an error: " + e);
        }

        try {
            // Example: OutOfMemoryError (creating huge array)
            int[] arr = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Caught an error: " + e);
        }

        System.out.println("Program continues after handling errors.");
    }

    static void recursiveMethod() {
        // Infinite recursion to trigger StackOverflowError
        recursiveMethod();
    }
}

