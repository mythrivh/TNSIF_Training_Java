package org.tnsif.acc.c2tc.polymorphism;
class Calculator {
    public int add(int n1, int n2) {
        return n1+ n2;
    } 
    public int add(int a1, int a2, int a3) {
        return a1 + a2+ a3;
    }  
    public double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 ints: " + calc.add(5, 10));
        System.out.println("Sum of 3 ints: " + calc.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 10.5));
    }
}




