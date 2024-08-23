package com.core;

public class Constructor {
	int weight,height;
	public Constructor() {
	System.out.println("Default Constructor");
	}
	
	Constructor(int weight, int height){
		System.out.println("Parameterized Constructor Called.");
		weight = weight;
		height = height;
	}
	
	Constructor(Constructor con){
		System.out.println("Copy Constructor Called");
		weight = con.weight;
		height = con.height;
	}
	public static void main(String[] args) {
		Constructor c1 = new Constructor(10,20);
		Constructor c2 = new Constructor(c1);
	}
}
