package com.module_2;

import java.util.Scanner;

public class Factorial {

	public static int fact(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("factorial of "+a+" is  : "+fact(a));
	}
}
