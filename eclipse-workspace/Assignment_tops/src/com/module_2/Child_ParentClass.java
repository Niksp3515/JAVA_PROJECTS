package com.module_2;

class A{
	public void method_1() {
		System.out.println("This is a parent class");
	}
}

class B extends A{
	void method_2() {
			System.out.println("This is a child class");
	}
}

public class Child_ParentClass {
	public static void main(String[] args) {
		B obj1 = new B();
		obj1.method_1();
		obj1.method_2();
	}
}
