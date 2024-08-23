package com.module_2;

abstract class Parent{
	abstract void method();
}

class sub1 extends Parent{
	
	@Override
	void method() {
	System.out.println("This is first subclass");
		
	}
}

class sub2 extends Parent{

	@Override
	void method() {
		System.out.println("This is second subclass");
		
	}
	
}

public class AbstractClass {
	public static void main(String[] args) {
		sub1 s1 = new sub1();
		s1.method();
		sub2 s2 = new sub2();
		s2.method();
	}
}
