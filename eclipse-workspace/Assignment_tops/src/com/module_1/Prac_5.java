package com.module_1;

import java.util.Scanner;

public class Prac_5 {
	public static void main(String[] args) {
		int[] arr =new int[5];
		int sum=0,avg;
		Scanner sc= new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Element ["+(i+1)+"] : ");
			arr[i] = sc.nextInt();
			sum =sum + arr[i];
		}
		
		avg = sum/arr.length;
		System.out.println("Sum is : "+sum);
		System.out.println("Average is : "+avg);
		
	}
}
