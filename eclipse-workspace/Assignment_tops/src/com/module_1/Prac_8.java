package com.module_1;

import java.util.Scanner;

public class Prac_8 {
	
	public static void check_digit() {
		
		Scanner sc =new Scanner(System.in);
		int num ,digit=0,orig;
		System.out.println("Enter a Number: ");
		num = sc.nextInt();
		orig= num;
		if (num < 0) {
			System.out.println("Please Enter Only Positive Number.");
			check_digit();
		}
		else {
			while (num > 0) {
				num = num/10;
				digit++;
			}
			
			System.out.println("Digits in "+orig+" is  : "+digit);
		}
		
	}
	
public static void main(String[] args) {
	check_digit();
	}
}
