package com.core;

abstract class D{
	
	void meth1() {
		System.out.println("Meth 1");
	}
	abstract void  meth2();
}

abstract class F{
	
}

class E extends D{

	@Override
	void meth2() {
		System.out.println("Meth 2");
	}
	
}
public class AbstractClass {
	public static void main(String[] args) {
		E e = new E();
		e.meth2();
		e.meth1();
	}
}
