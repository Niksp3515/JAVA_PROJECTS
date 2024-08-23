package com.core;

public class StaticMethod {
	
	static int a = 10;
	static int b;
	
	static void meth(int x) {
		System.out.println("X : "+x);
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	
	static {
		System.out.println("Static Block Initializer");
		//this block will execute first even if the object is not create and even if the static method is called.
	}
	{
		System.out.println("Hello World");
		//this block will execute when object is created
	}
	
	public StaticMethod() {
	System.out.println("Default Contructor");
	//even if this constructor but most priority will be given to first static block then block and then constructor.
	}
	public static void main(String[] args) {
		new StaticMethod();
		meth(12);
		
	}
}
