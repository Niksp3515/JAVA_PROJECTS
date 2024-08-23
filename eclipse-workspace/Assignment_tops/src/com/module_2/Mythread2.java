package com.module_2;

class Mythread33 extends Thread{
	String name;
	public Mythread33(String name) {
	this.name = name;
	}
	
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Executing thread is ["+name+"] : "+i);
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class Mythread2 {

	public static void main(String[] args) {
		Mythread33 m1 = new Mythread33("Thread 1");
		Mythread33 m2 = new Mythread33("Thread 2");
		m1.start();
		m2.start();
	}
}
