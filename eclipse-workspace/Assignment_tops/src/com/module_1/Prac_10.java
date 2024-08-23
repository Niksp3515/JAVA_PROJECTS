package com.module_1;

import java.util.Scanner;

public class Prac_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		String ch =sc.next();
		char c1 = ch.charAt(0);
		int ascii = c1;
		System.out.println("ASCII value of "+c1+" is : "+ascii);
		
	}
}
