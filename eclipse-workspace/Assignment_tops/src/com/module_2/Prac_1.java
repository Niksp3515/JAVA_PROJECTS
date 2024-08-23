package com.module_2;

import java.util.Scanner;

public class Prac_1 {
	
	public static void main(String[] args) {
		String str = "Tops Technologies!";
		int index;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Index : ");
		index = sc.nextInt();
		System.out.println("Character at "+index+" is : "+str.charAt(index));
		
	}
}
