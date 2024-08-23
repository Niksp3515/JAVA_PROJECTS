package com.module_2;

public class IntgereAndCharacter {
	public static void print(int n,char c) {
		System.out.println("The first is integer "+n+" and second is character "+c);
	}

	public static void print(char c, int n) {
		System.out.println("The first is character "+c+" and second is integer "+n);
	}
	public static void main(String[] args) {
		print('A', 25);
		print(20,'C');
	}
}
