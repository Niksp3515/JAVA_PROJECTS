package com.module_2;

import java.util.Scanner;

public class TryCatch_Block {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter two numbers: ");
	            int num1 = scanner.nextInt();
	            int num2 = scanner.nextInt();

	            
	            int result = num1 / num2;
	            System.out.println("The result is: " + result);
	        } catch (ArithmeticException e) {
	            
	            System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: / by zero");
	        }
	    }
}


