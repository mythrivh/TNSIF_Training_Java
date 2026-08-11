package org.tnsif.acc.c2tc.scanner_class;

import java.util.Scanner;

public class ScannerMethodDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        char ch = name.charAt(2);    
        System.out.println("Character at index 2 is: " + ch);    
        sc.close();
    }
}

