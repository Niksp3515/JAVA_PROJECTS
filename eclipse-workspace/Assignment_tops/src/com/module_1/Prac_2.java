package com.module_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Prac_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String c;
	System.out.println("Enter a Character: ");
	c = sc.next();
	char ch = c.toLowerCase().charAt(0);
//	System.out.println(ch);
	 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		System.out.println(c+" is Vowel.");
	}
	 
	 else if (c.length() > 1) {
		System.out.println("This is String !!!!!Please Enter Only A character");
	}
	 else if (!Character.isLetter(ch)) {
		System.out.println("Invalid Input!!!!!");
	}
	 else {
		System.out.println(c +" is a Consonant");
	}
	
}
}
