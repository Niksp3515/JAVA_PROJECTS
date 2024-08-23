package com.core;

interface ifs1{
//	static void meth1() {
//		System.out.println("Meth1 is defined in interface");
//	}
//	if we want to define block in interface so we use static method
	
	void meth1();
}

interface ifs2 extends ifs1{
	void meth2();
}

public class Interface_Demo implements ifs1,ifs2{

	@Override
	public void meth2() {
		System.out.println("Meth 2");
		
	}
	public static void main(String[] args) {
//		ifs1.meth1(); this will use when we call method that is defined by static because static doesn't require object to call
		//if we have static method in class then just simply call it by A.meth()
		
		Interface_Demo i = new Interface_Demo();
		i.meth1();
		i.meth2();
	}
	@Override
	public void meth1() {
		System.out.println("Meth 1");
		
	}

}
