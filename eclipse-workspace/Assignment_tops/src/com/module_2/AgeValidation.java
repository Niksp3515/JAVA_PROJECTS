package com.module_2;

import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
        	 if (age < 18) {
                 throw new ArithmeticException("not valid Age for vote");
             }
            System.out.println("Welcome to vote.");
        } catch (ArithmeticException e) {
            System.out.println( e.getMessage());
        }
    }
}

