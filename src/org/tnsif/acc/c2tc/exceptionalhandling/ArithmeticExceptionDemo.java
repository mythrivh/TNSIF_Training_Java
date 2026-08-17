
package org.tnsif.acc.c2tc.exceptionalhandling;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
        System.out.println("Program continues after exception handling.");
    }
}

