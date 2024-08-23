package com.module_2;

public class PrintNumbers {

	public static void print(String name) {
		System.out.println("Your name is : "+name);
	}
	
	public static void print(int age) {
		System.out.println("Your Age is : "+age);
	}
	
	public static void print(double per) {
		System.out.println("Your Percentage is : "+per);
	}
	
	public static void main(String[] args) {
		print("Nikhil");
		print(30);
		print(89.56);
	}
}
