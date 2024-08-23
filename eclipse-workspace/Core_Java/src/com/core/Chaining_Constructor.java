package com.core;

class A{
	A(){
		System.out.println("A's Constructor");
	}
	void Show() {
		System.out.println("Show from A");
	}
}

class B extends A{
	B(){
		System.out.println("B's Constructor");
	}
	void Show() {
		super.Show();
		System.out.println("Show from B");
	}
}

class C extends B{
	C(){
		System.out.println("C's Constructor");
	}
	
	void Show() {
		super.Show();
		System.out.println("Show from C");
	}
}

public class Chaining_Constructor {
	public static void main(String[] args) {
	 C c = new C();
	 c.Show();

	}

}
