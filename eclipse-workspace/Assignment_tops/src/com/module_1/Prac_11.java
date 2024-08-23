package com.module_1;

import java.util.Scanner;

public class Prac_11 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int n = sc.nextInt();
		
		int nn = n * n;
		int nnn = n * n * n;
		
		int sum = n+nn+nnn;
		
		System.out.println("Sum is : "+sum);
	}
}
