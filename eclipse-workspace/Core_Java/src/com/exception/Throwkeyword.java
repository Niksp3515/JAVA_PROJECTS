package com.exception;

import java.util.Scanner;

public class Throwkeyword {
	
	public static void demo(){
		int x;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter X : ");
			x =sc.nextInt();
			if (x > 0) {
				System.out.println("Nothing");
			}
			else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Please Enter Positive Number Only.");
			demo();
		}
	}
	public static void main(String[] args) {
		demo();
	}
}
