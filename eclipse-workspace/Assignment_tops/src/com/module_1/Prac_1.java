package com.module_1;

import java.util.Scanner;

public class Prac_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter First Number : ");
		n1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		n2 = sc.nextInt();
		System.out.println("Enter Third Number : ");
		n3 = sc.nextInt();
		
		if (n1 > n3) {
			if (n1 > n2) {
				System.out.println(n1+" is Greatest");
			}
			else {
				System.out.println(n2+" is Greatest");
			}
		}
		else {
			System.out.println(n3+" is Greatest");
		}
	}
}
