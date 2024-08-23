package com.module_2;

public class CommandLineDivision {
    public static void main(String[] args) {

        try {
            
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

           
            int result = num1 / num2;
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: / by zero");
        } catch (NumberFormatException e) {
            
            System.out.println("Please provide valid integers as command line arguments.");
        }
    }
}

